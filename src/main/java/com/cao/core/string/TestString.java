package com.cao.core.string;

import java.nio.charset.Charset;

public class TestString {
    public static void main(String[] args) {

        System.out.println("");

        byte [] aa = {81, 82, 83};
        System.out.println(new String(aa, 1, 2, Charset.defaultCharset()));
    }
}
