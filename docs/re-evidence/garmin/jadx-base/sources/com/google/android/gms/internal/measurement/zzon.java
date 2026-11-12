package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes14.dex */
final class zzon extends zzoo {
    public zzon(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final void zza(Object obj, long j8, byte b14) {
        if (zzop.zzb) {
            zzop.zzD(obj, j8, b14);
        } else {
            zzop.zzE(obj, j8, b14);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final boolean zzb(Object obj, long j8) {
        return zzop.zzb ? zzop.zzu(obj, j8) : zzop.zzv(obj, j8);
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final void zzc(Object obj, long j8, boolean z14) {
        if (zzop.zzb) {
            zzop.zzD(obj, j8, z14 ? (byte) 1 : (byte) 0);
        } else {
            zzop.zzE(obj, j8, z14 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final float zzd(Object obj, long j8) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j8));
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final void zze(Object obj, long j8, float f14) {
        this.zza.putInt(obj, j8, Float.floatToIntBits(f14));
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final double zzf(Object obj, long j8) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j8));
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final void zzg(Object obj, long j8, double d14) {
        this.zza.putLong(obj, j8, Double.doubleToLongBits(d14));
    }
}
