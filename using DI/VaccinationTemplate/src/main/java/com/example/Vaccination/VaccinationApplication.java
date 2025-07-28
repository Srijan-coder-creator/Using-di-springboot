package com.example.Vaccination;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;
@SpringBootApplication
public class VaccinationApplication {

    public static void main(String[] args) {
    	  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

          Scanner scanner = new Scanner(System.in);

          System.out.println("Select user: 1. Self 2. Father 3. Mother 4. Spouse");
          int choice = scanner.nextInt();
          scanner.nextLine(); // consume leftover newline

          User user = null;

          switch (choice) {
              case 1:
                  user = (User) context.getBean("self");
                  break;
              case 2:
                  user = (User) context.getBean("father");
                  break;
              case 3:
                  user = (User) context.getBean("mother");
                  break;
              case 4:
                  user = (User) context.getBean("spouse");
                  break;
              default:
                  System.out.println("Invalid choice");
                  System.exit(0);
          }

          System.out.println("Enter your name:");
          String name = scanner.nextLine();
          System.out.println("Enter your age:");
          int age = scanner.nextInt();
          scanner.nextLine(); // consume newline

          System.out.println("Enter time slot (e.g., 12:00 PM):");
          String timeSlot = scanner.nextLine();
          System.out.println("Enter location:");
          String location = scanner.nextLine();
          System.out.println("Enter date (e.g., 2025-05-10):");
          String date = scanner.nextLine();

          TimeAndLocation timeAndLocation = (TimeAndLocation) context.getBean("timeAndLocation");
          timeAndLocation.setDetails(timeSlot, location, date);

          user.setUserDetails(name, age, timeAndLocation);
          user.setAppointment();
        /*
		You need to complete this application as mentioned in the problem 
		statement build your own logic and perform the following tasks.

		 Tasks:
		1. Fetch context from ApplicationContext.xml and initiate Scanner.
		2. Fetch vaccine and User type choice.
		3. Get the required bean from context.
		4. Get the appointment details form user
		5. Display the appointment details
		6. Run the loop again to book for another user or else exit.
		 */

    }
}