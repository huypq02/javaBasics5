package vn.edu.cybersoft.lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import vn.edu.cybersoft.lesson7.pkg.utils;

import static vn.edu.cybersoft.lesson7.exercise.NO_EXIST;

public class Number {
    private int[] soNguyenArr;
    private int maxNum;
    private int firstNegativeNum;
    private int maxNegativeNum;

    // init constructor
    public Number (){}

    public void save(int index, int soNguyen){
        this.soNguyenArr[index] = soNguyen;
    }


    //--------------------------------------------
    // a
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen: ");
        int n = sc.nextInt();
        this.soNguyenArr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Nhap so nguyen thu " + i  + ": ");
            this.save(this.soNguyenArr[i], sc.nextInt());
        }
    }
    public void xuat(){
        System.out.println("Mang so nguyen: " + Arrays.toString(this.soNguyenArr));
        System.out.println("So nguyen lon nhat la "
                + this.maxNum(this.soNguyenArr)
                + " va vi tri cua no trong mang la "
                + this.findNumber(this.soNguyenArr, maxNum));
        System.out.println("So nguyen am dau tien la "
                + this.isNegative(this.soNguyenArr)
                + " va vi tri cua no trong mang la "
                + this.findNumber(this.soNguyenArr, firstNegativeNum));
        System.out.println("So nguyen am lon nhat la "
                + this.maxNegativeNum(this.soNguyenArr)
                + " va vi tri cua no trong mang la "
                + this.findNumber(this.soNguyenArr, maxNegativeNum));
        System.out.println("Tong cac so nguyen duong: " + this.sumArr(this.soNguyenArr));
        System.out.println("So luong so nguyen am: " + this.numberOfNegativeNum(this.soNguyenArr));
        System.out.println("Tong cac so nguyen am: " + this.sumNegativeNum(this.soNguyenArr));
        System.out.println("Vi tri cua so nguyen x: " + this.findNumber(this.soNguyenArr, this.nhapX()));
    }

    // b
    public int maxNum(int []arr){
        this.maxNum = arr[0];
        for (int i = 1; i < arr.length; i++){
            this.maxNum = utils.maxNum(this.maxNum, arr[i]);
        }
        return this.maxNum;
    }

    // c
    public String isNegative(int []arr){
        for (int j : arr) {
            if (utils.isNegative(j)) {
                this.maxNegativeNum = j;
                return Integer.toString(j);
            }
        }
        return NO_EXIST;
    }

    // d
    public String maxNegativeNum(int []arr){
        int min = 0;
        for (int j : arr) {
            if (utils.isNegative(j) && utils.isNotZero(j)) {
                min = utils.maxNegativeNum(min, j);
            }
        }
        if (this.maxNegativeNum == 0)
            return NO_EXIST;

        this.maxNegativeNum = min;
        return Integer.toString(this.maxNegativeNum);
    }

    // e
    public int sumArr(int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (!utils.isNegative(arr[i])) sum += arr[i];
        }
        return sum;
    }

    // f
    public int numberOfNegativeNum(int []arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (utils.isNegative(arr[i])) count++;
        }
        return count;
    }

    // g
    public int sumNegativeNum(int []arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (utils.isNegative(arr[i])) sum += arr[i];
        }
        return sum;
    }

    // h
    public int nhapX(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x: ");
        return sc.nextInt();
    }
    public String findNumber(int []arr, int x){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x) list.add(i);
        }
        if (list.isEmpty()) return NO_EXIST;
        return list.toString();
    }
}
