package String;

import java.util.Scanner;

public class RemoveBrackets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter string : ");
        String input = scanner.nextLine();
        String inputWithoutBrackets = input.replaceAll("[(){}]", "");
        System.out.println("String without brackets : "+inputWithoutBrackets);
    }
}
