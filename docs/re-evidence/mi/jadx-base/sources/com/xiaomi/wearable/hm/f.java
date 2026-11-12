package com.xiaomi.wearable.hm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface f extends IInterface {

    public static abstract class a extends Binder implements f {
        static final int TRANSACTION_onCancel = 5;
        static final int TRANSACTION_onError = 6;
        static final int TRANSACTION_onFwFinish = 4;
        static final int TRANSACTION_onFwProgress = 3;
        static final int TRANSACTION_onFwStart = 1;
        static final int TRANSACTION_onFwStop = 2;
        static final int TRANSACTION_onTransmissionFinish = 7;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.f$a$a, reason: collision with other inner class name */
        public static class C0874a implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14396a;

            public C0874a(IBinder iBinder) {
                this.f14396a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14396a;
            }

            @Override // com.xiaomi.wearable.hm.f
            public void onCancel() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.FirmwareProgressCallback");
                    this.f14396a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.f
            public void onError(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.FirmwareProgressCallback");
                    parcelObtain.writeInt(i);
                    this.f14396a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.f
            public void onFwFinish() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.FirmwareProgressCallback");
                    this.f14396a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.f
            public void onFwProgress(HuamiDataWrapper huamiDataWrapper, HuamiDataWrapper huamiDataWrapper2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.FirmwareProgressCallback");
                    b.d(parcelObtain, huamiDataWrapper, 0);
                    b.d(parcelObtain, huamiDataWrapper2, 0);
                    this.f14396a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.f
            public void onFwStart(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.FirmwareProgressCallback");
                    b.d(parcelObtain, huamiDataWrapper, 0);
                    this.f14396a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.f
            public void onFwStop(boolean z, HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.FirmwareProgressCallback");
                    parcelObtain.writeInt(z ? 1 : 0);
                    b.d(parcelObtain, huamiDataWrapper, 0);
                    this.f14396a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.f
            public void onTransmissionFinish() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.FirmwareProgressCallback");
                    this.f14396a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.hm.FirmwareProgressCallback");
        }

        public static f asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.FirmwareProgressCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof f)) ? new C0874a(iBinder) : (f) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.FirmwareProgressCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.FirmwareProgressCallback");
                return true;
            }
            switch (i) {
                case 1:
                    onFwStart((HuamiDataWrapper) b.c(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    onFwStop(parcel.readInt() != 0, (HuamiDataWrapper) b.c(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    HuamiDataWrapper.Companion companion = HuamiDataWrapper.INSTANCE;
                    onFwProgress((HuamiDataWrapper) b.c(parcel, companion), (HuamiDataWrapper) b.c(parcel, companion));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    onFwFinish();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    onCancel();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    onError(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    onTransmissionFinish();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
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

    void onCancel() throws RemoteException;

    void onError(int i) throws RemoteException;

    void onFwFinish() throws RemoteException;

    void onFwProgress(HuamiDataWrapper huamiDataWrapper, HuamiDataWrapper huamiDataWrapper2) throws RemoteException;

    void onFwStart(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    void onFwStop(boolean z, HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    void onTransmissionFinish() throws RemoteException;
}
