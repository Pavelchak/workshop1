package com.pavelchak;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello!!");
        System.out.println("Input some:");
        String str= input.nextLine();

        System.out.print(ConsoleColors.CYAN);
        System.out.print(ConsoleColors.BLACK_BACKGROUND);

        System.out.println(str);
        System.out.print(ConsoleColors.RESET);
        System.out.println(str);

        System.out.println(ConsoleColors.BLUE+ConsoleColors.YELLOW_BACKGROUND+"My Name is Andrii"+ConsoleColors.RESET);


        System.out.println("\033[31;1mHello\033[0m, \033[32;1;2mworld!\033[0m");
        System.out.println("\033[31mRed\033[32m, Green\033[33m, Yellow\033[34m, Blue\033[0m");
    }
}
