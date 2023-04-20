import java.util.Scanner;

public class MainMenu {
    public static void getMainMenu(){
        int menuChoice = 0;
        Scanner input = new Scanner((System.in));
        System.out.println("1. Find and reserve a room.");
        System.out.println("2. See my reservations.");
        System.out.println("3. Create an account.");
        System.out.println("4. Admin");
        System.out.println("5. Exit");
        System.out.println();
        try {
            menuChoice = input.nextInt();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Please enter a valid number");
        }
        switch (menuChoice) {
            case 1:
                System.out.println("Find and reserve a room");
                break;
            case 2:
                System.out.println("See my reservations");
                break;
            case 3:
                System.out.println("create an account");
                break;
            case 4:
                AdminMenu.showAdminMenu();
                break;
            case 5:
                System.out.println("Back to Main Menu");
                break;
            default:
                System.out.println("Invalid Response");
                break;
        }
    }
    public static void main(String[] args) {
    MainMenu.getMainMenu();
    }
}
