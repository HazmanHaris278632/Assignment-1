import java.util.Scanner;
public class tournamentRegistration { //user define class
	private int category;
	private String teamname;
	private int players =12;	
	private int choice, quantity, order;
	private double price;
	private double registerPrice = 100;
	private double payment;
	private double balance;
	private double totalprice;
	public double packagetotal;
	
	Scanner s = new Scanner(System.in); //predefine class
	public tournamentRegistration() {
		
		while(true) {
			System.out.println("Enter category:");
			this.category = s.nextInt();
			s.nextLine();
			if(this.category < 1 || this.category > 2) {
				System.out.println("Invalid category. Please enter correct category.");
				continue;
			}
			break;
			}
	switch(this.category) {
	
	case 1:
		System.out.println("Joining MEN category");
		break;
	
	case 2:
		System.out.println("Joining WOMEN category");
		break;
		default:
			System.out.println("Invalid category");
	}
	teamName("Team name"); 
	playerRegistration();
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public void teamName(String gn) { //1.4 constructor with one argument
		String groupname = gn;
			System.out.println("Enter your team name:");
			this.teamname = s.nextLine();	
		}
	public String getTeamName() {
		return teamname;
	}
	public void setTeamName(String teamname) {
		this.teamname = teamname;
}
	public void playerRegistration() {
	System.out.println("Please register your team player name. "
				+ "\nTotal of 12 players only!");
		String[] playernames = new String[players];
		
		for(int counter = 0; counter < players; counter++) {
			System.out.println("Enter the name of your team players: " + (counter+1));
			playernames[counter] = s.nextLine();
		}
			System.out.println("Team players list:");
			for(int counter = 0; counter < players; counter++) {
			
			System.out.println(playernames[counter]);
	}
		energyPackage();
		totalPrice();
}
	public void energyPackage() { //1.4 constructor with no argument

		System.out.println("We have 100 Plus & Milo Energy Bar for contestants. Do you want to booking for buy? ");
		
		while(true) {
			System.out.println("Enter 1 to buy, if do not want to buy enter 2");
			this.choice = Integer.parseInt(s.nextLine());
			if(this.choice < 1 || this.choice > 2) {
				System.out.println("Invalid choice. Please enter correct choice.");
				continue;
		}
		break;
		}
		switch(this.choice) {
		
		case 1:
			System.out.println("What package your team want to buy?");
				System.out.println("Package 1: 6 bottles of 500ml 100 Plus + 12 Milo Fitness Energy Bar - RM20"
						+ "\nPackage 2: 12 bottles of 500ml 100 Plus + 24 Milo Fitness Energy Bar - RM30"
						+ "\nPackage 3: 24 bottles (1carton) of 500ml 100 Plus + 36 Milo Fitness Energy Bar - RM50");
				while (true) {
				System.out.println("Enter your order:");
				this.order = s.nextInt();
				if(this.order < 1 || this.order > 3) {
					System.out.println("Invalid order.Please enter right order number.");
					continue;
				}
				break;
				}
				if(this.order == 1) {
					this.price = 20;
				}
				else if(this.order == 2) {
					this.price = 30;
				}
				else if(this.order == 3) {
					this.price = 50;
				}
				else {
					System.out.println("Invalid order option");
				}
				
				System.out.println("How many quantity");
				this.quantity = s.nextInt();
				packagetotal = this.price*this.quantity;
				System.out.printf("Energy package price \t: RM%.2f",packagetotal);
				break;		
				
		case 2:
			System.out.println("No order place");
			break;
			default:
				System.out.println("Invalid option");
		}
		}
		public int getChoice() {
			return choice;
		}
		public void setChoice(int choice) {
			this.choice = choice;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public int getOrder() {
			return order;
		}
		public void setOrder(int order) {
			this.order = order;
		}
		public void totalPrice() {
			
			this.totalprice = this.registerPrice + packagetotal;
			System.out.printf("\nTotal price \t\t: RM%.2f",this.totalprice);
			System.out.println("\nEnter your payment \t: ");
			this.payment = s.nextDouble();
			
			System.out.println("=============================================================");
			System.out.printf("Registration fee \t\t: RM%.2f",this.registerPrice);
			System.out.printf("\nTotal energy package price \t: RM%.2f",packagetotal);
			System.out.printf("\nTotal price \t\t\t: RM%.2f",this.totalprice);
			System.out.printf("\nPaid \t\t\t\t: RM%.2f",payment);
			this.balance = this.payment - this.totalprice;
			System.out.printf("\nChange \t\t\t\t: RM%.2f",this.balance);
			System.out.println("\nTHAK YOU FOR JOINING THIS TOURNAMENT. GOODLUCK.");
			System.out.println("=============================================================");
			
		}
		public double getRegisterPrice() {
			return registerPrice;
		}
		public void setRegisterPrice(double registerPrice) {
			this.registerPrice = registerPrice;
		}
		public double getPayment() {
			return payment;
		}
		public void setPayment(double payment) {
			this.payment = payment;
		}
		public double getTotalPrice() {
			return totalprice;
		}
		public void setTotalPrice(double totalprice) {
			this.totalprice = totalprice;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
	}
