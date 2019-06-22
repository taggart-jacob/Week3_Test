package com.example.week3_test;


import java.util.Stack;

public class BracketsParentheses {

    public static void main(String[] args) {
        String stringFalse = "({})[]}}}}{{{}})";
        String stringTrue = "(()){()}{}[]";

        if (!orderCheck(stringFalse)){
            System.out.println("The brackets of stringFalse are not ordered with balance");
        } else{
            System.out.println("The brackets of stringFalse are ordered with balance");
        }

        if (!orderCheck(stringTrue)){
            System.out.println("The brackets of stringTrue are not ordered with balance");
        } else{
            System.out.println("The brackets of stringTrue are ordered with balance");
        }
    }

    public static boolean orderCheck(String s) {
        //creates stack
        Stack<Character> stack = new Stack<>();
        //iterates through the string's characters
        for (int i = 0; i < s.length(); i++) {
            //checks to see if the symbol is one of the bracket charters
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                //pushes the detected bracket to the top of the character stack
                stack.push(s.charAt(i));
            }
            //checks to see if the current character is  a closed bracket
            else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                //if the stack is empty and the current character is closing bracket
                if (stack.isEmpty())
                    //returns false
                    return false;
                    //this checks to see if the character at counted part of the string and the last character are facing
                    //each other
                else if (s.charAt(i) == '}' && stack.peek() == '{' || s.charAt(i) == ')' && stack.peek() == '(' || s.charAt(i) == ']' && stack.peek() == '[')
                    //gets rid of the brackets facing each other
                    stack.pop();
                else
                    return false;
            }
        }
        //returns whether or not the stack is empty. if it is, the string is balanced
        return stack.isEmpty();
    }
}
