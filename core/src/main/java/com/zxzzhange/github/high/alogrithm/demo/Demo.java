/*
 * Unpay.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package com.zxzzhange.github.high.alogrithm.demo;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 类说明
 *
 * @author zhangge
 * @version Demo.java, 2018/9/26 11:24
 */
public class Demo {

    public static void main(String[] args){
        int[] arr = {4,5,8,7};
        //System.out.println(Demo.sum1(arr, 12));

        //Arrays.sort(arr);
        //System.out.println(Demo.sum2(arr, 8));

        System.out.println(Demo.sum3(arr, 8));


    }

    public static boolean sum3(int[] arr, int sum){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : arr){
            if(set.contains(sum - num)){
                return Boolean.TRUE;
            }
            set.add(num);
        }
        return Boolean.FALSE;
    }

    /**
     * 时间复杂度 O(NLOGn)
     * @param arr
     * @param sum
     * @return
     */
    public static boolean sum2(int[] arr, int sum){
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++){
                System.out.println(arr[i] + "," + arr[j]);
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + "+" + arr[j] + "=" + sum);
                    return Boolean.TRUE;
                }
                if(arr[i] + arr[j] > sum){
                    System.out.print("break");
                    break;
                }
                System.out.print("for");
            }
        }
        return Boolean.FALSE;
    }

    /**
     * 时间复杂度 小于 O(N平方)
     * @param arr
     * @param sum
     * @return
     */
    public static boolean sum1(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++){
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + "+" + arr[j] + "=" + sum);
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.FALSE;
    }

}
