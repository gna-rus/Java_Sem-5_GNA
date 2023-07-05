import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
		HashMap<String, Integer> passportsAndNames = new HashMap<>();
	   passportsAndNames.put("Лидия", 212133);
       passportsAndNames.put("Иван Михайлович Серебряков", 162348);
       passportsAndNames.put("Дональд Джон Трамп", 8082771);
       System.out.println(passportsAndNames);
       
       int lidiaName = passportsAndNames.get("Лидия");
   System.out.println(lidiaName);


   passportsAndNames.remove("Дональд Джон Трамп");
   System.out.println(passportsAndNames);
   
///////////////////////////   
   
   
   int[] abc = new int []{1,2,3,4};
   HashMap<String, int[]> test1 = new HashMap<>();
   test1.put("Test1", abc);
   System.out.println(test1);
       
 ////////////////////////////     
    LinkedList<String> earlBio = new LinkedList<>();
    String str1 = new String("Hello World!");
       String str2 = new String("My name is Earl");
    
       earlBio.add(str1);
       earlBio.add(str2);
       
       HashMap<String, LinkedList> test2 = new HashMap<>();
   test2.put("Test2", earlBio);
   System.out.println(test2);
       
	}
}
