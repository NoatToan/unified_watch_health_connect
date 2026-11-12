package com.xiaomi.wearable.hm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface c extends IInterface {

    public static abstract class a extends Binder implements c {
        static final int TRANSACTION_onBatteryInfo = 1;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.c$a$a, reason: collision with other inner class name */
        public static class C0870a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14392a;

            public C0870a(IBinder iBinder) {
                this.f14392a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14392a;
            }

            @Override // com.xiaomi.wearable.hm.c
            public void onBatteryInfo(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.BatteryChangeCallback");
                    b.d(parcelObtain, huamiDataWrapper, 0);
                    this.f14392a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.hm.BatteryChangeCallback");
        }

        public static c asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.BatteryChangeCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new C0870a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.BatteryChangeCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.BatteryChangeCallback");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onBatteryInfo((HuamiDataWrapper) b.c(parcel, HuamiDataWrapper.INSTANCE));
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

    void onBatteryInfo(HuamiDataWrapper huamiDataWrapper) throws RemoteException;
}
