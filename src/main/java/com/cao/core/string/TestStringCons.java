package com.cao.core.string;

import java.nio.charset.Charset;

public class TestStringCons {
    public static void main(String[] args) {

        //String()
        String one = new String();
        System.out.println(one);

        //String(String original)
        String two = new String("two");
        System.out.println(two);

        //String(char value[])
        String three = new String(new char[]{'t', 'h', 'r', 'e', 'e'});
        System.out.println(three);

        //String(char value[], int offset, int count)
        String four = new String(new char[]{'t', 'f', 'o', 'u', 'r'}, 1, 4);
        System.out.println(four);


        //String(int[] codePoints, int offset, int count)
        String five = new String(new int[]{102, 105, 118, 101}, 0, 4);
        System.out.println(five);

        //String(byte bytes[], int offset, int length, String charsetName)
        try {
            String six = new String(new byte[]{81, 82, 83}, 1,2, "UTF-8");
            System.out.println("six = " + six);
        } catch (Exception e) {
        }

        //String(byte bytes[], int offset, int length, Charset charset)
        String seven = new String(new byte[]{81, 82, 83}, 1,2, Charset.defaultCharset());
        System.out.println("seven = " + seven);

        //String(byte bytes[], String charsetName)
        try {
            String eight = new String(new byte[]{81, 82, 83}, "UTF-8");
            System.out.println("eight = " + eight);
        } catch (Exception e) {
        }

        //String(byte bytes[], Charset charset)
        String nine = new String(new byte[]{81, 82, 83}, Charset.defaultCharset());
        System.out.println("nine = " + nine);

        //String(byte bytes[], int offset, int length)
        String ten = new String(new byte[]{81, 82, 83}, 1, 1);
        System.out.println("ten = " + ten);

        //String(byte bytes[])
        String eleven  = new String(new byte[]{81, 82, 83});
        System.out.println("eleven = " + eleven );

        //String(StringBuffer buffer)线程安全
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("twelve");
        String twelve = new String(stringBuffer);
        System.out.println("twelve = " + twelve);

        //String(StringBuilder builder)非线程安全
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("thirteen");
        String thirteen = new String(stringBuilder);
        System.out.println("thirteen" + thirteen);


    }
}
