package org.example;


import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));

    }
    public static boolean checkForPalindrome(String str){
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static String convertDecimalToBinary(int number){
        ArrayList<Integer> list = new ArrayList<>();

        if (number == 0) {
            return "0";
        }

        while (number > 0) {
            list.add(number % 2);
            number = number / 2;
        }

        Collections.reverse(list);
        StringBuilder numbers = new StringBuilder();
        for (Integer num : list) {
            numbers.append(num);
        }
        String result = numbers.toString();

        return result;
    }

}