package com.huawei.hihealth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface IWriteCallback extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.hihealth.IWriteCallback";

    public static class Default implements IWriteCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hihealth.IWriteCallback
        public void onResult(int i, String str) throws RemoteException {
        }
    }

    void onResult(int i, String str) throws RemoteException;

    public static abstract class Stub extends Binder implements IWriteCallback {
        static final int TRANSACTION_onResult = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IWriteCallback.DESCRIPTOR);
        }

        public static IWriteCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IWriteCallback.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IWriteCallback)) {
                return (IWriteCallback) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IWriteCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IWriteCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onResult(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        static class Proxy implements IWriteCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f12031a;

            Proxy(IBinder iBinder) {
                this.f12031a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12031a;
            }

            @Override // com.huawei.hihealth.IWriteCallback
            public void onResult(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWriteCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.f12031a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
