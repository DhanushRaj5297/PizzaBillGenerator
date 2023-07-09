/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pizza_bill_generator;

import java.util.Scanner;
/**
 *
 * @author dhanush
 */
public class Pizza_Bill_Generator {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Quantity
        System.out.println("Welcome to Pizza Bill Generator! \nPlease enter number of pizza needed:");
        int quantity=sc.nextInt();
       //Size
        System.out.println("Please state size of Pizza: (enter 0 for regular, 1 for medium, 2 for large)");
        int size=sc.nextInt();
        while(size>2 || size<0){
            System.out.println("Please enter valid size Input!");
            size=sc.nextInt();
        }
        //Veg/Non-Veg
        System.out.println("Please enter preference of Veg/Non-veg (Enter 1 for Veg, 0 for Non-Veg)");
        int isVeg=sc.nextInt();
        while(isVeg>1 || isVeg<0){
            System.out.println("Please enter valid Veg/Non-Veg Input!");
            isVeg=sc.nextInt();
        }
        //Extra cheese?
         System.out.println("Please enter 1 for Extra cheese,0 if not needed");
        int extraCheese=sc.nextInt();
        while(extraCheese>1 || extraCheese<0){
            System.out.println("Please enter valid extra cheese Input!");
            extraCheese=sc.nextInt();
        }
        Pizza p= new Pizza(isVeg,size,quantity,extraCheese);
        p.addExtraCheese();
        p.adjustToSize();
        p.generateBill();
    }
}
