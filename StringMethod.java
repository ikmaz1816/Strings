package strings;

public class StringMethod {

	public static void main(String[] args) {
		String s="Khan na";
		String s1="kHan";
		System.out.println(s.concat(s1));
		// it is used to concatenate two strings but it intial value doesnt change
		
		int n=s.length();
		System.out.println(n);//This gives the length of the string
		
		boolean b=s.isEmpty();
		System.out.println(b);//Checks whether the string is empty or not
		
		// we can create an array of characters
		char[] c=s.toCharArray();
		for(char a:c)
			System.out.println(a);

		String ab="        ab       ";
		System.out.println(ab.trim());
		//trim functions removes spaces from front and back
		
		String a="     a     b   ";
		System.out.println(a.trim());//It will remove only from front and back
		
		if(s.equalsIgnoreCase(s1))
			System.out.println("equals");
		
		int num=s.compareTo(s1);
		System.out.println(num);// it gives an subtraction of ASCII VAlues
		//What if the string is empty()
		
		String o="";
		int nums=s.compareTo(o);
		System.out.println(nums);//It returns the length of the non empty string
		
		int nums1=s.compareToIgnoreCase(s1);
		System.out.println(nums1);//It ignores the case considers it small alphabets
		
		System.out.println(s.substring(2));//print the substring from second index to last index
		
		System.out.println(s.substring(0,2)); //print the substring from 0 index to 1 index 2 is excluded
		
		System.out.println(s.startsWith("K"));
		System.out.println(s.endsWith("n"));
		
		System.out.println(s.replace("n", "was"));
		System.out.println(s.replaceFirst("n", "was"));
		System.out.println(s.replaceAll("n(.)", "was"));//It also removes the spaces as we are using regex
		System.out.println(s.replaceAll("n(.*)", "was"));//It stops after removing the character
		
		System.out.println(s.charAt(0));
		int n1=s.indexOf('n');
		System.out.println(n1);
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		System.out.println(s.contains("n"));
		
		String q=s.valueOf(5);//It converts the integer to string
		System.out.println(q+10);
	}

}
