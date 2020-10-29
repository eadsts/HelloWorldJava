package com.maxtrain.tracy;

//ArrayList class in in the java.util package. import statements point to classes. 
//here we are pointing to one class in one package
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.* to point to any class in the package

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Java World");
		
		int i = 0;//int is for new Java, but might see var (same with C#)
		var n = 1;
		Integer m = null;//class Integer can be null, but int cannot be null
		
		boolean b = true;//in C# it is bool
		Boolean nb = null;//class Boolean can be null, but boolean cannot be null
		
		String s = "Greg";//in C# it is string, String in Java is a class and can be null
		
		int[] ints = new int[] {1,2,3,4,5};//same as in C#
		
		//Equivalent to List<int> generic collection - a generic collection of things (int, string, array, collection)
		//cannot initialize it here with {1,3,5} need to use Add
		ArrayList<Integer> arraylist = new  ArrayList<Integer> ();
		arraylist.add(1);
		
		//Equivalent to Dictionary<int,string> which is key/value(data)
		//a way to take a value and turn it into something unique (usually a number)
		//in .NET the dictionary has a key to find something else
		//initialize with put
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(1, "First String");
		
		//foreach(). in C# this is foreach(var idx in ints)
		var sum = 0;
		for(var idx : ints) {
			sum += idx;
		}
		System.out.println("Sum is " + sum);//this is interpolated string in C#
		
		//for(;;)
		var sum1 = 0;
		for(var idx = 0; idx <= 10; idx++) {
			sum1 += idx;		
		}
		System.out.println("Sum of numbers is " + sum1);//this is interpolated string in C#
		
		//if and if else are same
		//while and do while are the same
		
		
	}

}
