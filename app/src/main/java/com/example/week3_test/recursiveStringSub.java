package com.example.week3_test;

//Still really trying to get recursion down because I didn't deal with it at all in my major
//I keep watching tutorials, but I can tell it takes a little bit to sink in fully

public class recursiveStringSub {
    static int count = 0;

    public static void main(String[] args) {
        System.out.print(copySubs("cacowadcat", "cat", 2));
    }

    private static boolean copySubs(String catcowcat, String string, int num) {

        if (catcowcat.contains(string)){
            count++;
            String newString = catcowcat.replaceFirst(string, string.substring(0, 1));

            return copySubs(newString, string, num);
        }
        else if (num == count){
            return true;
        }
        else{
            return false;
        }
    }
}
