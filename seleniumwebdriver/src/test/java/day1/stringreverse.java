package day1;

public class stringreverse {

	public static void main(String[] args) {
		String str="I am robot";
		String Reversed="";
		
		for(int i=str.length()-1;i>=0 ;i--){
		
		Reversed+=str.charAt(i);

	}
		System.out.println(Reversed);

}
}

//// Online Java Compiler
//Use this editor to write, compile and run your Java code online

/*class Main {
 public static void main(String[] args) {
     String str="god is great";
     String Reversed="";
     for(int i=str.length()-1;i>=0;i--){
         Reversed+=str.charAt(i);
     }
     System.out.println(Reversed);
 }
}*/