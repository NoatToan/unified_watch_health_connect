package com.xiaomi.fitness.device.contact.export;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.contact.export.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0414a extends Binder implements a {
        static final int TRANSACTION_onSyncError = 2;
        static final int TRANSACTION_onSyncSuccess = 1;

        /* JADX INFO: renamed from: com.xiaomi.fitness.device.contact.export.a$a$a, reason: collision with other inner class name */
        public static class C0415a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f11888a;

            public C0415a(IBinder iBinder) {
                this.f11888a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11888a;
            }

            @Override // com.xiaomi.fitness.device.contact.export.a
            public void onSyncError(String str, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.contact.export.IDeviceSyncCallback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.f11888a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.a
            public void onSyncSuccess(String str, int i, SyncResult syncResult) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.contact.export.IDeviceSyncCallback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    b.d(parcelObtain, syncResult, 0);
                    this.f11888a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0414a() {
            attachInterface(this, "com.xiaomi.fitness.device.contact.export.IDeviceSyncCallback");
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.device.contact.export.IDeviceSyncCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0415a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.device.contact.export.IDeviceSyncCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.device.contact.export.IDeviceSyncCallback");
                return true;
            }
            if (i == 1) {
                onSyncSuccess(parcel.readString(), parcel.readInt(), (SyncResult) b.c(parcel, SyncResult.INSTANCE));
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

    public static class b {
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

    void onSyncSuccess(String str, int i, SyncResult syncResult) throws RemoteException;
}
