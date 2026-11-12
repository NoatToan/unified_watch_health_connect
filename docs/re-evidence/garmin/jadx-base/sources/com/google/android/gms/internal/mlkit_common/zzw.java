package com.google.android.gms.internal.mlkit_common;

import am.j;
import j20.x;

/* JADX INFO: loaded from: classes14.dex */
final class zzw {
    public static void zza(Object obj, Object obj2) {
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
