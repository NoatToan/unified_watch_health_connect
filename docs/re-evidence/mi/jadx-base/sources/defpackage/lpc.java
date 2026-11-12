package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface lpc extends IInterface {

    public static abstract class a extends Binder implements lpc {
        public a() {
            attachInterface(this, "miui.bluetooth.ble.IBluetoothMiBleCallback");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("miui.bluetooth.ble.IBluetoothMiBleCallback");
                return true;
            }
            parcel.enforceInterface("miui.bluetooth.ble.IBluetoothMiBleCallback");
            C1(parcel.readInt() != 0 ? (ParcelUuid) ParcelUuid.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void C1(ParcelUuid parcelUuid, int i) throws RemoteException;
}
