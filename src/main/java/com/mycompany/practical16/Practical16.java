/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical16;

import java.util.Scanner;

public class Practical16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите производителя: ");
        String producer = scanner.nextLine();
        Seller telephone = new Seller(producer);
        telephone.modify();
        System.out.println(telephone.toString());
        System.out.print("Коржавина Виктория РИБО-03-22");
    }
}
