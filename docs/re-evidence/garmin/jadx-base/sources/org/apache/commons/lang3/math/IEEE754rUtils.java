package org.apache.commons.lang3.math;

import org.apache.commons.lang3.Validate;

/* JADX INFO: loaded from: classes3.dex */
public class IEEE754rUtils {
    public static double max(double... dArr) {
        Validate.notNull(dArr, "array", new Object[0]);
        Validate.isTrue(dArr.length != 0, "Array cannot be empty.", new Object[0]);
        double dMax = dArr[0];
        for (int i14 = 1; i14 < dArr.length; i14++) {
            dMax = max(dArr[i14], dMax);
        }
        return dMax;
    }

    public static double min(double... dArr) {
        Validate.notNull(dArr, "array", new Object[0]);
        Validate.isTrue(dArr.length != 0, "Array cannot be empty.", new Object[0]);
        double dMin = dArr[0];
        for (int i14 = 1; i14 < dArr.length; i14++) {
            dMin = min(dArr[i14], dMin);
        }
        return dMin;
    }

    public static float max(float... fArr) {
        Validate.notNull(fArr, "array", new Object[0]);
        Validate.isTrue(fArr.length != 0, "Array cannot be empty.", new Object[0]);
        float fMax = fArr[0];
        for (int i14 = 1; i14 < fArr.length; i14++) {
            fMax = max(fArr[i14], fMax);
        }
        return fMax;
    }

    public static float min(float... fArr) {
        Validate.notNull(fArr, "array", new Object[0]);
        Validate.isTrue(fArr.length != 0, "Array cannot be empty.", new Object[0]);
        float fMin = fArr[0];
        for (int i14 = 1; i14 < fArr.length; i14++) {
            fMin = min(fArr[i14], fMin);
        }
        return fMin;
    }

    public static double max(double d14, double d15, double d16) {
        return max(max(d14, d15), d16);
    }

    public static double min(double d14, double d15, double d16) {
        return min(min(d14, d15), d16);
    }

    public static double max(double d14, double d15) {
        if (Double.isNaN(d14)) {
            return d15;
        }
        return Double.isNaN(d15) ? d14 : Math.max(d14, d15);
    }

    public static double min(double d14, double d15) {
        if (Double.isNaN(d14)) {
            return d15;
        }
        return Double.isNaN(d15) ? d14 : Math.min(d14, d15);
    }

    public static float max(float f14, float f15, float f16) {
        return max(max(f14, f15), f16);
    }

    public static float min(float f14, float f15, float f16) {
        return min(min(f14, f15), f16);
    }

    public static float max(float f14, float f15) {
        if (Float.isNaN(f14)) {
            return f15;
        }
        return Float.isNaN(f15) ? f14 : Math.max(f14, f15);
    }

    public static float min(float f14, float f15) {
        if (Float.isNaN(f14)) {
            return f15;
        }
        return Float.isNaN(f15) ? f14 : Math.min(f14, f15);
    }
}
