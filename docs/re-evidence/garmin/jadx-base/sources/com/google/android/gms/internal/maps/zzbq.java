package com.google.android.gms.internal.maps;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzbq extends zzbk {
    static final zzbk zza = new zzbq(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzbq(Object[] objArr, int i14) {
        this.zzb = objArr;
        this.zzc = i14;
    }

    @Override // java.util.List
    public final Object get(int i14) {
        zzbc.zza(i14, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zzb[i14];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.maps.zzbk, com.google.android.gms.internal.maps.zzbh
    public final int zza(Object[] objArr, int i14) {
        Object[] objArr2 = this.zzb;
        int i15 = this.zzc;
        System.arraycopy(objArr2, 0, objArr, 0, i15);
        return i15;
    }

    @Override // com.google.android.gms.internal.maps.zzbh
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.maps.zzbh
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.maps.zzbh
    public final Object[] zze() {
        return this.zzb;
    }
}
