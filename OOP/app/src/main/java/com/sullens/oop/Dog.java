package com.sullens.oop;

public class Dog extends Animal {
    public void test(){
        super.sing();
    }

    public void sing() {
        System.out.println("dog class");
    }
}