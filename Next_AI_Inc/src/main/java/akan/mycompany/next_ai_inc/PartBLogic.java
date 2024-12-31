/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package akan.mycompany.next_ai_inc;

/**
 *
 * @author Muhamed
 */
public class PartBLogic {

  
    public void calculatePay(double basePay, int hoursWorked) {
      
        if (basePay < 30000) {
            System.out.println("Error: Base pay must not be below UGX 30,000.");
            return;
        }

       
        if (hoursWorked > 72) {
            System.out.println("Error: Hours worked must not exceed 72 hours per week.");
            return;
        }

        
        double totalPay;
        if (hoursWorked <= 48) {
            totalPay = hoursWorked * basePay;
        } else {
            int overtimeHours = hoursWorked - 48;
            totalPay = (48 * basePay) + (overtimeHours * basePay * 2);
        }

     
        System.out.println("Total weekly pay: UGX " + totalPay);
    }
}

