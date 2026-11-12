package com.google.android.gms.internal.mlkit_vision_common;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes14.dex */
final class zzo extends zzp {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzp zzc;

    public zzo(zzp zzpVar, int i14, int i15) {
        this.zzc = zzpVar;
        this.zza = i14;
        this.zzb = i15;
    }

    @Override // java.util.List
    public final Object get(int i14) {
        zzf.zza(i14, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i14 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzp, java.util.List
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzp subList(int i14, int i15) {
        zzf.zzc(i14, i15, this.zzb);
        zzp zzpVar = this.zzc;
        int i16 = this.zza;
        return zzpVar.subList(i14 + i16, i15 + i16);
    }
}
