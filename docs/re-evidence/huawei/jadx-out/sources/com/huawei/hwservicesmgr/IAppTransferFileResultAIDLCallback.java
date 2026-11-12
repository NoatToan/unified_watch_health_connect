package com.huawei.hwservicesmgr;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface IAppTransferFileResultAIDLCallback extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback";

    void onFileRespond(int i, String str) throws RemoteException;

    void onFileTransferState(int i, String str) throws RemoteException;

    void onUpgradeFailed(int i, String str) throws RemoteException;

    /* JADX INFO: loaded from: classes11.dex */
    public static abstract class Stub extends Binder implements IAppTransferFileResultAIDLCallback {
        static final int TRANSACTION_onFileRespond = 3;
        static final int TRANSACTION_onFileTransferState = 1;
        static final int TRANSACTION_onUpgradeFailed = 2;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IAppTransferFileResultAIDLCallback.DESCRIPTOR);
        }

        public static IAppTransferFileResultAIDLCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IAppTransferFileResultAIDLCallback.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IAppTransferFileResultAIDLCallback)) {
                return (IAppTransferFileResultAIDLCallback) iInterfaceQueryLocalInterface;
            }
            return new b(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IAppTransferFileResultAIDLCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IAppTransferFileResultAIDLCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onFileTransferState(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 2) {
                onUpgradeFailed(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 3) {
                onFileRespond(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        static class b implements IAppTransferFileResultAIDLCallback {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f17667b;

            b(IBinder iBinder) {
                this.f17667b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17667b;
            }

            @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
            public void onFileTransferState(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAppTransferFileResultAIDLCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.f17667b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
            public void onUpgradeFailed(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAppTransferFileResultAIDLCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.f17667b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
            public void onFileRespond(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAppTransferFileResultAIDLCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.f17667b.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
