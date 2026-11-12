package a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes20.dex */
public abstract class f extends Binder implements IInterface {
    public f() {
        attachInterface(this, "com.huawei.harmonyos.interwork.IInitCallBack");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("com.huawei.harmonyos.interwork.IInitCallBack");
        }
        if (i == 1598968902) {
            parcel2.writeString("com.huawei.harmonyos.interwork.IInitCallBack");
            return true;
        }
        if (i == 1) {
            ((b.d) this).d.onInitSuccess(parcel.readString());
        } else {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            ((b.d) this).d.onInitFailure(parcel.readString(), parcel.readInt());
        }
        return true;
    }
}
