package com.yaya.mylibrary;

/**
 * Created by Administrator on 2018/5/3.
 */
public class GitTest {
    public double add(double... doubles) {
        double sum = 0;
        for (double d : doubles) {
            sum += d;
        }
        return sum;
    }
}
