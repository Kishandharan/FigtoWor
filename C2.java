import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C2{
	public static void main(String[] args) {
		Map<String, String>map1 = new HashMap<>();
		Scanner sc1 = new Scanner(System.in);
		map1.put("1","One");
		map1.put("2","Two");	
		map1.put("3", "Three");
		map1.put("4", "Four");
		map1.put("5", "Five");
		map1.put("6", "six");
		map1.put("7", "seven");
		map1.put("8", "eight");
		map1.put("9", "nine");
		map1.put("0", "zero");
		System.out.print("Enter: ");
		String userinput = sc1.nextLine();
		System.out.println(map1.get(userinput));
	}
}