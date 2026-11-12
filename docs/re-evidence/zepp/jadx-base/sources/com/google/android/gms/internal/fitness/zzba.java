package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.result.DailyTotalResult;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzba extends zza implements zzbb {
    public zzba() {
        super("com.google.android.gms.fitness.internal.IDailyTotalCallback");
    }

    public static zzbb zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDailyTotalCallback");
        return iInterfaceQueryLocalInterface instanceof zzbb ? (zzbb) iInterfaceQueryLocalInterface : new zzbd(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zza
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzc((DailyTotalResult) zzd.zza(parcel, DailyTotalResult.CREATOR));
        return true;
    }
}
