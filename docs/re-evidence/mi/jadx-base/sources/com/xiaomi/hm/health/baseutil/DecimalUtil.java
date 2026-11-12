package com.xiaomi.hm.health.baseutil;

import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class DecimalUtil {
    private static final String DEFAUL_VALUE = "0";
    private static NumberFormat nf = NumberFormat.getInstance(Locale.ENGLISH);

    public static String doubleToStr(Double d) {
        return doubleToStr(d, nf);
    }

    public static String floatToStr(Float f) {
        return floatToStr(f, nf);
    }

    private static String doubleToStr(Double d, NumberFormat numberFormat) {
        if (d == null) {
            return "0";
        }
        numberFormat.setMaximumFractionDigits(9);
        return numberFormat.format(d);
    }

    public static String floatToStr(Float f, NumberFormat numberFormat) {
        if (f == null) {
            return "0";
        }
        numberFormat.setMaximumFractionDigits(6);
        return numberFormat.format(f);
    }
}
