/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;
/**
 *
 * @author micho
 */
public class Cart {
    private int customerId;
    private int nProducts;
    private Product[] products;

    public Cart(int customerId, int nProducts) {
        this.customerId = Math.abs(customerId);
        this.nProducts =  Math.abs(nProducts);
        this.products = new Product[nProducts];
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }
    public int getnProducts() {
        return nProducts;
    }
    public void setnProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
    }
    public Product[] getProducts() {
        return products;
    }
    public void setProducts(Product[] products) {
        this.products = products;
    }
    public void addProducts(Product product , int index){ 
        if (index >= 0 && index < nProducts){
            products[index]=product;
        }else{
            System.out.println("invalid index.");
        }      
    }
    public void removeProducts(int index){
     if (index >= 0 && index < nProducts) {
            products[index] = null;
        } else {
            System.out.println("Invalid index.");
        }
    }
     public double calculatePrice() {
        double totalPrice = 0;
        for (Product product : products) {
                totalPrice += product.getPrice();
        }
        return totalPrice;
    }
      public void placeOrder() {
          System.out.println("order placed successfully!");
      }
}
