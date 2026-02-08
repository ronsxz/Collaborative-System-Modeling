public class Order {
    private int orderID;
    private FoodItem food;

    public Order(int orderID, FoodItem food){
        this.orderID = orderID;
        this.food = food;
    }
    public String processOrder(){
        return "Order ID: " + orderID + " processed.\n" + food.getInfo();
    }
    public void identity(){
        System.out.println("I am an Order class. I manage order transactions");
    }
}