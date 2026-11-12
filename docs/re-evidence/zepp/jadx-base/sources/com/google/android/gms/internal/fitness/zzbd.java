package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.result.DailyTotalResult;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbd extends zzb implements zzbb {
    public zzbd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IDailyTotalCallback");
    }

    @Override // com.google.android.gms.internal.fitness.zzbb
    public final void zzc(DailyTotalResult dailyTotalResult) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, dailyTotalResult);
        zzb(1, parcelZza);
    }
}
