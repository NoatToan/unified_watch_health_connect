package com.huami.watch.util;

import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes11.dex */
public class UnitUtil {
    public static final float CM_TO_IN = 0.3937008f;
    public static final int FT_TO_IN = 12;
    public static final float FT_TO_M = 0.3048f;
    public static final float IN_TO_CM = 2.54f;
    public static final float KG_TO_LB = 2.204623f;
    public static final float KM_TO_MI = 0.6213712f;
    public static final float LB_TO_KG = 0.4535924f;
    public static final float MI_TO_KM = 1.609344f;
    public static final float M_TO_FT = 3.28084f;
    private static final String a = "Util-Unit";
    private static final float b = 0.5f;
    private static final float c = 0.5f;

    public static int centigradeToFahrenheit(int i) {
        return Math.round((i * 1.8f) + 32.0f);
    }

    public static int[] cmToFtIn(int i) {
        float f = i * 0.3937008f;
        int i2 = (int) (f / 12.0f);
        int iRound = Math.round(f % 12.0f);
        if (iRound == 12) {
            i2++;
            iRound = 0;
        }
        Log.d(a, SearchCriteria.LT + i + "cm =>" + i2 + "ft" + iRound + "in>", new Object[0]);
        return new int[]{i2, iRound};
    }

    public static int ftInToCm(int i, int i2) {
        int iRound = Math.round(((i * 12) + i2) * 2.54f);
        Log.d(a, SearchCriteria.LT + i + "ft" + i2 + "in => " + iRound + "cm>", new Object[0]);
        return iRound;
    }

    public static float getAccuracyWeight(float f, boolean z) {
        float f2;
        int i;
        if (z) {
            int iRound = Math.round(f * 2.0f);
            f2 = iRound / 2;
            i = iRound % 2;
        } else {
            int iRound2 = Math.round(f * 2.0f);
            f2 = iRound2 / 2;
            i = iRound2 % 2;
        }
        return f2 + (i * 0.5f);
    }

    public static int getDefaultUnit(boolean z) {
        return z ? 1 : 0;
    }

    public static float jinToKg(float f) {
        float f2 = f / 2.0f;
        Log.d(a, SearchCriteria.LT + f + "jin => " + f2 + "kg>", new Object[0]);
        return f2;
    }

    public static float kgToJin(float f) {
        float f2 = 2.0f * f;
        Log.d(a, SearchCriteria.LT + f + "kg => " + f2 + "jin>", new Object[0]);
        return f2;
    }

    public static float kgToLb(float f) {
        float f2 = 2.204623f * f;
        Log.d(a, SearchCriteria.LT + f + "kg => " + f2 + "lb>", new Object[0]);
        return f2;
    }

    public static float kmToMi(float f) {
        float f2 = 0.6213712f * f;
        Log.d(a, SearchCriteria.LT + f + "km => " + f2 + "mi>", new Object[0]);
        return f2;
    }

    public static float lbToKg(float f) {
        float f2 = 0.4535924f * f;
        Log.d(a, SearchCriteria.LT + f + "lb => " + f2 + "kg>", new Object[0]);
        return f2;
    }

    public static float mToFt(float f) {
        return f * 3.28084f;
    }

    public static int mToFt(int i) {
        return Math.round(i * 3.28084f);
    }

    public static double kmToMi(double d) {
        double d2 = 0.6213712096214294d * d;
        Log.d(a, SearchCriteria.LT + d + "km => " + d2 + "mi>", new Object[0]);
        return d2;
    }
}
