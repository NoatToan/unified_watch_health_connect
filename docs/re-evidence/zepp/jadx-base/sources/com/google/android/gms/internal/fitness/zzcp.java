package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcp extends zzb implements zzcn {
    public zzcp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IStatusCallback");
    }

    @Override // com.google.android.gms.internal.fitness.zzcn
    public final void onResult(Status status) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, status);
        zzb(1, parcelZza);
    }
}
