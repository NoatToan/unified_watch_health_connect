package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzka implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzlj zzb;

    public zzka(zzlj zzljVar, long j8) {
        this.zza = j8;
        Objects.requireNonNull(zzljVar);
        this.zzb = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzic zzicVar = this.zzb.zzu;
        zzhe zzheVar = zzicVar.zzd().zzf;
        long j8 = this.zza;
        zzheVar.zzb(j8);
        zzicVar.zzaV().zzj().zzb("Session timeout duration set", Long.valueOf(j8));
    }
}
