package com.demo.number;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsEffective {

    public static List<Integer> primeFactors(int numbers) {
        int n = numbers;
        List<Integer> factors = new ArrayList<Integer>();
        System.out.println("start...");
        
        for (int i = 2; i <= n / i; i++) {
            System.out.println("n=" + n);
            while (n % i == 0) {
                factors.add(i);
                n /= i;
                System.out.println("n:::" + n);
            }
        }
        
        if (n > 1) {
            factors.add(n);
        }
        System.out.println("end...");
        return factors;
    }

    public static void main(String[] args) {
        System.out.println("Primefactors of 12345678");
        for (Integer integer : primeFactors(12345678)) {
            System.out.println(integer);
        }
        // System.out.println("Primefactors of 3");
        // for (Integer integer : primeFactors(3)) {
        // System.out.println(integer);
        // }
        // System.out.println("Primefactors of 32");
        // for (Integer integer : primeFactors(32)) {
        // System.out.println(integer);
        // }
    }

}
