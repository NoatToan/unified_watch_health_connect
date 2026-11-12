package com.huami.step.utils;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes14.dex */
public class UnitManager {
    private static float a = 10.0f;
    private static float b = 100.0f;
    private static float c = 1000.0f;

    private static String a(double d, int i, RoundingMode roundingMode) {
        if (i < 0) {
            throw new IllegalArgumentException("Accuracy must >= 0");
        }
        String str = "###0";
        if (i > 0) {
            str = "###0.";
            for (int i2 = 0; i2 < i; i2++) {
                str = str + "0";
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat(str);
        decimalFormat.setRoundingMode(roundingMode);
        return decimalFormat.format(d);
    }

    public static String formatValue(int i) {
        int i2;
        float f = i;
        float f2 = a;
        if (f < f2 && f > 0.0f) {
            f = f2;
        }
        float f3 = f / 1000.0f;
        if (f3 < b) {
            i2 = 2;
        } else {
            i2 = f3 < c ? 1 : 0;
        }
        return a(f3, f3 != 0.0f ? i2 : 1, RoundingMode.FLOOR);
    }
}
