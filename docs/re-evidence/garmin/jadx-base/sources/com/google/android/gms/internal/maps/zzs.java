package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public final class zzs extends zza implements zzu {
    public zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IFeatureLayerDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final String zzd() {
        Parcel parcelZzJ = zzJ(6, zza());
        String string = parcelZzJ.readString();
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final String zze() {
        Parcel parcelZzJ = zzJ(1, zza());
        String string = parcelZzJ.readString();
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final void zzf(zzal zzalVar) {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, zzalVar);
        zzc(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final void zzg(zzal zzalVar) {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, zzalVar);
        zzc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final void zzh(zzat zzatVar) {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, zzatVar);
        zzc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final boolean zzi() {
        Parcel parcelZzJ = zzJ(2, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }
}
