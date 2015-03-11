/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Student
 */
public abstract class Product {
    
    private String name;
    private float price;
    private int quantity;
    
    Product (){}
    
    public String getName()
    {
        return name;
    }
    
    
    public float getPrice()
    {
       return price;     
    }
    
    @Override
    public String toString()
    {
        return "nume produs: "+ name+ "\n Pret produs: "+ price;
    }
    
    
}
