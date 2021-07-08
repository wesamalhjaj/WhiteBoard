package com.company;

import java.util.Arrays;

class recursion {

 public static void recursive(int[]arr){
     System.out.print(arr[0]+",");
     if (arr.length >1)
     recursive(Arrays.copyOfRange(arr,1,arr.length));
    }
}
public class Main {

    public static void main(String[] args) {
        {
            int [] a = {1,3,2,56,8,0,4,23};
             recursion.recursive(a);
        }
    }
}