public class Customer{
    private String name;

    public Customer(String name){
        this.name = name;
    }

    public String orderFood(FoodItem food){
        Order order = new Order(1, food);
        return name + " ordered food. " + order.processOrder();
    }

    public void identity(){
        System.out.println("I am a Customer class. I handle customer orders");
    }
}