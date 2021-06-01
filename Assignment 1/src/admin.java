import java.util.Scanner;

public class admin { //user define class
		private double profit;
		private double totalIncome;
		private double incomeWeek1;
		private double incomeWeek2;
		private double incomeWeek3;
		private double incomeWeek4;
		private double tournamentCost;
		private int option;
		private int choose;
		
		Scanner s = new Scanner(System.in); //predefine class
		
		public admin(String n, String c) { //1.4 constructor with two arguments
			String name = n;
			String contact = c;
			while (true) {
			System.out.println("Enter as:"
								+ "\n1. Admin" + "\n2. User");
			option = s.nextInt();
			if(option < 1 || option > 2) {
				System.out.println("Invalid option. Please enter correct option.");
				continue;
			}
			break;
			}
			switch(option) {
			case 1:
				System.out.println("Admin:"
						+ "\n1. Employee" + "\n2. Finance");
				System.out.println("Choose option:");
				choose = s.nextInt();
				
				if(choose == 1) {
					employee();
				}
				else if(choose == 2) {
					finance();
				}
				break;
			case 2:
				System.out.println("\nHi! Welcome, join our futsal competition. LUCRATIVE PRIZE awaits you!");
				break;
				default:
					System.out.println("Invalid option");
					
			
		}
		}
			public void employee() {
			System.out.println("\nEmployee list: \n");
			System.out.println("Name:" + "\t\t\t" + "\tContact number:");
			
		String []employee = {"LuqmanHakim \t(Event Manager)\t", "Aiman \t\t(Assistant Manager)", "Salim \t\t(Logistic Manager)", "Dzul \t\t(Marketing Coordinator)", "Faiz \t\t(Game Day Staff)"};
		int []phone = {123456, 654321, 325641, 426135, 541263};
		for(int x = 0; x<employee.length; x++) {
			System.out.println(employee[x] + "\t\t\t" + phone[x]);
		}
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
		public void netIncome(double incomeWeek1, double incomeWeek2, double incomeWeek3, double incomeWeek4) {
			totalIncome = incomeWeek1 + incomeWeek2 + incomeWeek3 + incomeWeek4;
			profit = totalIncome - tournamentCost;
			
			System.out.printf("Total income for this month : RM%.2f",totalIncome );
			System.out.printf("\nTotal cost of tournament operation: RM%.2f",tournamentCost);
			System.out.printf("\nTotal profit for this month: RM%.2f",profit);
		}

	}
	





