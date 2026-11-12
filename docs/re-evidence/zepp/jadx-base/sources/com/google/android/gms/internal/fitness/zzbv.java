package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.GoalsReadRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbv extends zzb implements zzbs {
    public zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitGoalsApi");
    }

    @Override // com.google.android.gms.internal.fitness.zzbs
    public final void zza(GoalsReadRequest goalsReadRequest) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, goalsReadRequest);
        zza(1, parcelZza);
    }
}
