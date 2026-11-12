package com.xiaomi.wearable.hm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface q extends IInterface {

    public static abstract class a extends Binder implements q {
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onSuccess = 1;
        static final int TRANSACTION_onTimeout = 3;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.q$a$a, reason: collision with other inner class name */
        public static class C0885a implements q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14407a;

            public C0885a(IBinder iBinder) {
                this.f14407a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14407a;
            }

            @Override // com.xiaomi.wearable.hm.q
            public void onFailure(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.IScheduleCallback");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.f14407a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.q
            public void onSuccess(List<HuamiDataWrapper> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.IScheduleCallback");
                    b.b(parcelObtain, list, 0);
                    this.f14407a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.q
            public void onTimeout(List<HuamiDataWrapper> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.IScheduleCallback");
                    b.b(parcelObtain, list, 0);
                    this.f14407a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.hm.IScheduleCallback");
        }

        public static q asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.IScheduleCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof q)) ? new C0885a(iBinder) : (q) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.IScheduleCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.IScheduleCallback");
                return true;
            }
            if (i == 1) {
                onSuccess(parcel.createTypedArrayList(HuamiDataWrapper.INSTANCE));
                parcel2.writeNoException();
            } else if (i == 2) {
                onFailure(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onTimeout(parcel.createTypedArrayList(HuamiDataWrapper.INSTANCE));
                parcel2.writeNoException();
            }
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

    void onFailure(int i, String str) throws RemoteException;

    void onSuccess(List<HuamiDataWrapper> list) throws RemoteException;

    void onTimeout(List<HuamiDataWrapper> list) throws RemoteException;
}
