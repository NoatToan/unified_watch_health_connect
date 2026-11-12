package com.google.android.gms.internal.auth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes14.dex */
public class zzb extends Binder implements IInterface {
    private static zzd zzc;

    public zzb(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    public boolean dispatchTransaction(int i14, Parcel parcel, Parcel parcel2, int i15) {
        return false;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i14, Parcel parcel, Parcel parcel2, int i15) throws RemoteException {
        boolean zOnTransact;
        if (i14 > 16777215) {
            zOnTransact = super.onTransact(i14, parcel, parcel2, i15);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            zOnTransact = false;
        }
        if (zOnTransact) {
            return true;
        }
        return dispatchTransaction(i14, parcel, parcel2, i15);
    }
}
