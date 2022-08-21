package ru.netology.javaqa.javaqamvn.sqr;

public class calcSqr{
    public int calcSQR(int x) {
        for (int i = 1; i <= x; i++) {
            if (i * i >= x) {
                return i;
            }
        }
        return -1;
    }
}
