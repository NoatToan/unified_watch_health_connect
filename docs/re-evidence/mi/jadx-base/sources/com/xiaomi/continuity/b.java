package com.xiaomi.continuity;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes7.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        public a() {
            attachInterface(this, "com.xiaomi.continuity.IStaticConfigService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.xiaomi.continuity.IStaticConfigService");
                return true;
            }
            parcel.enforceInterface("com.xiaomi.continuity.IStaticConfigService");
            Y4(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    void Y4(Intent intent);
}
