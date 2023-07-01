package com.bambam.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.bambam.demo")
@EnableAspectJAutoProxy
public class BeanConfig {
    

}
