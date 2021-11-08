package Comparator_i;

import java.util.ArrayList;
import java.util.Collections;

public class Lambda_comparaator {

	public static void main(String[] args) {

ArrayList<Integer>i=new ArrayList<Integer>();
i.add(10);
i.add(15);
i.add(20);
i.add(0);
i.add(18);
i.add(30);
i.add(25);
System.err.println("before sorting:"+i);
Collections.sort(i,(k1,k2)->(k1>k2)?-1:(k1<k2)?1:0);
	System.out.println("after sorting:"+i);	

	}

}
