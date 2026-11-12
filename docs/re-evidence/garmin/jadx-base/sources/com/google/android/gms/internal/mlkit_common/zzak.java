package com.google.android.gms.internal.mlkit_common;

import am.j;
import j20.x;

/* JADX INFO: loaded from: classes14.dex */
public final class zzak {
    public static Object[] zza(Object[] objArr, int i14) {
        for (int i15 = 0; i15 < i14; i15++) {
            if (objArr[i15] == null) {
                x.l(j.h(i15, "at index "));
                return null;
            }
        }
        return objArr;
    }
}
