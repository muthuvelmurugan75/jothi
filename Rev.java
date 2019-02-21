package pppp;

public class Rev {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String n="jo";
		String s="";
for(int i=n.length()-1;i>=0;i--){
	char ch=n.charAt(i);
	s=s+ch;
}
	if(n.equals(s)){
		System.out.println("palindrome");
		
	}
	else{
		System.out.println("this is not palindrome");
	}
}
		
		
	

}
