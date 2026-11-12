package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes14.dex */
final class zzae extends zzaf {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzaf zzc;

    public zzae(zzaf zzafVar, int i14, int i15) {
        this.zzc = zzafVar;
        this.zza = i14;
        this.zzb = i15;
    }

    @Override // java.util.List
    public final Object get(int i14) {
        zzt.zza(i14, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i14 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaf, java.util.List
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzaf subList(int i14, int i15) {
        zzt.zzd(i14, i15, this.zzb);
        int i16 = this.zza;
        return this.zzc.subList(i14 + i16, i15 + i16);
    }
}
