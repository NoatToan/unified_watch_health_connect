package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzif {
    public static <T> zzib<T> zza(zzib<T> zzibVar) {
        if ((zzibVar instanceof c2) || (zzibVar instanceof b2)) {
            return zzibVar;
        }
        return zzibVar instanceof Serializable ? new b2(zzibVar) : new c2(zzibVar);
    }

    public static <T> zzib<T> zzb(T t) {
        return new d2(t);
    }
}
