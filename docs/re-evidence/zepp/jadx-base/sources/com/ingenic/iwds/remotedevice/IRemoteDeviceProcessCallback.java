package com.ingenic.iwds.remotedevice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes18.dex */
public interface IRemoteDeviceProcessCallback extends IInterface {

    public static abstract class Stub extends Binder implements IRemoteDeviceProcessCallback {
        private static final String a = "com.ingenic.iwds.remotedevice.IRemoteDeviceProcessCallback";
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;

        public static class a implements IRemoteDeviceProcessCallback {
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

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceProcessCallback
            public void onDoneKillProcess(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    this.a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceProcessCallback
            public void onResponseRunningAppProcessInfo(RemoteProcessInfoList remoteProcessInfoList) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (remoteProcessInfoList != null) {
                        parcelObtain.writeInt(1);
                        remoteProcessInfoList.writeToParcel(parcelObtain, 0);
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

            @Override // com.ingenic.iwds.remotedevice.IRemoteDeviceProcessCallback
            public void onResponseSystemMemoryInfo(long j, long j2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeLong(j2);
                    this.a.transact(1, parcelObtain, parcelObtain2, 0);
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

        public static IRemoteDeviceProcessCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRemoteDeviceProcessCallback)) ? new a(iBinder) : (IRemoteDeviceProcessCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(a);
                onResponseSystemMemoryInfo(parcel.readLong(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(a);
                onResponseRunningAppProcessInfo(parcel.readInt() != 0 ? RemoteProcessInfoList.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(a);
                return true;
            }
            parcel.enforceInterface(a);
            onDoneKillProcess(parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void onDoneKillProcess(String str) throws RemoteException;

    void onResponseRunningAppProcessInfo(RemoteProcessInfoList remoteProcessInfoList) throws RemoteException;

    void onResponseSystemMemoryInfo(long j, long j2) throws RemoteException;
}
