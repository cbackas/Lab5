// Lab 5d
// Zachary Gibson
// 60975

package cback;

import java.util.Scanner;

public class Lab5d {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextDouble()) {
            String line = scan.nextLine();

            processLine(line);
        }
    }

    public static void processLine(String line) {
        Scanner lineScan = new Scanner(line);

        double sum = 0;
        double count = 0;
        double product = 1;
        while (lineScan.hasNextDouble()) {
            double curDouble = lineScan.nextDouble();
            sum += curDouble;
            product *= curDouble;
            count++;
        }

        double average = sum / count;

        System.out.printf("Sum: %.2f, Product: %.2f, Average: %.2f\n", sum, product, average);
    }
}
