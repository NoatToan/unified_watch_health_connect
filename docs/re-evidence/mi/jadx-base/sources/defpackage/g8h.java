package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface g8h extends IInterface {

    public static abstract class a extends Binder implements g8h {
        static final int TRANSACTION_onBind = 2;
        static final int TRANSACTION_onConnectFailure = 5;
        static final int TRANSACTION_onConnectStart = 4;
        static final int TRANSACTION_onConnectSuccess = 6;
        static final int TRANSACTION_onDestroy = 3;
        static final int TRANSACTION_onDisconnect = 7;
        static final int TRANSACTION_onInIt = 1;

        /* JADX INFO: renamed from: g8h$a$a, reason: collision with other inner class name */
        public static class C0941a implements g8h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f18724a;

            public C0941a(IBinder iBinder) {
                this.f18724a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18724a;
            }

            @Override // defpackage.g8h
            public void onBind(String str, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusRemoteListener");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f18724a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.g8h
            public void onConnectFailure(String str, String str2, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusRemoteListener");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.f18724a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.g8h
            public void onConnectStart(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusRemoteListener");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f18724a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.g8h
            public void onConnectSuccess(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusRemoteListener");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f18724a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.g8h
            public void onDestroy(String str, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusRemoteListener");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f18724a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.g8h
            public void onDisconnect(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusRemoteListener");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f18724a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.g8h
            public void onInIt(String str, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusRemoteListener");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f18724a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusRemoteListener");
        }

        public static g8h asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusRemoteListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof g8h)) ? new C0941a(iBinder) : (g8h) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusRemoteListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusRemoteListener");
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
                    onConnectStart(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    onConnectFailure(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    onConnectSuccess(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    onDisconnect(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void onBind(String str, boolean z) throws RemoteException;

    void onConnectFailure(String str, String str2, int i, int i2) throws RemoteException;

    void onConnectStart(String str, String str2) throws RemoteException;

    void onConnectSuccess(String str, String str2) throws RemoteException;

    void onDestroy(String str, boolean z) throws RemoteException;

    void onDisconnect(String str, String str2) throws RemoteException;

    void onInIt(String str, boolean z) throws RemoteException;
}
