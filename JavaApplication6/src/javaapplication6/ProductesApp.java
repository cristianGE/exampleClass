/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import javaapplication6.Product;
import javaapplication6.Store;
import cat.proven.productes.model.TV;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ProductesApp {

    
    
    
    private Store myStore;
    
           
    /**
     * The options in the main menu
     */
    private final String[] mainMenuOptions = 
    {   "Exit",
        "List all products",
        "Find product by id",
        "Find product by name"
    };
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        ProductesApp myApp = new ProductesApp();
        myApp.run();
                  
    }
    
    
    /* --------------- methods--------------*/
    
    /**
     * run()
     * runs the application in a non static mode
     */
    private void run(){
    
        /* Exit flag */
        
        boolean exit = false;
        
        /* menu option to execute */
        
        int option;
                
        
        // load or initialize the data
        loadData();
        
        do{
        
            // Show and get option
            option = showMainMenu();
        
            
            switch (option)
            {
                case 0:
                    exit = true; // set true the exit flag
                    break;
                case 1:
                    //TODO
                    listAll();
                    break;
                case 2:
                    findById();
                    break;
                case 3:
                    //TODO
                    findByName();
                    break;    
                default: // default or invalid option
                    System.out.println("Invalid option");
            }
            
        
        }
        while(!exit);
        
        // save the data
        saveData();
        
        System.out.println("Closing...");
        
    }
    
    /**
     *  shows the menu and get's the user input
     * @return option to execute
     */
    private int showMainMenu()
    {
       
        
        int option = -1; 
        
        try
        {
       
        Scanner scan = new Scanner(System.in);
        
        System.out.println("====== Menu  ======");
        
       
        for(int i=0; i < mainMenuOptions.length;i++)
        {
        
            System.out.println( i + ". " + mainMenuOptions[i]  );
        }
        
        
        System.out.println("===================");
        System.out.println(" Enter option");
        
        option = scan.nextInt();
        }
        catch(Exception ex)
        {
            option = -1;
        }
        
        
        return option;
    }
 
    /**
     * Loads and initialize data
     */
    private void loadData()
    {
        //TODO
        
        myStore = new Store(100);
        
               
        myStore.add(new Product(13434,"TV1",1200.00));
        myStore.add(new TV(2342,"TV2",1100.00,41));
        myStore.add(new Product(3222,"TV3",1000.00));
        myStore.add(new TV(545454,"TV4",1500.00,67));
      
    }
    
    /**
     * Saves the data
     */
    private void saveData()
    {
        //TODO
        System.out.println("Saving data...");
    }

    /**
     * Lists all the products
     */
    private void listAll()
    {
        //TODO
        
        for(int i =0; i<myStore.getNumProducts();i++)
        {
            System.out.println(myStore.get(i));
        }
        
        
    }
    
    
    /**
     * find a product by a given id
     */
    private void findById()
    {
        //TODO
        
       
        
        // ask the id
        System.out.println("Enter the product id to find");        
        Scanner scan = new Scanner(System.in);
       
       
        try
        {
           int id = scan.nextInt();
            
            Product p = myStore.getByID(id);
        
            if (p!=null)
            {
                System.out.println(p.toString());
            }
            else
            {
                System.out.println("Product not found");
            }
        
        }
        catch(InputMismatchException ex)
        {
            System.out.println("Incorrect input");
        }
            
    }
    
    /**
     * find a product by a given name
     */
    private void findByName()
    {
        //TODO
        System.out.println("find product by name");    
        Scanner scan = new Scanner(System.in);
       
       
        try
        {
           String  name = scan.next();
            
            Product p = myStore.getByName(name);
        
            if (p!=null)
            {
                System.out.println(p.toString());
            }
            else
            {
                System.out.println("Product not found");
            }
        
        }
        catch(InputMismatchException ex)
        {
            System.out.println("Incorrect input");
        }
            
    }
    
}
