package tasmiya;

public class Simple {
	int id;
	String name;
	void display()
	{
		System.out.println("id number is = " +id);
		System.out.println("name is = " +name);
	}

	public static void main(String[] args) {
		Simple S = new Simple();
		S.id=7;
		S.name="Tasmiya";
		S.display();
		

	}

}
