package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class zzy extends zza implements zzaa {
    public zzy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final int zzd() {
        Parcel parcelZzJ = zzJ(1, zza());
        int i14 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i14;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final int zze() {
        Parcel parcelZzJ = zzJ(2, zza());
        int i14 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i14;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final int zzf() {
        Parcel parcelZzJ = zzJ(6, zza());
        int i14 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i14;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final List zzg() {
        Parcel parcelZzJ = zzJ(3, zza());
        ArrayList<IBinder> arrayListCreateBinderArrayList = parcelZzJ.createBinderArrayList();
        parcelZzJ.recycle();
        return arrayListCreateBinderArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final boolean zzh(zzaa zzaaVar) {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, zzaaVar);
        Parcel parcelZzJ = zzJ(5, parcelZza);
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final boolean zzi() {
        Parcel parcelZzJ = zzJ(4, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }
}
