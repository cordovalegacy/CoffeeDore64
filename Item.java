
public class Item {
    //when private access modifier, we have to use getter and setter methods in App to play with attributes
    private String name;
    private double price;
    private int idx;

    //constructor
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){ //getter
        return this.name;
    }

    public void setName(String name){ //setter
        this.name = name;
    }

    public double getPrice(){ //getter
        return this.price;
    }

    public void setPrice(double price){ //setter
        this.price = price;
    }

    public void setIndex(int idx){
        this.idx = idx;
    }

}