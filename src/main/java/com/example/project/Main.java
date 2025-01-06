package com.example.project;

public class Main {
    public static void main(String[] args) {
        Fibonacci fib3 = new Fibonacci(5);
        System.out.println(fib3.fibonacciString());

        int[] seq3 = fib3.getSequence();
        seq3[0] = 100;

        System.out.println(fib3.fibonacciString());
        
        Fibonacci fib0 = new Fibonacci(5);
        Fibonacci fib1 = new Fibonacci(11);
        Fibonacci fib2 = new Fibonacci(20);
        Fibonacci[] fibonaccis = {fib0, fib1, fib2};
        for (Fibonacci fib: fibonaccis) {
            System.out.println(fib.getSequence().length);
        } 
    }
}