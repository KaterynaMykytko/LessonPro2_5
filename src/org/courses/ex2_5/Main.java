package org.courses.ex2_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row:");
        while (true){
            String row = scanner.next();
            if (row.equals("end")){
                break;
            } else {
                list.add(row);
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
