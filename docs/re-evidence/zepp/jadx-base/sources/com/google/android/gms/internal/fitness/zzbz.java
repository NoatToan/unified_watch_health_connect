package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.zzak;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbz extends zzb implements zzbw {
    public zzbz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
    }

    @Override // com.google.android.gms.internal.fitness.zzbw
    public final void zza(com.google.android.gms.fitness.request.zzbi zzbiVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, zzbiVar);
        zza(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbw
    public final void zza(com.google.android.gms.fitness.request.zzbm zzbmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, zzbmVar);
        zza(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.fitness.zzbw
    public final void zza(zzak zzakVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, zzakVar);
        zza(3, parcelZza);
    }
}
