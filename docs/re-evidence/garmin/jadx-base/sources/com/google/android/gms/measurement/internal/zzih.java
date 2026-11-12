package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzih implements Runnable {
    final /* synthetic */ zzah zza;
    final /* synthetic */ zzr zzb;
    final /* synthetic */ zzjd zzc;

    public zzih(zzjd zzjdVar, zzah zzahVar, zzr zzrVar) {
        this.zza = zzahVar;
        this.zzb = zzrVar;
        Objects.requireNonNull(zzjdVar);
        this.zzc = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjd zzjdVar = this.zzc;
        zzjdVar.zzL().zzZ();
        zzah zzahVar = this.zza;
        Object objZza = zzahVar.zzc.zza();
        zzr zzrVar = this.zzb;
        if (objZza == null) {
            zzjdVar.zzL().zzam(zzahVar, zzrVar);
        } else {
            zzjdVar.zzL().zzak(zzahVar, zzrVar);
        }
    }
}
