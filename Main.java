package org.example;

import org.example.Homework.ConsoleView;
import org.example.Homework.Order;
import org.example.Homework.View;

public class Main {
    public static void main(String[] args) {
        Order order = new Order((View) new ConsoleView());
        order.saveToJson();
    }
}