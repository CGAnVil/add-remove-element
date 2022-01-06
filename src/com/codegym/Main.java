package com.codegym;

public class Main {

    public static void main(String[] args) {
        String[] array = {"viet", "binh", "luyt", "Chien"};
        System.out.println("--Mang ban dau--");
        for (String element : array) {
            System.out.println(element);
        }
        String[] newArray = addNewElementToArray(array, 2, "Sang");
        System.out.println("--Mang sau khi them--");
        for (String element : newArray) {
            System.out.println(element);
        }
        String[] newArray2 = removeElement(array, 2);
        System.out.println("--Mang sau khi xoa--");
        for (String element : newArray2) {
            System.out.println(element);
        }
    }

    public static String[] addNewElementToArray(String[] array, int index, String value) {
        String[] newArray = new String[array.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else if (i == index) {
                newArray[i] = value;
            } else {
                newArray[i] = array[i - 1];
            }
        }
        return newArray;
    }

    public static String[] removeElement(String[] array, int index) {
        String[] newArray = new String[array.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else {
                newArray[i] = array[i + 1];
            }
        }
        return newArray;
    }
}
