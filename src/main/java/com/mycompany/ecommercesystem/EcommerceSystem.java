/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ecommercesystem;
import java.util.Scanner;

public class EcommerceSystem {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
   ElectronicProduct electronicProduct = new ElectronicProduct("Samsung",1,1,"smartphone",599.9);
   ClothingProduct clothingProduct = new ClothingProduct("Medium","Cotton",2,"T-shirt",19.99);
   BookProduct bookProduct = new BookProduct("O’Reilly","X Publications",3,"OOP",39.99);
   
        System.out.println("Welcome to E-commerce system|");
        System.out.println("Please enter your id ");
        int Id = input.nextInt();
        System.out.println("Please enter your name ");
        String name = input.next();
        System.out.println("Please enter your address ");
        String address = input.next();
        
        Customer customer = new Customer(Id,name,address);
        System.out.println("How many products you want to add to your cart?");
        int nProducts = input.nextInt();
        Cart cart = new Cart(customer.getCustomerId(), nProducts);
        
        for(int i=0; i<nProducts;i++){
            System.out.println("Which product would you like to add? 1-Smartphone 2-T-shirt 3-OOP");
            int select = input.nextInt();
            Product product;
            switch (select) {
                case 1:
                    product = electronicProduct;
                    break;
                case 2:
                    product = clothingProduct;
                    break;
                case 3:
                    product = bookProduct;
                    break;
                default:
                    System.out.println("Invalid choice,You should choose from 1 to 3! ");
                    i--;
                    continue;
            }
            cart.addProducts(product, i);
        }
             System.out.print("Your total is $" + cart.calculatePrice()+". Do you want to place the order? 1-Yes 2-No: ");
        int choice = input.nextInt();
        if (choice == 1) {
           Order order = new Order(customer.getCustomerId(), 1, cart.getProducts(),cart.calculatePrice());
            order.printOrderInfo();
            cart.placeOrder();
        } else {
            System.out.println("Order not placed.");
        }
        System.out.println("would you like to remove a product from your cart? 1-Yes 2-No");
          int choiceRemove = input.nextInt();
          if (choiceRemove == 1) {
              System.out.println("Enter the index of the product you want to remove:");
                int indexToremove = input.nextInt();
            cart.removeProducts(indexToremove);
              System.out.println("Product removed. ");
          }else{
              System.out.println("No products were removed.");
          }
        }
}
