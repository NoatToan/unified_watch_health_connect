package com.google.android.gms.internal.mlkit_vision_common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;

/* JADX INFO: loaded from: classes14.dex */
final class zzv extends zzp {
    final /* synthetic */ zzw zza;

    public zzv(zzw zzwVar) {
        this.zza = zzwVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i14) {
        zzf.zza(i14, this.zza.zzc, FirebaseAnalytics.Param.INDEX);
        zzw zzwVar = this.zza;
        int i15 = i14 + i14;
        Object obj = zzwVar.zzb[i15];
        obj.getClass();
        Object obj2 = zzwVar.zzb[i15 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
