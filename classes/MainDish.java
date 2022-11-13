package classes;

public class MainDish extends FoodItem {
	private String category;
	
	public MainDish(){}
	
	public MainDish(String fid, String name, int availableQuantity, double price, String category){
		super(fid, name, availableQuantity, price);
		this.category = category;
	}
	
	public void setCategory(String fid){
		this.category = category;
	}
	public String getCategory(){
		return category;
	}
	
	public void showInfo(){
		System.out.println("Food Item Number: "+ fid);
		System.out.println("Name: "+ name);
		System.out.println("Price: "+ price);
		System.out.println("Available Quantity: "+ availableQuantity);
		System.out.println("Category: "+ category);
	}
}