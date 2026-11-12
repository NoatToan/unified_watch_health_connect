package com.xiaomi.wearable.hm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface u extends IInterface {

    public static abstract class a extends Binder implements u {
        static final int TRANSACTION_getData = 1;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.u$a$a, reason: collision with other inner class name */
        public static class C0889a implements u {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14411a;

            public C0889a(IBinder iBinder) {
                this.f14411a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14411a;
            }

            @Override // com.xiaomi.wearable.hm.u
            public List<HuamiDataWrapper> getData(String str, String str2, HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.SleepDataSourceCallback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14411a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.hm.SleepDataSourceCallback");
        }

        public static u asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.SleepDataSourceCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof u)) ? new C0889a(iBinder) : (u) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.SleepDataSourceCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.SleepDataSourceCallback");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            List<HuamiDataWrapper> data = getData(parcel.readString(), parcel.readString(), (HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
            parcel2.writeNoException();
            b.e(parcel2, data, 1);
            return true;
        }
    }

    public static class b {
        public static <T> T d(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void e(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                f(parcel, list.get(i2), i);
            }
        }

        public static <T extends Parcelable> void f(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    List<HuamiDataWrapper> getData(String str, String str2, HuamiDataWrapper huamiDataWrapper) throws RemoteException;
}
