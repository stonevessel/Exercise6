import java.util.Scanner;

public class Check {
    public static Scanner input = new Scanner(System.in);
    public static double doublePrompt() {
        System.out.println("enter a double please..");
        String a = input.nextLine();

        double user = 0;
        boolean userFloat = false;
        while(!userFloat){
            try {
                user = Double.parseDouble(a);
                userFloat = true;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("try again");
                a = input.nextLine();
            }
        }
        return user;
    }
    public static double intPrompt() {
        System.out.println("enter a int please..");
        String a = input.nextLine();

        int user = 0;
        boolean userint = false;
        while(!userint){
            try {
                user = Integer.parseInt(a);
                userint = true;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("try again");
                a = input.nextLine();
            }
        }
        return user;
    }
    public static String stringPrompt() {
        System.out.println("enter a String please..");
        String a = input.nextLine();

        String user = a;
        boolean userFloat = false;
        while(!userFloat){
            try {
                userFloat = true;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("try again");
                a = input.nextLine();
            }
        }
        return user;
    }

}
