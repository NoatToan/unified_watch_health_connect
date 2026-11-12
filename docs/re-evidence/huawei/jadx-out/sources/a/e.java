package a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes20.dex */
public abstract class e extends Binder implements IInterface {
    public e() {
        attachInterface(this, "com.huawei.harmonyos.interwork.IDeviceStateCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("com.huawei.harmonyos.interwork.IDeviceStateCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("com.huawei.harmonyos.interwork.IDeviceStateCallback");
            return true;
        }
        if (i == 1) {
            ((b.c) this).f867b.onDeviceOffline(parcel.readString(), parcel.readInt());
        } else {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            ((b.c) this).f867b.onDeviceOnline(parcel.readString(), parcel.readInt());
        }
        return true;
    }
}
