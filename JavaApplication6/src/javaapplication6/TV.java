/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import javaapplication6.Product;

/**
 *
 * @author alumne
 */
public class TV extends Product {
    
    private int inches;
    
    //Constructorshttp://www.marca.com/

    /**
     * Full constructor
     * @param id
     * @param name
     * @param price
     * @param inches 
     */
    public TV(int id, String name, double price, int inches) {
        super(id, name, price);
        this.inches = inches;
    }
    
   /**
    * Constructor that uses an instance of the superclass plus the inches
    * @param p
    * @param inches 
    */
    public TV(Product p, int inches)
    {
        super(p);
        this.inches = inches;
    }
    
    /**
     * Constructor of copy
     * @param other 
     */
    public TV(TV other)
    {
        super(other);
        this.inches = other.inches;
    }
 
    // Accessors

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }
    
    /**
     *  Serializes this object
     * @return 
     */
    @Override
    public String toString()
    {
        
        StringBuilder sb = new StringBuilder();
        sb.append("TV{");
        sb.append(super.toString());
        sb.append(",inches=");
        sb.append(inches);
        sb.append("}");
        return sb.toString();
    }
    
}
