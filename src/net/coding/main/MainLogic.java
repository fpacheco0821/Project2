package net.coding.main;

import java.util.Scanner;

public class MainLogic {
    static Scanner scanner = new Scanner(System.in);

    public static int readInt(String prompt, int userChoices){
        int input;
        do{
            System.out.println(prompt);
            try{
                input = Integer.parseInt(scanner.next());
            }catch (Exception e){
                input = -1;
                System.out.println("Please enter an integer");
            }

        }while (input < 1 || input > userChoices);

        return input;
    }

}
