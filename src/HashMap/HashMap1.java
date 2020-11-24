package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Collections;

public class HashMap1 {
 public static void main(String[] args) {
	 HashMap<String, Integer> m = new HashMap<String, Integer>();
	 m.put("Nag", 200);
	 m.put("Varun", 600);
	 m.put("Vithika", 900);
	 Integer i1 = m.put("Ali", 100);
	 Integer i2 = m.put("Ali", 800);
	 System.out.println(i1);
	 System.out.println(i2);
	 System.out.println(m);
	 Integer i = m.get("Nag");
	 System.out.println(i);
	 
	 HashMap<String, Integer> n = new HashMap<String, Integer>();
	 n.put("sree", 900);
	 n.put("ntr", 2000);
	 
	 m.putAll(n);
	 System.out.println(m);
	 
	 m.put(null, null);
	 m.put(null, null);
	 m.put(null, null);
	 m.put(null, 300);
	 System.out.println(m);
	 
	 boolean val = m.containsValue(null);
	 System.out.println(val);
	 
	 Set s = m.keySet();
	 System.out.println(s);
	 
	 Collection c = m.values();
	 System.out.println(c);
	 
	 Set e = m.entrySet();
	 System.out.println(e);
	 
	 Iterator itr = e.iterator();
	 while(itr.hasNext()) {
		 Map.Entry<String, Integer> obj = (Map.Entry<String, Integer>)itr.next();
		 if(obj.getKey() == "Nag") {
			 obj.setValue(30000);
		 }
		
	 }
	 System.out.println(m);
	 
	 /*Collections.synchronizedMap(m);*/
	 for(Map.Entry<String, Integer> entry: m.entrySet()) {
		 if(entry.getKey()!=null && entry.getKey().equals("Vithika")) {
			 entry.setValue(100);
		 }
	 }
	 
	 System.out.println(m);
 }
}
