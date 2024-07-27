package vn.edu.cybersoft.lesson7;

import java.util.InputMismatchException;

public class exercise {
    final static String NO_EXIST = "khong toi tai";
    public static void main(String[] args) {
        try {
            // init Number object
            Number num = new Number();
            // nhap so nguyen
            num.nhap();
            // xuat so nguyen
            num.xuat();
        } catch (Exception e) {
            if (e instanceof InputMismatchException) {
                System.out.println("Vui long nhap so nguyen");
            }
            if (e instanceof NegativeArraySizeException){
                System.out.println("Vui long nhap so luong so nguyen > 0");
            }
            System.out.println("error: " + e);
        }
    }
}
