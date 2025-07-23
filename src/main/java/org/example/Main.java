package org.example;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {


    public static boolean checkForPalindrome(String string) {
        String kelime = string.toLowerCase().replaceAll("[ .,?!_-]", "");
        String[] arraykelime = kelime.split("");
        List<String> arrayList = new ArrayList<>(List.of(arraykelime));
        List<String> reversedArray = new ArrayList<>();

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            reversedArray.add(arrayList.get(i));
        }
        return reversedArray.equals(arrayList);
    }


    public static String convertDecimalToBinary(int i) {
        String binaryNum = "";
        int sayi = i;

        while (true) {

            if (sayi == 0) {
                binaryNum += "0";
                break;
            } else if (sayi == 1) {
                binaryNum += "1";
                break;
            }

            if (sayi % 2 == 1) {
                binaryNum += "1";
                sayi = sayi / 2;
            } else {
                binaryNum += "0";
                sayi = sayi / 2;
            }
        }

        String reverse = "";
        for (int o = binaryNum.length() - 1; o >= 0; o--) {
            reverse += binaryNum.charAt(o);
        }
        return reverse;
    }


    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));

        WorkintechList workintech = new WorkintechList();
        workintech.add("ucubik");
        workintech.add("ucubik");
        System.out.println(workintech);
        System.out.println(convertDecimalToBinary(13));
    }


}
