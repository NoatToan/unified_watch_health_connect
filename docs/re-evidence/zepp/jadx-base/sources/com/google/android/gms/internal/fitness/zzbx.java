package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest;
import com.google.android.gms.fitness.request.DataUpdateRequest;
import com.google.android.gms.fitness.request.zzv;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbx extends zzb implements zzbu {
    public zzbx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
    }

    @Override // com.google.android.gms.internal.fitness.zzbu
    public final void zza(DataReadRequest dataReadRequest) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, dataReadRequest);
        zza(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbu
    public final void zza(com.google.android.gms.fitness.request.zzj zzjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, zzjVar);
        zza(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbu
    public final void zza(DataDeleteRequest dataDeleteRequest) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, dataDeleteRequest);
        zza(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbu
    public final void zza(com.google.android.gms.fitness.request.zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, zzfVar);
        zza(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbu
    public final void zza(DataUpdateRequest dataUpdateRequest) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, dataUpdateRequest);
        zza(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbu
    public final void zza(DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, dataUpdateListenerRegistrationRequest);
        zza(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbu
    public final void zza(zzv zzvVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, zzvVar);
        zza(11, parcelZza);
    }
}
