package org.example.Homework;

import java.io.FileWriter;
import java.io.IOException;

public class Order {
    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public String getClientName() {
        return clientName;
    }
    public String getProduct() {
        return product;
    }
    public int getQnt() {
        return qnt;
    }
    public int getPrice() {
        return price;
    }

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public Order(View view){
        this.clientName = view.getStringFromUser("Имя клиента: ");
        this.product = view.getStringFromUser("Наименование продукта: ");
        this.qnt = view.getintFromUser("Количество товара: ");
        this.price = view.getintFromUser("Цена: ");
    }

    @Override
    public String toString() {
        return "Order{" +
                "clientName='" + clientName + '\'' +
                ", product='" + product + '\'' +
                ", qnt=" + qnt +
                ", price=" + price +
                '}';
    }

    public void saveToJson(){
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\"" + clientName + "\",\n");
            writer.write("\"product\":\"" + product + "\",\n");
            writer.write("\"qnt\":" + qnt + ",\n");
            writer.write("\"price\":" + price + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
