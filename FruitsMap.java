package map;

import java.util.*;

public class FruitsMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> m1 = new TreeMap<Integer,String>();
		
		m1.put(2, "Banana");
		m1.put(5, "Apple");
		m1.put(1, "papaya");
		m1.put(3, "Pear");
		m1.put(4, "melon");
		
		System.out.println("Content: "+m1);

		System.out.println("values after iteration: ");
		
		for(Integer key : m1.keySet()){
			System.out.println("  \n"+m1.get(key));
		}
		
		m1.remove(2);
		
		System.out.println("Content: "+m1);
		
		if(m1.containsValue("Apple"))
			{
				System.out.println("found apple");
			}
		
		
		
		for(Integer key: m1.keySet())
		{
			System.out.println(key+" : "+ m1.get(key));
		}
		
		
		m1.clear();
		
		System.out.println("values after cleaering: "+m1);
		
		
	}

}
