package defpackage;

import java.text.NumberFormat;

/* JADX INFO: loaded from: classes2.dex */
public class ltc {
    public static double b(int i) {
        return ((double) i) / 1000.0d;
    }

    public static int c(int i) {
        return (int) (((double) i) * 2.54d);
    }

    public static int a(int i) {
        return (int) Math.round(((double) i) / 2.54d);
    }

    public static double d(int i) {
        return b(i) * 0.62137119223733d;
    }

    public static String c(double d, int i, int i2) {
        if (i == 1) {
            NumberFormat numberFormat = NumberFormat.getInstance();
            numberFormat.setMaximumFractionDigits(i2);
            numberFormat.setMinimumFractionDigits(i2);
            return numberFormat.format(d);
        }
        if (i == 2) {
            NumberFormat percentInstance = NumberFormat.getPercentInstance();
            percentInstance.setMaximumFractionDigits(i2);
            percentInstance.setMinimumFractionDigits(i2);
            return percentInstance.format(d / 100.0d);
        }
        return "";
    }
}
