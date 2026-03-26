package com.subhash;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> isEven = i -> i % 2 == 0;
        System.out.println("Is number 49 even " + isEven.test(41));

        Predicate<Integer> isGreaterThan50 = i -> i > 50;
        System.out.println("Is no 49 greater than 50 " + isGreaterThan50.and(isEven).test(49));
        System.out.println("Is no 49 greater than 50 " + isGreaterThan50.or(isEven).test(49));
        System.out.println("Is number 49 odd " + isEven.negate().test(41));

        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35, 40, 45, 50);
        List<Integer> collect = list.stream().filter(isEven).toList();
        System.out.println("Even numbers from the list " + collect);


    }
}

