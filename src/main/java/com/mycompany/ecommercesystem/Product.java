
package com.mycompany.ecommercesystem;

public class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = Math.abs(productId);
        this.name = name;
        this.price = Math.abs(price);
    }
    public int getproductId(){
        return productId;
    }
    public void setproductId(int productId){
        this.productId = Math.abs(productId);
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
        this.price = Math.abs(price);
    }
}