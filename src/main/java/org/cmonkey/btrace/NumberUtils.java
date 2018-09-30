package org.cmonkey.btrace;

import java.util.concurrent.TimeUnit;

public class NumberUtils {

    public int sum(){
        int result = 0;

        for (int i = 0; i < 100; i++) {
            result += i * i;
        }

        return result;
    }

    public static void main(String[] args) {
        while (true){
            Thread.currentThread().setName("calc");

            NumberUtils utils = new NumberUtils();

            int result = utils.sum();

            System.out.println(result);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
