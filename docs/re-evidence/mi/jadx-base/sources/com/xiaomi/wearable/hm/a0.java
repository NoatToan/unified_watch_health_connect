package com.xiaomi.wearable.hm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface a0 extends IInterface {

    public static abstract class a extends Binder implements a0 {
        static final int TRANSACTION_onPressureData = 2;
        static final int TRANSACTION_onPressureStart = 1;
        static final int TRANSACTION_onPressureStop = 3;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.a0$a$a, reason: collision with other inner class name */
        public static class C0866a implements a0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14389a;

            public C0866a(IBinder iBinder) {
                this.f14389a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14389a;
            }

            @Override // com.xiaomi.wearable.hm.a0
            public void onPressureData(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.SyncPressureDataSingleCallback");
                    parcelObtain.writeString(str);
                    this.f14389a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.a0
            public void onPressureStart() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.SyncPressureDataSingleCallback");
                    this.f14389a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.a0
            public void onPressureStop(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.SyncPressureDataSingleCallback");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14389a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.hm.SyncPressureDataSingleCallback");
        }

        public static a0 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.SyncPressureDataSingleCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a0)) ? new C0866a(iBinder) : (a0) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.SyncPressureDataSingleCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.SyncPressureDataSingleCallback");
                return true;
            }
            if (i == 1) {
                onPressureStart();
                parcel2.writeNoException();
            } else if (i == 2) {
                onPressureData(parcel.readString());
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onPressureStop(parcel.readInt() != 0);
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onPressureData(String str) throws RemoteException;

    void onPressureStart() throws RemoteException;

    void onPressureStop(boolean z) throws RemoteException;
}
