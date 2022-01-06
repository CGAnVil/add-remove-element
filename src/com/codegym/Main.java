package com.codegym;

public class Main {

    public static void main(String[] args) {
        String[] array = {"viet", "binh", "luyt", "Chien"};
        String[] array2 = {"Minh", "Sang"};
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

        String [] newArray3 = mergeArray(array,array2);
        System.out.println("--Mang sau khi gop--");
        for (String element : newArray3) {
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

    public static String[] mergeArray(String[] array1, String[] array2){
        String [] newArray = new String[array1.length + array2.length];
        for (int i = 0; i < newArray.length ; i++) {
            if (i < array1.length) {
                newArray[i] = array1[i];
            } else {
                newArray[i] = array2[i - array1.length];
            }
        }
        return newArray;
    }
}
