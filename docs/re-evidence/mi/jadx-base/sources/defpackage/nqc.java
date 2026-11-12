package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface nqc extends IInterface {

    public static abstract class a extends Binder implements nqc {
        public a() {
            attachInterface(this, "com.xiaomi.aicr.ICoreServiceCallback");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.aicr.ICoreServiceCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.aicr.ICoreServiceCallback");
                return true;
            }
            if (i == 1) {
                t1(parcel.readStrongBinder());
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                X(parcel.readString(), parcel.readLong());
            }
            return true;
        }
    }

    void X(String str, long j) throws RemoteException;

    void t1(IBinder iBinder) throws RemoteException;
}
