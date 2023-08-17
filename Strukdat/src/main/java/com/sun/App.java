package com.sun;

public class App {
    public static void main(String[] args) {
        List myList = new List(5);

        myList.setValue(1, 0);
        myList.setValue(2, 1);
        myList.setValue(3, 2);
        myList.setValue(4, 3);
        myList.setValue(5, 4);

        System.out.println("Value at index 0: " + myList.getValue(0));
        System.out.println("Value at index 1: " + myList.getValue(1));
        System.out.println("Value at index 2: " + myList.getValue(2));
        System.out.println("Value at index 3: " + myList.getValue(3));
        System.out.println("Value at index 4: " + myList.getValue(4));

        System.out.println("Array:");
        myList.printArray();         
    }
}

