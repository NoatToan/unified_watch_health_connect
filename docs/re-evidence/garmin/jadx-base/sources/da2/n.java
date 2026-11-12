package da2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes7.dex */
public abstract class n extends Binder implements IInterface {
    public n() {
        attachInterface(this, "com.garmin.android.deviceinterface.RemoteGdiService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i14, Parcel parcel, Parcel parcel2, int i15) {
        if (i14 != 1598968902) {
            return super.onTransact(i14, parcel, parcel2, i15);
        }
        parcel2.writeString("com.garmin.android.deviceinterface.RemoteGdiService");
        return true;
    }
}
