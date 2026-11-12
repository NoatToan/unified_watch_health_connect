package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzku implements Runnable {
    final /* synthetic */ zzjl zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzlj zzd;

    public zzku(zzlj zzljVar, zzjl zzjlVar, long j8, boolean z14) {
        this.zza = zzjlVar;
        this.zzb = j8;
        this.zzc = z14;
        Objects.requireNonNull(zzljVar);
        this.zzd = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlj zzljVar = this.zzd;
        zzjl zzjlVar = this.zza;
        zzljVar.zzA(zzjlVar);
        zzljVar.zzak(zzjlVar, this.zzb, true, this.zzc);
    }
}
