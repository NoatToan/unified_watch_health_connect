package com.xiaomi.smarthome.core.server.bluetooth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface IProfileProxyPrepareCallback extends IInterface {

    public static class Default implements IProfileProxyPrepareCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.smarthome.core.server.bluetooth.IProfileProxyPrepareCallback
        public void onServiceConnected(int i) throws RemoteException {
        }

        @Override // com.xiaomi.smarthome.core.server.bluetooth.IProfileProxyPrepareCallback
        public void onServiceDisconnected(int i) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IProfileProxyPrepareCallback {
        private static final String DESCRIPTOR = "com.xiaomi.smarthome.core.server.bluetooth.IProfileProxyPrepareCallback";
        static final int TRANSACTION_onServiceConnected = 1;
        static final int TRANSACTION_onServiceDisconnected = 2;

        public static class Proxy implements IProfileProxyPrepareCallback {
            public static IProfileProxyPrepareCallback sDefaultImpl;
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

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IProfileProxyPrepareCallback
            public void onServiceConnected(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onServiceConnected(i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IProfileProxyPrepareCallback
            public void onServiceDisconnected(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onServiceDisconnected(i);
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

        public static IProfileProxyPrepareCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IProfileProxyPrepareCallback)) ? new Proxy(iBinder) : (IProfileProxyPrepareCallback) iInterfaceQueryLocalInterface;
        }

        public static IProfileProxyPrepareCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IProfileProxyPrepareCallback iProfileProxyPrepareCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iProfileProxyPrepareCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iProfileProxyPrepareCallback;
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
                onServiceConnected(parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onServiceDisconnected(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void onServiceConnected(int i) throws RemoteException;

    void onServiceDisconnected(int i) throws RemoteException;
}
