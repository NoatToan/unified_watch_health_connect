package com.xiaomi.wearable.hm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface j extends IInterface {

    public static abstract class a extends Binder implements j {
        static final int TRANSACTION_onData = 3;
        static final int TRANSACTION_onFinish = 4;
        static final int TRANSACTION_onProgress = 2;
        static final int TRANSACTION_onStart = 1;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.j$a$a, reason: collision with other inner class name */
        public static class C0878a implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14400a;

            public C0878a(IBinder iBinder) {
                this.f14400a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14400a;
            }

            @Override // com.xiaomi.wearable.hm.j
            public void onData(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HMSportDataCallback");
                    b.d(parcelObtain, huamiDataWrapper, 0);
                    this.f14400a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.j
            public void onFinish(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HMSportDataCallback");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14400a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.j
            public void onProgress(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HMSportDataCallback");
                    b.d(parcelObtain, huamiDataWrapper, 0);
                    this.f14400a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.j
            public void onStart() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HMSportDataCallback");
                    this.f14400a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.hm.HMSportDataCallback");
        }

        public static j asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.HMSportDataCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof j)) ? new C0878a(iBinder) : (j) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.HMSportDataCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.HMSportDataCallback");
                return true;
            }
            if (i == 1) {
                onStart();
                parcel2.writeNoException();
            } else if (i == 2) {
                onProgress((HuamiDataWrapper) b.c(parcel, HuamiDataWrapper.INSTANCE));
                parcel2.writeNoException();
            } else if (i == 3) {
                onData((HuamiDataWrapper) b.c(parcel, HuamiDataWrapper.INSTANCE));
                parcel2.writeNoException();
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onFinish(parcel.readInt() != 0);
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

    void onData(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    void onFinish(boolean z) throws RemoteException;

    void onProgress(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    void onStart() throws RemoteException;
}
