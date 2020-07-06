package main.java.com.homework6.collect;

import java.util.ArrayList;

public class FindElement {

    public void findIn() {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        first.add(2);
        first.add(5);
        first.add(12);
        first.add(24);

        second.add(5);
        second.add(8);
        second.add(10);
        second.add(12);

        first.retainAll(second);
        System.out.println("Symmetric performance: " + first);
    }
}
