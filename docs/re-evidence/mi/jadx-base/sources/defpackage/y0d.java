package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface y0d extends IInterface {

    public static abstract class a extends Binder implements y0d {
        public a() {
            attachInterface(this, "com.mi.health.nfc.opensdk.IXMWearMierService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.mi.health.nfc.opensdk.IXMWearMierService");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.mi.health.nfc.opensdk.IXMWearMierService");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            String strJ = j();
            parcel2.writeNoException();
            parcel2.writeString(strJ);
            return true;
        }
    }

    String j() throws RemoteException;
}
