package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public final class zzab extends zza implements zzad {
    public zzab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final int zzd() {
        Parcel parcelZzJ = zzJ(5, zza());
        int i14 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i14;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final String zze() {
        Parcel parcelZzJ = zzJ(1, zza());
        String string = parcelZzJ.readString();
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final String zzf() {
        Parcel parcelZzJ = zzJ(2, zza());
        String string = parcelZzJ.readString();
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzg() {
        zzc(3, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final boolean zzh(zzad zzadVar) {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, zzadVar);
        Parcel parcelZzJ = zzJ(4, parcelZza);
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }
}
