public class main {
    public static void main(String[] args){

       Customer customer = new Customer("Aron brillantes");
       FoodItem food = new FoodItem("Burger", 120.00);

       System.out.println(customer.orderFood(food));

       customer.identity();
       food.identity();

       Order order = new Order(1, food);
       order.identity();
    }    
}
