package com.google.android.gms.internal.mlkit_vision_barcode;

import am.j;
import j20.x;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzby {
    public static int zza(int i14, String str) {
        if (i14 >= 0) {
            return i14;
        }
        h.s(h.h(i14, str, " cannot be negative but was: "));
        return 0;
    }

    public static void zzb(Object obj, Object obj2) {
        if (obj == null) {
            x.l("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            x.l(j.m("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
