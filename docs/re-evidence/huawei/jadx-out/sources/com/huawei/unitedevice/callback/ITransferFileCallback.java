package com.huawei.unitedevice.callback;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes20.dex */
public interface ITransferFileCallback extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.unitedevice.callback.ITransferFileCallback";

    void onFailure(int i, String str) throws RemoteException;

    void onProgress(int i, String str) throws RemoteException;

    void onResponse(int i, String str) throws RemoteException;

    void onSuccess(int i, String str, String str2) throws RemoteException;

    public static abstract class Stub extends Binder implements ITransferFileCallback {
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onProgress = 3;
        static final int TRANSACTION_onResponse = 4;
        static final int TRANSACTION_onSuccess = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, ITransferFileCallback.DESCRIPTOR);
        }

        public static ITransferFileCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ITransferFileCallback.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof ITransferFileCallback)) {
                return (ITransferFileCallback) iInterfaceQueryLocalInterface;
            }
            return new c(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ITransferFileCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ITransferFileCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onSuccess(parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 2) {
                onFailure(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 3) {
                onProgress(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 4) {
                onResponse(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        static class c implements ITransferFileCallback {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f29862b;

            c(IBinder iBinder) {
                this.f29862b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29862b;
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onSuccess(int i, String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITransferFileCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f29862b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onFailure(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITransferFileCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.f29862b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onProgress(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITransferFileCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.f29862b.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onResponse(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITransferFileCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.f29862b.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
