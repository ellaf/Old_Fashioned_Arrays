package _01_array_manipulation;

public class Inserting {

	
	public static int[] insertAt(int[] a, int b, int c) {
	
	int[] d = new int[a.length + 1];
	
	for (int i = 0; i < b; i++) {
	d[i] = a[i];
	}
	
	d[b] = c;
	
	for (int i = 0; i < a.length - b; i++) {
	d[b+i+1] = a[b+i];
	}
		
	return d;
	}

	public static String[] insertAlphabetically(String[] a, String b) {

	String[] c = new String[a.length+1];
	int d = 0;
		for (int i = 0; i < a.length; i++) {
		if(a[i].compareTo(b) <= 0) {
		d += 1;
	}
	}
	for (int i = 0; i < d; i++) {
	c[i] = a[i];
	}
	
	c[d] = b;
	
	for (int i = 0; i < a.length - d; i++) {
	c[d+i+1] = a[d+i];
	}		
	return c;
	}
}


//for (int i = 1; i < a.length - b; i++) {
//	int d = a[b+i];
//	int e =a[b+i+1];
// }