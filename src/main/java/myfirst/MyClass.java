package myfirst;

public class MyClass {
	private int id;
	private String name;
	
	public MyClass(){
		++id;
	}
	
	public MyClass(String name) {
		this();
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static MyClass myName(String name) {
		return new MyClass(name);
	}
	
	
}
