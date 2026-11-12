package com.xiaomi.wearable.hm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface i extends IInterface {

    public static abstract class a extends Binder implements i {
        static final int TRANSACTION_onData = 3;
        static final int TRANSACTION_onFinish = 4;
        static final int TRANSACTION_onFirstbeatData = 5;
        static final int TRANSACTION_onProgress = 2;
        static final int TRANSACTION_onStart = 1;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.i$a$a, reason: collision with other inner class name */
        public static class C0877a implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14399a;

            public C0877a(IBinder iBinder) {
                this.f14399a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14399a;
            }

            @Override // com.xiaomi.wearable.hm.i
            public void onData(List<HuamiDataWrapper> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HMFirstbeatDataCallback");
                    b.e(parcelObtain, list, 0);
                    this.f14399a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.i
            public void onFinish(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HMFirstbeatDataCallback");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14399a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.i
            public void onFirstbeatData(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HMFirstbeatDataCallback");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14399a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.i
            public void onProgress(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HMFirstbeatDataCallback");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14399a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.i
            public void onStart() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HMFirstbeatDataCallback");
                    this.f14399a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.hm.HMFirstbeatDataCallback");
        }

        public static i asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.HMFirstbeatDataCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof i)) ? new C0877a(iBinder) : (i) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.HMFirstbeatDataCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.HMFirstbeatDataCallback");
                return true;
            }
            if (i == 1) {
                onStart();
                parcel2.writeNoException();
            } else if (i == 2) {
                onProgress((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                parcel2.writeNoException();
            } else if (i == 3) {
                onData(parcel.createTypedArrayList(HuamiDataWrapper.INSTANCE));
                parcel2.writeNoException();
            } else if (i == 4) {
                onFinish(parcel.readInt() != 0);
                parcel2.writeNoException();
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onFirstbeatData((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                parcel2.writeNoException();
            }
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

    void onData(List<HuamiDataWrapper> list) throws RemoteException;

    void onFinish(boolean z) throws RemoteException;

    void onFirstbeatData(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    void onProgress(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    void onStart() throws RemoteException;
}
