package com.xiaomi.hm.health.baseutil;

import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class DecimalUtil {
    private static final String a = "0";
    private static NumberFormat b = NumberFormat.getInstance(Locale.ENGLISH);

    private static String a(Double d, NumberFormat numberFormat) {
        if (d == null) {
            return "0";
        }
        numberFormat.setMaximumFractionDigits(9);
        return numberFormat.format(d);
    }

    public static String doubleToStr(Double d) {
        return a(d, b);
    }

    public static String floatToStr(Float f) {
        return floatToStr(f, b);
    }

    public static String floatToStr(Float f, NumberFormat numberFormat) {
        if (f == null) {
            return "0";
        }
        numberFormat.setMaximumFractionDigits(6);
        return numberFormat.format(f);
    }
}
