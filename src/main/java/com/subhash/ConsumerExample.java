package com.subhash;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> convertAndDisplay = input -> System.out.println(input.toUpperCase());
        convertAndDisplay.accept("hello");

        Consumer<String> appendInput = input -> System.out.println("New value after appending is: " + "Hello " + input);

        //First appendInput is run with input and obj reference present in andThen will be run
        appendInput.andThen(convertAndDisplay).accept("Java 8");
    }
}
