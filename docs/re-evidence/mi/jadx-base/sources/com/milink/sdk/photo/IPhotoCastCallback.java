package com.milink.sdk.photo;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface IPhotoCastCallback extends IInterface {

    public static class Default implements IPhotoCastCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.milink.sdk.photo.IPhotoCastCallback
        public void onDisplayNum(int i) throws RemoteException {
        }

        @Override // com.milink.sdk.photo.IPhotoCastCallback
        public void onEnd() throws RemoteException {
        }

        @Override // com.milink.sdk.photo.IPhotoCastCallback
        public void onError(int i) throws RemoteException {
        }

        @Override // com.milink.sdk.photo.IPhotoCastCallback
        public void onInit() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IPhotoCastCallback {
        private static final String DESCRIPTOR = "com.milink.sdk.photo.IPhotoCastCallback";
        static final int TRANSACTION_onDisplayNum = 4;
        static final int TRANSACTION_onEnd = 2;
        static final int TRANSACTION_onError = 3;
        static final int TRANSACTION_onInit = 1;

        public static class Proxy implements IPhotoCastCallback {
            public static IPhotoCastCallback sDefaultImpl;
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

            @Override // com.milink.sdk.photo.IPhotoCastCallback
            public void onDisplayNum(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onDisplayNum(i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.photo.IPhotoCastCallback
            public void onEnd() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onEnd();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.photo.IPhotoCastCallback
            public void onError(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onError(i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.photo.IPhotoCastCallback
            public void onInit() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onInit();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IPhotoCastCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IPhotoCastCallback)) ? new Proxy(iBinder) : (IPhotoCastCallback) iInterfaceQueryLocalInterface;
        }

        public static IPhotoCastCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IPhotoCastCallback iPhotoCastCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iPhotoCastCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iPhotoCastCallback;
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
                onInit();
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onEnd();
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                onError(parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            if (i != 4) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onDisplayNum(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void onDisplayNum(int i) throws RemoteException;

    void onEnd() throws RemoteException;

    void onError(int i) throws RemoteException;

    void onInit() throws RemoteException;
}
