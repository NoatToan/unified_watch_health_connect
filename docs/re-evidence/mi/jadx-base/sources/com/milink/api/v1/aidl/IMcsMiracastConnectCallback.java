package com.milink.api.v1.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface IMcsMiracastConnectCallback extends IInterface {

    public static class Default implements IMcsMiracastConnectCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.milink.api.v1.aidl.IMcsMiracastConnectCallback
        public void onConnectFail(String str) throws RemoteException {
        }

        @Override // com.milink.api.v1.aidl.IMcsMiracastConnectCallback
        public void onConnectSuccess(String str) throws RemoteException {
        }

        @Override // com.milink.api.v1.aidl.IMcsMiracastConnectCallback
        public void onConnecting(String str) throws RemoteException {
        }

        @Override // com.milink.api.v1.aidl.IMcsMiracastConnectCallback
        public void onResult(int i, String str, String str2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMcsMiracastConnectCallback {
        private static final String DESCRIPTOR = "com.milink.api.v1.aidl.IMcsMiracastConnectCallback";
        static final int TRANSACTION_onConnectFail = 2;
        static final int TRANSACTION_onConnectSuccess = 1;
        static final int TRANSACTION_onConnecting = 3;
        static final int TRANSACTION_onResult = 4;

        public static class Proxy implements IMcsMiracastConnectCallback {
            public static IMcsMiracastConnectCallback sDefaultImpl;
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

            @Override // com.milink.api.v1.aidl.IMcsMiracastConnectCallback
            public void onConnectFail(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onConnectFail(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcsMiracastConnectCallback
            public void onConnectSuccess(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onConnectSuccess(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcsMiracastConnectCallback
            public void onConnecting(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onConnecting(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcsMiracastConnectCallback
            public void onResult(int i, String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onResult(i, str, str2);
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

        public static IMcsMiracastConnectCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMcsMiracastConnectCallback)) ? new Proxy(iBinder) : (IMcsMiracastConnectCallback) iInterfaceQueryLocalInterface;
        }

        public static IMcsMiracastConnectCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IMcsMiracastConnectCallback iMcsMiracastConnectCallback) {
            if (Proxy.sDefaultImpl != null || iMcsMiracastConnectCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iMcsMiracastConnectCallback;
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
                onConnectSuccess(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onConnectFail(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                onConnecting(parcel.readString());
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
            onResult(parcel.readInt(), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void onConnectFail(String str) throws RemoteException;

    void onConnectSuccess(String str) throws RemoteException;

    void onConnecting(String str) throws RemoteException;

    void onResult(int i, String str, String str2) throws RemoteException;
}
