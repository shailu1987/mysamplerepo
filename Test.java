import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		int array[]= {10,20,30};
		array = reverseArray(array);
		//for(int i=0;i<array.length;i++)
		//System.out.println(array[i]);
		System.out.println(removeSHA(null));*/
		try{
			int a=10;
			Date date = new Date();
			SimpleDateFormat format = new SimpleDateFormat("DD-MMM-yyyy");
			System.out.println(format.format(date));
			
			
		}catch(Exception e) {
			e.getStackTrace();
		}
//		int b=20;
//		a= a+b - (b=a);
//		System.out.println(a);
//		System.out.println(b);
	}
	public static int[] reverseArray(int[] arr){

		  int temp = 0;
		  for(int i=0; i<arr.length/2; i++){
		       temp = arr[i];
		       arr[i] = arr[arr.length-i-1];
		       arr[arr.length-i-1] = temp;
		   }
		   
		   return arr;
		}
	
	public static ArrayList<String> removeSHA(ArrayList<String> arr){
		ArrayList<String> a = new ArrayList();

		a.add("rahul");
		a.add("shailendra");
		a.add("shailu");
		a.add("abcdsha");
		a.add("rahhl");
		
		Iterator<String> i= a.iterator();
		while (i.hasNext()) {
			String str = i.next();
			if(str.contains("sha")){//(Collections.singleton("sh");
		        i.remove();
		        }
		}
/*	     for(String str : a){
	      if(str.contains("sha")){
	        a.remove(str);
	        }
	     }*/
	     
	     return a;//Arrays.sort("sdf");
	}
	
	public int methodA(String a) {
	return a.hashCode();
	}
	public String methodA(int a) {
	String str = "Pravin";
	return str;
	}
}
