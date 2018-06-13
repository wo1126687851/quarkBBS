package com.quark.admin.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by zsq on 2018/5/14.
 */
public class StreamTest1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = numbers.stream();
        stream.filter((x)->{
            return  x % 2 == 0;
        }).map((x) ->{
            return  x * x;
        }).limit(10).forEach(System.out::println);
    }
}
