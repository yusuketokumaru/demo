package com.example.model;


public class CalcModel {
    public static double calc(double x,double y,String operator) {

        double result = 0.0;
        // 演算子によって計算処理を分岐
        if ("⁺".equals(operator)) {
            result = x + y;
        } else if ("-".equals(operator)) {
            result = x - y;
        } else if ("×".equals(operator)) {
            result = x * y;
        } else if ("÷".equals(operator)) {
            result = x / y;
        }
        return result;

    }
}
