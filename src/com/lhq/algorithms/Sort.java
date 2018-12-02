package com.lhq.algorithms;

import sun.plugin.liveconnect.OriginNotAllowedException;

import java.util.Scanner;

/**
 * 排序算法
 */
public class Sort {
    public static void main(String[] args) {
        // 桶排序
//        bucketSort();
        // 冒泡排序
        bubbleSort();
    }

    /**
     * 桶排序
     */
    public static void bucketSort() {
        int[] originArr = {5, 3, 5, 2, 8};
        int[] bucketArr = new int[10];
        // 初始化数组
        for (int i = 0; i < bucketArr.length; i++) {
            bucketArr[i] = 0;
        }
        // 累加数组
        for (int i = 0; i < originArr.length; i++) {
            bucketArr[originArr[i]]++;
        }
        // 打印结果
        for (int i = bucketArr.length - 1; i >= 0; i--) {
            for (int j = 0; j < bucketArr[i]; j++) {
                System.out.print(i + "\t");
            }
        }

    }

    /**
     * 冒泡排序
     */
    public static void bubbleSort() {
//        int originArr[] = {12, 35, 99, 18, 76};
        int originArr[] = {8, 100, 50, 22, 15, 6, 1, 1000, 999, 0};
        for (int i = 0; i < originArr.length - 1; i++) {
            // 第i+1趟
            for (int j = 0; j < originArr.length - 1 - i; j++) {
                // 第i+1趟比较第j+1次
                if (originArr[j] < originArr[j + 1]) {
                    // 顺序不对，则交换两个数
                    int tempInt = originArr[j];
                    originArr[j] = originArr[j + 1];
                    originArr[j + 1] = tempInt;
                }
            }

        }
        // 打印结果
        for (int i = 0; i < originArr.length; i++) {
            System.out.print(originArr[i] + "  ");
        }
    }

}
