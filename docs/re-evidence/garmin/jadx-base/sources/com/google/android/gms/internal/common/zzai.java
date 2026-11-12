package com.google.android.gms.internal.common;

import j20.x;

/* JADX INFO: loaded from: classes14.dex */
public final class zzai {
    public static Object[] zza(Object[] objArr, int i14) {
        for (int i15 = 0; i15 < i14; i15++) {
            if (objArr[i15] == null) {
                x.l(x.e(new StringBuilder(String.valueOf(i15).length() + 9), i15, "at index "));
                return null;
            }
        }
        return objArr;
    }
}
