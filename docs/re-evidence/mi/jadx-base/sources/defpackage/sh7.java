package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface sh7 extends IInterface {

    public static abstract class a extends Binder implements sh7 {
        static final int TRANSACTION_dismissPairingCode = 8;
        static final int TRANSACTION_onBindFailure = 2;
        static final int TRANSACTION_onBindSuccess = 1;
        static final int TRANSACTION_onConnectFailure = 4;
        static final int TRANSACTION_onConnectSuccess = 3;
        static final int TRANSACTION_onPairingFailure = 6;
        static final int TRANSACTION_onPairingSuccess = 5;
        static final int TRANSACTION_showPairingCode = 7;

        /* JADX INFO: renamed from: sh7$a$a, reason: collision with other inner class name */
        public static class C1104a implements sh7 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f33633a;

            public C1104a(IBinder iBinder) {
                this.f33633a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f33633a;
            }

            @Override // defpackage.sh7
            public void dismissPairingCode() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.remote.EcoBindDeviceCallback");
                    this.f33633a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.sh7
            public void onBindFailure(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.remote.EcoBindDeviceCallback");
                    parcelObtain.writeInt(i);
                    this.f33633a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.sh7
            public void onBindSuccess(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.remote.EcoBindDeviceCallback");
                    parcelObtain.writeString(str);
                    this.f33633a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.sh7
            public void onConnectFailure(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.remote.EcoBindDeviceCallback");
                    parcelObtain.writeInt(i);
                    this.f33633a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.sh7
            public void onConnectSuccess() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.remote.EcoBindDeviceCallback");
                    this.f33633a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.sh7
            public void onPairingFailure(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.remote.EcoBindDeviceCallback");
                    parcelObtain.writeInt(i);
                    this.f33633a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.sh7
            public void onPairingSuccess(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.remote.EcoBindDeviceCallback");
                    parcelObtain.writeByteArray(bArr);
                    this.f33633a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.sh7
            public void showPairingCode(String str, bv7 bv7Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.remote.EcoBindDeviceCallback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(bv7Var);
                    this.f33633a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.eco.device.manager.remote.EcoBindDeviceCallback");
        }

        public static sh7 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.eco.device.manager.remote.EcoBindDeviceCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof sh7)) ? new C1104a(iBinder) : (sh7) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.eco.device.manager.remote.EcoBindDeviceCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.eco.device.manager.remote.EcoBindDeviceCallback");
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
                    showPairingCode(parcel.readString(), bv7.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    dismissPairingCode();
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

    void showPairingCode(String str, bv7 bv7Var) throws RemoteException;
}
