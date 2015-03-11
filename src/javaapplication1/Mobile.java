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
public class Mobile extends Product{
    
    private int memory;
    private String Os;
    private int quantity;
    
    String name = super.getName();
    float price = super.getPrice();
    
    public Mobile(int mem, String os)
    {
       memory = mem;
       Os = os;
    }
    
    public Mobile(){};
   
   public float getPrice( int quant)
   {
     quantity = quant; 
      if (quantity < 2) return price * quantity;
      else if (quantity == 2) return (float) (price * quantity * 0.30);
      else return (float) (price * quantity * 0.40); 
   }
   
   
    @Override
    public String toString()
    {
      return "Mobile  "+ name + "has memory "+ memory + " and operating sistem " + Os;
    }
    
}
