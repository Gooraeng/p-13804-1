package com.back;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        lab1();
        lab2();
    }

    private static void lab1() {
        String input = """
                등록
                나의 죽음을 적들에게 알리지 말라
                """;

        Scanner scanner = new Scanner(input);

        String cmd = scanner.nextLine();
        String content = scanner.nextLine();

        System.out.println("cmd : " + cmd);
        System.out.println("content : " + content);
    }

    private static void lab2() {
        System.out.println("안녕하세요.");
    }
}
