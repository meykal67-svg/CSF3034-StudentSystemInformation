/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package systeminformationstudent;

/**
 *
 * @author LENOVO
 */
public class SystemInformationStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Amir Haikal";
        String studentId = "S87264";
        int mark1 = 80;
        int mark2 = 70;

        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        
         int total = mark1 + mark2;

        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Total: " + total);

        if (total >= 160) {
            System.out.println("Result: Excellent");
        } else if (total >= 100) {
            System.out.println("Result: Good");
        } else {
            System.out.println("Result: Needs Improvement");
        }
    }
    
}
