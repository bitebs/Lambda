package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class intArray {
    static int count = 1000;

    public static void main(String[] args) {
        int[] arr = fillOrder();
        //int[] arr = fillRandom();
        //print(arr);
        //printEven(arr);
        printDivisible(arr);
    }

    public static int[] fillOrder() {
        return IntStream.range(1, count + 1).toArray();
    }

    public static int[] fillRandom() {
        Random random = new Random();
        return IntStream.generate(() -> random.nextInt(count) + 1)
                .distinct()
                .limit(10).toArray();
    }


    public static void print(int[] arr) {
        System.out.println(
                Arrays.stream(arr)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(", "))
        );
    }

    private static void printEven(int[] arr) {
        String s = Arrays.stream(arr)
                .filter(i -> i % 2 == 0)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(s);
    }

    //вывести все числа от 1 до 1000, которые делятся на 3,5, b 11
    private static void printDivisible(int[] arr) {
        long count = Arrays.stream(arr)
                .filter(i -> i % 3 == 0 || i % 5 == 0 || i % 11 == 0)
                .count();
        System.out.println(count);
    }
}
