package com.company;

public class Practice_Set {
    public static void main(String[] args) {

                                                // Problem #1 create an array of 5 floats and calculate their sum
        /*float [] arr = {1.5f,2.5f,3.5f,4.5f,5.5f};
        float sum = 0;


        for (float elements: arr){
            sum = sum + elements;

        }
        System.out.println(sum);*/
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        // Problem #2 to find that whether integer is present in an array or not

  /*      float [] arr = {1.5f,2.5f,3.5f,4.5f,5.5f};
        float num = 3.5f;
        boolean isAnArray=false;


        for (float element: arr){
            if (num==element){
                isAnArray=true;
                break;
            }

        }

        if (isAnArray){
            System.out.println("value is present in the array");
        }
        else
        {
            System.out.println("value is not present in the array");
        }
*/
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // Problem #3 to calculate the average of marks stored in array

//       float [] marks = {1.5f,2.5f,3.5f,4.5f,5.5f};
//        float sum = 0;
//
//        for (float elements: marks){
//            sum = sum + elements;
//
//        }
//        System.out.print("the average is: ");
//        System.out.println(sum/marks.length);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // Problem #4 to make two matrices using 2-D array and addition of 2-D array

        /*int [][]mat1 = { {1,2,3},
                        {4,5,6}};

        int [][]mat2 = { {7,8,9},
                         {10,11,12}};

        int [][]result = { {0,0,0},
                            {0,0,0}};


        for (int i=0; i<mat1.length; i++)                 // row number of times
        {
            for (int j=0; j<mat1[i].length; j++)          // column number of times
            {
                System.out.format("Setting values for i=%d and j=%d\n" ,i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        //Printing elements of a 2-D array
        for (int i=0; i<mat1.length; i++ ){              // row number of times
            for (int j=0; j<mat1[i].length; j++){       // column number of times

                System.out.print(result[i][j] + " ");

                result[i][j]=mat1[i][j] + mat2[i][j];
            }
            System.out.println(" ");
        }*/

        // Problem 5 to reverse an array
       /* int [] arr = {1,2,3,4,5,6};

        int l = arr.length;
//        int temp;
        int n= Math.floorDiv(2,1);


        for (int i=0; i<n; i++)
        {
            // swap a[i] and a[l-1-i]
            // |4| |3|
            int temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for (int element: arr)
        {
            System.out.print(element+ " ");
        }*/

        // Problem 6 to find the maximum number in the array

        /*int [] arr = {1,992,3,46,590,666};
        int max =0;
        for (int  element: arr){
            if (element>max)
                max = element;

        }
        System.out.println("maximum is :"+ max);*/

        // Problem 7 to know if the array is sorted or not

//        int [] arr = {1,2,3,4,5,6};
//        boolean isSorted = true;
//        for (int i =0; i<arr.length-1; i++){
//          if  (arr[i] > arr[i+1]) {
//                    isSorted = false;
//                    break;
//            }
//        }
//        if (isSorted){
//            System.out.println("Sorted");
//        }
//        else
//        {
//            System.out.println("not sorted");
//        }

    }
}
