package easyleetcode.mxy;

import java.util.Scanner;

public class PostGraduate {
    public static void main(String[] args) {
        int arraysum = arraysum();
        System.out.println(arraysum);
    }

    /**
     * 从键盘输入一个 3x3 的矩阵，求该矩阵主对角线上的元素之和
     *
     * @return
     */
    public static int arraysum() {
        int sum = 0, a[][] = new int[3][3];
        System.out.println("请输入3*3的矩阵");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = Integer.parseInt(scanner.next());
            }
        }
        for (int i = 0; i < 3; i++) {
            sum += a[i][i];
        }
        return sum;
    }

    public static int maxInThree() {
        return 0;
    }

}
