package com.google.android.play.integrity.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public class b extends Binder implements IInterface {
    public b(String str) {
        attachInterface(this, str);
    }

    public boolean a(int i14, Parcel parcel, Parcel parcel2, int i15) {
        throw null;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i14, Parcel parcel, Parcel parcel2, int i15) {
        if (i14 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i14, parcel, parcel2, i15)) {
            return true;
        }
        return a(i14, parcel, parcel2, i15);
    }
}
