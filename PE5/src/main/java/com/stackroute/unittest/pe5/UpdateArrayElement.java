package com.stackroute.unittest.pe5;
import java.util.*;
import java.io.*;
import java.util.*;

/*
        Write a Java program to update specific array element by given element and empty the array list .
    Input: [Apple, Grape, Melon, Berry]
    Output: [Kiwi, Grape, Mango, Berry]
    Array list after removing all elements []
 */
public class UpdateArrayElement {
    public static void main(String[] args) {


       // public void addRemoveArray{
            ArrayList<String> fruitsList = new ArrayList<String>(Arrays.asList("Apple", "Grape", "Melon", "Berry"));

            System.out.println(fruitsList);

            //Replace item while iterating
            for (int i = 0; i < fruitsList.size(); i++) {
                if (fruitsList.get(i).equalsIgnoreCase("Apple")) {
                    fruitsList.set(i, "Kiwi");
                }
            }

            System.out.println(fruitsList);
            //return(namesList);
            fruitsList.clear();
            System.out.println("The ArrayList after clearing is" + fruitsList);
        }
    }
