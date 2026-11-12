package com.google.android.gms.internal.maps;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes14.dex */
final class zzbj extends zzbk {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzbk zzc;

    public zzbj(zzbk zzbkVar, int i14, int i15) {
        this.zzc = zzbkVar;
        this.zza = i14;
        this.zzb = i15;
    }

    @Override // java.util.List
    public final Object get(int i14) {
        zzbc.zza(i14, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i14 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.maps.zzbh
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.maps.zzbh
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.maps.zzbh
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.maps.zzbk, java.util.List
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzbk subList(int i14, int i15) {
        zzbc.zzc(i14, i15, this.zzb);
        int i16 = this.zza;
        return this.zzc.subList(i14 + i16, i15 + i16);
    }
}
