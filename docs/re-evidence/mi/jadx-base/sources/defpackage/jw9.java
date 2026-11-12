package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface jw9 extends IInterface {

    public static abstract class a extends Binder implements jw9 {
        static final int TRANSACTION_syncTheData = 3;
        static final int TRANSACTION_syncTheDataWithDevice = 2;
        static final int TRANSACTION_syncWithDevice = 1;
        static final int TRANSACTION_testDeviceSync = 6;
        static final int TRANSACTION_triggerDataSync = 4;
        static final int TRANSACTION_triggerDataSyncByWidget = 5;

        /* JADX INFO: renamed from: jw9$a$a, reason: collision with other inner class name */
        public static class C0986a implements jw9 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f23198a;

            public C0986a(IBinder iBinder) {
                this.f23198a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f23198a;
            }

            @Override // defpackage.jw9
            public void syncTheData(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessSyncRemote");
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeByteArray(bArr2);
                    parcelObtain.writeByteArray(bArr3);
                    this.f23198a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.jw9
            public void syncTheDataWithDevice(String str, byte[] bArr, iw9 iw9Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessSyncRemote");
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(iw9Var);
                    this.f23198a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.jw9
            public void syncWithDevice(String str, iw9 iw9Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessSyncRemote");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iw9Var);
                    this.f23198a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.jw9
            public void testDeviceSync(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessSyncRemote");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f23198a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.jw9
            public void triggerDataSync(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessSyncRemote");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f23198a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.jw9
            public void triggerDataSyncByWidget(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessSyncRemote");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f23198a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fit.fitness.FitnessSyncRemote");
        }

        public static jw9 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fit.fitness.FitnessSyncRemote");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof jw9)) ? new C0986a(iBinder) : (jw9) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fit.fitness.FitnessSyncRemote");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fit.fitness.FitnessSyncRemote");
                return true;
            }
            switch (i) {
                case 1:
                    syncWithDevice(parcel.readString(), iw9.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    syncTheDataWithDevice(parcel.readString(), parcel.createByteArray(), iw9.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    syncTheData(parcel.readString(), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    triggerDataSync(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    triggerDataSyncByWidget(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    testDeviceSync(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void syncTheData(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) throws RemoteException;

    void syncTheDataWithDevice(String str, byte[] bArr, iw9 iw9Var) throws RemoteException;

    void syncWithDevice(String str, iw9 iw9Var) throws RemoteException;

    void testDeviceSync(boolean z) throws RemoteException;

    void triggerDataSync(boolean z) throws RemoteException;

    void triggerDataSyncByWidget(boolean z) throws RemoteException;
}
