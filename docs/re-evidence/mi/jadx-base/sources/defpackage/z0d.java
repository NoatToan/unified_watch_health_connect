package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface z0d extends IInterface {

    public static abstract class a extends Binder implements z0d {
        public a() {
            attachInterface(this, "com.mi.health.nfc.opensdk.IXMWearNfcOpenService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.mi.health.nfc.opensdk.IXMWearNfcOpenService");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.mi.health.nfc.opensdk.IXMWearNfcOpenService");
                return true;
            }
            if (i == 1) {
                String strJ = J(parcel.readHashMap(getClass().getClassLoader()));
                parcel2.writeNoException();
                parcel2.writeString(strJ);
            } else if (i == 2) {
                String strDeleteCard = deleteCard(parcel.readHashMap(getClass().getClassLoader()));
                parcel2.writeNoException();
                parcel2.writeString(strDeleteCard);
            } else if (i == 3) {
                String strQueryCardInfo = queryCardInfo(parcel.readHashMap(getClass().getClassLoader()));
                parcel2.writeNoException();
                parcel2.writeString(strQueryCardInfo);
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                String strJ2 = j();
                parcel2.writeNoException();
                parcel2.writeString(strJ2);
            }
            return true;
        }
    }

    String J(Map map) throws RemoteException;

    String deleteCard(Map map) throws RemoteException;

    String j() throws RemoteException;

    String queryCardInfo(Map map) throws RemoteException;
}
