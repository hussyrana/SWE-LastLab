package com.example.service;

import java.util.ArrayList;
import java.util.List;

public class ArrayFlattenerService {
    public Integer[] flattenArray(Integer[][] array) {
        if (array==null)
            return  null;
        List<Integer> list = new ArrayList<>();
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                list.add(array[i][j]);
            }
        }
//        int[] arr = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            arr[i] = list.get(i);
//        }
//        return arr;
        return list.toArray(new Integer[0]);
    }
}
