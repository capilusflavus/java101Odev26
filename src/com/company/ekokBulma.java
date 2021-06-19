package com.company;

import java.util.Scanner;

public class ekokBulma {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("n1  sayısını giriniz : ");
        int n1=scanner.nextInt();
        System.out.print("n2 sayısınız giriniz : ");
        int n2=scanner.nextInt();
        int i=1 ,ebob=1, k=1;
        do {
            if (n1%i==0 && n2%i==0){
                ebob=i;
            }
            i++;
        }
        while (i<=n1);
        System.out.println("Girdiğiniz sayıların ebobu : " + ebob);
    }

    }

