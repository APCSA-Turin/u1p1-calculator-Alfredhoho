package com.example;
import java.util.Scanner;
public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW  
        double tip = (Math.round(100 * (cost * percent / 100))) / 100.0; 
        double totalBillWithTip = cost + tip;
        double perPersonCost = (Math.round((100 * (cost / people)))) / 100.0; 
        double tipPerPerson = (Math.round((100 * (tip / people)))) / 100.0; 
        double totalCostPerPerson = (Math.round((100 * ((cost/people) + ((cost * percent / 100) / people))))) / 100.0; 
        
        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + tip + "\n" +
                       "Total Bill with tip: $" + totalBillWithTip + "\n" +
                       "Per person cost before tip: $" + perPersonCost + "\n" +
                       "Tip per person: $" + tipPerPerson + "\n" +
                       "Total cost per person: $" + totalCostPerPerson + "\n" +
                       "-------------------------------\n";

        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {
        Scanner scanner = new Scanner(System.in);
        
        
        String item = " ";
        String list = "Items ordered:\n";
        boolean condition = true;
        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 
        double tip = (Math.round(100 * (cost * percent / 100))) / 100.0; 
        double totalBillWithTip = cost + tip;
        double perPersonCost = (Math.round((100 * (cost / people)))) / 100.0; 
        double tipPerPerson = (Math.round((100 * (tip / people)))) / 100.0; 
        double totalCostPerPerson = (Math.round((100 * ((cost/people) + ((cost * percent / 100) / people))))) / 100.0; 
 
        while (condition) {
            System.out.println("Enter a item name or -1 to finish:");
            item = scanner.nextLine();
            String cancel = "-1";
            if (item.equals(cancel)) {
            condition = false;
            break;
            }
         list = list + item + "\n"; //got from Grit(bingyan)
        
         } 
        scanner.close();
        String result2 = "-------------------------------\n" +
                    "Total bill before tip: $" + cost + "\n" +
                    "Total percentage: " + percent + "%\n" +
                    "Total tip: $" + tip + "\n" +
                    "Total Bill with tip: $" + totalBillWithTip + "\n" +
                    "Per person cost before tip: $" + perPersonCost + "\n" +
                    "Tip per person: $" + tipPerPerson + "\n" +
                    "Total cost per person: $" + totalCostPerPerson + "\n" +
                    "-------------------------------\n" + 
                    list + "-------------------------------\n";

        return result2;
        }
           
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=10; 
        int percent=8;
        double cost=10.5;           
        double tip = (Math.round(100 * (cost * percent / 100))) / 100.0; 
        double totalBillWithTip = cost + tip;
        double perPersonCost = (Math.round((100 * (cost / people)))) / 100.0; 
        double tipPerPerson = (Math.round((100 * (tip / people)))) / 100.0; 
        double totalCostPerPerson = (Math.round((100 * ((cost/people) + ((cost * percent / 100) / people))))) / 100.0; 

        // System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));
    }
}
        
