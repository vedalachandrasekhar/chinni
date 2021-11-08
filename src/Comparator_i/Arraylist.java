package Comparator_i;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer>i=new ArrayList<Integer>();
		i.add(10);
		i.add(5);
		i.add(20);
		i.add(50);
		i.add(25);
		i.add(15);
		
		
		System.out.println("Before sorting:"+i);
		Collections.sort(i);
		System.out.println("After sorting:"+i);
		
	}

}
