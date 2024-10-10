package p1;
class Dog {
	String name;
	int cost;
	String breed;
	
	void addData(int a,String b, String c) {
		name=b;
		cost=a;
		breed=c;
	}
	void display() {
		System.out.println(name);
		System.out.println(cost);
		System.out.println(breed);
		System.out.println("==============");
		
		
	}
}



public class Giriraj {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.display();
		d.addData(39999, "rofckn","JEL");
		d.display();
		// TODO Auto-generated method stub

	}

}
