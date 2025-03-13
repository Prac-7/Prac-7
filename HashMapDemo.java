import java.util.*;

class HashMapDemo {
    public static void main(String args[]) {
        HashMap<Integer, String> ha = new HashMap<>();
        ha.put(10, "Java");
        ha.put(20, "Operating System");
        ha.put(30, "SoftwareTesting Tools");
        ha.put(40, "Compiler Constructor");
        ha.put(50, "Web Technologies");

        // Before Sorting
        System.out.println("Before Sorting:");
        Set<Map.Entry<Integer, String>> set = ha.entrySet();
        Iterator<Map.Entry<Integer, String>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> me = it.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        // After Sorting (Using TreeMap)
        Map<Integer, String> map = new TreeMap<>(ha);  // Sorting by keys with TreeMap
        System.out.println("After Sorting:");
        Set<Map.Entry<Integer, String>> set1 = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it2 = set1.iterator();
        while (it2.hasNext()) {
            Map.Entry<Integer, String> me2 = it2.next();
            System.out.print(me2.getKey() + ": ");
            System.out.println(me2.getValue());
        }
    }
}
