import java.util.ArrayList;

public class Order {
    private String name;
    private boolean isReady;
    private ArrayList<Item> items; //pulls from Item class as type

    //base constructor
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    //overloaded constructor (different signature, parameters)
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    //add an object to the ArrayList
    public void addItem(Item item){
        items.add(item); //item is an object
    }

    public String getStatusMessage(){
        if(isReady){
            return "Your order is ready";
        }
        return "Your order is not ready yet";
    }

    public double getOrderTotal(){
        double total = 0;
        for(Item item: items){
            total += item.getPrice();
        }
        return total;
    }

    public void display(){
        System.out.println("<---" + this.name + "--->");
        for(Item item: items){ //for-in loop. For item in items...
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println(getStatusMessage());
        System.out.println("Total: $" + getOrderTotal());
    }

    public String getName(){ //getter
        return this.name;
    }

    public void setName(String name){ //setter
        this.name = name;
    }

    public boolean getIsReady(){ //getter
        return this.isReady;
    }

    public void setIsReady(boolean isReady){ //setter
        this.isReady = isReady;
    }

    public ArrayList<Item> getItems(){ //getter
        return this.items;
    }

    public void setItems(ArrayList<Item> items){ //setter
        this.items = items;
    }

}