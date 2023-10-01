/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

import java.util.Scanner;

/**
 *
 * @author LENOVO_ITL6
 */
public class DuckSimulator {
    
    public static void main(String[] args) {
        
        Scanner pilih = new Scanner(System.in);
        boolean ulang = true;
        while (ulang) {
        System.out.println("1.Mallard Duck");
        System.out.println("2.Model Duck");
        System.out.println("3.Rubber Duck");
        System.out.println("4.Decoy Duck");
        System.out.println("5.Red Head Duck");
        System.out.print("Masukan angka:");
        int pilihan = pilih.nextInt();
        
        switch (pilihan) {
            case 1 -> {
                Duck duck_1 = new MallardDuck();
                duck_1.display();
                duck_1.performFly();
                duck_1.setFlyBehavior(new FlyWithWings());
                duck_1.performQuack();
                duck_1.setQuackBehavior(new Quack());
            }
            case 2 -> {
                Duck duck_2 = new ModelDuck();
                duck_2.display();
                duck_2.performFly();
                duck_2.setFlyBehavior(new FlyNoWay());
                duck_2.performQuack();
                duck_2.setQuackBehavior(new Quack());
            }
            case 3 -> {
                Duck duck_3 = new RubberDuck();
                duck_3.display();
                duck_3.performFly();
                duck_3.setFlyBehavior(new FlyNoWay());
                duck_3.performQuack();
                duck_3.setQuackBehavior(new Squeak());
            }
            case 4 -> {
                Duck duck_4 = new DecoyDuck();
                duck_4.display();
                duck_4.performFly();
                duck_4.setFlyBehavior(new FlyNoWay());
                duck_4.performQuack();
                duck_4.setQuackBehavior(new MuteQuack());
            }
            case 5 -> {
                Duck duck_5 = new RedHeadDuck();
                duck_5.display();
                duck_5.performFly();
                duck_5.setFlyBehavior(new FlyWithWings());
                duck_5.performQuack();
                duck_5.setQuackBehavior(new Quack());
            }
            default -> System.out.println("milih yg bener tolol");
        }
        System.out.print("Apakah Anda ingin mencoba lagi? (ya/tidak): ");
            String jawaban = pilih.next().toLowerCase();
            if (!jawaban.equals("ya")) {
                ulang = false;
            }
        }
    }
}
