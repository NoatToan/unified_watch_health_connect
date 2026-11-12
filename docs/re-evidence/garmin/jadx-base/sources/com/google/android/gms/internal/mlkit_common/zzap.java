package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzap extends zzaf {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzap(Object[] objArr, int i14, int i15) {
        this.zza = objArr;
        this.zzb = i14;
        this.zzc = i15;
    }

    @Override // java.util.List
    public final Object get(int i14) {
        zzt.zza(i14, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zza[i14 + i14 + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
