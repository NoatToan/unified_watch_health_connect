package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes14.dex */
abstract class zzoo {
    final Unsafe zza;

    public zzoo(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract void zza(Object obj, long j8, byte b14);

    public abstract boolean zzb(Object obj, long j8);

    public abstract void zzc(Object obj, long j8, boolean z14);

    public abstract float zzd(Object obj, long j8);

    public abstract void zze(Object obj, long j8, float f14);

    public abstract double zzf(Object obj, long j8);

    public abstract void zzg(Object obj, long j8, double d14);
}
