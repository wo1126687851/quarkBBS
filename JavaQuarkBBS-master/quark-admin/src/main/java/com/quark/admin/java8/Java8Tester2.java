package com.quark.admin.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by zsq on 2018/5/14.
 */
public class Java8Tester2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        long count = 0;
         count = strings.stream().filter(x -> x.isEmpty()).count();
        System.out.println("集合中元素为空得长度是:"+count);
        count = strings.stream().filter(x -> x.length() == 3).count();
        System.out.println("集合中元素得长度是3的个数是："+count);
        List<String> filtered = new ArrayList<>();
        filtered = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.toList());
        System.out.println("筛选后的列表: " + filtered);
        String mergedString = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("合并字符串: " + mergedString);
        List<Integer> squaresList = new ArrayList<>();
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        squaresList = numbers.stream().map( i ->i*i).distinct().collect(Collectors.toList());
        System.out.println("Squares List: " + squaresList);
       // System.out.println("列表: " +integers);

    }
}
