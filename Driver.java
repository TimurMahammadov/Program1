// Author: Timur Mahammadov
// CourseL: Data Structures 2214
// Program Assignment #1
// Purpose: This program that simulates customers waiting in line at a grocery store.
// Program must use a Queue to represent the customer objects waiting in line.

import java.util.*;

public class Driver
{
   public static void main (String[] args)
   {
      CustomerQueue line = new CustomerQueue();

      // Chance that a new customer arrives.
      double newCustomer;

      // Total number customer served.
      int total = 0;

      // Max number length.
      int max = 0;

      // Start the hour of work.
      System.out.println("Hour of working has began. ");

      for (int m = 0; m < 60; m++)
      {
         // If there customer in line subtract one minute from their service time.
         if(line.size() > 0)
         {
            line.get().decServiceTime();
            //System.out.println("Current customer time is " + line.get().getServiceTime());

            if(line.get().getServiceTime() == 0)
            {
               line.remove();
               System.out.println("Customer Served. Line length is " + line.size());
               total++;

            }
         }
         // Check to see if customer should be added.
         newCustomer = Math.random();
         if (newCustomer <= 0.25)
         {
            Customer c = new Customer();
            line.add(c);
            System.out.println("New customer arrives. The service time is " + c.getServiceTime() + ". Length is " + line.size());

            // If the new line length is maximum, charge max
            if(line.size() > max) max = line.size();
         }


         System.out.println("Time: " + (m+1) + "----------------");
       }// End for loop
      // Print total number of customers served and max
         System.out.println("The number of customers served is: " + total);
         System.out.println("The maximum line length is " + max);
   }
}
