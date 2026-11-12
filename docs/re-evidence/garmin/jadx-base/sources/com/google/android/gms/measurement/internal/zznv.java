package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zznv implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzoc zzb;

    public zznv(zzoc zzocVar, long j8) {
        this.zza = j8;
        Objects.requireNonNull(zzocVar);
        this.zzb = zzocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzl(this.zza);
    }
}
