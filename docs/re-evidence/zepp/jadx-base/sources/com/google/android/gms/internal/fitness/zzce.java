package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

/* JADX INFO: loaded from: classes3.dex */
public final class zzce extends zzb implements zzcc {
    public zzce(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
    }

    @Override // com.google.android.gms.internal.fitness.zzcc
    public final void zza(ListSubscriptionsResult listSubscriptionsResult) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, listSubscriptionsResult);
        zzb(1, parcelZza);
    }
}
