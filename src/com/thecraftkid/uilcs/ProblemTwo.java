package com.thecraftkid.uilcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProblemTwo {

    private static final String DATA_SOURCE = "a_two.dat";

    public static void main(String[] args) {
        for (int number : readData()) {
            System.out.println(Arrays.toString(getLargestTwinPrimes(number)));
        }
    }

    /**
     * Converts the given file into a readable list of data.
     */
    public static List<Integer> readData() {
        Scanner scanner = new Scanner(DATA_SOURCE);
        List<Integer> numbers = new ArrayList<>();
        while (scanner.hasNext()) {
            numbers.add(scanner.nextInt());
        }
        return numbers;
    }

    public static int[] getLargestTwinPrimes(int n) {
        int[] twinPrimes = new int[2];
        int lastPrime = 0;
        for (int i = 0; i < n; i++) {
            if (getIsTwinPrime(lastPrime, n)) {
                twinPrimes[0] = lastPrime;
                twinPrimes[1] = n;
            }
        }
        return twinPrimes;
    }

    /**
     * Returns whether or not two consecutive odd numbers are both prime numbers.
     *
     * @param x Must be greater than y
     * @param y
     * @return
     */
    public static boolean getIsTwinPrime(int x, int y) {
        return true;
    }
}
