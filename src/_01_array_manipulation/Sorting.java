package _01_array_manipulation;

import java.util.Arrays;

public class Sorting {

	String[] me = {};
	public static void main(String[] args) {
	Sorting s = new Sorting();
	//String[] candy = {"banana", "zinc", "rain"};
	//String[] moo = s.sort(candy);
	//String mooB = Arrays.toString(moo);
	//System.out.println(mooB);
	}
	public static String[] sort(String[] a){
	for (int j = 0; j < a.length; j++) {
	for (int i = 0; i < a.length - 1; i++) {
	String b = a[i];
	String c = a[i+1];

	if(b.compareTo(c) >= 0) {
	a[i] = c;
	a[i+1] = b;
	}
		
	}
	}
	return a;

}
}
