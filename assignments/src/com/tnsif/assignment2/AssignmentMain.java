package com.tnsif.assignment2;

import com.tnsif.assignment2.employees.*;
import com.tnsif.assignment2.utilities.*;

/**
 * Main class to demonstrate the use of packages and access modifiers.
 */
public class AssignmentMain {
    public static void main(String[] args) {

        Manager manager = new Manager("Pavi", 101, 85000, "HR");
        Developer developer = new Developer("Kani", 102, 75000, "Java");

        EmployeeUtilities util = new EmployeeUtilities();

        System.out.println("Manager Details");
        manager.displayInfo();

        System.out.println("\nDeveloper Details");
        developer.displayInfo();

        // Give bonus using utility
        System.out.println("\nAfter Bonus");
        util.giveBonus(manager, 5000);
        util.giveBonus(developer, 4000);
    }
}