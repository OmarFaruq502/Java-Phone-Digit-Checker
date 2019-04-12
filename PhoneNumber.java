import java.util.Scanner;

public class PhoneNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 digit phone number: ");

        String entry =  input.nextLine();


        if(entry.charAt(0) == '(' && entry.charAt(4) == ')'){

            String [] tokens = entry.split("-");


            String areaCode = entry.substring(1,4);

            System.out.println("Area code is: "+ areaCode);

            System.out.print("Phone number is: ");


            for (int i = 0; i < 2; i++) {

                System.out.print(""+tokens[i]);
            }
        }

        else {
            System.out.println("Invalid input");
        }

    }
}
