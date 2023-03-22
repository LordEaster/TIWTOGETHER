package Vehicle;

import java.util.ArrayList;

public class Truck extends Vehicle{
    ArrayList<Item> item = new ArrayList<Item>();
    
    public Truck(String name) {
        super(name);
    }
    
    public void move(){
        if(calWeigh()>2000){
            System.out.println("I can't move it move it anymore");
        }else{
            System.out.println("I'm movin like a truck");
        }
    }

    public void addItem(String name , int weigh){
        item.add(new Item(name,weigh));
    }

    public void remove(String name){
        for(Item i : item){
            if(i.getName().equals(name)){
                item.remove(i);
                break;
            }
        }
    }

    public int calWeigh(){
        int weigh=0;
        for(Item i : item){
            weigh += i.getWeigh();
        }
        return weigh;
    }
}
