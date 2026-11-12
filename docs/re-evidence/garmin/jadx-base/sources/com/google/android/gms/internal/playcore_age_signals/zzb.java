package com.google.android.gms.internal.playcore_age_signals;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public class zzb extends Binder implements IInterface {
    public zzb(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public boolean dispatchTransaction(int i14, Parcel parcel, Parcel parcel2, int i15) {
        return false;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i14, Parcel parcel, Parcel parcel2, int i15) {
        if (i14 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i14, parcel, parcel2, i15)) {
            return true;
        }
        return dispatchTransaction(i14, parcel, parcel2, i15);
    }
}
