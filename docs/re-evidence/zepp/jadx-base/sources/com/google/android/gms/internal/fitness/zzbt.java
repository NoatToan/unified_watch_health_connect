package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.request.zzr;
import com.google.android.gms.fitness.request.zzz;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbt extends zzb implements zzbq {
    public zzbt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
    }

    @Override // com.google.android.gms.internal.fitness.zzbq
    public final void zza(DataTypeCreateRequest dataTypeCreateRequest) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, dataTypeCreateRequest);
        zza(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbq
    public final void zza(zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, zzrVar);
        zza(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbq
    public final void zza(zzz zzzVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, zzzVar);
        zza(22, parcelZza);
    }
}
