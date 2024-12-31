/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package akan.mycompany.next_ai_inc;

/**
 *
 * @author Muhamed
 */
public class Next_AI_Inc {

    public static void main(String[] args) {

       
        System.out.println("\nPart B: Calculating Contractor Pay");
        PartBLogic partB = new PartBLogic();

        System.out.println("Contractor A:");
        partB.calculatePay(30000, 51); 

        System.out.println("Contractor B:");
        partB.calculatePay(20000, 40); 

        System.out.println("Contractor C:");
        partB.calculatePay(35000, 96); 
    }
}

