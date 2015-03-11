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
public class Laptop extends Product{
    
    private String processor;
    private int screenSize;
    private int quantity;
    
    String name = super.getName();
    float price = super.getPrice();
    
   public Laptop( String proc, int screen)
    {
       
        processor = proc;
        screenSize = screen;
    }
   
   Laptop(){};
   public float getPrice( int quant)
   {
     quantity = quant;
      if (quantity <3) return price * quantity;
      else if (quantity == 3) return (float) (price * quantity * 0.23);
      else return (float) (price * quantity * 0.35); 
   }
   
   
    @Override
    public String toString()
    {
        return "Laptop "+ name + "has processor "+ processor + " and screen size " + screenSize;
    }
    
}
