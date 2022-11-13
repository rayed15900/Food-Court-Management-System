import fileio.*;
import java.util.*;
import classes.*;

public class Start {
	public static void main(String args[]) {
		FoodCourt f = new FoodCourt();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		Scanner sc = new Scanner(System.in);
		boolean repeat = true;
		
		System.out.println("*********************************************");
		System.out.println("Welcome to Food Court Management Application");
		System.out.println("*********************************************");
		System.out.println();
		while(repeat) {
			System.out.println("What do you want to chose?\n");
			System.out.println("1. Employee Management");
			System.out.println("2. Restaurant Management");
			System.out.println("3. Restaurant FoodItem Management");
			System.out.println("4. FoodItem Quantity Add-Sell");
			System.out.println("5. Exit");
			System.out.println();
			
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("***********************************");
					System.out.println("Your Choice is: Employee Management");
					System.out.println("***********************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("------------------------------");
					System.out.println("1. Insert New Employee");
					System.out.println("2. Remove Existing Employee");
					System.out.println("3. Show All Employees");
					System.out.println("4. Search an Employee");
					System.out.println("5. Go Back");
					System.out.println("------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option1 = sc.nextInt();
					
					switch(option1) {
						case 1:
							System.out.println("***********************************");
							System.out.println("Your Option is: Insert New Employee");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Employee Id: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(f.insertEmployee(e1)){
								System.out.println("Employee Inserted... ID: " + empId1);
							} else {
								System.out.println("Oops... Something is Wrong...");
							}
							System.out.println();
							break;
						case 2:
							System.out.println("****************************************");
							System.out.println("Your Option is: Remove Existing Employee");
							System.out.println("****************************************");
							System.out.println();
							
							System.out.print("Enter Employee Id: ");
							String empId2 = sc.next();
							
							Employee e2 = f.searchEmployee(empId2);
							
							if(e2 != null) {
								if(f.removeEmployee(e2)){
									System.out.println("Employee Removed...... ID: " + e2.getEmpId());
								} else {
									System.out.println("Oops... Something is Wrong...");
								}
							} else {
								System.out.println("Sorry... No Employee Found to Remove.....");
							}
							System.out.println();
							break;
						case 3:
							System.out.println("**********************************");
							System.out.println("Your Option is: Show All Employees");
							System.out.println("**********************************");
							System.out.println();
							
							f.showAllEmployees();
							break;
						case 4:
							System.out.println("**********************************");
							System.out.println("Your Option is: Search an Employee");
							System.out.println("**********************************");
							System.out.println();
							
							System.out.println("Enter Employee Id: ");
							String empId4 = sc.next();
							
							Employee e4 = f.searchEmployee(empId4);
							
							if(e4 != null) {
								System.out.println("Employee Found...........");
								System.out.println("Employee Id: " + e4.getEmpId());
								System.out.println("Employee Name: " + e4.getName());
								System.out.println("Employee Salary: " + e4.getSalary());
							} else {
								System.out.println("Sorry... No Employee Found.....");
							}
							System.out.println();
							break;
						case 5:
							System.out.println("***********************");
							System.out.println("Going Back.............");
							System.out.println("***********************");
							System.out.println();
							break;
						default:
							System.out.println("**************");
							System.out.println("Invalid Option");
							System.out.println("**************");
							System.out.println();
							break;
					}
					System.out.println();
					break;
				case 2:
					System.out.println("*************************************");
					System.out.println("Your Choice is: Restaurant Management");
					System.out.println("*************************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("----------------------------------");
					System.out.println("1. Insert New Restaurant");
					System.out.println("2. Remove Existing Restaurant");
					System.out.println("3. Show All Restaurant");
					System.out.println("4. Search a Restaurant");
					System.out.println("5. Go Back");
					System.out.println("----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
							System.out.println("*************************************");
							System.out.println("Your Option is: Insert New Restaurant");
							System.out.println("*************************************");
							System.out.println();
							
							System.out.print("Enter Restaurant Id: ");
							String rid1 = sc.next();
							System.out.print("Enter Restaurant Name: ");
							String name1 = sc.next();
							
							Restaurant r1 = new Restaurant();
							r1.setRid(rid1);
							r1.setName(name1);
							
							if(f.insertRestaurant(r1)){
								System.out.println("Restaurant Inserted... ID: " + rid1);
							} else {
								System.out.println("Oops... Something is Wrong...");
							}
							System.out.println();
							break;
						case 2:
							System.out.println("******************************************");
							System.out.println("Your Option is: Remove Existing Restaurant");
							System.out.println("******************************************");
							System.out.println();
							
							System.out.print("Enter Restaurant Id: ");
							String rid2 = sc.next();
							
							Restaurant r2 = f.searchRestaurant(rid2);
							
							if(r2 != null) {
								if(f.removeRestaurant(r2)){
									System.out.println("Restaurant Removed...... ID: " + r2.getRid());
								} else {
									System.out.println("Oops... Something is Wrong...");
								}
							} else {
								System.out.println("Sorry... No Restaurant Found to Remove.....");
							}
							System.out.println();
							break;
						case 3:
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Restaurant");
							System.out.println("***********************************");
							System.out.println();
							
							f.showAllRestaurant();
							break;
						case 4:
							System.out.println("***********************************");
							System.out.println("Your Option is: Search a Restaurant");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Restaurant Id: ");
							String rid4 = sc.next();
							
							Restaurant r4 = f.searchRestaurant(rid4);

							if(r4 != null) {
								System.out.println("Restaurant Found...........");
								System.out.println("Restaurant Id: " + r4.getRid());
								System.out.println("Restaurant Name: " + r4.getName());
							} else {
								System.out.println("Sorry... No Restaurant Found.....");
							}
							System.out.println();
							break;
						case 5:
							System.out.println("***********************");
							System.out.println("Going Back.............");
							System.out.println("***********************");
							System.out.println();
							break;
						default:
							System.out.println("**************");
							System.out.println("Invalid Option");
							System.out.println("**************");
							System.out.println();
							break;
					}
					System.out.println();
					break;
				case 3:
					System.out.println("**********************************************");
					System.out.println("Your Choice is: Restaurant FoodItem Management");
					System.out.println("**********************************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("---------------------------------");
					System.out.println("1. Insert New Food Item");
					System.out.println("2. Remove Existing Food Item");
					System.out.println("3. Show All Food Item");
					System.out.println("4. Search a Food Item");
					System.out.println("5. Go Back");
					System.out.println("---------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1:
							System.out.println("************************************");
							System.out.println("Your Option is: Insert New Food Item");
							System.out.println("************************************");
							System.out.println();
							
							System.out.println("There are Two Types of Food Item: ");
							System.out.println("1. Main Dish");
							System.out.println("2. Appetiziers");
							System.out.println("3. Go Back");
							
							System.out.print("Enter Your Choice: ");
							int type1 = sc.nextInt();
							
							FoodItem fi = null;
							
							if(type1 == 1) {
								System.out.println("Your Choice is: Main Dish");
								
								System.out.print("Enter Main Dish Number: ");
								String mid = sc.next();
								System.out.print("Enter Main Dish Name: ");
								String name = sc.next();
								System.out.print("Enter Quantity: ");
								int quantity = sc.nextInt();
								System.out.print("Enter Price: ");
								double price = sc.nextDouble();
								System.out.print("Enter Main Dish Category: ");
								String category = sc.next();
								
								MainDish md = new MainDish(mid, name, quantity, price, category);
								
								fi = md;
							} else if(type1 == 2) {
								System.out.println("Your Choice is: Appetiziers");
								
								System.out.print("Enter Appetiziers Number: ");
								String aid = sc.next();
								System.out.print("Enter Appetiziers Name: ");
								String name = sc.next();
								System.out.print("Enter Quantity: ");
								int quantity = sc.nextInt();
								System.out.print("Enter Price: ");
								double price = sc.nextDouble();
								System.out.print("Enter Appetiziers Size: ");
								String size = sc.next();
								
								Appetiziers ap = new Appetiziers(aid, name, quantity, price, size);
								
								fi = ap;
							} else if(type1 == 3) {
								System.out.println("Your choice is to Go Back");
							} else {
								System.out.println("Inavlid Type...........");
							}
							
							if(fi != null) {
								System.out.print("Enter Restaurant ID: ");
								String rid1 = sc.next();
								
								Restaurant r1 = f.searchRestaurant(rid1);
								
								if(r1 != null) {
									if(r1.insertFoodItem(fi)){
										System.out.println("Food Item inserted....");
									} else {
										System.out.println("Food Item Not Inserted");
									}
								} else {
									System.out.println("Oops... Someting is Worng...");
								}
							}
							break;
						case 2:
							System.out.println("*****************************************");
							System.out.println("Your Option is: Remove Existing Food Item");
							System.out.println("*****************************************");
							System.out.println();
							
							System.out.print("Enter Restaurant ID: ");
							String rid2 = sc.next();
							System.out.print("Enter Food Item Number: ");
							String fid2 = sc.next();

							Restaurant rr = f.searchRestaurant(rid2);
							FoodItem aa = rr.searchFoodItem(fid2);

							if (aa == null) {
								System.out.println("Food Item ID Not Found!");
								break;
							}
							rr.removeFoodItem(aa);
							System.out.println();
							break;
						case 3:
							System.out.println("**********************************");
							System.out.println("Your Option is: Show All Food Item");
							System.out.println("**********************************");
							System.out.println();
							
							System.out.print("Enter Restaurant ID: ");
							String rid3 = sc.next();
								
							Restaurant r3 = f.searchRestaurant(rid3);
							
							if(r3 != null) {
								r3.showAllFoodItems();
							} else {
								System.out.println("No Restaurant Found");
							}
							break;
						case 4:
							System.out.println("**********************************");
							System.out.println("Your Option is: Search a Food Item");
							System.out.println("**********************************");
							System.out.println();
							
							System.out.print("Enter Restaurant ID: ");
							String rid4 = sc.next();
							System.out.print("Enter Food Item Number: ");
							String fid4 = sc.next();

							FoodItem f4 = f.searchRestaurant(rid4).searchFoodItem(fid4);

							if (f4 != null) {
								f4.showInfo();
							} else {
								System.out.println("Food Item Not Found!");
							}
							break;
						case 5:
							System.out.println("***********************");
							System.out.println("Going Back.............");
							System.out.println("***********************");
							System.out.println();
							break;
						default:
							System.out.println("**************");
							System.out.println("Invalid Option");
							System.out.println("**************");
							System.out.println();
							break;
					}
					System.out.println();
					break;
				case 4:
					System.out.println("*******************************************");
					System.out.println("Your Choice is: Food Item Quantity Add-Sell");
					System.out.println("*******************************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------");
					System.out.println("1. Add FoodItem");
					System.out.println("2. Sell FoodItem");
					System.out.println("3. Show Add Sell History");
					System.out.println("4. Go Back");
					System.out.println("-----------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option4 = sc.nextInt();
					
					switch(option4) {
						case 1:
							System.out.println("****************************");
							System.out.println("Your Option is: Add FoodItem");
							System.out.println("****************************");
							System.out.println();
							
							System.out.print("Enter Restaurant ID: ");
							String rid1 = sc.next();
							
							Restaurant r1 = f.searchRestaurant(rid1);
							
							if(r1 != null) {
								System.out.print("Enter Food Item Number: ");
								String z = sc.next();
								
								FoodItem fi = r1.searchFoodItem(z);
								
								if(fi != null) {
									System.out.print("Add Quantity: ");
									int q1 = sc.nextInt();
									System.out.println("Current Available Quantity: " + fi.getAvailableQuantity());
									
									if(fi.addQuantity(q1)) {
										System.out.println("Add Quantity: " + q1 + "  Successfull");
										System.out.println("Updated Available Quantity: "+ fi.getAvailableQuantity());
										frwd.writeInFile(q1 + " has been added in "+ fi.getFid());
									} else {
										System.out.println("Oops Something is Worng");
									}
								}
							}
							break;
						case 2:
							System.out.println("*****************************");
							System.out.println("Your Option is: Sell FoodItem");
							System.out.println("*****************************");
							System.out.println();
							
							System.out.print("Enter Restaurant ID: ");
							String rid2 = sc.next();
							
							Restaurant r2 = f.searchRestaurant(rid2);
							
							if(r2 != null) {
								System.out.print("Enter Food Item Number: ");
								String z = sc.next();
								
								FoodItem fi = r2.searchFoodItem(z);
								
								if(fi != null) {
									System.out.print("Sell Quantity: ");
									int q2 = sc.nextInt();
									System.out.println("Current Available Quantity: " + fi.getAvailableQuantity());
									
									if(fi.sellQuantity(q2)) {
										System.out.println("Sell Quantity: " + q2 + "  Successfull");
										System.out.println("Updated Available Quantity: "+ fi.getAvailableQuantity());
										frwd.writeInFile(q2 + " has been sold from "+ fi.getFid());
									} else {
										System.out.println("Oops Something is Worng");
									}
								}
							}
							break;
						case 3:
							System.out.println("*************************************");
							System.out.println("Your Option is: Show Add Sell History");
							System.out.println("*************************************");
							
							frwd.readFromFile();
							System.out.println();
							break;
						case 4:
							System.out.println("***********************");
							System.out.println("Going Back.............");
							System.out.println("***********************");
							System.out.println();
							break;
						default:
							System.out.println("**************");
							System.out.println("Invalid Option");
							System.out.println("**************");
							System.out.println();
							break;
					}
					System.out.println();
					break;
				case 5:
					repeat = false;
					System.out.println("******************************");
					System.out.println("Thank You for Using Our System");
					System.out.println("******************************");
					System.out.println();
					break;
				default:
					System.out.println("**************");
					System.out.println("Invalid Choice");
					System.out.println("**************");
					System.out.println();
					break;
			}
		}
	}
}