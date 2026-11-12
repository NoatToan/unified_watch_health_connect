package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface pt7 extends IInterface {

    public static abstract class a extends Binder implements pt7 {
        static final int TRANSACTION_onSyncError = 2;
        static final int TRANSACTION_onSyncSuccess = 1;

        /* JADX INFO: renamed from: pt7$a$a, reason: collision with other inner class name */
        public static class C1077a implements pt7 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f30743a;

            public C1077a(IBinder iBinder) {
                this.f30743a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30743a;
            }

            @Override // defpackage.pt7
            public void onSyncError(String str, int i, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.eco.EcoFitnessSyncListener");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    this.f30743a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.pt7
            public void onSyncSuccess(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.eco.EcoFitnessSyncListener");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f30743a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fit.fitness.eco.EcoFitnessSyncListener");
        }

        public static pt7 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fit.fitness.eco.EcoFitnessSyncListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof pt7)) ? new C1077a(iBinder) : (pt7) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fit.fitness.eco.EcoFitnessSyncListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fit.fitness.eco.EcoFitnessSyncListener");
                return true;
            }
            if (i == 1) {
                onSyncSuccess(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onSyncError(parcel.readString(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onSyncError(String str, int i, String str2) throws RemoteException;

    void onSyncSuccess(String str, int i) throws RemoteException;
}
