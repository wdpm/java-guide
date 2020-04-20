package io.github.wdpm.idea.debug;

/**
 * IDEA Debug测试类
 *
 * @author evan
 * @date 2020/4/20
 */
public class BasicDebug {
    public static void main(String[] args) {
        // printHelloWorld();
        playFire();
        int a = 1;
        int b = 2;
        int c = a + b;

        for (int i = 0; i < 10; i++) {
            print(i);
        }
    }

    private static void playFire() {
        System.out.println("准备木材");
        System.out.println("点火，危险");
    }

    public static void printHelloWorld() {
        System.out.println("Hello World.");
        System.out.println("Other thing...");
    }

    public static void print(int i) {
        System.out.println(i);
    }
}
