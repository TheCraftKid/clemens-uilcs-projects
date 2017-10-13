package com.thecraftkid.uilcs;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ProblemOne {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        // One
        for (Integer number : numbers) {
            System.out.println(number);
        }
        // Two
        ListIterator iterator = numbers.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Three
        numbers.listIterator().forEachRemaining(System.out::println);
        // Four
        numbers.forEach(System.out::println);
    }
}