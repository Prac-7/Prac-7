import java.util.*;
import java.io.*;

class HashTableDemo {
    public static void main(String args[]) {
        Hashtable ht = new Hashtable();
        Enumeration names;
        String str;

        ht.put("Amar", new Long(2222222222L));
        ht.put("Anil", new Long(3333333333L));
        ht.put("Soham", new Long(8888888888L));
        ht.put("Kiran", new Long(9999999999L));
        ht.put("Williams", new Long(4444444444L));

        names = ht.keys();
        while (names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + ": " + ht.get(str));
        }
    }
}