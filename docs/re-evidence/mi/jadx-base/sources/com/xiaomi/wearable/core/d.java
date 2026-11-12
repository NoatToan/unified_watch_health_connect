package com.xiaomi.wearable.core;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface d extends IInterface {

    public static abstract class a extends Binder implements d {
        static final int TRANSACTION_onConnectFailure = 3;
        static final int TRANSACTION_onConnectStart = 1;
        static final int TRANSACTION_onConnectSuccess = 2;
        static final int TRANSACTION_onDeviceFound = 6;
        static final int TRANSACTION_onDeviceLost = 5;
        static final int TRANSACTION_onDisconnect = 4;

        /* JADX INFO: renamed from: com.xiaomi.wearable.core.d$a$a, reason: collision with other inner class name */
        public static class C0862a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14383a;

            public C0862a(IBinder iBinder) {
                this.f14383a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14383a;
            }

            @Override // com.xiaomi.wearable.core.d
            public void onConnectFailure(String str, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IDeviceStateListener");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.f14383a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.d
            public void onConnectStart(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IDeviceStateListener");
                    parcelObtain.writeString(str);
                    this.f14383a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.d
            public void onConnectSuccess(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IDeviceStateListener");
                    parcelObtain.writeString(str);
                    this.f14383a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.d
            public void onDeviceFound(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IDeviceStateListener");
                    parcelObtain.writeString(str);
                    this.f14383a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.d
            public void onDeviceLost(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IDeviceStateListener");
                    parcelObtain.writeString(str);
                    this.f14383a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.d
            public void onDisconnect(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IDeviceStateListener");
                    parcelObtain.writeString(str);
                    this.f14383a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.core.IDeviceStateListener");
        }

        public static d asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.core.IDeviceStateListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) ? new C0862a(iBinder) : (d) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.core.IDeviceStateListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.core.IDeviceStateListener");
                return true;
            }
            switch (i) {
                case 1:
                    onConnectStart(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    onConnectSuccess(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    onConnectFailure(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    onDisconnect(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    onDeviceLost(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    onDeviceFound(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void onConnectFailure(String str, int i, int i2) throws RemoteException;

    void onConnectStart(String str) throws RemoteException;

    void onConnectSuccess(String str) throws RemoteException;

    void onDeviceFound(String str) throws RemoteException;

    void onDeviceLost(String str) throws RemoteException;

    void onDisconnect(String str) throws RemoteException;
}
