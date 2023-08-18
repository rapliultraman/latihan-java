package com.sun;

public class List {
    private int[] value;

    public List(int size) {
        value = new int[size];
    }

    public int getValue(int index) {
        return value[index];
    }

    public void setValue(int value, int index) {
        this.value[index] = value;
    }

    public void printArray() {
        for (int val : value) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
