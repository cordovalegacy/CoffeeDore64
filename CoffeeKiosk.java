import java.util.ArrayList;

class CoffeeKiosk {

    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk(){
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    public void addItem(Item item){
        int idx = menu.size();
        item.setIndex(idx);
        this.menu.add(item);
    }

    public void getMenu(){
        System.out.println(this.menu);
    }

    public void getOrders(){
        System.out.println(this.orders);
    }

}