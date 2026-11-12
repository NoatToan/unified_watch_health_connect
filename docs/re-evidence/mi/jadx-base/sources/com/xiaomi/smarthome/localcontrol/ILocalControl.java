package com.xiaomi.smarthome.localcontrol;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface ILocalControl extends IInterface {

    public static class Default implements ILocalControl {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
        public void changeHome(String str) throws RemoteException {
        }

        @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
        public void controlDevice(String str, int i, String str2, int i2, ILCCallback iLCCallback) throws RemoteException {
        }

        @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
        public void destroy() throws RemoteException {
        }

        @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
        public void excuteLocalAutomAction(String str, ILCCallback iLCCallback) throws RemoteException {
        }

        @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
        public void getDeviceProperty(String str, int i, int i2, int i3, ILCCallback iLCCallback) throws RemoteException {
        }

        @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
        public void init(String str, String str2, ILCCallback iLCCallback) throws RemoteException {
        }

        @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
        public boolean isAcitonLocalControled(String str) throws RemoteException {
            return false;
        }

        @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
        public boolean isDeviceInControlList(String str) throws RemoteException {
            return false;
        }

        @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
        public void refreshDeviceList() throws RemoteException {
        }

        @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
        public void refreshSceneList() throws RemoteException {
        }

        @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
        public void setCommonCallback(ILCCallback iLCCallback) throws RemoteException {
        }

        @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
        public void setIDeviceCallback(ILCCallback iLCCallback) throws RemoteException {
        }

        @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
        public void setISceneCallback(ILCCallback iLCCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ILocalControl {
        private static final String DESCRIPTOR = "com.xiaomi.smarthome.localcontrol.ILocalControl";
        static final int TRANSACTION_changeHome = 13;
        static final int TRANSACTION_controlDevice = 9;
        static final int TRANSACTION_destroy = 12;
        static final int TRANSACTION_excuteLocalAutomAction = 10;
        static final int TRANSACTION_getDeviceProperty = 11;
        static final int TRANSACTION_init = 1;
        static final int TRANSACTION_isAcitonLocalControled = 8;
        static final int TRANSACTION_isDeviceInControlList = 7;
        static final int TRANSACTION_refreshDeviceList = 2;
        static final int TRANSACTION_refreshSceneList = 3;
        static final int TRANSACTION_setCommonCallback = 6;
        static final int TRANSACTION_setIDeviceCallback = 4;
        static final int TRANSACTION_setISceneCallback = 5;

        public static class Proxy implements ILocalControl {
            public static ILocalControl sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
            public void changeHome(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(13, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().changeHome(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
            public void controlDevice(String str, int i, String str2, int i2, ILCCallback iLCCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeStrongBinder(iLCCallback != null ? iLCCallback.asBinder() : null);
                    if (this.mRemote.transact(9, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().controlDevice(str, i, str2, i2, iLCCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
            public void destroy() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(12, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().destroy();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
            public void excuteLocalAutomAction(String str, ILCCallback iLCCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iLCCallback != null ? iLCCallback.asBinder() : null);
                    if (this.mRemote.transact(10, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().excuteLocalAutomAction(str, iLCCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
            public void getDeviceProperty(String str, int i, int i2, int i3, ILCCallback iLCCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeStrongBinder(iLCCallback != null ? iLCCallback.asBinder() : null);
                    if (this.mRemote.transact(11, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().getDeviceProperty(str, i, i2, i3, iLCCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
            public void init(String str, String str2, ILCCallback iLCCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongBinder(iLCCallback != null ? iLCCallback.asBinder() : null);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().init(str, str2, iLCCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
            public boolean isAcitonLocalControled(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(8, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isAcitonLocalControled(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
            public boolean isDeviceInControlList(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(7, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isDeviceInControlList(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
            public void refreshDeviceList() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().refreshDeviceList();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
            public void refreshSceneList() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().refreshSceneList();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
            public void setCommonCallback(ILCCallback iLCCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iLCCallback != null ? iLCCallback.asBinder() : null);
                    if (this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setCommonCallback(iLCCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
            public void setIDeviceCallback(ILCCallback iLCCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iLCCallback != null ? iLCCallback.asBinder() : null);
                    if (this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setIDeviceCallback(iLCCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.localcontrol.ILocalControl
            public void setISceneCallback(ILCCallback iLCCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iLCCallback != null ? iLCCallback.asBinder() : null);
                    if (this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setISceneCallback(iLCCallback);
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

        public static ILocalControl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ILocalControl)) ? new Proxy(iBinder) : (ILocalControl) iInterfaceQueryLocalInterface;
        }

        public static ILocalControl getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ILocalControl iLocalControl) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iLocalControl == null) {
                return false;
            }
            Proxy.sDefaultImpl = iLocalControl;
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
                    init(parcel.readString(), parcel.readString(), ILCCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    refreshDeviceList();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    refreshSceneList();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    setIDeviceCallback(ILCCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    setISceneCallback(ILCCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    setCommonCallback(ILCCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsDeviceInControlList = isDeviceInControlList(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsDeviceInControlList ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsAcitonLocalControled = isAcitonLocalControled(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsAcitonLocalControled ? 1 : 0);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    controlDevice(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), ILCCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    excuteLocalAutomAction(parcel.readString(), ILCCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    getDeviceProperty(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), ILCCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    destroy();
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    changeHome(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void changeHome(String str) throws RemoteException;

    void controlDevice(String str, int i, String str2, int i2, ILCCallback iLCCallback) throws RemoteException;

    void destroy() throws RemoteException;

    void excuteLocalAutomAction(String str, ILCCallback iLCCallback) throws RemoteException;

    void getDeviceProperty(String str, int i, int i2, int i3, ILCCallback iLCCallback) throws RemoteException;

    void init(String str, String str2, ILCCallback iLCCallback) throws RemoteException;

    boolean isAcitonLocalControled(String str) throws RemoteException;

    boolean isDeviceInControlList(String str) throws RemoteException;

    void refreshDeviceList() throws RemoteException;

    void refreshSceneList() throws RemoteException;

    void setCommonCallback(ILCCallback iLCCallback) throws RemoteException;

    void setIDeviceCallback(ILCCallback iLCCallback) throws RemoteException;

    void setISceneCallback(ILCCallback iLCCallback) throws RemoteException;
}
