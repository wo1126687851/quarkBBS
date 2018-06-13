package com.quark.admin.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by zsq on 2018/5/14.
 */
public class Java8Tester {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("abc");
        list.forEach(System.out::println);
        System.out.println("________________________");
        Stream<String> stream = list.stream();
        stream.filter((x)->{
            //return x.contains("b");
            //return x.indexOf("b") != -1;
            return x.startsWith("b");
        }).map((x)->{
            return x;
        }).forEach(System.out::println);
    }
}
