package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes14.dex */
final class zzgx extends zzgy {
    public zzgx(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final double zza(Object obj, long j8) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j8));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final float zzb(Object obj, long j8) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j8));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final void zzc(Object obj, long j8, boolean z14) {
        if (zzgz.zzb) {
            zzgz.zzD(obj, j8, z14 ? (byte) 1 : (byte) 0);
        } else {
            zzgz.zzE(obj, j8, z14 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final void zzd(Object obj, long j8, byte b14) {
        if (zzgz.zzb) {
            zzgz.zzD(obj, j8, b14);
        } else {
            zzgz.zzE(obj, j8, b14);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final void zze(Object obj, long j8, double d14) {
        this.zza.putLong(obj, j8, Double.doubleToLongBits(d14));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final void zzf(Object obj, long j8, float f14) {
        this.zza.putInt(obj, j8, Float.floatToIntBits(f14));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final boolean zzg(Object obj, long j8) {
        return zzgz.zzb ? zzgz.zzt(obj, j8) : zzgz.zzu(obj, j8);
    }
}
