import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class AdminMenu {

    public static void showAdminMenu(){
        int menuChoice = 0;
        Scanner input = new Scanner((System.in));
        System.out.println("******** Admin Menu *********");
        System.out.println("1. See all Customers.");
        System.out.println("2. See all Rooms.");
        System.out.println("3. See all Reservations.");
        System.out.println("4. Add a room.");
        System.out.println("5. Back to Main Menu.");
        System.out.println("********************");
        System.out.println("Please Enter a Number corresponding a menu to proceed!");
        try{
            menuChoice = input.nextInt();
        }catch (Exception ex){
            throw new IllegalArgumentException("Please enter a valid number");
        }
       switch(menuChoice) {
           case 1:
                 System.out.println("All Customers");
                 break;
           case 2:
               System.out.println("All Rooms");
               break;
           case 3:
               System.out.println("All Reservations");
               break;
           case 4:
               System.out.println("Add a room");
               break;
           case 5:
               MainMenu.getMainMenu();
               break;
           default:
               System.out.println("Invalid Response");
               break;
       }

    }
}
