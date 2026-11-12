package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.zzaw;
import com.google.android.gms.fitness.request.zzay;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcd extends zzb implements zzca {
    public zzcd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
    }

    @Override // com.google.android.gms.internal.fitness.zzca
    public final void zza(zzay zzayVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, zzayVar);
        zza(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzca
    public final void zza(com.google.android.gms.fitness.request.zzba zzbaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, zzbaVar);
        zza(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzca
    public final void zza(SessionInsertRequest sessionInsertRequest) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, sessionInsertRequest);
        zza(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzca
    public final void zza(SessionReadRequest sessionReadRequest) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, sessionReadRequest);
        zza(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzca
    public final void zza(zzaw zzawVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, zzawVar);
        zza(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzca
    public final void zza(com.google.android.gms.fitness.request.zzbc zzbcVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, zzbcVar);
        zza(6, parcelZza);
    }
}
