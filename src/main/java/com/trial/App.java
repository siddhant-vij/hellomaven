package com.trial;

public class App {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please pass two arguments!");
            return;
        }
        System.out.println(sum(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }
}
