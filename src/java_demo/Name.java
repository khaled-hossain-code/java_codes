package java_demo;

public class Name {
	private String firstName;
	private String lastName;
	
	//constructor methods which takes all params
	public Name (String fName, String lName) {
		this.firstName = fName;
		this.lastName = lName;
		System.out.println("Constructor with both args " + fName + " " + lName);
	}
	//overloading constructor which takes 1 argument
	public Name (String fName) {
		this.firstName = fName;
		System.out.println("Constructor with only fName" + fName);
	}
	//overloading constructor with a no param constructor
	public Name () {
		System.out.println("Constructor without any param");
	}
	
}
