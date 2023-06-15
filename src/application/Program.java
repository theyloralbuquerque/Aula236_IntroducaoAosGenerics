package application;

import java.util.Locale;
import java.util.Scanner;

import model.services.PrintService;


public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        PrintService<String> ps = new PrintService<>();

        System.out.print("How many values? "); // "Quantos valores? "
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("First: " + ps.first());

        sc.close();
    }
}