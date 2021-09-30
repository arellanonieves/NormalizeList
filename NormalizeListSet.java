package com.comcast.test;

import java.util.Arrays;
import java.util.List;

public class NormalizeListSet {
	
	private static List<String> sourceList = Arrays.asList (	"Tromeo & Juliet",
														"Platoon",
														"Kate & Leopold",
														"Poltergeist III",
														"Harold and Kumar Go to White Castle",
														"Clerks II" );
	private static final String amp = "&";
	private static final String and = "and";
	
	public static void main(String[] args) {
		System.out.println("Original List Set: : \n" + sourceList);
		normalizeList_Set();
		System.out.println("Normalized List Set: : \n" + sourceList);
	}
	
	private static void normalizeList_Set() {
		int i = 0;
		
		for (String str : sourceList) {
			sourceList.set(i, str.replaceAll(amp, and));
			i++;
		}
	}

}
