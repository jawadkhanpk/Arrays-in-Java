package com.company;

public class Multi_Dimensional_Array {
    public static void main(String[] args) {

        int [] [] arr = new int[2][3];

        //this block is row 1, such that 0 mean row number 1
        arr [0][0]= 101;            // row 1 column 1
        arr [0][1]= 102;            // row 1 column 2
        arr [0][2]= 103;            // row 1 column 3

        //this block is row 2, such that 1 mean row number 2
        arr [1][0]= 104;            // row 2 column 1
        arr [1][1]= 105;            // row 2 column 2
        arr [1][2]= 106;            // row 2 column 3

//        Displaying 2-D array

        for (int i=0; i<arr.length; i++){

            for (int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
