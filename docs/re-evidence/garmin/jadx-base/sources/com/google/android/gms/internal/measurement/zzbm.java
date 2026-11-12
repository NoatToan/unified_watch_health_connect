package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public class zzbm extends Binder implements IInterface {
    public zzbm(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i14, Parcel parcel, Parcel parcel2, int i15) {
        if (i14 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i14, parcel, parcel2, i15)) {
            return true;
        }
        return zza(i14, parcel, parcel2, i15);
    }

    public boolean zza(int i14, Parcel parcel, Parcel parcel2, int i15) {
        throw null;
    }
}
