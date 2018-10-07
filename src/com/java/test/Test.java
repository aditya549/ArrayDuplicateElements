package com.java.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Test {
	static int count=0;
	public static void main(String[] args) {
		Integer [] arr=new Integer[]{10,20,20,10,30,40,50,50,10};
		List<Integer> ls=Arrays.asList(arr);
		HashSet<Integer> hs=new HashSet<>();
		hs.addAll(ls);
		for (int i = 0; i < ls.size(); i++) {
			hs.add(ls.get(i));
		}
		System.out.println(hs.toString());
	}
}
