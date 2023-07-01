package com.bambam.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.bambam.demo.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp)
    {   
        // String arg = jp.getSignature().toString();
        String arg = jp.getArgs()[0].toString();
        System.out.println("Before Logger Called "+arg);
    }

    @After("execution(* *.checkout(..))")
    public void afterLogger()
    {
        System.out.println("After Logger Called");
    }

    @Pointcut("execution(* com.bambam.demo.ShoppingCart.quantity(..)))")
    public void afterReturningPointCut()
    {}

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal)
    {
        System.out.println("After Returning "+retVal);
    }
    
}
