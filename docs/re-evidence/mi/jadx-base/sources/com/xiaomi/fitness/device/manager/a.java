package com.xiaomi.fitness.device.manager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0419a extends Binder implements a {
        static final int TRANSACTION_dismissPairingCode = 8;
        static final int TRANSACTION_onBindFailure = 2;
        static final int TRANSACTION_onBindSuccess = 1;
        static final int TRANSACTION_onConnectFailure = 4;
        static final int TRANSACTION_onConnectSuccess = 3;
        static final int TRANSACTION_onPairingFailure = 6;
        static final int TRANSACTION_onPairingSuccess = 5;
        static final int TRANSACTION_onRequestDeviceFailure = 10;
        static final int TRANSACTION_onRequestDeviceSuccess = 9;
        static final int TRANSACTION_showPairingCode = 7;

        /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.a$a$a, reason: collision with other inner class name */
        public static class C0420a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f11902a;

            public C0420a(IBinder iBinder) {
                this.f11902a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11902a;
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void dismissPairingCode() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.BindDeviceCallback");
                    this.f11902a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onBindFailure(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.BindDeviceCallback");
                    parcelObtain.writeInt(i);
                    this.f11902a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onBindSuccess(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.BindDeviceCallback");
                    parcelObtain.writeString(str);
                    this.f11902a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onConnectFailure(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.BindDeviceCallback");
                    parcelObtain.writeInt(i);
                    this.f11902a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onConnectSuccess() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.BindDeviceCallback");
                    this.f11902a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onPairingFailure(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.BindDeviceCallback");
                    parcelObtain.writeInt(i);
                    this.f11902a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onPairingSuccess(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.BindDeviceCallback");
                    parcelObtain.writeByteArray(bArr);
                    this.f11902a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onRequestDeviceFailure() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.BindDeviceCallback");
                    this.f11902a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void showPairingCode(String str, e eVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.BindDeviceCallback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(eVar);
                    this.f11902a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0419a() {
            attachInterface(this, "com.xiaomi.fitness.device.manager.BindDeviceCallback");
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.device.manager.BindDeviceCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0420a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.device.manager.BindDeviceCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.device.manager.BindDeviceCallback");
                return true;
            }
            switch (i) {
                case 1:
                    onBindSuccess(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    onBindFailure(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    onConnectSuccess();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    onConnectFailure(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    onPairingSuccess(parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    onPairingFailure(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    showPairingCode(parcel.readString(), e.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    dismissPairingCode();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    onRequestDeviceSuccess();
                    parcel2.writeNoException();
                    return true;
                case 10:
                    onRequestDeviceFailure();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void dismissPairingCode() throws RemoteException;

    void onBindFailure(int i) throws RemoteException;

    void onBindSuccess(String str) throws RemoteException;

    void onConnectFailure(int i) throws RemoteException;

    void onConnectSuccess() throws RemoteException;

    void onPairingFailure(int i) throws RemoteException;

    void onPairingSuccess(byte[] bArr) throws RemoteException;

    void onRequestDeviceFailure() throws RemoteException;

    void onRequestDeviceSuccess() throws RemoteException;

    void showPairingCode(String str, e eVar) throws RemoteException;
}
