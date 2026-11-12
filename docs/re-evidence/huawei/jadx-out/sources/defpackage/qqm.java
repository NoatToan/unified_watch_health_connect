package defpackage;

import android.graphics.Color;

/* JADX INFO: loaded from: classes16.dex */
public class qqm {
    public static int a(float[] fArr, float[] fArr2, Boolean bool, Boolean bool2) {
        float f;
        float[] fArr3 = new float[3];
        if (bool.booleanValue()) {
            if (bool2.booleanValue()) {
                float f2 = fArr[2];
                if (f2 >= 0.95f) {
                    f2 = 0.95f;
                }
                fArr3[2] = f2;
                fArr3[0] = fArr[0];
                fArr3[1] = fArr[1];
            } else {
                float f3 = fArr[0];
                float f4 = 0.7f;
                if (f3 > 190.0f && f3 <= 269.0f) {
                    f = f4;
                } else if (f3 < 70.0f || f3 > 190.0f) {
                    f = 0.6f;
                    if (f3 < 18.0f || f3 > 69.0f) {
                        f4 = 0.6f;
                    }
                } else {
                    f4 = 0.5f;
                    f = f4;
                }
                float f5 = fArr[1];
                float f6 = fArr[2];
                float f7 = f4 + f;
                float f8 = f5 + f6;
                if (f8 < f7) {
                    fArr3[0] = f3;
                    fArr3[1] = f5;
                    fArr3[2] = f6;
                } else {
                    fArr3[0] = f3;
                    double d = 1.0d - ((double) ((f8 - f7) / f8));
                    fArr3[1] = (float) (((double) f5) * d);
                    fArr3[2] = (float) (((double) f6) * d);
                }
            }
        } else {
            fArr3[0] = fArr[1] < fArr2[1] ? fArr2[0] : fArr[0];
            if (bool2.booleanValue()) {
                fArr3[1] = 0.05f;
                fArr3[2] = 0.9f;
            } else {
                fArr3[1] = 0.3f;
                fArr3[2] = 0.4f;
            }
        }
        return Color.HSVToColor(fArr3);
    }

    public static Boolean b(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        if (fArr[2] < 0.8d) {
            return false;
        }
        if (f >= 20.0f && f < 50.0f) {
            return Boolean.valueOf(f2 < 0.6f);
        }
        if (f >= 50.0f && f < 190.0f) {
            return Boolean.valueOf(f2 < 0.4f);
        }
        if (f >= 190.0f && f < 269.0f) {
            return Boolean.valueOf(f2 < 0.4f);
        }
        return Boolean.valueOf(f2 < 0.5f);
    }
}
