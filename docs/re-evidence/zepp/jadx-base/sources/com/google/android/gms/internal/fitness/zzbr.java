package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.zzai;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbr extends zzb implements zzbo {
    public zzbr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitBleApi");
    }

    @Override // com.google.android.gms.internal.fitness.zzbo
    public final void zza(StartBleScanRequest startBleScanRequest) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, startBleScanRequest);
        zza(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbo
    public final void zza(com.google.android.gms.fitness.request.zzbg zzbgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, zzbgVar);
        zza(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbo
    public final void zza(com.google.android.gms.fitness.request.zzd zzdVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, zzdVar);
        zza(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbo
    public final void zza(com.google.android.gms.fitness.request.zzbk zzbkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, zzbkVar);
        zza(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbo
    public final void zza(zzai zzaiVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, zzaiVar);
        zza(5, parcelZza);
    }
}
