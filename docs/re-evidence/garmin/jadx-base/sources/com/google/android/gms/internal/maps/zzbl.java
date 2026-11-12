package com.google.android.gms.internal.maps;

import p6.b;
import v.e0;

/* JADX INFO: loaded from: classes14.dex */
final class zzbl {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzbl(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        String strValueOf = String.valueOf(obj3);
        String strValueOf2 = String.valueOf(obj2);
        return new IllegalArgumentException(e0.h(b.i("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(obj3), "=", String.valueOf(obj)));
    }
}
