package strings;

public class StringBasics {

	public static void main(String[] args) {
		/*
		 Strings are classes which are final
		 that means we cannot make changes to the class
		 it implements comparable charsequence serializable
		 */
		// The heap area now contains the String Constant pool
		String s="Imran";
		// heap will not have any value that is
		/*
		  heap 
		  Nothing Availbale
		  
		  
		  
		        SCP
		        s->Imran 
		 */
		//SCP doesnt have Garbage Collection
		//That means when object is created it remains in the SCP forever
		String s1="Imran";
		/*
		  heap
		 
		 
		 
		 		SCP
		 		s->Imran<-s1
		 */
		//So if you have an object in SCP
		//and an object with same value is being intialized then it points to same reference
		//As SCP doesnt have any garbage Collection 
		
		//Intialize something like this
		String s2=new String("Khan");
		/*
		 Heap
		 s2->Khan
		 
		 
		 
		 			SCP
		 			s->Imran<-s1
		 			Khan<- JVM Internally
		 */
		// When we initialize something in the class format approach then an reference of that is created
		//In the heap memory as well as in the SCP but in the SCP it is not pointed by the object but 
		//by the JVM itself
		//Strings are immutable that means it cannot be changed 
		//Therefore whenever you perform any operations on it it will create a new String and the previous 
		//String will be left in the SCP itself
		//In heap it will be removed
		s=s+"hi";
		System.out.println(s);
		/*
		 Heap
		 s2->Khan
		 
		 
		 
		 		SCP
		 		s->Imranhi
		 		s1->Imran
		 		JVM->Khan
		 */

		/*
		 Difference between Final and Immutable
		 final int a=5;
		 a=a+1; error;
		 as final means its value cannot be changed
		 
		 But in case of object its value can be changed but not the reference
		  That means
		  s1->ahdfjafkl   ahdfjafkl(Reference)->Imran
		  ahdfjafasf(Location cannot be change)->Khan
		  s1 can point another memory location but with different value.
		  The reference of the String Value Cannot be changed therefore Strings are immutable
		  Immutable means there are no changes made to the string on the other hand a new String is created
		  And then s1 will point to the reference of the new String
		 */
		
		//Example
		String a=new String("Imran");
		String b=new String("Imran");
		String c="Khan";
		String d="Imran";
		/*
		 	Heap
		 	a->Imran
		 	b->Imran
		 	
		 	
		 				SCP
		 				c->Khan
		 				d->Imran<-JVM Internally
		 */
		//So when we use the class method a and b will create two different references of the same value
		//But in the SCP the same value objects share the same reference
		
		
		/*
		  Why are strings immutable
		  Suppose 
		  s->Imran
		  s1->Imran
		  Then s1 value changes to Khan
		  s1->Khan
		  What about s?
		  s will now point to khan
		  That is the reason strings are immutable s->Imran
		  s1 will point to a new string 
		  s1->Khan
		 */
	}

}
