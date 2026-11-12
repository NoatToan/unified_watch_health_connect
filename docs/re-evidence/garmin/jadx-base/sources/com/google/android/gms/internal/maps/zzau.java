package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public final class zzau extends zza implements zzaw {
    public zzau(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final float zzd() {
        Parcel parcelZzJ = zzJ(13, zza());
        float f14 = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f14;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final float zze() {
        Parcel parcelZzJ = zzJ(5, zza());
        float f14 = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f14;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final int zzf() {
        Parcel parcelZzJ = zzJ(9, zza());
        int i14 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i14;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final String zzg() {
        Parcel parcelZzJ = zzJ(3, zza());
        String string = parcelZzJ.readString();
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final void zzh() {
        zzc(2, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final void zzi() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final void zzj(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final void zzk(float f14) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f14);
        zzc(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final void zzl(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final void zzm(float f14) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f14);
        zzc(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final boolean zzn(zzaw zzawVar) {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, zzawVar);
        Parcel parcelZzJ = zzJ(8, parcelZza);
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final boolean zzo() {
        Parcel parcelZzJ = zzJ(11, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final boolean zzp() {
        Parcel parcelZzJ = zzJ(7, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }
}
