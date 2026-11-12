package com.huami.mifit.sportlib.utils;

import com.huami.mifit.sportlib.common.DataTypeSource;

/* JADX INFO: loaded from: classes11.dex */
public class RunDataConversion {
    private static final float a = 1.8f;
    private static final float b = 6.0f;
    private static final float c = 6.0f;

    private RunDataConversion() {
    }

    public static float compareToMaxPace(float f) {
        if (f > 1.8f) {
            return 1.8f;
        }
        return f;
    }

    public static float convertMeterToKmOrMile(float f, boolean z) {
        return z ? NumberFormatter.format(f / 1000.0f, 2, new int[0]) : NumberFormatter.format((float) (((double) f) / 1609.344d), 2, new int[0]);
    }

    public static float convertMeterToYard(float f) {
        return f / 0.9144f;
    }

    public static float convertTohpkm(float f) {
        return (f * 1000.0f) / 3600.0f;
    }

    public static float convertTokmph(float f) {
        return (f * 3600.0f) / 1000.0f;
    }

    public static long convertTospkm(float f) {
        return (long) (f * 1000.0f);
    }

    public static float getMaxValidPace(int i) {
        return (DataTypeSource.isSwimSport(i) || i == 25 || i == 26) ? 6.0f : 1.8f;
    }

    public static String paceConvertToSpeed(float f, boolean z) {
        if (f == 0.0f || !RunUtils.isPaceValid(f)) {
            return NumberFormatter.formatDouble2StringByLocale(f, 2, 4);
        }
        double d = 3600.0f / (f * 1000.0f);
        if (!z) {
            d *= 0.6213712d;
        }
        return NumberFormatter.formatDouble2StringByLocale(d, 2, 4);
    }

    public static float paceMultiplyHund(float f, boolean z) {
        if (!z) {
            f *= 0.9144f;
        }
        return f * 100.0f;
    }

    public static double paceMultiplyKilo(float f, boolean z) {
        if (!z) {
            f = (float) (((double) f) * 1.609344d);
        }
        return f * 1000.0f;
    }

    public static String parseAltitude(float f, boolean z) {
        return !z ? NumberFormatter.formatFloat2String(f * 3.28084f, 0, new int[0]) : NumberFormatter.formatFloat2String(f, 0, new int[0]);
    }

    public static String parseStrideLength(float f, boolean z) {
        return !z ? NumberFormatter.formatFloat2String(f * 0.3937008f, 0, 4) : NumberFormatter.formatFloat2String(f, 0, 4);
    }
}
