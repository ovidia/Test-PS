/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Student
 */
public class Cart extends Product{
    
    private Map<Product, Integer> products = new HashMap<Product, Integer>(); 
    Product prod;
   
    public void addProduct( Product p, int q)
    {
        products.put(p, q);
    }
    
    public float getTotalPrice()
    {
       float price = 0;
       for (Map.Entry<Product,Integer> pr : products.entrySet())
       {
          price += pr.getKey().getPrice();
           
        }
       return price;
    }
           
    
}
