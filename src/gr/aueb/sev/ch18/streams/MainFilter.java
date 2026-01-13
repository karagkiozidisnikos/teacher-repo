package gr.aueb.sev.ch18.streams;

import java.util.List;
import java.util.stream.Collectors;

public class MainFilter {

    public static void main(String[] args) {
        List<String> cities = List.of("Athens", "London", "Paris", "Rome", "Athens");

        // Java 10 and later var replaces the right part of the equation, meaing List<String>
        // for easier coding
        var filteredCities = cities.stream()
                .filter(city-> city.startsWith("A"))
                .toList(); // immutable List

        Iterable<String> filteredCities2 = cities.stream()
                .filter(city -> city.startsWith("R"))
                .collect(Collectors.toList());

        filteredCities.forEach(System.out::println);
    }
}
