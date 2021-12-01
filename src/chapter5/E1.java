/*
 * (Count positive and negative numbers and compute the average of numbers).
 * Write a program that reads an unspecified number of integers, determines how
 * many positive and negative values have been read, and computes the total and average
 * of the input values (not counting zeros). Your program ends with the input 0.
 * Display the average as a floating-point number
 * */

package chapter5;

import java.util.Scanner;

public class E1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int positives = 0;
        int negatives = 0;
        double total = 0;
        int count = 0;
        double average = 0;

        int a;

        do {
            a = sc.nextInt();

            if ( a > 0 ) {
                positives++;
                count++;
            } else if ( a < 0 ) {
                negatives++;
                count++;
            }

            total += a;


        } while (a != 0 );

        System.out.println("The number of positives is " + positives);
        System.out.println("The number of negatives is " + negatives);
        System.out.println("The total is " + total);

        if ( count > 0 ) {
            average = total / count;
        }

        System.out.println("The average is " + average );

    }

}
