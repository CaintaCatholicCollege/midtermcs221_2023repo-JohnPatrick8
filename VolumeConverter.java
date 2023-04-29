/**
 * @(#)Volume Converter.java
 *
 *
 * @author 
 * @version 1.00 2023/4/29
 */




import java.util.Scanner;

public class VolumeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double volume, converted_volume;
        int choice;
        
        System.out.print("Enter the volume: ");
        volume = input.nextDouble();
        
        System.out.println("Choose the volume type to convert:");
        System.out.println("1. Milliliters to Microliters");
        System.out.println("2. Microliters to Milliliters");
        System.out.println("3. Quarts to Gallons");
        System.out.println("4. Gallons to Quarts");
        System.out.print("Enter your choice (1, 2, 3, or 4): ");
        choice = input.nextInt();
        
        switch (choice) {
            case 1:
                converted_volume = volume * 1000;
                System.out.printf("%.2f milliliters is equal to %.2f microliters", volume, converted_volume);
                break;
            case 2:
                converted_volume = volume / 1000;
                System.out.printf("%.2f microliters is equal to %.2f milliliters", volume, converted_volume);
                break;
            case 3:
                converted_volume = volume / 4;
                System.out.printf("%.2f quarts is equal to %.2f gallons", volume, converted_volume);
                break;
            case 4:
                converted_volume = volume * 4;
                System.out.printf("%.2f gallons is equal to %.2f quarts", volume, converted_volume);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        
        input.close();
    }
}
    
    