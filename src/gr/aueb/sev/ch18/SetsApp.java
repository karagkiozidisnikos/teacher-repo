package gr.aueb.sev.ch18;

import java.util.HashSet;
import java.util.Set;

public class SetsApp {

    public static void main(String[] args) {
        Set<String> bag = new HashSet<String>();

        bag.add("apple");
        bag.add("orange");
        bag.add("pear");

        if (bag.contains("apple")) {
            bag.remove("apple");
        } else {
            System.out.println("Item not found!");
        }

        bag.forEach(System.out::println);
    }
}
