package com.xiaomi.fitness.eco.device.contact.export;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        static final int TRANSACTION_onSyncError = 2;
        static final int TRANSACTION_onSyncSuccess = 1;

        /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.contact.export.b$a$a, reason: collision with other inner class name */
        public static class C0545a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f12071a;

            public C0545a(IBinder iBinder) {
                this.f12071a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12071a;
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.b
            public void onSyncError(String str, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.contact.export.IEcoDeviceSyncCallback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.f12071a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.b
            public void onSyncSuccess(String str, int i, EcoSyncResult ecoSyncResult) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.contact.export.IEcoDeviceSyncCallback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    C0546b.d(parcelObtain, ecoSyncResult, 0);
                    this.f12071a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.eco.device.contact.export.IEcoDeviceSyncCallback");
        }

        public static b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.eco.device.contact.export.IEcoDeviceSyncCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0545a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.eco.device.contact.export.IEcoDeviceSyncCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.eco.device.contact.export.IEcoDeviceSyncCallback");
                return true;
            }
            if (i == 1) {
                onSyncSuccess(parcel.readString(), parcel.readInt(), (EcoSyncResult) C0546b.c(parcel, EcoSyncResult.INSTANCE));
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onSyncError(parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.contact.export.b$b, reason: collision with other inner class name */
    public static class C0546b {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void onSyncError(String str, int i, int i2) throws RemoteException;

    void onSyncSuccess(String str, int i, EcoSyncResult ecoSyncResult) throws RemoteException;
}
