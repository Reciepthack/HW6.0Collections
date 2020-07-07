package main.java.com.homework6.collect;

import java.util.ArrayList;

public class Fruit {

    public void findOne() {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Avocado");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Pinapple");
        fruits.add("Cherry");

        if (fruits.contains("Orange")){
            fruits.set(fruits.indexOf("Orange"), "Grapefruit");
            System.out.println(fruits);
        }
        else {
            System.out.println("There is not Orange");
        }
    }
}
