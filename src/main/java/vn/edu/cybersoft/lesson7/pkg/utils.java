package vn.edu.cybersoft.lesson7.pkg;

public class utils {
    public static boolean isNotZero(int i) {
        return i != 0;
    }

    public static int maxNum(int a, int b){
        return a > b ? a : b;
    }

    public static boolean isNegative(int a){
        return a < 0 ? true : false;
    }

    public static int maxNegativeNum(int a, int b){
        if (a >= 0 && b >= 0) return 0;
        return a < b ? a : b;
    }
}
