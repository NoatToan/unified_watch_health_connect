package com.huami.watch.companion.util;

import com.huami.watch.util.Log;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes16.dex */
public class NumUtil {
    private static final String a = "Util-Num";
    private static final int b = 10;

    public static float div(float f, float f2) {
        return div(f, f2, 10);
    }

    public static boolean isNumInt(String str) {
        try {
            Log.d(a, "IsNum : \"" + str + "\" -> " + Integer.parseInt(str), new Object[0]);
            return true;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static double sub(double d, double d2) {
        return new BigDecimal(Double.toString(d)).subtract(new BigDecimal(Double.toString(d2))).doubleValue();
    }

    public static int toInt(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return i;
        }
    }

    public static long toLong(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return j;
        }
    }

    public static float div(float f, float f2, int i) {
        if (i >= 0) {
            return new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(f2)), i, 4).floatValue();
        }
        throw new IllegalArgumentException("The scale must be a positive integer or zero");
    }

    public static int toInt(String str) {
        return toInt(str, 0);
    }
}
