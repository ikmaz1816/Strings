package strings;

public class StringAndObjectClass {

	public static void main(String[] args) {
		//String extends the Object class
		//Object class has the equal method
		int a=5;
		int b=3;
		if(a==b)
			System.out.println("True");
	String s=new String("khan");
	String s1=new String("khan");
	if(s==s1)
		System.out.println("True");
	// This should be true
	//But here we are comparing their refernces and their references are not equal
	//Hence it is false
	// Therefore we use the Strings class equals method
	if(s.equals(s1));
		System.out.println("true");
		//The equals method is overriden and it checks their content rather than their references
	}

}
