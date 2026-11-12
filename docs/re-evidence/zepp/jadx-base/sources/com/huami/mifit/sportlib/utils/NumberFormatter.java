package com.huami.mifit.sportlib.utils;

import java.math.BigDecimal;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class NumberFormatter {
    private NumberFormatter() {
    }

    private static int a(int[] iArr) {
        if (iArr == null || iArr.length != 1 || iArr[0] < 0 || iArr[0] > 6) {
            return 1;
        }
        return iArr[0];
    }

    public static double format(double d, int i, int... iArr) {
        return new BigDecimal(String.valueOf(d)).setScale(i, a(iArr)).doubleValue();
    }

    public static String formatDouble2String(double d, int i, int... iArr) {
        double d2 = (iArr == null || iArr.length != 1) ? format(d, i, new int[0]) : format(d, i, iArr[0]);
        return String.format(Locale.ENGLISH, "%." + i + "f", Double.valueOf(d2));
    }

    public static String formatDouble2StringByLocale(double d, int i, int... iArr) {
        double d2 = (iArr == null || iArr.length != 1) ? format(d, i, new int[0]) : format(d, i, iArr[0]);
        return String.format(Locale.getDefault(), "%." + i + "f", Double.valueOf(d2));
    }

    public static String formatFloat2String(float f, int i, int... iArr) {
        float f2 = (iArr == null || iArr.length != 1) ? format(f, i, new int[0]) : format(f, i, iArr[0]);
        return String.format(Locale.ENGLISH, "%." + i + "f", Float.valueOf(f2));
    }

    public static String formatFloat2StringByLocale(float f, int i, int... iArr) {
        float f2 = (iArr == null || iArr.length != 1) ? format(f, i, new int[0]) : format(f, i, iArr[0]);
        return String.format(Locale.getDefault(), "%." + i + "f", Float.valueOf(f2));
    }

    public static float format(float f, int i, int... iArr) {
        return new BigDecimal(String.valueOf(f)).setScale(i, a(iArr)).floatValue();
    }
}
