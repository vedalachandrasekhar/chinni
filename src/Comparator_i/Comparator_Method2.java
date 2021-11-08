package Comparator_i;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Mycomparatorb implements Comparator<Integer>
{
   public int compare(Integer k1,Integer k2)
   {
	   return(k1>k2)?-1:(k1<k2)?1:0;
   }
	
}	
		
public class Comparator_Method2 {

	public static void main(String[] args) {
		
		ArrayList<Integer>l=new ArrayList<Integer>();
		
		l.add(10);
		l.add(5);
		l.add(20);
		l.add(50);
		l.add(15);
		l.add(25);
		
		System.out.println("Before sorting:"+l);
		Collections.sort(l,new Mycomparatorb());
		System.out.println("After sorting:"+l);
				
	}

}
