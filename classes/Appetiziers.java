package classes;

public class Appetiziers extends FoodItem {
	private String size;

	public Appetiziers(){}

	public Appetiziers(String fid, String name, int availableQuantity, double price, String size){
		super(fid, name, availableQuantity, price);
		this.size = size;
	}
	
	public void setSize(String size){
		this.size = size;
	}
	public String getSize(){
		return size;
	}
	
	public void showInfo(){
		System.out.println("Food Item Number: "+ fid);
		System.out.println("Name: "+ name);
		System.out.println("Price: "+ price);
		System.out.println("Available Quantity: "+ availableQuantity);
		System.out.println("Size: "+ size);
	}
}