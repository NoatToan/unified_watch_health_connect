package com.xiaomi.hm.health.training.utils;

import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes22.dex */
public class ExpiryUtils {
    private static final SparseIntArray a;
    private static final SparseIntArray b;
    private static ExpiryUtils c;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        a = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        b = sparseIntArray2;
        c = null;
        sparseIntArray.put(0, 1);
        sparseIntArray.put(1, 2);
        sparseIntArray.put(2, 4);
        sparseIntArray.put(3, 5);
        sparseIntArray2.put(0, 10);
        sparseIntArray2.put(1, 12);
        sparseIntArray2.put(2, 13);
    }

    private int a(SparseIntArray sparseIntArray, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < sparseIntArray.size(); i3++) {
            Integer numValueOf = Integer.valueOf(sparseIntArray.keyAt(i3));
            if (numValueOf.intValue() >= i) {
                if (numValueOf.intValue() == i) {
                    i2 = sparseIntArray.get(numValueOf.intValue());
                }
                if (numValueOf.intValue() > i && sparseIntArray.get(numValueOf.intValue()) != 0) {
                    return i2 + 1;
                }
            }
        }
        return i2;
    }

    public static ExpiryUtils newInstance() {
        if (c == null) {
            c = new ExpiryUtils();
        }
        return c;
    }

    public int parseExpiry(@NonNull String str, int i) {
        if (a.indexOfValue(i) < 0 && b.indexOfValue(i) < 0) {
            throw new IllegalArgumentException("Invalid unit:" + i);
        }
        Matcher matcher = Pattern.compile("(\\d{1,4})-(\\d{1,4})-(\\d{1,4})-(\\d{1,4})\\.(\\d{1,4}):(\\d{1,4}):(\\d{1,4})").matcher(str);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Invalid expiry-" + str);
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (int i2 = 1; i2 <= 4; i2++) {
            int i3 = Integer.parseInt(matcher.group(i2));
            if (i3 != 0) {
                sparseIntArray.put(a.get(i2 - 1), i3);
            }
        }
        for (int i4 = 5; i4 <= 7; i4++) {
            int i5 = Integer.parseInt(matcher.group(i4));
            if (i5 != 0) {
                sparseIntArray.put(b.get(i4 - 5), i5);
            }
        }
        return a(sparseIntArray, i);
    }
}
