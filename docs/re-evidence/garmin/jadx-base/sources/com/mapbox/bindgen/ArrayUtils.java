package com.mapbox.bindgen;

import i3.e5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ArrayUtils {
    private ArrayUtils() {
    }

    public static List<Boolean> convert(boolean[] zArr) {
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z14 : zArr) {
            arrayList.add(Boolean.valueOf(z14));
        }
        return arrayList;
    }

    public static Object[] convertListToArray(List<Object> list) {
        return list.toArray();
    }

    public static List<Byte> convert(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b14 : bArr) {
            arrayList.add(Byte.valueOf(b14));
        }
        return arrayList;
    }

    public static List<Character> convert(char[] cArr) {
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c14 : cArr) {
            arrayList.add(Character.valueOf(c14));
        }
        return arrayList;
    }

    public static List<Short> convert(short[] sArr) {
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s8 : sArr) {
            arrayList.add(Short.valueOf(s8));
        }
        return arrayList;
    }

    public static List<Integer> convert(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int iD = 0;
        while (iD < length) {
            iD = e5.d(iArr[iD], iD, arrayList, 1);
        }
        return arrayList;
    }

    public static List<Long> convert(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j8 : jArr) {
            arrayList.add(Long.valueOf(j8));
        }
        return arrayList;
    }

    public static List<Float> convert(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f14 : fArr) {
            arrayList.add(Float.valueOf(f14));
        }
        return arrayList;
    }

    public static List<Double> convert(double[] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d14 : dArr) {
            arrayList.add(Double.valueOf(d14));
        }
        return arrayList;
    }

    public static List<Object> convert(Object[] objArr) {
        return Arrays.asList(objArr);
    }
}
