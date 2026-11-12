package com.google.android.play.core.splitinstall.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public class zzl extends Binder implements IInterface {
    public zzl(String str) {
        attachInterface(this, "com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
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
        return zza(i14, parcel, parcel2, i15);
    }

    public boolean zza(int i14, Parcel parcel, Parcel parcel2, int i15) {
        throw null;
    }
}
