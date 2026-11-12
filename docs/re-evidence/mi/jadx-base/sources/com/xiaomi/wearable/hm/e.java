package com.xiaomi.wearable.hm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface e extends IInterface {

    public static abstract class a extends Binder implements e {
        static final int TRANSACTION_onDataSyncFinish = 1;
        static final int TRANSACTION_onOsaDataSyncFinish = 2;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.e$a$a, reason: collision with other inner class name */
        public static class C0873a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14395a;

            public C0873a(IBinder iBinder) {
                this.f14395a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14395a;
            }

            @Override // com.xiaomi.wearable.hm.e
            public void onDataSyncFinish() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.DailyDataSyncCallback");
                    this.f14395a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.e
            public void onOsaDataSyncFinish() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.DailyDataSyncCallback");
                    this.f14395a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.hm.DailyDataSyncCallback");
        }

        public static e asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.DailyDataSyncCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e)) ? new C0873a(iBinder) : (e) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.DailyDataSyncCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.DailyDataSyncCallback");
                return true;
            }
            if (i == 1) {
                onDataSyncFinish();
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onOsaDataSyncFinish();
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onDataSyncFinish() throws RemoteException;

    void onOsaDataSyncFinish() throws RemoteException;
}
