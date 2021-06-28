package com.company;

public class Main {

    public static void main(String[] args) {
        // Loop through and print out only the even numbers
        // e.g.
        // Even Number: 96
        //   0   1     0   1    0   1    0  1   0    1
        // twoDimArray = [[13, 45], [26, 22], [1, 2], [3, 2], [30, 90]] // Multidimensional arrays. 2 dimensional array
            // 0       1          2      3       4
        // twoDimArray[0][2]

        int[][] numbers = {{13, 45}, {26, 22}, {19, 24, 28}, {20, 30, 80}, {90, 12}}; // length
        String text = "This is ";
        text += "my text";


        System.out.println(text.intern());


        for(int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) { // nested loop
//                System.out.println(numbers[i][j]);
            }
            if (i == numbers.length - 1) {
//                System.out.println("Last iteration done");
                break; // terminates a code block
            }
//            System.out.println("One iteration done");
        }


    }
}
