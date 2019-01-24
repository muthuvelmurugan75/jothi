package bean;

public class Continueexample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
String name="muthu";

for(int i=0;i<name.length();i++){
	char ch=name.charAt(i);
	if(ch=='u'){
		continue;
	}
	System.out.print(ch);
}
		
	}

}
