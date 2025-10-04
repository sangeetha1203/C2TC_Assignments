package com.tnsif.assignment1;
import java.util.Scanner;

		class Commission {
		    String name;
		    String address;
		    String phone;
		    double sales_amount;
		    double commission;

		    // Method to accept details of the sales employee
		    public void acceptDetails() {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter employee name: ");
		        name = sc.nextLine();
		        System.out.print("Enter employee address: ");
		        address = sc.nextLine();
		        System.out.print("Enter employee phone number: ");
		        phone = sc.nextLine();
		        System.out.print("Enter sales amount: ");
		        sales_amount = sc.nextDouble();
		    }

		    // Method to calculate the commission
		    public void calculateCommission() {
		        if (sales_amount >= 100000) {
		            commission = sales_amount * 0.10;
		        } else if (sales_amount >= 50000) {
		            commission = sales_amount * 0.05;
		        } else if (sales_amount >= 30000) {
		            commission = sales_amount * 0.03;
		        } else {
		            commission = 0;
		        }
		    }

		    // Method to display the employee details and calculated commission
		    public void displayDetails() {
		        System.out.println("\n--- Employee Details ---");
		        System.out.println("Name: " + name);
		        System.out.println("Address: " + address);
		        System.out.println("Phone: " + phone);
		        System.out.println("Sales Amount: " + sales_amount);
		        System.out.println("Commission: " + commission);
		        System.out.println("------------------------");
		    }

	}

