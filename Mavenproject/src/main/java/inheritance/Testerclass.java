package inheritance;

public class Testerclass extends Emplyeeclass{
	public void Testing() {
		System.out.println(name+ " is testing the software");
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testerclass ob=new Testerclass();
		ob.name="jebin";
		ob.Testing();
		ob.attentmeeting();
		Emplyeeclass oj1=new Emplyeeclass();
		//oj1.attentmeeting();
		//oj1.Testing we cannot access child class property by parent class property

	}


}
