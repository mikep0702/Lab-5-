/*
authors: Min Park, Calvin
 */

import java.util.*;

public class Main {
    public static void main(String arg[]){

        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String userInput = scnr.nextLine();

        int hexaLength = String.valueOf(userInput).length();
        int total;
        long totalValue = 0;
        int powerCount = 0;
        char hexadecimal;

        while(0 < hexaLength){
            hexadecimal = userInput.charAt(hexaLength - 1);

            if (( userInput.contains("0x") || userInput.contains("0X") )&& hexaLength < 3){
                hexaLength = -1;
                System.out.println("Your number is " + totalValue + " in decimal");
                System.exit(0);
            }


            if (hexadecimal >= 'A' && hexadecimal <= 'F') {
                total = hexadecimal - 'A' + 10;
                totalValue += (total * Math.pow(16,powerCount));
                powerCount++;
                hexaLength--;
            }

            if (hexadecimal >= 'a' && hexadecimal <= 'f') {
                total = hexadecimal - 'a' + 10;
                totalValue += (total * Math.pow(16,powerCount));
                powerCount++;
                hexaLength--;
            }

            if (hexadecimal >= '0' && hexadecimal <= '9'){
                total = hexadecimal - '0';
                totalValue += (total * Math.pow(16,powerCount));
                powerCount++;
                hexaLength--;
            }
        }

        System.out.println("Your number is " + totalValue + " in decimal");
    }
}
