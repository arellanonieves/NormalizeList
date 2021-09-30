package com.comcast.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NormalizeListStream {
	
	private static List<String> sourceList = Arrays.asList (	"Tromeo & Juliet",
														"Platoon",
														"Kate & Leopold",
														"Poltergeist III",
														"Harold and Kumar Go to White Castle",
														"Clerks II" );
	private static final String amp = "&";
	private static final String and = "and";
	
	public static void main(String[] args) {
		System.out.println("Original List Stream: : \n" + sourceList);
		normalizeList_Stream();
		System.out.println("Normalized List Stream: : \n" + sourceList);
	}
	
	private static void normalizeList_Stream() {
		sourceList = sourceList.stream().map(line -> line.replaceAll(amp, and)).collect(Collectors.toList());
	}

}
