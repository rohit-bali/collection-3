import java.util.*;  
class Students
{
	 int age;
	 String name;
	public Students(int age,String name)
	{
		super();
		this.age=age;
		this.name=name;
	}
	
	public String toString()
	{
		return this.age+"      "+this.name+"      ";
	}
}



class Sortbyage implements Comparator<Students> 
{  
 public int compare(Students a, Students b) 
 { 
     return a.age - b.age; 
 } 
} 

class Sortbyname implements Comparator<Students> 
{ 

 public int compare(Students a, Students b) 
 { 
     return a.name.compareTo(b.name); 
 } 
} 



public class StudentList 
{ 
 public static void main (String[] args) 
 { 
     ArrayList<Students> al = new ArrayList<Students>(); 
     al.add(new Students(18, "bbbb")); 
     al.add(new Students(20, "aaaa")); 
     al.add(new Students(15, "cccc")); 

     System.out.println("Unsorted"); 
     for (int i=0; i<al.size(); i++) 
         System.out.println(al.get(i)); 

     Collections.sort(al, new Sortbyage()); 

     System.out.println("\nSorted by Age"); 
     for (int i=0; i<al.size(); i++) 
         System.out.println(al.get(i)); 

     Collections.sort(al, new Sortbyname()); 

     System.out.println("\nSorted by name"); 
     for (int i=0; i<al.size(); i++) 
         System.out.println(al.get(i)); 
 } 
} 
