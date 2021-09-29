/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Bt4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double  x;
        
        	Scanner weekday = new Scanner(System.in);
        System.out.print("Nhap So: ");
        int day = weekday.nextInt();
        
            System.out.println(getDayName(day));
            }
	 	public static String getDayName(int day) {
                    String dayName = "";
                        switch (day) {
                            case 0: dayName = "Monday"; break;
                            case 1: dayName = "Tuesday"; break;
                            case 2: dayName = "Wednesday"; break;
                            case 3: dayName = "Thursday"; break;
                            case 4: dayName = "Friday"; break;
                            case 5: dayName = "Saturday"; break;
                            case 6: dayName = "Sunday"; break;
                            default:dayName = "Ngày sai";
                        }

                        return dayName;
                }
}
