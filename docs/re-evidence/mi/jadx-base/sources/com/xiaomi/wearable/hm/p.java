package com.xiaomi.wearable.hm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface p extends IInterface {

    public static abstract class a extends Binder implements p {
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onFwProgressa = 5;
        static final int TRANSACTION_onFwStart = 3;
        static final int TRANSACTION_onFwStopa = 4;
        static final int TRANSACTION_upgradingProgress = 1;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.p$a$a, reason: collision with other inner class name */
        public static class C0884a implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14406a;

            public C0884a(IBinder iBinder) {
                this.f14406a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14406a;
            }

            @Override // com.xiaomi.wearable.hm.p
            public void onError(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.IFirmwareInvokeCallback");
                    parcelObtain.writeInt(i);
                    this.f14406a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.p
            public void onFwProgressa(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.IFirmwareInvokeCallback");
                    b.d(parcelObtain, huamiDataWrapper, 0);
                    this.f14406a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.p
            public void onFwStart() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.IFirmwareInvokeCallback");
                    this.f14406a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.p
            public void onFwStopa(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.IFirmwareInvokeCallback");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14406a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.p
            public void upgradingProgress(HuamiDataWrapper huamiDataWrapper, HuamiDataWrapper huamiDataWrapper2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.IFirmwareInvokeCallback");
                    b.d(parcelObtain, huamiDataWrapper, 0);
                    b.d(parcelObtain, huamiDataWrapper2, 0);
                    this.f14406a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.hm.IFirmwareInvokeCallback");
        }

        public static p asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.IFirmwareInvokeCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof p)) ? new C0884a(iBinder) : (p) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.IFirmwareInvokeCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.IFirmwareInvokeCallback");
                return true;
            }
            if (i == 1) {
                HuamiDataWrapper.Companion companion = HuamiDataWrapper.INSTANCE;
                upgradingProgress((HuamiDataWrapper) b.c(parcel, companion), (HuamiDataWrapper) b.c(parcel, companion));
                parcel2.writeNoException();
            } else if (i == 2) {
                onError(parcel.readInt());
                parcel2.writeNoException();
            } else if (i == 3) {
                onFwStart();
                parcel2.writeNoException();
            } else if (i == 4) {
                onFwStopa(parcel.readInt() != 0);
                parcel2.writeNoException();
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onFwProgressa((HuamiDataWrapper) b.c(parcel, HuamiDataWrapper.INSTANCE));
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

    void onError(int i) throws RemoteException;

    void onFwProgressa(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    void onFwStart() throws RemoteException;

    void onFwStopa(boolean z) throws RemoteException;

    void upgradingProgress(HuamiDataWrapper huamiDataWrapper, HuamiDataWrapper huamiDataWrapper2) throws RemoteException;
}
