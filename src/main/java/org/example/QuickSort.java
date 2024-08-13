package org.example;

public class QuickSort {

    // Main method to perform quick sort
    public static void quickSort(int[] arr, int low, int high)  {
        if (low < high) {

            //Partition the array to get the pivot index
            int pivotIndex = partition(arr, low, high);

            // recursively sort elements before and after the pivot
            quickSort(arr, low, pivotIndex - 1);                // Sort before
            quickSort(arr, pivotIndex + 1, high);               // Sort after
        }
    }

    //Method to patition the array around the pivot
    public static int partition(int[] arr, int low, int high) {

        //Chooses the last element as the pivot
        int pivot = arr[high];
        int i = low - 1;                                // Index of smaller element

        //traverse through all elements
        for ( int j = low; j < high; j++) {
            if (arr[j] <= pivot) {                      //if the current element is smaller than or equal to the pivot
                i++;                                    //increment the index of the smaller element

                //swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    //Main method to sort quickSort function
    public static void main(String[] args) {

        int[] arr1 = {10, 2, 3, 6, 7, 4};
        int N1 = arr1.length;                               // Swap arr[i + 1] and arr[high] (or pivot)
        quickSort(arr1, 0, N1 - 1);               // Sort arr1 using quickSort
        System.out.println("Array 1 sorted: ");;
        for (int i : arr1) {
            System.out.println(i + " ");
        }
        System.out.println();

        int[] arr2 = {101, 12, 31, 61, 17, 14};
        int N2 = arr2.length;
        quickSort(arr2, 0 , N2 - 1);
        System.out.println("Array 2 sorted: ");
        for (int i : arr2) {
            System.out.println(i + " ");
    }
        System.out.println();
}
}

