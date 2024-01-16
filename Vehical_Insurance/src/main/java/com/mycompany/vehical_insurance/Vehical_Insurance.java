package com.mycompany.vehical_insurance;

import java.util.Scanner;

public class Vehical_Insurance {

    public static void main(String[] args) {
        System.out.println("Enter your Vechical type: ");
        System.out.println(" Car, Truck , Bus , Motorcycle ");
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();

        int premium = 0;
        switch (type) {
            case "Car":
                premium = 200;
                break;
            case "Truck":
                premium = 300;
                break;
            case "Bus":
                premium = 400;
                break;
            case "Motorcycle":
                System.out.println("Enter your Motorcycle type : ");
                System.out.println("1 (Low power), 2 (Medium power), 3 (High power)");
                String MotorcycleType = scan.nextLine();
                int MotorcycleInt = Integer.parseInt(MotorcycleType);
                switch (MotorcycleInt) {
                    case 1:
                        premium = 300;
                        break;
                    case 2:
                        premium = 400;
                        break;
                    case 3:
                        premium = 500;
                        break;
                    default:
                        System.out.println("Unknown Motorcycle type");
                }
                break;
                
            default:
                System.out.println(" Unknown vehical type");

        }
        
        scan.close();
        System.out.println("The premim is $ " + premium  );

    }
}
