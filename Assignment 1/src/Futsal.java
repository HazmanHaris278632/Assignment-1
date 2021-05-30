import java.util.Scanner;
public class Futsal {
	
	Scanner s = new Scanner(System.in);
	  Futsal() {
		companyDescription z = new companyDescription();
		
		  System.out.println("This is Megah Jitra Futsal Tournament."
							+ "\n1. GRAND PRIZE RM10,000 FOR MEN'S CATEOGRY"
							+ "\n2. GRAND PRIZE RM7,000 FOR WOMEN'S CATEGORY");
		advertisement b = new advertisement();
		tournamentRegistration c = new tournamentRegistration();
		admin d = new admin("Name", "Contact number");
}
class companyDescription {
	public companyDescription() {
		System.out.println("Our company Megah Futsal is very experienced in managing a futsal competition."
							+ "\nOur company location is located in Jitra,Kedah."
							+ "\nMake us your top choice to manage your futsal competition.");	
	}
}
class advertisement {
		public  advertisement() {
		System.out.println("The BIGGEST futsal tournament in Jitra is here again. What you waiting for, don't waste your time, register before "
							+ "\nRegistration fee only RM100");
	}			
}
class tournamentRegistration {
	private int category;
	private String teamname;
	private int players =12;	
	private int choice, quantity;
	private double price;
	private double registerPrice = 100;
	private double payment;
	private double balance;
	private double totalprice;
	public double packagetotal;
	
	public tournamentRegistration() {
	System.out.println("Enter category:");
	this.category = s.nextInt();
	s.nextLine();
	
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
	teamName();
	playerRegistration();
	energyPackage();
	totalPrice();
	}
public int getCategory() {
	return category;
}
public void setCategory(int category) {
	this.category = category;
}
	public void teamName() {
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
			System.out.println("Team is players list:");
			for(int counter = 0; counter < players; counter++) {
			
			System.out.println(playernames[counter]);
	}
		
}
	public void energyPackage() {

	System.out.println("We have 100 Plus & Milo Energy Bar for contestants. Do you want to booking for buy? ");
	System.out.println("Enter 1 to buy, if do not want to buy enter 2");
	this.choice = Integer.parseInt(s.nextLine());
	
	switch(this.choice) {
	
	case 1:
		System.out.println("What package your team want to buy?");
			System.out.println("Package 1: 6 bottles of 500ml 100 Plus + 12 Milo Fitness Energy Bar - RM20"
					+ "\nPackage 2: 12 bottles of 500ml 100 Plus + 24 Milo Fitness Energy Bar - RM30"
					+ "\nPackage 3: 24 bottles (1carton) of 500ml 100 Plus + 36 Milo Fitness Energy Bar - RM50");
			System.out.println("Enter package to order order:");
			int order = s.nextInt();
			
			if(order == 1) {
				this.price = 20;
			}
			else if(order == 2) {
				price = 30;
			}
			else if(order == 3) {
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
class admin {
	private double profit;
	private double totalIncome;
	private double incomeWeek1;
	private double incomeWeek2;
	private double incomeWeek3;
	private double incomeWeek4;
	private double tournamentCost;
	public admin(String n, String c) {
		String name = n;
		String contact = c;
		System.out.println("\nEmployee list: \n");
		System.out.println("Name:" + "\t\t\t" + "\tContact number:");
		
	String []employee = {"LuqmanHakim \t(Event Manager)\t", "Aiman \t\t(Assistant Manager)", "Salim \t\t(Logistic Manager)", "Dzul \t\t(Marketing Coordinator)", "Faiz \t\t(Game Day Staff)"};
	int []phone = {123456, 654321, 325641, 426135, 541263};
	for(int x = 0; x<employee.length; x++) {
		System.out.println(employee[x] + "\t\t\t" + phone[x]);
	}
	finance();
	}
	
	public void finance () {
	Scanner s = new Scanner(System.in);
		System.out.println("\nEnter income for week 1: ");
		incomeWeek1 = s.nextDouble();
		System.out.println("Enter income for week 2: ");
		incomeWeek2 = s.nextDouble();
		System.out.println("Enter income for week 3: ");
		incomeWeek3 = s.nextDouble();
		System.out.println("Enter income for week 4: ");
		incomeWeek4 = s.nextDouble();
		System.out.println("Enter the operation cost of the tournament: ");
		tournamentCost = s.nextDouble();
		
		netIncome(incomeWeek1,incomeWeek2,incomeWeek3,incomeWeek4);
	}
	void netIncome(double incomeWeek1, double incomeWeek2, double incomeWeek3, double incomeWeek4) {
		totalIncome = incomeWeek1 + incomeWeek2 + incomeWeek3 + incomeWeek4;
		profit = totalIncome - tournamentCost;
		
		System.out.printf("Total income for this month : RM%.2f",totalIncome );
		System.out.printf("\nTotal cost of tournament operation: RM%.2f",tournamentCost);
		System.out.printf("\nTotal profit for this month: RM%.2f",profit);
	}

}
}






	



	
		
	
	

