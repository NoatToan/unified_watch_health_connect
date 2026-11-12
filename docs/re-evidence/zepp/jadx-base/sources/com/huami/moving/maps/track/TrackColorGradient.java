package com.huami.moving.maps.track;

import android.graphics.Color;

/* JADX INFO: loaded from: classes11.dex */
public class TrackColorGradient {
    private static int[] a = {-16726924, -16896, -25856, -40960};
    private static float[] b = {0.0f, 0.33f, 0.67f, 1.0f};
    private static float[] c;

    private static float a(float f, float f2, float f3) {
        return (f - f2) / (f3 - f2);
    }

    private static int b(int i, int i2, float f) {
        int iRed = Color.red(i);
        int iBlue = Color.blue(i);
        int iGreen = Color.green(i);
        return Color.argb(255, (int) (((double) iRed) + ((double) ((Color.red(i2) - iRed) * f)) + 0.5d), (int) (((double) iGreen) + ((double) ((Color.green(i2) - iGreen) * f)) + 0.5d), (int) (((double) iBlue) + ((double) ((Color.blue(i2) - iBlue) * f)) + 0.5d));
    }

    public static int getColor(float f) {
        float[] fArr = c;
        int i = 1;
        if (fArr[1] == fArr[0]) {
            return a[0];
        }
        float f2 = (f - fArr[0]) / (fArr[1] - fArr[0]);
        if (f2 >= 1.0f || f2 <= 0.0f) {
            int[] iArr = a;
            return iArr[f2 > 0.0f ? iArr.length - 1 : 0];
        }
        while (true) {
            float[] fArr2 = b;
            if (i >= fArr2.length) {
                return -1;
            }
            if (f2 <= fArr2[i]) {
                int[] iArr2 = a;
                int i2 = i - 1;
                return b(iArr2[i2], iArr2[i], a(f2, fArr2[i2], fArr2[i]));
            }
            i++;
        }
    }

    public static float[] getMinMaxSpeed() {
        return c;
    }

    public static boolean isMinMaxSpeedValid() {
        float[] fArr = c;
        return (fArr == null || (fArr[0] == 0.0f && fArr[1] == 0.0f)) ? false : true;
    }

    public static void setSpeedScope(float[] fArr) {
        c = fArr;
    }
}
