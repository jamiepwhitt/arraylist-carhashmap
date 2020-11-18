import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class carHashMapHW {

	public static String askQuestion(Scanner scanner, String question) {
		System.out.print(question + " ");     
		String userinput = scanner.next().toString();
		return userinput;}

  public static void main(String[] args) {
		
		HashMap<String, String> vehicles = new HashMap<>();
		vehicles.put("Fusion", "Ford");
		vehicles.put("CRV", "Honda");
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Are you looking for a Fusion or a CRV? ");     
		String userInput = scanner.next();
		
	for (Map.Entry<String, String> myCombo : vehicles.entrySet()) {
			if (myCombo.getKey().equals(userInput)) {
				System.out.println("That model is right over here");
				break;
			} 
			if (myCombo.getKey()!=(userInput)) {
				System.out.println("That model isn't in stock right now");
				break;
			}
		}
}
}


