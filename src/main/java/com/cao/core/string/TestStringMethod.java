package com.cao.core.string;

public class TestStringMethod {

    public static void main(String[] args) {
        String s = "aaa";
        String s1 = "aaa";
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s == s1);
    }
}
