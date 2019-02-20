package pppp;

public class KKK   {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
child1 ob=new child1();
child2 ob2=new child2();
ob2.start();
ob.start();


	}

}
class child1 extends Thread{
	 	public void run(){
	 		child1 c=new child1();
	 		c.print();
	}
	 	synchronized void print(){
	 		for(int i=1;i<5;i++){
				System.out.println("child class");
			}
	 	}
	
	}


class child2 extends Thread{
	public void run(){
		for(int i=1;i<5;i++){
			System.out.println(i);
		}
	}
}