/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizza_bill_generator;

/**
 *
 * @author dhanush
 */
public class Pizza {
    
    int quantity;
    int size;
    int isVeg;
    int isCheeseAdded;
    
    double basePrice;
    double toppingsPrice;
    double totalPrice;
    
    //CONSTRUCTOR
    Pizza(int isVeg,int size,int quantity,int isCheeseAdded){
        this.size = size;
        this.quantity = quantity;
        this.isVeg = isVeg;
        if(isVeg==1){
            basePrice =100;
            toppingsPrice=100;
        }
        else{
            basePrice =150;
            toppingsPrice=120;
        }
    }
    
    //method to add extracheese
    public void addExtraCheese(){
        if(isCheeseAdded==1){
            toppingsPrice+=50;
        }
    }
    
    public void adjustToSize(){
       
        if(size==1){
            basePrice*=1.5;
            toppingsPrice*=1.75;
        }
        else if(size==2){
            basePrice*=2;
            toppingsPrice*=2.5;
        }
    }
    
    public void generateBill(){
        totalPrice=toppingsPrice+basePrice;
        System.out.print("You have ordered "+quantity);
        if(isVeg==1){System.out.print(" Veg pizza. ");}
        else{System.out.print(" Non-Veg pizza. ");}
        if(isCheeseAdded==1){System.out.print(",with extra cheese");}
        System.out.println("The total price is Rs."+totalPrice);
    }
}
