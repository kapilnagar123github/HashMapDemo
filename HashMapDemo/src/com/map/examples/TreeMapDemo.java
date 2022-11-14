package com.map.examples;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> treemap =new TreeMap<>();
		treemap.put(1,"Kapil");
		treemap.put(2,"Ram");
		treemap.put(3,"Prashant");
		treemap.put(5, "Atul");
		treemap.put(4, "Shobhit");
		System.out.println(treemap);
		
	}

}
