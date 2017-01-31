import java.awt.Color;

public class Cloning {
	
	public static void main(String args[]){
		Fruit apple = new Fruit(new Color(100, 0, 0), 3, "apple");
		
		Fruit otherApple = apple;
		
		System.out.println("Color: " + otherApple.getColor() + " Amount: " + otherApple.getAmount());
		
		
		
		apple.setColor(new Color(0, 100, 0));
		
		System.out.println(otherApple.getColor().getRed() + "");
		
		
		otherApple.setAmount(5);
		
		System.out.println(apple.getAmount() + "");
		
		
		
		Fruit anotherApple = new Fruit(apple);
		
		apple.setColor(new Color(0, 0, 100));
		
		System.out.println(anotherApple.getColor() + "");
	}
}


