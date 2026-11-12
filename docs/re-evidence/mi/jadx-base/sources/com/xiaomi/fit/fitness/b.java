package com.xiaomi.fit.fitness;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        static final int TRANSACTION_onSyncResult = 1;

        /* JADX INFO: renamed from: com.xiaomi.fit.fitness.b$a$a, reason: collision with other inner class name */
        public static class C0364a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f11304a;

            public C0364a(IBinder iBinder) {
                this.f11304a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11304a;
            }

            @Override // com.xiaomi.fit.fitness.b
            public void onSyncResult(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessRemoteSyncCallback");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f11304a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fit.fitness.FitnessRemoteSyncCallback");
        }

        public static b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fit.fitness.FitnessRemoteSyncCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0364a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fit.fitness.FitnessRemoteSyncCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fit.fitness.FitnessRemoteSyncCallback");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onSyncResult(parcel.readInt() != 0);
            parcel2.writeNoException();
            return true;
        }
    }

    void onSyncResult(boolean z) throws RemoteException;
}
