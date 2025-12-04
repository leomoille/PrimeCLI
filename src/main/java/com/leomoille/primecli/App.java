package com.leomoille.primecli;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        PrimeService service = new PrimeService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Prime Calculator ===");
            System.out.println("1. Tester si un nombre est premier");
            System.out.println("2. Générer les nombres premiers jusqu’à une limite");
            System.out.println("3. Quitter");
            System.out.print("Choix : ");

            int choix = scanner.nextInt();

            switch (choix) {
                case 1 -> {
                    System.out.print("Entrez un nombre : ");
                    int n = scanner.nextInt();
                    boolean prime = service.isPrime(n);
                    System.out.println(n + (prime ? " est premier" : " n'est pas premier"));
                }
                case 2 -> {
                    System.out.print("Limite : ");
                    int limit = scanner.nextInt();
                    List<Integer> primes = service.generatePrimes(limit);
                    System.out.println("Nombres premiers : " + primes);
                }
                case 3 -> {
                    System.out.println("Bye 👋");
                    return;
                }
                default -> System.out.println("Choix invalide");
            }
        }
    }
}
