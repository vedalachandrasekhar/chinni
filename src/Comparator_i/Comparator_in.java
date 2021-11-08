package Comparator_i;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Mycomparator implements Comparator<Integer>
{
   public int compare(Integer k1,Integer k2)
   {
	   if(k1>k2)
	   {
		   return -1;
	   }
	   else if(k1<k2)
	   {
		   return +1;
	   }
	   else 
	   {
		   return 0;   
   }
	
}	}
		
public class Comparator_in {

	public static void main(String[] args) {
		
		ArrayList<Integer>l=new ArrayList<Integer>();
		
		l.add(10);
		l.add(5);
		l.add(20);
		l.add(50);
		l.add(15);
		l.add(25);
		
		System.out.println("Before sorting:"+l);
		Collections.sort(l,new Mycomparator());
		System.out.println("After sorting:"+l);
				
	}

}
