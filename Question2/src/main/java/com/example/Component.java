package com.example;

import com.example.service.ArrayFlattenerService;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Component {
    private ArrayFlattenerService arrayFlattenerService;

    public Component(ArrayFlattenerService arrayFlattenerService){
        this.arrayFlattenerService = arrayFlattenerService;
    }

    public Integer[] reverseArray(Integer[][] array) {
        if(array == null)
            return null;
        Integer[] arr = arrayFlattenerService.flattenArray(array);
        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);
        return list.toArray(new Integer[0]);
    }
}
