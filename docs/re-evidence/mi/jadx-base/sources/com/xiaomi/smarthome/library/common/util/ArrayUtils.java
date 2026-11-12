package com.xiaomi.smarthome.library.common.util;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ArrayUtils {
    public static int[] reverse(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[(iArr.length - 1) - i] = iArr[i];
        }
        return iArr2;
    }

    public static HashMap<String, Object> toMap(Object[] objArr) {
        HashMap<String, Object> map = new HashMap<>();
        if (objArr != null) {
            for (int i = 0; i < objArr.length; i += 2) {
                map.put((String) objArr[i], objArr[i + 1]);
            }
        }
        return map;
    }

    public static float[] reverse(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        float[] fArr2 = new float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[(fArr.length - 1) - i] = fArr[i];
        }
        return fArr2;
    }
}
