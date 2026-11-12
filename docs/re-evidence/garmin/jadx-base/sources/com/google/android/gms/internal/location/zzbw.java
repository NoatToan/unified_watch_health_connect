package com.google.android.gms.internal.location;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes14.dex */
final class zzbw extends zzbx {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzbx zzc;

    public zzbw(zzbx zzbxVar, int i14, int i15) {
        this.zzc = zzbxVar;
        this.zza = i14;
        this.zzb = i15;
    }

    @Override // java.util.List
    public final Object get(int i14) {
        zzbr.zza(i14, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i14 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzbu
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzbu
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzbu
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.location.zzbu
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.location.zzbx, java.util.List
    /* JADX INFO: renamed from: zzh */
    public final zzbx subList(int i14, int i15) {
        zzbr.zzc(i14, i15, this.zzb);
        zzbx zzbxVar = this.zzc;
        int i16 = this.zza;
        return zzbxVar.subList(i14 + i16, i15 + i16);
    }
}
