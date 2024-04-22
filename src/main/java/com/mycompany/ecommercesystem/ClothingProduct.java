
package com.mycompany.ecommercesystem;

public class ClothingProduct extends Product {
    private String size;
    private String fabric;

    public ClothingProduct(String size, String fabric, int productId, String name, double price) {
        super(productId, name, price);
        this.size = size;
        this.fabric = fabric;
    }
    public String getsize(){
        return size;
    }
    public void setsize(String size){
        this.size = size;
    }
    public String getFabric() {
        return fabric;
    }
    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
}