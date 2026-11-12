package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface toc extends IInterface {

    public static abstract class a extends Binder implements toc {
        public a() {
            attachInterface(this, "com.xiaomi.phonenum.service.IAccountPhoneNumberResponse");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.phonenum.service.IAccountPhoneNumberResponse");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.phonenum.service.IAccountPhoneNumberResponse");
                return true;
            }
            if (i == 1) {
                onResult((Bundle) b.b(parcel, Bundle.CREATOR));
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onError(parcel.readInt(), parcel.readString());
            }
            return true;
        }
    }

    public static class b {
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void onError(int i, String str) throws RemoteException;

    void onResult(Bundle bundle) throws RemoteException;
}
