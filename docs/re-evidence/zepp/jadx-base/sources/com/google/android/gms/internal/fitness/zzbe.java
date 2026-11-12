package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.result.DataReadResult;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbe extends zzb implements zzbc {
    public zzbe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IDataReadCallback");
    }

    @Override // com.google.android.gms.internal.fitness.zzbc
    public final void zza(DataReadResult dataReadResult) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, dataReadResult);
        zzb(1, parcelZza);
    }
}
