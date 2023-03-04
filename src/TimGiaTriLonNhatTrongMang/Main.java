package TimGiaTriLonNhatTrongMang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[5];
        int i = 0;
        while (i < list.length) {
            System.out.print("nhập vào số thứ " + (i + 1) + " : ");
            list[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Mảng ban đầu là: ");
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + "\t");
        }
        int max = list[0];
        int index = 1;
        for (int j = 0; j < list.length; j++) {
            if (list[j] > max) {
                max = list[j];
                index = j + 1;
            }
        }
        System.out.println("Số lớn nhất trong mảng là: " + max + " ở vị trí: " + index);
    }
}
