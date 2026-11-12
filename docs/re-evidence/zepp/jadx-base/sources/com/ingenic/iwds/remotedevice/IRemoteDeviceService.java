package com.ingenic.iwds.remotedevice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes18.dex */
public interface IRemoteDeviceService extends IInterface {

    public static abstract class Stub extends Binder implements IRemoteDeviceService {
        private static final String a = "com.ingenic.iwds.remotedevice.IRemoteDeviceService";
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;
        public static final int f = 5;
        public static final int g = 6;
        public static final int h = 7;
        public static final int i = 8;
        public static final int j = 9;
        public static final int k = 10;
        public static final int l = 11;
        public static final int m = 12;
        public static final int n = 13;
        public static final int o = 14;
        public static final int p = 15;
        public static final int q = 16;
        public static final int r = 17;
        public static final int s = 18;
        public static final int t = 19;
        public static final int u = 20;

        public static class a implements IRemoteDeviceService {
            private IBinder a;

            public a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            public String d() {
                return Stub.a;
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
            public boolean registerAppListener(String str, IRemoteDeviceAppCallback iRemoteDeviceAppCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iRemoteDeviceAppCallback != null ? iRemoteDeviceAppCallback.asBinder() : null);
                    this.a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
            public boolean registerProcessListener(String str, IRemoteDeviceProcessCallback iRemoteDeviceProcessCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iRemoteDeviceProcessCallback != null ? iRemoteDeviceProcessCallback.asBinder() : null);
                    this.a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
            public boolean registerSettingListener(String str, IRemoteDeviceSettingCallback iRemoteDeviceSettingCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iRemoteDeviceSettingCallback != null ? iRemoteDeviceSettingCallback.asBinder() : null);
                    this.a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
            public boolean registerStatusListener(String str, IRemoteDeviceStatusCallback iRemoteDeviceStatusCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iRemoteDeviceStatusCallback != null ? iRemoteDeviceStatusCallback.asBinder() : null);
                    this.a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
            public void requestClearAllAppDataAndCache(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    this.a.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
            public void requestClearAppDataOrCache(String str, String str2, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    this.a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
            public void requestDeleteApp(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
            public void requestDoSetting(String str, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.a.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
            public void requestGetAppList(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    this.a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
            public void requestGetSetting(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.a.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
            public void requestGetStorageInfo(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    this.a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
            public void requestInstallApp(String str, String str2, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
            public void requestKillProcess(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.a.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
            public void requestPkgSizeInfo(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.a.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
            public void requestRunningAppProcessInfo(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    this.a.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
            public void requestSystemMemoryInfo(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    this.a.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
            public void unregisterAppListener(IRemoteDeviceAppCallback iRemoteDeviceAppCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeStrongBinder(iRemoteDeviceAppCallback != null ? iRemoteDeviceAppCallback.asBinder() : null);
                    this.a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
            public void unregisterProcessListener(IRemoteDeviceProcessCallback iRemoteDeviceProcessCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeStrongBinder(iRemoteDeviceProcessCallback != null ? iRemoteDeviceProcessCallback.asBinder() : null);
                    this.a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
            public void unregisterSettingListener(IRemoteDeviceSettingCallback iRemoteDeviceSettingCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeStrongBinder(iRemoteDeviceSettingCallback != null ? iRemoteDeviceSettingCallback.asBinder() : null);
                    this.a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceService
            public void unregisterStatusListener(IRemoteDeviceStatusCallback iRemoteDeviceStatusCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeStrongBinder(iRemoteDeviceStatusCallback != null ? iRemoteDeviceStatusCallback.asBinder() : null);
                    this.a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, a);
        }

        public static IRemoteDeviceService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRemoteDeviceService)) ? new a(iBinder) : (IRemoteDeviceService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1598968902) {
                parcel2.writeString(a);
                return true;
            }
            switch (i2) {
                case 1:
                    parcel.enforceInterface(a);
                    boolean zRegisterStatusListener = registerStatusListener(parcel.readString(), IRemoteDeviceStatusCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterStatusListener ? 1 : 0);
                    return true;
                case 2:
                    parcel.enforceInterface(a);
                    unregisterStatusListener(IRemoteDeviceStatusCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(a);
                    boolean zRegisterAppListener = registerAppListener(parcel.readString(), IRemoteDeviceAppCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterAppListener ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface(a);
                    unregisterAppListener(IRemoteDeviceAppCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(a);
                    boolean zRegisterProcessListener = registerProcessListener(parcel.readString(), IRemoteDeviceProcessCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterProcessListener ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface(a);
                    unregisterProcessListener(IRemoteDeviceProcessCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(a);
                    boolean zRegisterSettingListener = registerSettingListener(parcel.readString(), IRemoteDeviceSettingCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterSettingListener ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface(a);
                    unregisterSettingListener(IRemoteDeviceSettingCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface(a);
                    requestGetAppList(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface(a);
                    requestGetStorageInfo(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface(a);
                    requestInstallApp(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface(a);
                    requestDeleteApp(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface(a);
                    requestPkgSizeInfo(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface(a);
                    requestClearAppDataOrCache(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface(a);
                    requestClearAllAppDataAndCache(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface(a);
                    requestSystemMemoryInfo(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface(a);
                    requestRunningAppProcessInfo(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface(a);
                    requestKillProcess(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface(a);
                    requestDoSetting(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface(a);
                    requestGetSetting(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }
    }

    boolean registerAppListener(String str, IRemoteDeviceAppCallback iRemoteDeviceAppCallback) throws RemoteException;

    boolean registerProcessListener(String str, IRemoteDeviceProcessCallback iRemoteDeviceProcessCallback) throws RemoteException;

    boolean registerSettingListener(String str, IRemoteDeviceSettingCallback iRemoteDeviceSettingCallback) throws RemoteException;

    boolean registerStatusListener(String str, IRemoteDeviceStatusCallback iRemoteDeviceStatusCallback) throws RemoteException;

    void requestClearAllAppDataAndCache(String str) throws RemoteException;

    void requestClearAppDataOrCache(String str, String str2, int i) throws RemoteException;

    void requestDeleteApp(String str, String str2) throws RemoteException;

    void requestDoSetting(String str, int i, int i2) throws RemoteException;

    void requestGetAppList(String str) throws RemoteException;

    void requestGetSetting(String str, int i) throws RemoteException;

    void requestGetStorageInfo(String str) throws RemoteException;

    void requestInstallApp(String str, String str2, boolean z) throws RemoteException;

    void requestKillProcess(String str, String str2) throws RemoteException;

    void requestPkgSizeInfo(String str, String str2) throws RemoteException;

    void requestRunningAppProcessInfo(String str) throws RemoteException;

    void requestSystemMemoryInfo(String str) throws RemoteException;

    void unregisterAppListener(IRemoteDeviceAppCallback iRemoteDeviceAppCallback) throws RemoteException;

    void unregisterProcessListener(IRemoteDeviceProcessCallback iRemoteDeviceProcessCallback) throws RemoteException;

    void unregisterSettingListener(IRemoteDeviceSettingCallback iRemoteDeviceSettingCallback) throws RemoteException;

    void unregisterStatusListener(IRemoteDeviceStatusCallback iRemoteDeviceStatusCallback) throws RemoteException;
}
