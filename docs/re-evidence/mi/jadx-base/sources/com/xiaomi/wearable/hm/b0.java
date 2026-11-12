package com.xiaomi.wearable.hm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface b0 extends IInterface {

    public static abstract class a extends Binder implements b0 {
        static final int TRANSACTION_onProgress = 2;
        static final int TRANSACTION_onStart = 1;
        static final int TRANSACTION_onStop = 3;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.b0$a$a, reason: collision with other inner class name */
        public static class C0869a implements b0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14391a;

            public C0869a(IBinder iBinder) {
                this.f14391a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14391a;
            }

            @Override // com.xiaomi.wearable.hm.b0
            public void onProgress(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.SyncSkinCallback");
                    b.d(parcelObtain, huamiDataWrapper, 0);
                    this.f14391a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.b0
            public void onStart() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.SyncSkinCallback");
                    this.f14391a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.b0
            public void onStop(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.SyncSkinCallback");
                    parcelObtain.writeInt(i);
                    this.f14391a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.hm.SyncSkinCallback");
        }

        public static b0 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.SyncSkinCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b0)) ? new C0869a(iBinder) : (b0) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.SyncSkinCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.SyncSkinCallback");
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
                onStop(parcel.readInt());
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

    void onProgress(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    void onStart() throws RemoteException;

    void onStop(int i) throws RemoteException;
}
