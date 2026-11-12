package com.xiaomi.wearable.hm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.xiaomi.wearable.hm.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0864a extends Binder implements a {
        static final int TRANSACTION_onDataPulled = 1;
        static final int TRANSACTION_onDataPushed = 2;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.a$a$a, reason: collision with other inner class name */
        public static class C0865a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14388a;

            public C0865a(IBinder iBinder) {
                this.f14388a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14388a;
            }

            @Override // com.xiaomi.wearable.hm.a
            public void onDataPulled(List<HuamiDataWrapper> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.AbsActivityDataCallback");
                    b.b(parcelObtain, list, 0);
                    this.f14388a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.a
            public void onDataPushed(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.AbsActivityDataCallback");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14388a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0864a() {
            attachInterface(this, "com.xiaomi.wearable.hm.AbsActivityDataCallback");
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.AbsActivityDataCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0865a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.AbsActivityDataCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.AbsActivityDataCallback");
                return true;
            }
            if (i == 1) {
                onDataPulled(parcel.createTypedArrayList(HuamiDataWrapper.INSTANCE));
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onDataPushed(parcel.readInt() != 0);
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

    void onDataPulled(List<HuamiDataWrapper> list) throws RemoteException;

    void onDataPushed(boolean z) throws RemoteException;
}
