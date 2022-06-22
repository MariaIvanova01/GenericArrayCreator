package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator <T> {

     public static <T> T[] create(int lenhgt, T defoultValue){
         T[] arr = (T[])Array.newInstance(defoultValue.getClass(), lenhgt);

         Arrays.fill(arr, defoultValue);

         return arr;
     }

     public static <T> T[] create(Class<T> clazz, int length, T defoultValue){
         T[] arr = (T[])Array.newInstance(clazz, length);

         Arrays.fill(arr, defoultValue);

         return arr;
     }

}
