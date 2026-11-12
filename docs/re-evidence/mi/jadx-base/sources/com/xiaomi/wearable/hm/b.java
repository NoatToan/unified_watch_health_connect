package com.xiaomi.wearable.hm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        static final int TRANSACTION_onResult = 2;
        static final int TRANSACTION_onResultData = 1;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.b$a$a, reason: collision with other inner class name */
        public static class C0867a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14390a;

            public C0867a(IBinder iBinder) {
                this.f14390a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14390a;
            }

            @Override // com.xiaomi.wearable.hm.b
            public void onResult(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.AtrialFibCallback");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14390a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.b
            public void onResultData(List<HuamiDataWrapper> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.AtrialFibCallback");
                    C0868b.b(parcelObtain, list, 0);
                    this.f14390a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.hm.AtrialFibCallback");
        }

        public static b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.AtrialFibCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0867a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.AtrialFibCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.AtrialFibCallback");
                return true;
            }
            if (i == 1) {
                onResultData(parcel.createTypedArrayList(HuamiDataWrapper.INSTANCE));
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onResult(parcel.readInt() != 0);
                parcel2.writeNoException();
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.wearable.hm.b$b, reason: collision with other inner class name */
    public static class C0868b {
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

    void onResult(boolean z) throws RemoteException;

    void onResultData(List<HuamiDataWrapper> list) throws RemoteException;
}
