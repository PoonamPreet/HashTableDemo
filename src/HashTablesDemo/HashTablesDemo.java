package HashTablesDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashTablesDemo {
public static void main(String[] args) {
	String a="Hello";
	System.out.println(a.hashCode());//hash code will be generated even without hash map creation
	HashMap<String,Integer> student=new HashMap<String, Integer>();
	student.put("Priya", 1);
	student.put("Poonam", 5);
	student.put("Pakhi", 8);
	Set<String> data=student.keySet();
	for(String i:data) {
	System.out.println(student.get(i));
	System.out.println(i.hashCode()%10);//%10 is used to reduce code number digits hash value of each string
	}
	
	//going to create entry set to print both id and name
	Set<Map.Entry<String,Integer>> data1=student.entrySet();
	for(Map.Entry<String, Integer>i:data1)
	{
		System.out.println(i.getKey()+" "+i.getValue());
	}
}
}
