package com.huawei.remoteLoader.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes42.dex */
public abstract class ARBaseStub extends Binder implements IInterface {
    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    protected boolean routeToSuperOrEnforceInterface(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 16777215) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }
}
