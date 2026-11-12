package com.ingenic.iwds.remotedevice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes18.dex */
public interface IRemoteDeviceAppCallback extends IInterface {

    public static abstract class Stub extends Binder implements IRemoteDeviceAppCallback {
        private static final String a = "com.ingenic.iwds.remotedevice.IRemoteDeviceAppCallback";
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;
        public static final int f = 5;
        public static final int g = 6;
        public static final int h = 7;
        public static final int i = 8;

        public static class a implements IRemoteDeviceAppCallback {
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

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceAppCallback
            public void onDoneDeleteApp(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceAppCallback
            public void onDoneInstallApp(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceAppCallback
            public void onRemoteAppInfoListAvailable(RemoteApplicationInfoList remoteApplicationInfoList) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (remoteApplicationInfoList != null) {
                        parcelObtain.writeInt(1);
                        remoteApplicationInfoList.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceAppCallback
            public void onRemoteStorageInfoAvailable(RemoteStorageInfo remoteStorageInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (remoteStorageInfo != null) {
                        parcelObtain.writeInt(1);
                        remoteStorageInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceAppCallback
            public void onResponseClearAllAppDataAndCache(int i, int i2, String str, int i3, int i4) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    this.a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceAppCallback
            public void onResponseClearAppDataOrCache(String str, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceAppCallback
            public void onResponsePkgSizeInfo(RemotePackageStats remotePackageStats, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (remotePackageStats != null) {
                        parcelObtain.writeInt(1);
                        remotePackageStats.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i);
                    this.a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceAppCallback
            public void onSendFileProgressForInstall(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.a.transact(3, parcelObtain, parcelObtain2, 0);
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

        public static IRemoteDeviceAppCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRemoteDeviceAppCallback)) ? new a(iBinder) : (IRemoteDeviceAppCallback) iInterfaceQueryLocalInterface;
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
                    onRemoteAppInfoListAvailable(parcel.readInt() != 0 ? RemoteApplicationInfoList.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(a);
                    onRemoteStorageInfoAvailable(parcel.readInt() != 0 ? RemoteStorageInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(a);
                    onSendFileProgressForInstall(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(a);
                    onDoneInstallApp(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(a);
                    onDoneDeleteApp(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(a);
                    onResponsePkgSizeInfo(parcel.readInt() != 0 ? RemotePackageStats.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(a);
                    onResponseClearAppDataOrCache(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface(a);
                    onResponseClearAllAppDataAndCache(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }
    }

    void onDoneDeleteApp(String str, int i) throws RemoteException;

    void onDoneInstallApp(String str, int i) throws RemoteException;

    void onRemoteAppInfoListAvailable(RemoteApplicationInfoList remoteApplicationInfoList) throws RemoteException;

    void onRemoteStorageInfoAvailable(RemoteStorageInfo remoteStorageInfo) throws RemoteException;

    void onResponseClearAllAppDataAndCache(int i, int i2, String str, int i3, int i4) throws RemoteException;

    void onResponseClearAppDataOrCache(String str, int i, int i2) throws RemoteException;

    void onResponsePkgSizeInfo(RemotePackageStats remotePackageStats, int i) throws RemoteException;

    void onSendFileProgressForInstall(String str, int i) throws RemoteException;
}
