package servlet;

public class Student5 {
static int id;
static String name;
static int age;

	public Student5(int i, String string) {
	// TODO Auto-generated constructor stub
}


	public Student5(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student5 s1=new  Student5(111,"jothi");
		
		Student5 s2=new Student5(222,"jo",2);
		
		
	s1.display();
	s2.display();
		
	}
	

	public void Student5(int i,String n){
		id=i;
		name=n;
	}
	public void Student5(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}
	void display(){
		System.out.println(id+""+name+""+age);
	}
}

