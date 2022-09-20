package strings;
public class StringBuilder {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("abc");
		System.out.println(sb);
		
		sb.append("ab");
		System.out.println(sb);
		//Now when something is being added to the same string no new object is created
		//Therefore no new object is created and hence it is memory efficient 
		//String Buffer allocates memory only in the heap area
		//StringBuffer is thread safe as methods are synchronized
		//Therefore waiting time is more
		//It makes mutable objects
		
		sb.replace(3, 5, "");
		System.out.println(sb);
		
		System.out.println(sb.substring(0));
		
		System.out.println(sb.substring(0,2));
		
		sb.delete(0, 1);
		System.out.println(sb);
		
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		sb.insert(0, "a");
		System.out.println(sb);
		
		sb.insert(1, "b");
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		//Intial size of string builder is 16 as when we cross 16 
		// It would increase it by 16*2 +2 that is 34 and next by 34*2+2 size*2+2;
		sb.trimToSize();//Used to reduce the capacity of the sb to length
		System.out.println(sb.capacity());
		
		
		System.out.println(sb.length());
		
				//		String Builder
		//Same as String Buffer 
		//Same functions as String Buffer
		//Consumes Less Memory
		//Memory is allocated only once and then changes are made to the objects
		//It is not thread safe as strings
		//Which makes it a faster then String Buffer and Strings
		//It is mutable
		//Syntax
		
		StringBuilder s=new StringBuilder();
	}

}
