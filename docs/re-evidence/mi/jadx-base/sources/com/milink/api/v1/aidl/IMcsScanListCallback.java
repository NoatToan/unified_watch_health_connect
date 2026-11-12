package com.milink.api.v1.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface IMcsScanListCallback extends IInterface {

    public static class Default implements IMcsScanListCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.milink.api.v1.aidl.IMcsScanListCallback
        public void onConnectFail(String str, String str2) throws RemoteException {
        }

        @Override // com.milink.api.v1.aidl.IMcsScanListCallback
        public void onConnectSuccess(String str, String str2) throws RemoteException {
        }

        @Override // com.milink.api.v1.aidl.IMcsScanListCallback
        public void onSelectDevice(String str, String str2, String str3) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMcsScanListCallback {
        private static final String DESCRIPTOR = "com.milink.api.v1.aidl.IMcsScanListCallback";
        static final int TRANSACTION_onConnectFail = 3;
        static final int TRANSACTION_onConnectSuccess = 2;
        static final int TRANSACTION_onSelectDevice = 1;

        public static class Proxy implements IMcsScanListCallback {
            public static IMcsScanListCallback sDefaultImpl;
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

            @Override // com.milink.api.v1.aidl.IMcsScanListCallback
            public void onConnectFail(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onConnectFail(str, str2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcsScanListCallback
            public void onConnectSuccess(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onConnectSuccess(str, str2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcsScanListCallback
            public void onSelectDevice(String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onSelectDevice(str, str2, str3);
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

        public static IMcsScanListCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMcsScanListCallback)) ? new Proxy(iBinder) : (IMcsScanListCallback) iInterfaceQueryLocalInterface;
        }

        public static IMcsScanListCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IMcsScanListCallback iMcsScanListCallback) {
            if (Proxy.sDefaultImpl != null || iMcsScanListCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iMcsScanListCallback;
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
                onSelectDevice(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onConnectSuccess(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onConnectFail(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void onConnectFail(String str, String str2) throws RemoteException;

    void onConnectSuccess(String str, String str2) throws RemoteException;

    void onSelectDevice(String str, String str2, String str3) throws RemoteException;
}
