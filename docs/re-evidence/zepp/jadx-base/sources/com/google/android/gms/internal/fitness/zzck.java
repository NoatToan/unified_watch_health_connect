package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.result.SessionStopResult;

/* JADX INFO: loaded from: classes3.dex */
public final class zzck extends zzb implements zzci {
    public zzck(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.ISessionStopCallback");
    }

    @Override // com.google.android.gms.internal.fitness.zzci
    public final void zza(SessionStopResult sessionStopResult) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, sessionStopResult);
        zzb(1, parcelZza);
    }
}
