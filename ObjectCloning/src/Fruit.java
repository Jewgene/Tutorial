import java.awt.Color;

public class Fruit {
	private Color color;
	private int amount;
	private String type;
	
	public Fruit(Color color, int amount, String type){
		this.color = color;
		this.amount = amount;
		this.type = type;
		
	}
	
	public Fruit(Fruit toClone){
		this.color = toClone.getColor();
		this.amount = toClone.getAmount();
		this.type = toClone.getType();
	}
	
	public Fruit(){
		
	}
	
	public void setColor(Color color){
		this.color = color;
	}
	
	public Color getColor(){
		return color;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getType(){
		return type;
	}
	
	public void setAmount(int amount){
		this.amount = amount;
	}
	
	public int getAmount(){
		return amount;
	}
}

