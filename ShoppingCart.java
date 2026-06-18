import java.util.Scanner;
 class  Product {
	int productId;
	String productName;
	double price;
	
	Product(int productId, String productName, double price){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
    void displayProduct(){
		System.out.println(productId +"." + productName +"-₹"+price);
	}
  }

	public class ShoppingCart {
	
     public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Product p1 = new Product(101, "Wireless Mouse", 799);
		
		Product p2 = new Product(102, "Keyboad", 1200);
		
		Product p3 = new Product(103, "Headphones",1500);
		
		Product p4 = new Product(104, "Black Shirt", 2000);
		
		double totalBill = 0;
		 int choice;
		 do {
			 System.out.println("\n====== SHOPPING CART MENU ======");
			 
             System.out.println("1.View Products");
			 System.out.println("2.Buy Wireless Mouse");
			 System.out.println("3.Buy Keyboard");
			 System.out.println("4.Buy Headphones");
			 System.out.println("5.Buy Black Shirt");
			 System.out.println("6.Generate Bill");
			 System.out.println("7.Exit");
			 
			 System.out.print("Enter Your choice:");
			 choice = sc.nextInt();
			    switch (choice)
				
			    {
			    case 1:
					System.out.println("\nAvailable Products:");
				     p1.displayProduct();
					 p2.displayProduct();
					 p3.displayProduct();
					 p4.displayProduct();
					  break;
					  
			    case 2:
					System.out.print("Enter Quantity:");
				    int q1 = sc.nextInt();
					totalBill += q1*p1.price;
					System.out.println("Item Added To Cart.");
					break;
			   
			    case 3:
					System.out.print("Enter Quantity:");
				    int q2 = sc.nextInt();
					totalBill += q2*p1.price;
					System.out.println("Item Added To Cart.");
					break;
					
				 case 4:
					System.out.print("Enter Quantity:");
				    int q3 = sc.nextInt();
					totalBill += q3*p1.price;
					System.out.println("Item Added To Cart.");
					break;
				case 5:
					System.out.print("Enter Quantity:");
				    int q4 = sc.nextInt();
					totalBill += q4*p1.price;
					System.out.println("Item Added To Cart.");
					break;
					
				case 6:
				    double discount = 0;
					if (totalBill >= 5000) {
						discount = totalBill*0.10;
					}
					
				double finalBill = totalBill- discount;
				
				System.out.println("\n===== BILL SUMMARY =====");
				
				System.out.println("Total Amount:₹" + totalBill);
				System.out.println("Discount:₹" + discount);
				System.out.println("Final Amount:₹" + finalBill);
				 break;
				
				case 7:
				System.out.println("thank you for Shopping!");
				 break;
				 
				 default:
					 System.out.println("Invalid Choice!");  
				   }
				   
		            } while (choice !=6);
		            {
						sc.close();
		            }
		 
		
	}
}
