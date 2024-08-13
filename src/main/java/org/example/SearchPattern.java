package org.example;

import java.util.ArrayList;
import java.util.List;

public class SearchPattern {

    public static List<Integer> search(String S, String pat) {


        String concat = pat + "$" + S;                              //Concatenate pattern, separator and text
        int l = concat.length();                                    // Length of Concatenated string
        int[] Z = new int[l];                                       // Z array to store Z values
        List<Integer> result = new ArrayList<>();                   //List to store the result indices

        int left = 0, right = 0;
        for (int i = 1; i < l; i++) {
            if (i > right) {
                left = right = i;                                   //reset window
                while (right < l && concat.charAt(right) == concat.charAt(right - left)) {
                    right++;                                        //Expand the window
                }
                Z[i] = right - left;                                //Update the Z value
                right--;                                            //Move the right boundary back
            } else {
                int k = i - left;                                   //Relative position in the window
                if (Z[k] < right - i + 1) {
                    Z[i] = Z[k];                                //Copy the z value
                } else {
                    left = i;                                       //Shift the window
                    while (right < l && concat.charAt(right) == concat.charAt(right - left)) {
                        right++;                                   //expand the window
                    }
                    Z[i] = right - left;
                    right--;
                }
            }

            //Check if pattern is found
            if (Z[i] == pat.length()) {
                result.add(i - pat.length());                   //Add the start index
            }
        }

        //Convert to 1-based index
        for (int i = 0; i < result.size(); i++) {
            result.set(i, result.get(i) - pat.length() + 1);
        }
        return result;
    }

    // Main method to test search function
    public static void main (String[] args){

        String S1 = "thelittleenginethatcould";
        String pat1 = "that";

        System.out.println("Pattern found at indices: " + search(S1, pat1));

        String S2 = "hereisalittlediddyaboutjackanddiane";
        String pat2 = "our";
        System.out.println("Pattern found at indices: " + search(S2, pat2));
    }
}


