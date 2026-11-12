package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface qt7 extends IInterface {

    public static abstract class a extends Binder implements qt7 {
        static final int TRANSACTION_addSyncResultListener = 5;
        static final int TRANSACTION_syncData = 4;
        static final int TRANSACTION_syncTheData = 3;
        static final int TRANSACTION_syncTheDataWithDevice = 2;
        static final int TRANSACTION_syncWithDevice = 1;

        /* JADX INFO: renamed from: qt7$a$a, reason: collision with other inner class name */
        public static class C1093a implements qt7 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f31825a;

            public C1093a(IBinder iBinder) {
                this.f31825a = iBinder;
            }

            @Override // defpackage.qt7
            public void addSyncResultListener(String str, pt7 pt7Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.eco.EcoFitnessSyncRemote");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(pt7Var);
                    this.f31825a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f31825a;
            }

            @Override // defpackage.qt7
            public void syncData(String str, byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.eco.EcoFitnessSyncRemote");
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeByteArray(bArr2);
                    this.f31825a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.qt7
            public void syncTheData(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.eco.EcoFitnessSyncRemote");
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeByteArray(bArr2);
                    parcelObtain.writeByteArray(bArr3);
                    this.f31825a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.qt7
            public void syncTheDataWithDevice(String str, byte[] bArr, pt7 pt7Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.eco.EcoFitnessSyncRemote");
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(pt7Var);
                    this.f31825a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.qt7
            public void syncWithDevice(String str, pt7 pt7Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.eco.EcoFitnessSyncRemote");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(pt7Var);
                    this.f31825a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fit.fitness.eco.EcoFitnessSyncRemote");
        }

        public static qt7 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fit.fitness.eco.EcoFitnessSyncRemote");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof qt7)) ? new C1093a(iBinder) : (qt7) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fit.fitness.eco.EcoFitnessSyncRemote");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fit.fitness.eco.EcoFitnessSyncRemote");
                return true;
            }
            if (i == 1) {
                syncWithDevice(parcel.readString(), pt7.a.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 2) {
                syncTheDataWithDevice(parcel.readString(), parcel.createByteArray(), pt7.a.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 3) {
                syncTheData(parcel.readString(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray());
                parcel2.writeNoException();
            } else if (i == 4) {
                syncData(parcel.readString(), parcel.createByteArray(), parcel.createByteArray());
                parcel2.writeNoException();
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                addSyncResultListener(parcel.readString(), pt7.a.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void addSyncResultListener(String str, pt7 pt7Var) throws RemoteException;

    void syncData(String str, byte[] bArr, byte[] bArr2) throws RemoteException;

    void syncTheData(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException;

    void syncTheDataWithDevice(String str, byte[] bArr, pt7 pt7Var) throws RemoteException;

    void syncWithDevice(String str, pt7 pt7Var) throws RemoteException;
}
