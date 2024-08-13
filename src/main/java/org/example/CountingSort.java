package org.example;

public class CountingSort {

    public static String countSort(String arr) {
        int[] count = new int[30];                      //Frequency array for lowercase letters

        //count the frequency of each character in the string
        for (char c : arr.toCharArray()) {
            count[c - 'a']++;                           // Increment the count for this character
        }

        StringBuilder sortedString = new StringBuilder();       // To build the sorted string

            //Construct the sorted string using the frequency array
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j< count[i]; j++) {
                sortedString.append((char) (i + 'a'));        //Append character based on frequency
            }
        }

        return sortedString.toString();                         // Convert StringBuilder to String and return it
    }

    public static void main(String[] args) {

        String s1 = "jksldfjjsldkjjowei";
        System.out.println("Sorted string 1: " + countSort(s1));

        String s2 = "pqiurehfqenrvclzjk";
        System.out.println("Sorted string 2: " + countSort(s2));
    }
}
