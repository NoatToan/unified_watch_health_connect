package com.xiaomi.mi_connect_service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface IMiConnectCallback extends IInterface {

    public static class Default implements IMiConnectCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
        public void onAdvertisingResult(int i, int i2) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
        public void onConnectionInitiated(int i, int i2, String str, byte[] bArr, byte[] bArr2) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
        public void onConnectionResult(int i, int i2, String str, int i3) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
        public void onDisconnection(int i, int i2) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
        public void onDiscoveryResult(int i, int i2) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
        public void onEndpointFound(int i, int i2, String str, byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
        public void onEndpointLost(int i, int i2, String str) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
        public void onPayloadReceived(int i, int i2, byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
        public void onPayloadSentResult(int i, int i2, int i3) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMiConnectCallback {
        private static final String DESCRIPTOR = "com.xiaomi.mi_connect_service.IMiConnectCallback";
        static final int TRANSACTION_onAdvertisingResult = 1;
        static final int TRANSACTION_onConnectionInitiated = 4;
        static final int TRANSACTION_onConnectionResult = 5;
        static final int TRANSACTION_onDisconnection = 6;
        static final int TRANSACTION_onDiscoveryResult = 2;
        static final int TRANSACTION_onEndpointFound = 3;
        static final int TRANSACTION_onEndpointLost = 9;
        static final int TRANSACTION_onPayloadReceived = 8;
        static final int TRANSACTION_onPayloadSentResult = 7;

        public static class Proxy implements IMiConnectCallback {
            public static IMiConnectCallback sDefaultImpl;
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

            @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
            public void onAdvertisingResult(int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (this.mRemote.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onAdvertisingResult(i, i2);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
            public void onConnectionInitiated(int i, int i2, String str, byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeByteArray(bArr2);
                    if (this.mRemote.transact(4, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onConnectionInitiated(i, i2, str, bArr, bArr2);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
            public void onConnectionResult(int i, int i2, String str, int i3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i3);
                    if (this.mRemote.transact(5, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onConnectionResult(i, i2, str, i3);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
            public void onDisconnection(int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (this.mRemote.transact(6, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onDisconnection(i, i2);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
            public void onDiscoveryResult(int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (this.mRemote.transact(2, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onDiscoveryResult(i, i2);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
            public void onEndpointFound(int i, int i2, String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(3, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onEndpointFound(i, i2, str, bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
            public void onEndpointLost(int i, int i2, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(9, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onEndpointLost(i, i2, str);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
            public void onPayloadReceived(int i, int i2, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(8, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onPayloadReceived(i, i2, bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
            public void onPayloadSentResult(int i, int i2, int i3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    if (this.mRemote.transact(7, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onPayloadSentResult(i, i2, i3);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IMiConnectCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMiConnectCallback)) ? new Proxy(iBinder) : (IMiConnectCallback) iInterfaceQueryLocalInterface;
        }

        public static IMiConnectCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IMiConnectCallback iMiConnectCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iMiConnectCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iMiConnectCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    onAdvertisingResult(parcel.readInt(), parcel.readInt());
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    onDiscoveryResult(parcel.readInt(), parcel.readInt());
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    onEndpointFound(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.createByteArray());
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    onConnectionInitiated(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.createByteArray(), parcel.createByteArray());
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    onConnectionResult(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    onDisconnection(parcel.readInt(), parcel.readInt());
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    onPayloadSentResult(parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    onPayloadReceived(parcel.readInt(), parcel.readInt(), parcel.createByteArray());
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    onEndpointLost(parcel.readInt(), parcel.readInt(), parcel.readString());
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void onAdvertisingResult(int i, int i2) throws RemoteException;

    void onConnectionInitiated(int i, int i2, String str, byte[] bArr, byte[] bArr2) throws RemoteException;

    void onConnectionResult(int i, int i2, String str, int i3) throws RemoteException;

    void onDisconnection(int i, int i2) throws RemoteException;

    void onDiscoveryResult(int i, int i2) throws RemoteException;

    void onEndpointFound(int i, int i2, String str, byte[] bArr) throws RemoteException;

    void onEndpointLost(int i, int i2, String str) throws RemoteException;

    void onPayloadReceived(int i, int i2, byte[] bArr) throws RemoteException;

    void onPayloadSentResult(int i, int i2, int i3) throws RemoteException;
}
