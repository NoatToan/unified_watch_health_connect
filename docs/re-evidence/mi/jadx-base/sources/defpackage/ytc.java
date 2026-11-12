package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface ytc extends IInterface {

    public static abstract class a extends Binder implements ytc {
        public a() {
            attachInterface(this, "com.android.internal.app.IMessenger");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.android.internal.app.IMessenger");
                R3(parcel.readInt() != 0 ? (Message) Message.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.android.internal.app.IMessenger");
            return true;
        }
    }

    void R3(Message message) throws RemoteException;
}
