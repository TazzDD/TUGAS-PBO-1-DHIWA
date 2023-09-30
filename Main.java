import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c;

        do {
            clearScreen();
            System.out.println("+-------------------------------------+");
            System.out.println("+ Nama : Muhammad Dhiwa Rahma Fathani +");
            System.out.println("+ NIM  : 2200018250                   +");
            System.out.println("+ KELAS: F                            +");
            System.out.println("+-------------------------------------+\n");

            int baris, kolom, a, b;

            System.out.println("CEK GANJIL GENAP");
            System.out.print("masukan bilangan: ");
            b = input.nextInt();

            if (b % 2 == 0) {
                System.out.println("Bilangan genap: " + b);
            } else {
                System.out.println("Bilangan ganjil: " + b);
            }

            System.out.println("\nARRAY SATU");
            System.out.print("masukan bilangan: ");
            a = input.nextInt();
            int[] arr1 = new int[a];

            for (int i = 0; i < a; i++) {
                System.out.print("input array [" + i + "] : ");
                arr1[i] = input.nextInt();
            }

            System.out.print("[ ");
            for (int i = 0; i < a; i++) System.out.print(arr1[i] + " ");
            System.out.println(" ]");

            System.out.println("\nARRAY MULTI DIMENSI");
            System.out.print("masukan baris: ");
            baris = input.nextInt();
            System.out.print("masukan kolom: ");
            kolom = input.nextInt();
            int[][] array1 = new int[baris][kolom];

            System.out.println("\nINPUT ARRAY 1");
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    System.out.print("input array [" + i + "][" + j + "] : ");
                    array1[i][j] = input.nextInt();
                }
            }

            System.out.println("\nHASIL DARI INPUT 1");
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    System.out.printf("%4d", array1[i][j]);
                }
                System.out.println();
            }

            System.out.print("INGIN mengulangi lagi(Y/N): ");
            c = input.next().charAt(0);
        }
        while (c == 'Y' || c == 'y');

        System.out.println("\nTerimakasih");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
