//Write a java program that manages a hardware store. The store must have a name, contact and where it is located.
// The store consists of different products. New products can be added to the store each new day and the store manager
//always updates these products based on the number in stock once a new product has been bought, the manager updates the
// product name  if required and can also delete a product. The manager presents a list of these products to his boss
// with total products in the  store

//cement,hoes,Brushes, iron sheets--- a collection, a list data type must be attached
//products must have an id, stock number, the price, the image, name
//method that adds products, counts products and returns the total

import java.util.ArrayList;

public class Hardware_store {
    private String hardwareName;
    private String contact;
    private String location;
    private ArrayList <StoreProduct>products;

//    A constructor that takes 3 arguments, the hardwareName, contact and location of the hardware_stock, and initializes the corresponding attributes
    public Hardware_store(String hardwareName, String contact, String location) {
        this.hardwareName = hardwareName;
        this.contact = contact;
        this.location = location;
        this.products = new ArrayList<>();
    }
//    Using getters and setters to access and update our the different attributes of the hardware_store class
    public  String getHardwareName(){return hardwareName;}
    public void setHardwareName(String hardwareName){this.hardwareName=hardwareName;}
    public  String getContact(){return contact;}
    public void setContact(String contact){this.contact=contact;}
    public  String getLocation(){return location;}
    public void setLocation(String location){this.location=location;}

//    using the add method to add a product
    public void addProduct(StoreProduct product) {
        products.add(product);
    }

    public void updateProductStock(String productName, int newStock) {
        for (StoreProduct product : products) {
            if (product.getName().equals(productName)) {
                product.setStock(newStock);
                break;
            }
        }
    }

//    Using the delete method to remove a product from the store
    public void deleteProduct(String productName) {
        StoreProduct productToRemove = null;
        for (StoreProduct product : products) {
            if (product.getName().equals(productName)) {
                productToRemove = product;
                break;
            }
        }
        if (productToRemove != null) {
            products.remove(productToRemove);
            System.out.println("Product " + productName + " has been removed.");
        } else {
            System.out.println("Product " + productName + " not found.");
        }
    }

//    Using the display method to display the different products we have in our store
    public void displayProducts() {
        System.out.println("Product list:");
        for (StoreProduct product : products) {
            System.out.println(product);
        }
        System.out.println("Total products in store: " + products.size());
    }
}



















