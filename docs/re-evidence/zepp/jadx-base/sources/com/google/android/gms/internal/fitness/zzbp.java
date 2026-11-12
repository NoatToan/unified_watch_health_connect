package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.result.GoalsResult;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbp extends zzb implements zzbn {
    public zzbp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoalsReadCallback");
    }

    @Override // com.google.android.gms.internal.fitness.zzbn
    public final void zza(GoalsResult goalsResult) throws RemoteException {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, goalsResult);
        zzb(1, parcelZza);
    }
}
