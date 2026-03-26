package com.subhash;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        Function<String, String> convertStr = input -> input.toUpperCase();

        System.out.println("Convert to upper case "+ convertStr.apply("hello"));

        //static method.
        Function<String, String> sameValue = Function.identity();

        System.out.println("Same value "+ sameValue.apply("hello"));
    }
}
