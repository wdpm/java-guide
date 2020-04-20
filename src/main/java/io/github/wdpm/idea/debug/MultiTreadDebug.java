package io.github.wdpm.idea.debug;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 调试多线程
 *
 * @author evan
 * @date 2020/4/20
 */
public class MultiTreadDebug {
    public static void main(String[] args) {
        int availableProcessors = Runtime.getRuntime()
                                         .availableProcessors();
        System.out.println(availableProcessors);

        ExecutorService executorService = Executors.newFixedThreadPool(availableProcessors);
        Runnable r1 = () -> {
            System.out.println("r1");
        };
        Runnable r2 = () -> {
            System.out.println("r2");
        };
        Runnable r3 = () -> {
            System.out.println("r3");
        };
        executorService.execute(r1);
        executorService.execute(r2);
        executorService.execute(r3);

        System.out.println("main thread");

        executorService.shutdown();
    }
}
