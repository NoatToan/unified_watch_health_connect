package com.google.android.gms.internal.maps;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzbr extends zzbk {
    final /* synthetic */ zzbs zza;

    public zzbr(zzbs zzbsVar) {
        this.zza = zzbsVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i14) {
        zzbs zzbsVar = this.zza;
        zzbc.zza(i14, zzbsVar.zzc, FirebaseAnalytics.Param.INDEX);
        int i15 = i14 + i14;
        Object obj = zzbsVar.zzb[i15];
        Objects.requireNonNull(obj);
        Object obj2 = zzbsVar.zzb[i15 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
