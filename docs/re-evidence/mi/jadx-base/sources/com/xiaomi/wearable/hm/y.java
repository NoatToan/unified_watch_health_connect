package com.xiaomi.wearable.hm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface y extends IInterface {

    public static abstract class a extends Binder implements y {
        static final int TRANSACTION_onFinish = 3;
        static final int TRANSACTION_onProgress = 2;
        static final int TRANSACTION_onStart = 1;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.y$a$a, reason: collision with other inner class name */
        public static class C0893a implements y {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14415a;

            public C0893a(IBinder iBinder) {
                this.f14415a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14415a;
            }

            @Override // com.xiaomi.wearable.hm.y
            public void onFinish(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.SyncPaiCallback");
                    b.d(parcelObtain, huamiDataWrapper, 0);
                    this.f14415a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.y
            public void onProgress(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.SyncPaiCallback");
                    b.d(parcelObtain, huamiDataWrapper, 0);
                    this.f14415a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.y
            public void onStart() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.SyncPaiCallback");
                    this.f14415a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.hm.SyncPaiCallback");
        }

        public static y asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.SyncPaiCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof y)) ? new C0893a(iBinder) : (y) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.SyncPaiCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.SyncPaiCallback");
                return true;
            }
            if (i == 1) {
                onStart();
                parcel2.writeNoException();
            } else if (i == 2) {
                onProgress((HuamiDataWrapper) b.c(parcel, HuamiDataWrapper.INSTANCE));
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onFinish((HuamiDataWrapper) b.c(parcel, HuamiDataWrapper.INSTANCE));
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

    void onFinish(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    void onProgress(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    void onStart() throws RemoteException;
}
