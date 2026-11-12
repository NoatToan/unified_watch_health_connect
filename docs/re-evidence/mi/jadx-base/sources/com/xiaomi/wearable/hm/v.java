package com.xiaomi.wearable.hm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface v extends IInterface {

    public static abstract class a extends Binder implements v {
        static final int TRANSACTION_onResult = 1;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.v$a$a, reason: collision with other inner class name */
        public static class C0890a implements v {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14412a;

            public C0890a(IBinder iBinder) {
                this.f14412a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14412a;
            }

            @Override // com.xiaomi.wearable.hm.v
            public void onResult(int i, List<HuamiDataWrapper> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.SmsResCallback");
                    parcelObtain.writeInt(i);
                    b.b(parcelObtain, list, 0);
                    this.f14412a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.hm.SmsResCallback");
        }

        public static v asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.SmsResCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof v)) ? new C0890a(iBinder) : (v) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.SmsResCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.SmsResCallback");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onResult(parcel.readInt(), parcel.createTypedArrayList(HuamiDataWrapper.INSTANCE));
            parcel2.writeNoException();
            return true;
        }
    }

    public static class b {
        public static <T extends Parcelable> void b(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                c(parcel, list.get(i2), i);
            }
        }

        public static <T extends Parcelable> void c(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void onResult(int i, List<HuamiDataWrapper> list) throws RemoteException;
}
