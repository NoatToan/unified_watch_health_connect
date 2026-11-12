package com.yalantis.ucrop.util;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public class RectUtils {
    public static float[] getCenterFromRect(RectF rectF) {
        return new float[]{rectF.centerX(), rectF.centerY()};
    }

    public static float[] getCornersFromRect(RectF rectF) {
        float f14 = rectF.left;
        float f15 = rectF.top;
        float f16 = rectF.right;
        float f17 = rectF.bottom;
        return new float[]{f14, f15, f16, f15, f16, f17, f14, f17};
    }

    public static float[] getRectSidesFromCorners(float[] fArr) {
        return new float[]{(float) Math.sqrt(Math.pow(fArr[1] - fArr[3], 2.0d) + Math.pow(fArr[0] - fArr[2], 2.0d)), (float) Math.sqrt(Math.pow(fArr[3] - fArr[5], 2.0d) + Math.pow(fArr[2] - fArr[4], 2.0d))};
    }

    public static RectF trapToRect(float[] fArr) {
        RectF rectF = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        for (int i14 = 1; i14 < fArr.length; i14 += 2) {
            float fRound = Math.round(fArr[i14 - 1] * 10.0f) / 10.0f;
            float fRound2 = Math.round(fArr[i14] * 10.0f) / 10.0f;
            float f14 = rectF.left;
            if (fRound < f14) {
                f14 = fRound;
            }
            rectF.left = f14;
            float f15 = rectF.top;
            if (fRound2 < f15) {
                f15 = fRound2;
            }
            rectF.top = f15;
            float f16 = rectF.right;
            if (fRound <= f16) {
                fRound = f16;
            }
            rectF.right = fRound;
            float f17 = rectF.bottom;
            if (fRound2 <= f17) {
                fRound2 = f17;
            }
            rectF.bottom = fRound2;
        }
        rectF.sort();
        return rectF;
    }
}
