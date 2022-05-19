package com.Bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.*;

public class Workshop1 {
    public static void main(String[] args) {

        //write a java program How to change a collection to an array ?

        List<String> list = new ArrayList<String>();

        System.out.println("list is starts from akshay");
        list.add("1. swapnil");
        list.add("2. akshay");
        list.add("3. rajesh");
        list.add("4. rohan");
        list.add("5. rahul");

        String[] str = list.toArray(String[]::new);

        
        for (int i=1; i<str.length; i++ ){
            String data = str[i];
            System.out.println(data);
        }
    }
}