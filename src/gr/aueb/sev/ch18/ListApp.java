package gr.aueb.sev.ch18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListApp {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        cities.add("Athens");
        cities.add("Thessaloniki");
        cities.add("Patras");

        System.out.println("City: " + cities.get(0)); //Athens

        int position = cities.indexOf("Patras");

        if (position == -1) {
            System.out.println("City not found");
        }else {
            cities.set(position, "Larisa"); // Update the list
        }

        if(cities.contains("Larisa")) {
            cities.remove("Larisa");
        } else {
            System.out.println("City not found");
        }

        for(String city : cities) {
            System.out.println(city);
        }

        Iterator<String> iterator = cities.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        cities.forEach(System.out::println); // recommended way for traversal, it needs lambda

    }
}
