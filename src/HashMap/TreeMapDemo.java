package HashMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		// default natural sorting order
		/*TreeMap t = new TreeMap();
		t.put("abc", null);
		t.put("aaa", "thirty");
		t.put("aa", new StringBuffer("sandeep"));
		//t.put("e", "val");
		//t.put(null, "asdf");
		System.out.println(t);*/
		
		// customized sorting order
		/*TreeMap t = new TreeMap<>(new MyComparator());
		t.put("sa", "300");
		t.put("m", 20);
		t.put("vam", "krish");
		t.put(20, "sasdf");
		System.out.println(t);*/
		
		
		// customized sorting order with help of comparator
		/*TreeMap t = new TreeMap(new marksComparator());
		t.put(new Student(344, "vid", 533), "vidya");
		t.put(new Student(232, "srre", 453), "sree");
		t.put(new Student(4562, "varun", 364), "varun");
		Set s = t.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println("Key is: "+entry.getKey() +"Value is: "+entry.getValue() );
		}
		Set s = t.keySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Student stud = (Student)itr.next();
			System.out.println("id's "+ stud.getId());
		}*/
		
		
		// converting hashmap to treemap
		 HashMap<String, Integer> m = new HashMap<String, Integer>();
		 m.put("Nag", 200);
		 m.put("Varun", 600);
		 m.put("Vithika", 900);
		 System.out.println(m);
		TreeMap t = new TreeMap<>(m);
		System.out.println(t);
		
	}

}

class idComparator implements Comparator{
	
	public int compare(Object obj1, Object obj2) {
		Student s1 = (Student)obj1;
		Student s2 = (Student)obj2;
		if(s1.getId() > s2.getId()) {
			return 1;
		} else if(s1.getId() < s2.getId()) {
			return -1;
		} else {
			return 0;
		}
	}
}

class nameComparator implements Comparator{
	
	public int compare(Object obj1, Object obj2) {
		Student s1 = (Student)obj1;
		Student s2 = (Student)obj2;
		String name1 = s1.getName();
		String name2 = s2.getName();
		return -name1.compareTo(name2);
	}
}

class marksComparator implements Comparator{
	
	public int compare(Object obj1, Object obj2) {
		Student s1 = (Student)obj1;
		Student s2 = (Student)obj2;
		Integer m1 = s1.getMarks();
		Integer m2 = s2.getMarks();
		return m2.compareTo(m1);
	}
}
	
class Student {
	private int id;
	private String name;
	private int marks;
	public Student(int id, String name, int marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String toString() {
		return this.name;
	}
	
}
	
