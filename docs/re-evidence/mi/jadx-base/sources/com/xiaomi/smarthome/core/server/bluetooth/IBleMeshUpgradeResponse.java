package com.xiaomi.smarthome.core.server.bluetooth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface IBleMeshUpgradeResponse extends IInterface {

    public static class Default implements IBleMeshUpgradeResponse {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleMeshUpgradeResponse
        public boolean isMeshDevice() throws RemoteException {
            return false;
        }

        @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleMeshUpgradeResponse
        public void onProgress(int i) throws RemoteException {
        }

        @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleMeshUpgradeResponse
        public void onResponse(int i, String str) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IBleMeshUpgradeResponse {
        private static final String DESCRIPTOR = "com.xiaomi.smarthome.core.server.bluetooth.IBleMeshUpgradeResponse";
        static final int TRANSACTION_isMeshDevice = 3;
        static final int TRANSACTION_onProgress = 1;
        static final int TRANSACTION_onResponse = 2;

        public static class Proxy implements IBleMeshUpgradeResponse {
            public static IBleMeshUpgradeResponse sDefaultImpl;
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

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleMeshUpgradeResponse
            public boolean isMeshDevice() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isMeshDevice();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleMeshUpgradeResponse
            public void onProgress(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onProgress(i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleMeshUpgradeResponse
            public void onResponse(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onResponse(i, str);
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

        public static IBleMeshUpgradeResponse asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IBleMeshUpgradeResponse)) ? new Proxy(iBinder) : (IBleMeshUpgradeResponse) iInterfaceQueryLocalInterface;
        }

        public static IBleMeshUpgradeResponse getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IBleMeshUpgradeResponse iBleMeshUpgradeResponse) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iBleMeshUpgradeResponse == null) {
                return false;
            }
            Proxy.sDefaultImpl = iBleMeshUpgradeResponse;
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
                onProgress(parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onResponse(parcel.readInt(), parcel.readString());
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
            boolean zIsMeshDevice = isMeshDevice();
            parcel2.writeNoException();
            parcel2.writeInt(zIsMeshDevice ? 1 : 0);
            return true;
        }
    }

    boolean isMeshDevice() throws RemoteException;

    void onProgress(int i) throws RemoteException;

    void onResponse(int i, String str) throws RemoteException;
}
