package com.quark.admin.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by zsq on 2018/5/14.
 */
public class LambdaSort {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 11,5, 6, 7, 8, 9, 10);
        Collections.sort(numbers, (x, y) -> y.compareTo(x));
        System.out.println(numbers);
    }
}
