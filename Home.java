import com.animal1.Animal;

public class Home {
	public static void main(String[] args) {
		System.out.println("This is Home class");
		Animal a = new Animal("cat");
		a.printName();
		com.animal2.Animal b = new com.animal2.Animal("dog");
		b.printName();
 	}
}
