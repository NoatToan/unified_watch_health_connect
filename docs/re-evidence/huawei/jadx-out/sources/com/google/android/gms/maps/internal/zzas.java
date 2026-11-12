package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzas extends com.google.android.gms.internal.maps.zzb implements zzar {
    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean zZza = zza(com.google.android.gms.internal.maps.zzu.zzg(parcel.readStrongBinder()));
        parcel2.writeNoException();
        com.google.android.gms.internal.maps.zzc.zza(parcel2, zZza);
        return true;
    }

    public zzas() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }
}
