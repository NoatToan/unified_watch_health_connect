package com.liulishuo.filedownloader.i;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.liulishuo.filedownloader.message.MessageSnapshot;

/* JADX INFO: loaded from: classes18.dex */
public interface IFileDownloadIPCCallback extends IInterface {

    public static abstract class Stub extends Binder implements IFileDownloadIPCCallback {
        private static final String a = "com.liulishuo.filedownloader.i.IFileDownloadIPCCallback";
        public static final int b = 1;

        public static class a implements IFileDownloadIPCCallback {
            private IBinder a;

            public a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.liulishuo.filedownloader.i.IFileDownloadIPCCallback
            public void callback(MessageSnapshot messageSnapshot) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (messageSnapshot != null) {
                        parcelObtain.writeInt(1);
                        messageSnapshot.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String d() {
                return Stub.a;
            }
        }

        public Stub() {
            attachInterface(this, a);
        }

        public static IFileDownloadIPCCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IFileDownloadIPCCallback)) ? new a(iBinder) : (IFileDownloadIPCCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(a);
                callback(parcel.readInt() != 0 ? MessageSnapshot.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(a);
            return true;
        }
    }

    void callback(MessageSnapshot messageSnapshot) throws RemoteException;
}
