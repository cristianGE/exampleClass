/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;



/**
 *
 * @author alumne
 */
public class Product {
    
// attributes

    private int id;
    private String name;
    private double price;

// accessors

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


// Constructors
/**
 * Void constructor
 */    
public Product(){

}

/**
 * Full constructor
 * @param id the id of the product
 * @param name the name of the product
 * @param price price of the product
 */
public Product(int id, String name, double price) {
    this.id = id;
    this.name = name;
    this.price = price;
}

/**
 * Constructor with the param id
 * @param id 
 */
public Product(int id)
{
    this.id = id;
}

/**
 * Constructor of copy
 * @param other an instance of a product
 */
public Product(Product other)
{
    this.id = other.getId();
    this.name = other.getName();
    this.price = other.getPrice();
}

    
    
// methods


/**
 * Serializes the object into a string
 * @return a string that contains the data of this object
 */
@Override
public String toString()
{

    StringBuilder sb = new StringBuilder();
    sb.append("Product{");
    sb.append("id=");
    sb.append(id);
    sb.append(",name=");
    sb.append(name);
    sb.append(",price=");
    sb.append(price);
    sb.append("}");

    return sb.toString();
}

    
   
}
