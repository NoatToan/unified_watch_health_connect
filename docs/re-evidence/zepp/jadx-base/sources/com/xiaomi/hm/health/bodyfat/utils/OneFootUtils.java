package com.xiaomi.hm.health.bodyfat.utils;

import java.text.NumberFormat;

/* JADX INFO: loaded from: classes19.dex */
public class OneFootUtils {
    private static float[] a(int i) {
        float[] fArr = {-1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f};
        if (i < 20 || i >= 70) {
            return fArr;
        }
        if (i < 25) {
            return new float[]{0.0f, 6.0f, 16.0f, 37.0f, 90.0f, 999.9f};
        }
        if (i < 30) {
            return new float[]{0.0f, 6.0f, 15.0f, 33.0f, 85.0f, 999.9f};
        }
        if (i < 35) {
            return new float[]{0.0f, 5.0f, 13.0f, 29.0f, 73.0f, 999.9f};
        }
        if (i < 40) {
            return new float[]{0.0f, 4.0f, 10.0f, 24.0f, 63.0f, 999.9f};
        }
        if (i < 45) {
            return new float[]{0.0f, 4.0f, 8.0f, 19.0f, 46.0f, 999.9f};
        }
        if (i < 50) {
            return new float[]{0.0f, 3.0f, 7.0f, 16.0f, 40.0f, 999.9f};
        }
        if (i < 55) {
            return new float[]{0.0f, 3.0f, 6.0f, 14.0f, 34.0f, 999.9f};
        }
        if (i < 60) {
            return new float[]{0.0f, 3.0f, 6.0f, 11.0f, 27.0f, 999.9f};
        }
        return i < 65 ? new float[]{0.0f, 3.0f, 6.0f, 13.0f, 41.0f, 999.9f} : new float[]{0.0f, 3.0f, 5.0f, 11.0f, 36.0f, 999.9f};
    }

    private static float[] b(int i) {
        float[] fArr = {-1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f};
        if (i < 20 || i >= 70) {
            return fArr;
        }
        if (i < 25) {
            return new float[]{0.0f, 6.0f, 18.0f, 42.0f, 99.0f, 999.9f};
        }
        if (i < 30) {
            return new float[]{0.0f, 6.0f, 15.0f, 36.0f, 86.0f, 999.9f};
        }
        if (i < 35) {
            return new float[]{0.0f, 5.0f, 13.0f, 30.0f, 75.0f, 999.9f};
        }
        if (i < 40) {
            return new float[]{0.0f, 4.0f, 12.0f, 28.0f, 70.0f, 999.9f};
        }
        if (i < 45) {
            return new float[]{0.0f, 4.0f, 10.0f, 22.0f, 55.0f, 999.9f};
        }
        if (i < 50) {
            return new float[]{0.0f, 4.0f, 9.0f, 20.0f, 49.0f, 999.9f};
        }
        if (i < 55) {
            return new float[]{0.0f, 5.0f, 8.0f, 17.0f, 40.0f, 999.9f};
        }
        if (i < 60) {
            return new float[]{0.0f, 3.0f, 7.0f, 14.0f, 34.0f, 999.9f};
        }
        return i < 65 ? new float[]{0.0f, 4.0f, 7.0f, 15.0f, 49.0f, 999.9f} : new float[]{0.0f, 3.0f, 6.0f, 13.0f, 41.0f, 999.9f};
    }

    public static float[] getMaxTimeArray(int i, int i2) {
        return i2 == 1 ? b(i) : a(i);
    }

    public static String getOneFootValueStringForDisplay(float f) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMinimumFractionDigits(1);
        numberInstance.setMaximumFractionDigits(1);
        return numberInstance.format(f);
    }

    public static float getScore(int i, int i2, float f) {
        int i3;
        float[] maxTimeArray = getMaxTimeArray(i, i2);
        int length = maxTimeArray.length - 1;
        int i4 = -1;
        for (int i5 = 0; i5 < length; i5++) {
            if (f >= maxTimeArray[i5] && maxTimeArray[i5] != -1.0f && ((i3 = i5 + 1) >= length || f < maxTimeArray[i3])) {
                i4 = i3;
            }
        }
        return i4;
    }
}
