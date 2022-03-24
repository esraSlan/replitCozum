package day01;

import java.util.Scanner;

public class S08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz:");
        int num= scanner.nextInt();

        System.out.println((num*num*num)/2);

    }
}
