package HashMap;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) {
		WeakHashMap m = new WeakHashMap();
		temp t = new temp();
		m.put(t, "one");
		System.out.println(m);
		t = null;
		System.gc();
		System.out.println(m);

	}

}

class temp {
	public String toString() {
		return "temp";
	}
	public void finalize() {
		System.out.println("finalize method called");
	}
}
