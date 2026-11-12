package com.xiaomi.wearable.hm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface k extends IInterface {

    public static abstract class a extends Binder implements k {
        static final int TRANSACTION_onSportCommand = 1;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.k$a$a, reason: collision with other inner class name */
        public static class C0879a implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14401a;

            public C0879a(IBinder iBinder) {
                this.f14401a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14401a;
            }

            @Override // com.xiaomi.wearable.hm.k
            public void onSportCommand(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HMSportListener");
                    b.d(parcelObtain, huamiDataWrapper, 0);
                    this.f14401a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.hm.HMSportListener");
        }

        public static k asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.HMSportListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof k)) ? new C0879a(iBinder) : (k) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.HMSportListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.HMSportListener");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onSportCommand((HuamiDataWrapper) b.c(parcel, HuamiDataWrapper.INSTANCE));
            parcel2.writeNoException();
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

    void onSportCommand(HuamiDataWrapper huamiDataWrapper) throws RemoteException;
}
