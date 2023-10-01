package com.example;

import com.example.service.ArrayFlattenerService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class ComponentTest {
    @Test
    public void reverseArrayTest() {
        ArrayFlattenerService arrayFlattenerService = mock(ArrayFlattenerService.class);
        Integer[] arr = {1,3,0,4,5,9};
        when(arrayFlattenerService.flattenArray(any())).thenReturn(arr);
        Component component = new Component(arrayFlattenerService);
        Integer[][] twoDArray = {
                {1, 3},
                {0},
                {4, 5, 9}
        };
        Integer[] expectedArray = {9, 5, 4, 0, 3, 1};
        Integer[] array = component.reverseArray(twoDArray);
        assertArrayEquals(expectedArray, array);
        verify(arrayFlattenerService, times(1)).flattenArray(twoDArray);

    }

    @Test
    public void reverseArrayNullTest() {
        ArrayFlattenerService arrayFlattenerService = mock(ArrayFlattenerService.class);
        Integer[] arr = {1,3,0,4,5,9};
        when(arrayFlattenerService.flattenArray(any())).thenReturn(arr);
        Component component = new Component(arrayFlattenerService);
        Integer[] array = component.reverseArray(null);
        verify(arrayFlattenerService, times(0)).flattenArray(null);
        assertNull(array);
    }



}