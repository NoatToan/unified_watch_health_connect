package com.xiaomi.mi_connect_service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface IIDMServiceProcCallback extends IInterface {

    public static class Default implements IIDMServiceProcCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
        public void onAdvertisingResult(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
        public void onBlockReceived(byte[] bArr, byte[] bArr2) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
        public void onBlockSendResult(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
        public void onConfigurationReceived(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
        public void onConnectServiceStatus(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
        public void onNotifyEventResponse(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
        public void onOobInfoCreatedResult(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
        public void onRequest(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
        public void onRpcChannelConnected(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
        public void onRpcChannelDisconnected(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
        public void onServiceChanged(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
        public void onSetEventCallback(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
        public void onSubscribeEventStatus(byte[] bArr) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IIDMServiceProcCallback {
        private static final String DESCRIPTOR = "com.xiaomi.mi_connect_service.IIDMServiceProcCallback";
        static final int TRANSACTION_onAdvertisingResult = 3;
        static final int TRANSACTION_onBlockReceived = 10;
        static final int TRANSACTION_onBlockSendResult = 9;
        static final int TRANSACTION_onConfigurationReceived = 11;
        static final int TRANSACTION_onConnectServiceStatus = 2;
        static final int TRANSACTION_onNotifyEventResponse = 7;
        static final int TRANSACTION_onOobInfoCreatedResult = 8;
        static final int TRANSACTION_onRequest = 1;
        static final int TRANSACTION_onRpcChannelConnected = 12;
        static final int TRANSACTION_onRpcChannelDisconnected = 13;
        static final int TRANSACTION_onServiceChanged = 5;
        static final int TRANSACTION_onSetEventCallback = 4;
        static final int TRANSACTION_onSubscribeEventStatus = 6;

        public static class Proxy implements IIDMServiceProcCallback {
            public static IIDMServiceProcCallback sDefaultImpl;
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

            @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
            public void onAdvertisingResult(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(3, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onAdvertisingResult(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
            public void onBlockReceived(byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeByteArray(bArr2);
                    if (this.mRemote.transact(10, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onBlockReceived(bArr, bArr2);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
            public void onBlockSendResult(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(9, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onBlockSendResult(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
            public void onConfigurationReceived(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(11, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onConfigurationReceived(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
            public void onConnectServiceStatus(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(2, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onConnectServiceStatus(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
            public void onNotifyEventResponse(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(7, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onNotifyEventResponse(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
            public void onOobInfoCreatedResult(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(8, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onOobInfoCreatedResult(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
            public void onRequest(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onRequest(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
            public void onRpcChannelConnected(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(12, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onRpcChannelConnected(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
            public void onRpcChannelDisconnected(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(13, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onRpcChannelDisconnected(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
            public void onServiceChanged(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(5, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onServiceChanged(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
            public void onSetEventCallback(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(4, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSetEventCallback(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMServiceProcCallback
            public void onSubscribeEventStatus(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(6, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSubscribeEventStatus(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IIDMServiceProcCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IIDMServiceProcCallback)) ? new Proxy(iBinder) : (IIDMServiceProcCallback) iInterfaceQueryLocalInterface;
        }

        public static IIDMServiceProcCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IIDMServiceProcCallback iIDMServiceProcCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iIDMServiceProcCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iIDMServiceProcCallback;
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
                    onRequest(parcel.createByteArray());
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    onConnectServiceStatus(parcel.createByteArray());
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    onAdvertisingResult(parcel.createByteArray());
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    onSetEventCallback(parcel.createByteArray());
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    onServiceChanged(parcel.createByteArray());
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    onSubscribeEventStatus(parcel.createByteArray());
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    onNotifyEventResponse(parcel.createByteArray());
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    onOobInfoCreatedResult(parcel.createByteArray());
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    onBlockSendResult(parcel.createByteArray());
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    onBlockReceived(parcel.createByteArray(), parcel.createByteArray());
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    onConfigurationReceived(parcel.createByteArray());
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    onRpcChannelConnected(parcel.createByteArray());
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    onRpcChannelDisconnected(parcel.createByteArray());
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void onAdvertisingResult(byte[] bArr) throws RemoteException;

    void onBlockReceived(byte[] bArr, byte[] bArr2) throws RemoteException;

    void onBlockSendResult(byte[] bArr) throws RemoteException;

    void onConfigurationReceived(byte[] bArr) throws RemoteException;

    void onConnectServiceStatus(byte[] bArr) throws RemoteException;

    void onNotifyEventResponse(byte[] bArr) throws RemoteException;

    void onOobInfoCreatedResult(byte[] bArr) throws RemoteException;

    void onRequest(byte[] bArr) throws RemoteException;

    void onRpcChannelConnected(byte[] bArr) throws RemoteException;

    void onRpcChannelDisconnected(byte[] bArr) throws RemoteException;

    void onServiceChanged(byte[] bArr) throws RemoteException;

    void onSetEventCallback(byte[] bArr) throws RemoteException;

    void onSubscribeEventStatus(byte[] bArr) throws RemoteException;
}
