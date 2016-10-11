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
public class Store {

//Attributes
    
int maxElements; // número màxim d'elements que pot haver
int numProducts; // número actual d'elements que hi ha al vector
private Product[] products; // vector de productes
        

// Constructor
public Store(int maxElements) {
    this.maxElements = maxElements;
    products = new Product[maxElements];
    this.numProducts = 0;
}


// Getters
private Product[] getProducts()
{
 return this.products;
}

public int getNumProducts()
{
return numProducts;
}


// Methods

/**
 * Adds a new product to the store
 * @param p product to add
 * @return 1 if success, 0 otherwise
 */
public int add(Product p)
{
   if(numProducts<maxElements)
   {
       products[numProducts]=p;
       numProducts+=1;
       return 1;
   }
   return 0;
}

/**
 * Returns a product from the array given its index
 * @param index 
 * @return  product in position given by index or null in case of error
 */
public Product get(int index)
{
    if(index>=0 && index < numProducts)
    {
        return products[index];
    }
    else
    {
        return null;
    }
}

/**
 * Returns an element from the array given its id
 * @param id id of the product
 * @return product with the given id or null if not found
 */
public Product getByID(int id)
{
    for(int i=0; i<numProducts; i++)
    {
        if (products[i].getId()==id)
        {
            return products[i];
        }
        
    }
   
    return null; 
}


public Product getByName(String name)
{
    for(int i=0; i<numProducts; i++)
    {
        if (name.equals(products[i].getName())==true)
        {
            return products[i];
        }
        
    }
   
    return null; 
}






    
}
