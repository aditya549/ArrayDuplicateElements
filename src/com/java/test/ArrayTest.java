package com.java.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayTest {
	public static void main(String[] args) {
		int[] array = new int [] {10,20,30,40,50,60,70,10,20};
		Map<Integer,Integer> counterMap = new HashMap<>();

		//fill the array

		    for(int i=0;i<array.length;i++){
		         if(counterMap.containsKey(array[i])){
		          counterMap.put(array[i], counterMap.get(array[i])+1 );
		         }else{
		          counterMap.put(array[i], 1);
		         }
		    }
		    System.out.println(counterMap.toString());
	}
}
