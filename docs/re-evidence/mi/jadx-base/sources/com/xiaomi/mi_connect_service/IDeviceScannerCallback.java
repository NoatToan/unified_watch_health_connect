package com.xiaomi.mi_connect_service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface IDeviceScannerCallback extends IInterface {

    public static class Default implements IDeviceScannerCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.mi_connect_service.IDeviceScannerCallback
        public void onEndpointFound(int i, int i2, String str) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IDeviceScannerCallback
        public void onSuccessWrite(int i, int i2, int i3) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDeviceScannerCallback {
        private static final String DESCRIPTOR = "com.xiaomi.mi_connect_service.IDeviceScannerCallback";
        static final int TRANSACTION_onEndpointFound = 1;
        static final int TRANSACTION_onSuccessWrite = 2;

        public static class Proxy implements IDeviceScannerCallback {
            public static IDeviceScannerCallback sDefaultImpl;
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

            @Override // com.xiaomi.mi_connect_service.IDeviceScannerCallback
            public void onEndpointFound(int i, int i2, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onEndpointFound(i, i2, str);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IDeviceScannerCallback
            public void onSuccessWrite(int i, int i2, int i3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    if (this.mRemote.transact(2, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSuccessWrite(i, i2, i3);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IDeviceScannerCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDeviceScannerCallback)) ? new Proxy(iBinder) : (IDeviceScannerCallback) iInterfaceQueryLocalInterface;
        }

        public static IDeviceScannerCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IDeviceScannerCallback iDeviceScannerCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iDeviceScannerCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDeviceScannerCallback;
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
                onEndpointFound(parcel.readInt(), parcel.readInt(), parcel.readString());
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onSuccessWrite(parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    void onEndpointFound(int i, int i2, String str) throws RemoteException;

    void onSuccessWrite(int i, int i2, int i3) throws RemoteException;
}
