package com.example.webfluxdemo.util;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5)
                .peek(i -> System.out.println("Stream::"+ i))
                .filter(i -> i % 2 == 0)
                .peek(i -> System.out.println("Filter::"+i))
                .map(i -> i * i )
                .peek(i -> System.out.println("Map::"+ i))
                .limit(2)
                .forEach(System.out::println);

    }
}
