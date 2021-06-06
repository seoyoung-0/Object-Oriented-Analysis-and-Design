
public class Drink {

    private final String name;
    private int price;
    private int stock;
    private final String imgURL;

    public Drink(String name, int price, int stock, String imgURL){
        super();
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.imgURL = imgURL;
    }

    public Drink(String name, int price, String imgURL){
        this.name = name;
        this.price = price;
        this.imgURL = imgURL;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

//    public void setPrice(int price) {
//        this.price = price;
//    }

    public int getStock(){
        return stock;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public void updateStock(){
        this.stock--;
    }

    public String getImgURL() {
        return imgURL;
    }

}