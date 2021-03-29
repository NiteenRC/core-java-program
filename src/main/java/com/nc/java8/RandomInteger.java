package com.nc.java8;

import java.util.stream.IntStream;

/**
 * # program to generate 5 Random numbers between 100-200 using java 8 lambda
 */
public class RandomInteger {
    public static void main(String[] args) {
        IntStream stream = IntStream.generate(()
                -> {
            return (int) (Math.random() * 100);
        });

        stream.limit(10).forEach(System.out::println);
    }
}
