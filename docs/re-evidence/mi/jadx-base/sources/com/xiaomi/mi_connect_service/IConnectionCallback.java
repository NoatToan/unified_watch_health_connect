package com.xiaomi.mi_connect_service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface IConnectionCallback extends IInterface {

    public static class Default implements IConnectionCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.mi_connect_service.IConnectionCallback
        public void onDisconnected() throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IConnectionCallback
        public void onFailure(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IConnectionCallback
        public void onSuccess(byte[] bArr) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IConnectionCallback {
        private static final String DESCRIPTOR = "com.xiaomi.mi_connect_service.IConnectionCallback";
        static final int TRANSACTION_onDisconnected = 3;
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onSuccess = 1;

        public static class Proxy implements IConnectionCallback {
            public static IConnectionCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.xiaomi.mi_connect_service.IConnectionCallback
            public void onDisconnected() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(3, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onDisconnected();
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IConnectionCallback
            public void onFailure(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(2, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onFailure(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IConnectionCallback
            public void onSuccess(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSuccess(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IConnectionCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IConnectionCallback)) ? new Proxy(iBinder) : (IConnectionCallback) iInterfaceQueryLocalInterface;
        }

        public static IConnectionCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IConnectionCallback iConnectionCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iConnectionCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iConnectionCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onSuccess(parcel.createByteArray());
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onFailure(parcel.createByteArray());
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                onDisconnected();
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    void onDisconnected() throws RemoteException;

    void onFailure(byte[] bArr) throws RemoteException;

    void onSuccess(byte[] bArr) throws RemoteException;
}
