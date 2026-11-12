package com.xiaomi.smarthome.core.server.bluetooth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface IClassicBtRequest extends IInterface {

    public static class Default implements IClassicBtRequest {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
        public boolean connectBluetoothProfile(String str, int i) throws RemoteException {
            return false;
        }

        @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
        public boolean connectClassicBTSocket(String str, String str2) throws RemoteException {
            return false;
        }

        @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
        public void createClassicBTService() throws RemoteException {
        }

        @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
        public void destroy() throws RemoteException {
        }

        @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
        public boolean disconnectBluetoothProfile(String str, int i) throws RemoteException {
            return false;
        }

        @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
        public void disconnectClassicBtSocket() throws RemoteException {
        }

        @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
        public int getBluetoothProfileState(String str, int i) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
        public void prepareBluetoothProfile(int i, IProfileProxyPrepareCallback iProfileProxyPrepareCallback) throws RemoteException {
        }

        @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
        public boolean write(byte[] bArr) throws RemoteException {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements IClassicBtRequest {
        private static final String DESCRIPTOR = "com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest";
        static final int TRANSACTION_connectBluetoothProfile = 6;
        static final int TRANSACTION_connectClassicBTSocket = 2;
        static final int TRANSACTION_createClassicBTService = 1;
        static final int TRANSACTION_destroy = 9;
        static final int TRANSACTION_disconnectBluetoothProfile = 7;
        static final int TRANSACTION_disconnectClassicBtSocket = 3;
        static final int TRANSACTION_getBluetoothProfileState = 8;
        static final int TRANSACTION_prepareBluetoothProfile = 5;
        static final int TRANSACTION_write = 4;

        public static class Proxy implements IClassicBtRequest {
            public static IClassicBtRequest sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
            public boolean connectBluetoothProfile(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().connectBluetoothProfile(str, i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
            public boolean connectClassicBTSocket(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().connectClassicBTSocket(str, str2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
            public void createClassicBTService() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().createClassicBTService();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
            public void destroy() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(9, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().destroy();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
            public boolean disconnectBluetoothProfile(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(7, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().disconnectBluetoothProfile(str, i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
            public void disconnectClassicBtSocket() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().disconnectClassicBtSocket();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
            public int getBluetoothProfileState(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(8, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getBluetoothProfileState(str, i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
            public void prepareBluetoothProfile(int i, IProfileProxyPrepareCallback iProfileProxyPrepareCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongBinder(iProfileProxyPrepareCallback != null ? iProfileProxyPrepareCallback.asBinder() : null);
                    if (this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().prepareBluetoothProfile(i, iProfileProxyPrepareCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IClassicBtRequest
            public boolean write(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().write(bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IClassicBtRequest asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IClassicBtRequest)) ? new Proxy(iBinder) : (IClassicBtRequest) iInterfaceQueryLocalInterface;
        }

        public static IClassicBtRequest getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IClassicBtRequest iClassicBtRequest) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iClassicBtRequest == null) {
                return false;
            }
            Proxy.sDefaultImpl = iClassicBtRequest;
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
                    createClassicBTService();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zConnectClassicBTSocket = connectClassicBTSocket(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zConnectClassicBTSocket ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    disconnectClassicBtSocket();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zWrite = write(parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(zWrite ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    prepareBluetoothProfile(parcel.readInt(), IProfileProxyPrepareCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zConnectBluetoothProfile = connectBluetoothProfile(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zConnectBluetoothProfile ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zDisconnectBluetoothProfile = disconnectBluetoothProfile(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zDisconnectBluetoothProfile ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    int bluetoothProfileState = getBluetoothProfileState(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(bluetoothProfileState);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    destroy();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    boolean connectBluetoothProfile(String str, int i) throws RemoteException;

    boolean connectClassicBTSocket(String str, String str2) throws RemoteException;

    void createClassicBTService() throws RemoteException;

    void destroy() throws RemoteException;

    boolean disconnectBluetoothProfile(String str, int i) throws RemoteException;

    void disconnectClassicBtSocket() throws RemoteException;

    int getBluetoothProfileState(String str, int i) throws RemoteException;

    void prepareBluetoothProfile(int i, IProfileProxyPrepareCallback iProfileProxyPrepareCallback) throws RemoteException;

    boolean write(byte[] bArr) throws RemoteException;
}
