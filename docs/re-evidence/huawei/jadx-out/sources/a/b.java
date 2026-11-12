package a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.a;
import com.huawei.harmonyos.interwork.base.bundle.ElementName;

/* JADX INFO: loaded from: classes20.dex */
public abstract class b extends Binder implements IInterface {
    public b() {
        attachInterface(this, "com.huawei.harmonyos.interwork.IAbilityConnection");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("com.huawei.harmonyos.interwork.IAbilityConnection");
        }
        if (i == 1598968902) {
            parcel2.writeString("com.huawei.harmonyos.interwork.IAbilityConnection");
            return true;
        }
        if (i == 1) {
            ((a) this).b(parcel.readInt() != 0 ? ElementName.CREATOR.createFromParcel(parcel) : null, parcel.readStrongBinder(), parcel.readInt());
        } else {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            ((a) this).b(parcel.readInt() != 0 ? ElementName.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
        }
        return true;
    }
}
