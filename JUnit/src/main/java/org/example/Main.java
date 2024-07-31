package org.example;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.concat("a", "b"));
    }

    public String concat(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException("Input strings should not be null");
        }
        return str1 + str2;
    }

}