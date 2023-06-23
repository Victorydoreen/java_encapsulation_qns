//cement,hoes,Brushes, iron sheets--- a collection, a list data type must be attached
//products must have an id, stock number, the price, the image, name
//method that adds products, counts products and returns the total



public class StoreProduct {
    private int productId;
    private String name;
    private int stock=0;
    private String price;
    private String image;



    //    A constructor that takes 5 arguments
    public StoreProduct(int productId, String name, String price, String image){
        this.productId=productId;
        this.name=name;
        this.price=price;
        this.image=image;
    }
//    Using getter and setter methods to access and modify the title and author attributes.
//    using getters to get data
    public int getProductId(){return productId;}
    public void setProductId(int productId){this.productId=productId;}

    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public int getStock(){return stock;}
    public void setStock(int prod){this.stock+=stock;}
    public String getPrice(){return price;}
    public void setPrice(String price){this.price=price;}
    public String getImage(){return image;}
    public void setImage(String image){this.image=image;}

//    public int setStockValue(int stock)
@Override
    public String toString() {return name + ": " + stock + " in stock";
}


}
