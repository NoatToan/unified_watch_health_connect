package com.xiaomi.fitness.device.manager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface h extends IInterface {

    public static abstract class a extends Binder implements h {
        static final int TRANSACTION_onBind = 2;
        static final int TRANSACTION_onConnectFailure = 5;
        static final int TRANSACTION_onConnectStart = 4;
        static final int TRANSACTION_onConnectSuccess = 6;
        static final int TRANSACTION_onDestroy = 3;
        static final int TRANSACTION_onDisconnect = 7;
        static final int TRANSACTION_onInIt = 1;
        static final int TRANSACTION_onSpecificDeviceConnectFailure = 11;
        static final int TRANSACTION_onSpecificDeviceConnectStart = 8;
        static final int TRANSACTION_onSpecificDeviceConnectSuccess = 9;
        static final int TRANSACTION_onSpecificDeviceDisconnect = 10;

        /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.h$a$a, reason: collision with other inner class name */
        public static class C0429a implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f11922a;

            public C0429a(IBinder iBinder) {
                this.f11922a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11922a;
            }

            @Override // com.xiaomi.fitness.device.manager.h
            public void onBind(String str, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.OnDeviceStatusRemoteListener");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f11922a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.h
            public void onConnectFailure(String str, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.OnDeviceStatusRemoteListener");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.f11922a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.h
            public void onConnectStart(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.OnDeviceStatusRemoteListener");
                    parcelObtain.writeString(str);
                    this.f11922a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.h
            public void onConnectSuccess(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.OnDeviceStatusRemoteListener");
                    parcelObtain.writeString(str);
                    this.f11922a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.h
            public void onDestroy(String str, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.OnDeviceStatusRemoteListener");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f11922a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.h
            public void onDisconnect(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.OnDeviceStatusRemoteListener");
                    parcelObtain.writeString(str);
                    this.f11922a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.h
            public void onInIt(String str, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.OnDeviceStatusRemoteListener");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f11922a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.h
            public void onSpecificDeviceConnectFailure(String str, String str2, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.OnDeviceStatusRemoteListener");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    this.f11922a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.h
            public void onSpecificDeviceConnectStart(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.OnDeviceStatusRemoteListener");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f11922a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.h
            public void onSpecificDeviceConnectSuccess(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.OnDeviceStatusRemoteListener");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f11922a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.h
            public void onSpecificDeviceDisconnect(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.OnDeviceStatusRemoteListener");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f11922a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.device.manager.OnDeviceStatusRemoteListener");
        }

        public static h asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.device.manager.OnDeviceStatusRemoteListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof h)) ? new C0429a(iBinder) : (h) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.device.manager.OnDeviceStatusRemoteListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.device.manager.OnDeviceStatusRemoteListener");
                return true;
            }
            switch (i) {
                case 1:
                    onInIt(parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    onBind(parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    onDestroy(parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    onConnectStart(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    onConnectFailure(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    onConnectSuccess(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    onDisconnect(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    onSpecificDeviceConnectStart(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    onSpecificDeviceConnectSuccess(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    onSpecificDeviceDisconnect(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    onSpecificDeviceConnectFailure(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void onBind(String str, boolean z) throws RemoteException;

    void onConnectFailure(String str, int i, int i2) throws RemoteException;

    void onConnectStart(String str) throws RemoteException;

    void onConnectSuccess(String str) throws RemoteException;

    void onDestroy(String str, boolean z) throws RemoteException;

    void onDisconnect(String str) throws RemoteException;

    void onInIt(String str, boolean z) throws RemoteException;

    void onSpecificDeviceConnectFailure(String str, String str2, int i) throws RemoteException;

    void onSpecificDeviceConnectStart(String str, String str2) throws RemoteException;

    void onSpecificDeviceConnectSuccess(String str, String str2) throws RemoteException;

    void onSpecificDeviceDisconnect(String str, String str2) throws RemoteException;
}
