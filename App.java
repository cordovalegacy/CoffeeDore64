import static java.lang.System.out;

class App {
    public static void main(String[] args){

        out.println("<----Running App---->");

        //Instances
        Item item1 = new Item("Mocha", 5.50);
        Item item2 = new Item("Latte", 5.25);
        Item item3 = new Item("Coffee", 4.75);
        Item item4 = new Item("White Mocha", 6.50);

        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("Brendan");
        Order order4 = new Order("Tori");
        Order order5 = new Order("Bingus");

        CoffeeKiosk details = new CoffeeKiosk();

        //Method Calls
        order1.addItem(item1);
        order2.addItem(item2);
        order2.addItem(item3);
        order3.addItem(item1);
        order3.addItem(item4);
        order4.addItem(item4);
        order5.addItem(item2);
        order3.setIsReady(true);
        order5.setIsReady(true);
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
        details.getOrders();
        details.getMenu();
        details.addItem(item2);
        details.getOrders();
        details.getMenu();


        out.println("<----Done w/ App---->");

    }
}