package org.example;

public class BubbleSort {

    //Performs bubble sort on a given array
    public static void bubblesort(int[] arr, int N) {               //Param arr the array to be sorted | Param N the number of elements in the array

        //Loop through all array elements save for the last one
        for (int i = 0; i < N - 1; i++) {

            //flag to check if any swapping occurs in this pass
            boolean swapped = false;

            //traverse the array from start to end minus the number of passes
            //the range reduces with each pass as the largest elements are placed at the end
            for (int j = 0;j < N - 1; j++) {

                //Compare adjacent elements
                if (arr[j] > arr[j + 1]) {

                    //swap arr[j] and arr[j+1] if they are out of order
                    int temp = arr[j];                             // Temporarily store the value at arr[j]
                    arr[j] = arr[j + 1];                             // Move the value at arr[j + 1] to arr [j]
                    arr[j + 1] = temp;                               // Move the temporarily stores value to arr[j + 1]
                    swapped = true;                                // Set the flag to true as swap occurred
                }
            }

            // If no elements were swapped the array is sorted
            if(!swapped) {
                break;                                              //exit loop early as array is sorted

        }
    }
}

public static void main(String[] args) {
    int[] arr1 = {4, 5, 7, 3, 9, 8, 1};
    int N1 = arr1.length;                                           // get number of elements in array 1
    bubblesort(arr1, N1);                                           // Sort arr1 using bubble sort
    System.out.println("Array 1 sorted");

    for (int i : arr1) {
        System.out.printf(i + " ");
    }
    System.out.println();

    int[] arr2 = {7, 6, 5, 4, 3, 2, 1};
    int N2 = arr2.length;
    bubblesort(arr2,N2);
    System.out.println("Array 2 sorted");

    for (int i : arr2) {
        System.out.println(i + " ");
    }
    System.out.println();
}
}
