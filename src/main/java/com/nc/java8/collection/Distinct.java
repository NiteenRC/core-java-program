package com.nc.java8.collection;

import java.util.Arrays;

/**
 * Given the list of numbers, remove the duplicate elements from the list
 */
public class Distinct {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 3, 2, 4, 2};
        Arrays.stream(intArr).boxed()
                .distinct()
                //.collect(Collectors.toSet()) // alternative convert to set
                .forEach(System.out::println);
    }
}
