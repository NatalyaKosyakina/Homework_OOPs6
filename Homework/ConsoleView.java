package org.example.Homework;

import java.util.Scanner;

public class ConsoleView implements View {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String getStringFromUser(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    @Override
    public int getintFromUser(String question) {
        System.out.println(question);
        return scanner.nextInt();
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

}
