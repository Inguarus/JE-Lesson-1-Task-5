package com.inguarus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        IsPrime myIsPrime = new IsPrime();
        System.out.print("Enter the number: ");
        myIsPrime.setLimit();
        myIsPrime.getAllPrimes();
        System.out.println("Prime numbers: ");
        myIsPrime.display();
    }
}

class IsPrime {
    private int limit;
    private List<Integer> numbers = new ArrayList<>();

    private boolean isPrime(int num) {
        boolean prime = true;
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public void setLimit() {
        Scanner scanner = new Scanner(System.in);
        limit = scanner.nextInt();
    }


    public void getAllPrimes() {
        if (limit < 2) {
            System.out.println("The number must be greater than 2!");
        } else {
            for (int i = 2; i <= limit; i++) {
                if (isPrime(i)) {
                    numbers.add(i);
                }
            }
        }
    }


    public void display() {
        System.out.println(numbers);
    }
}
