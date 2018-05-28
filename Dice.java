
import java.util.Random;

public class Dice {
	
public void rollDice() {
	Random number = new Random(6);
	
	int result;
	
	result = number.nextInt(6);
	
	System.out.println(result);
	}



}
