public class FoodItem {
    private String name;
    private double price;

    public FoodItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getInfo(){
        return "Food: " + name + ", Price: $" + price;
    }
    public void identity(){
        System.out.println("I am a FoodItem class. I store food details.");
    }
}
