package a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes20.dex */
public abstract class d extends Binder implements IInterface {
    public d() {
        attachInterface(this, "com.huawei.harmonyos.interwork.IDeathRecipientCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("com.huawei.harmonyos.interwork.IDeathRecipientCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("com.huawei.harmonyos.interwork.IDeathRecipientCallback");
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        ((b.b) this).f866a.binderDied();
        return true;
    }
}
