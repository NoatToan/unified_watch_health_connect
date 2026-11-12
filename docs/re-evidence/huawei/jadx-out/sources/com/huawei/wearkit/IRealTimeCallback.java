package com.huawei.wearkit;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes20.dex */
public interface IRealTimeCallback extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.wearkit.IRealTimeCallback";

    void onChange(int i, String str) throws RemoteException;

    void onResult(int i) throws RemoteException;

    public static abstract class Stub extends Binder implements IRealTimeCallback {
        static final int TRANSACTION_onChange = 2;
        static final int TRANSACTION_onResult = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IRealTimeCallback.DESCRIPTOR);
        }

        public static IRealTimeCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IRealTimeCallback.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IRealTimeCallback)) {
                return (IRealTimeCallback) iInterfaceQueryLocalInterface;
            }
            return new d(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IRealTimeCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IRealTimeCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onResult(parcel.readInt());
                parcel2.writeNoException();
            } else if (i == 2) {
                onChange(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        static class d implements IRealTimeCallback {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f30823b;

            d(IBinder iBinder) {
                this.f30823b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30823b;
            }

            @Override // com.huawei.wearkit.IRealTimeCallback
            public void onResult(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRealTimeCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.f30823b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearkit.IRealTimeCallback
            public void onChange(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRealTimeCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.f30823b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
