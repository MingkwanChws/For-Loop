package com.company;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Main {
    public static void lesson1() {
        for (int i = 1; i <= 7; i++) {
            System.out.println(i);
        }
        System.out.println("--------------");
    }
    public static void evenNumber() {
        for (int k = 2; k <= 15; k = k+2){
            System.out.println(k);
        }
        System.out.println("--------------");
    }

    public static void main(String[] args) {
        lesson1();
        evenNumber();
    }
}
