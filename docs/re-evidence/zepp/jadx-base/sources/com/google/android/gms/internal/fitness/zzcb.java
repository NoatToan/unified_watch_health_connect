package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.zzar;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcb extends zzb implements zzby {
    public zzcb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
    }

    @Override // com.google.android.gms.internal.fitness.zzby
    public final void zza(DataSourcesRequest dataSourcesRequest) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, dataSourcesRequest);
        zza(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzby
    public final void zza(com.google.android.gms.fitness.request.zzap zzapVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, zzapVar);
        zza(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzby
    public final void zza(zzar zzarVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, zzarVar);
        zza(3, parcelZza);
    }
}
