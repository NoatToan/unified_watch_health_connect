package com.xiaomi.mi_connect_service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface IIDMClientCallback extends IInterface {

    public static class Default implements IIDMClientCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
        public void onAccountChanged(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
        public void onBlockReceived(byte[] bArr, byte[] bArr2) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
        public void onBlockSendResult(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
        public void onConfigurationReceived(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
        public void onDiscoveryResult(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
        public void onEvent(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
        public void onInvitationAccepted(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
        public void onInviteConnection(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
        public void onResponse(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
        public void onRpcChannelConnected(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
        public void onRpcChannelDisconnected(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
        public void onServiceConnectStatus(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
        public void onServiceFound(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
        public void onServiceLost(byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
        public void onSubscribeEventResult(byte[] bArr) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IIDMClientCallback {
        private static final String DESCRIPTOR = "com.xiaomi.mi_connect_service.IIDMClientCallback";
        static final int TRANSACTION_onAccountChanged = 9;
        static final int TRANSACTION_onBlockReceived = 12;
        static final int TRANSACTION_onBlockSendResult = 11;
        static final int TRANSACTION_onConfigurationReceived = 13;
        static final int TRANSACTION_onDiscoveryResult = 8;
        static final int TRANSACTION_onEvent = 3;
        static final int TRANSACTION_onInvitationAccepted = 7;
        static final int TRANSACTION_onInviteConnection = 6;
        static final int TRANSACTION_onResponse = 2;
        static final int TRANSACTION_onRpcChannelConnected = 14;
        static final int TRANSACTION_onRpcChannelDisconnected = 15;
        static final int TRANSACTION_onServiceConnectStatus = 4;
        static final int TRANSACTION_onServiceFound = 1;
        static final int TRANSACTION_onServiceLost = 5;
        static final int TRANSACTION_onSubscribeEventResult = 10;

        public static class Proxy implements IIDMClientCallback {
            public static IIDMClientCallback sDefaultImpl;
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

            @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
            public void onAccountChanged(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(9, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onAccountChanged(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
            public void onBlockReceived(byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeByteArray(bArr2);
                    if (this.mRemote.transact(12, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onBlockReceived(bArr, bArr2);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
            public void onBlockSendResult(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(11, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onBlockSendResult(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
            public void onConfigurationReceived(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(13, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onConfigurationReceived(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
            public void onDiscoveryResult(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(8, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onDiscoveryResult(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
            public void onEvent(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(3, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onEvent(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
            public void onInvitationAccepted(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(7, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onInvitationAccepted(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
            public void onInviteConnection(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(6, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onInviteConnection(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
            public void onResponse(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(2, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onResponse(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
            public void onRpcChannelConnected(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(14, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onRpcChannelConnected(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
            public void onRpcChannelDisconnected(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(15, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onRpcChannelDisconnected(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
            public void onServiceConnectStatus(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(4, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onServiceConnectStatus(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
            public void onServiceFound(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onServiceFound(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
            public void onServiceLost(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(5, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onServiceLost(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIDMClientCallback
            public void onSubscribeEventResult(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(10, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSubscribeEventResult(bArr);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IIDMClientCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IIDMClientCallback)) ? new Proxy(iBinder) : (IIDMClientCallback) iInterfaceQueryLocalInterface;
        }

        public static IIDMClientCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IIDMClientCallback iIDMClientCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iIDMClientCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iIDMClientCallback;
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
                    onServiceFound(parcel.createByteArray());
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    onResponse(parcel.createByteArray());
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    onEvent(parcel.createByteArray());
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    onServiceConnectStatus(parcel.createByteArray());
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    onServiceLost(parcel.createByteArray());
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    onInviteConnection(parcel.createByteArray());
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    onInvitationAccepted(parcel.createByteArray());
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    onDiscoveryResult(parcel.createByteArray());
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    onAccountChanged(parcel.createByteArray());
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    onSubscribeEventResult(parcel.createByteArray());
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    onBlockSendResult(parcel.createByteArray());
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    onBlockReceived(parcel.createByteArray(), parcel.createByteArray());
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    onConfigurationReceived(parcel.createByteArray());
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    onRpcChannelConnected(parcel.createByteArray());
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    onRpcChannelDisconnected(parcel.createByteArray());
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void onAccountChanged(byte[] bArr) throws RemoteException;

    void onBlockReceived(byte[] bArr, byte[] bArr2) throws RemoteException;

    void onBlockSendResult(byte[] bArr) throws RemoteException;

    void onConfigurationReceived(byte[] bArr) throws RemoteException;

    void onDiscoveryResult(byte[] bArr) throws RemoteException;

    void onEvent(byte[] bArr) throws RemoteException;

    void onInvitationAccepted(byte[] bArr) throws RemoteException;

    void onInviteConnection(byte[] bArr) throws RemoteException;

    void onResponse(byte[] bArr) throws RemoteException;

    void onRpcChannelConnected(byte[] bArr) throws RemoteException;

    void onRpcChannelDisconnected(byte[] bArr) throws RemoteException;

    void onServiceConnectStatus(byte[] bArr) throws RemoteException;

    void onServiceFound(byte[] bArr) throws RemoteException;

    void onServiceLost(byte[] bArr) throws RemoteException;

    void onSubscribeEventResult(byte[] bArr) throws RemoteException;
}
