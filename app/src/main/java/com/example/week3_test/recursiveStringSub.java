package com.example.week3_test;

//Still really trying to get recursion down because I didn't deal with it at all in my major
//I keep watching tutorials, but I can tell it takes a little bit to sink in fully

public class recursiveStringSub {
    static int count = 0;

    public static void main(String[] args) {
        System.out.print(copySubs("catcowcat", "cat", 2));
    }

    private static boolean copySubs(String catcowcat, String string, int num) {
        int length1 = catcowcat.length();
        int length2 = string.length();


        if (length1 == 0 || length1 < length2) {
            return false;
        }

        if (catcowcat.substring(0, length2).equals(string)) {
            count += 1;
            if (num == count) {
                return true;
            } else
                return copySubs(catcowcat.substring(length2 - 1),
                        string, num);
        }
        if (catcowcat.substring(length2 - 1).equals(string)) {
            if (num == count) {
                return true;
            }
        }
        return false;

    }
}
