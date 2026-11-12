package com.xiaomi.wearable.hm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface h extends IInterface {

    public static abstract class a extends Binder implements h {
        static final int TRANSACTION_onProgress = 2;
        static final int TRANSACTION_onStart = 1;
        static final int TRANSACTION_onStop = 3;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.h$a$a, reason: collision with other inner class name */
        public static class C0876a implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14398a;

            public C0876a(IBinder iBinder) {
                this.f14398a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14398a;
            }

            @Override // com.xiaomi.wearable.hm.h
            public void onProgress(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HMDataCallback");
                    b.d(parcelObtain, huamiDataWrapper, 0);
                    this.f14398a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.h
            public void onStart() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HMDataCallback");
                    this.f14398a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.h
            public void onStop() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HMDataCallback");
                    this.f14398a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.hm.HMDataCallback");
        }

        public static h asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.HMDataCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof h)) ? new C0876a(iBinder) : (h) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.HMDataCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.HMDataCallback");
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
                onStop();
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

    void onStop() throws RemoteException;
}
