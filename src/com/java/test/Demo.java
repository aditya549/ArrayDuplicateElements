package com.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,10,20,30,40,10};
		List<Integer> ls=new ArrayList<>();
        int count=0;
		for(int j=0;j<a.length;j++) {
        	for(int k =0;k<a.length;k++) {
                if(a[j]==a[k]) {
                	count++;
                }
            }
        	if(ls.contains(a[j])) {
        		break;
        	}
        	System.out.println(a[j] +"--" +count);
        	count=0;
        	ls.add(a[j]);
        }
	}
}
