import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kich thuoc khong vuot qua 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhap phan tu" + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf(" %-20s%s", "Cac phan tu trong mang:", "");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
    }
}