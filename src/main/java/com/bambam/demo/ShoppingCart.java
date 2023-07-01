package com.bambam.demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    
    public void checkout(String status) 
    {
        System.out.println("Checkout Method called from ShoppingCart");
    }


    public int quantity(){
        return 2;
    }
}
