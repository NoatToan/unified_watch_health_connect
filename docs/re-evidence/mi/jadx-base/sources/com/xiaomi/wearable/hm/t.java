package com.xiaomi.wearable.hm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface t extends IInterface {

    public static abstract class a extends Binder implements t {
        static final int TRANSACTION_onMemory = 1;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.t$a$a, reason: collision with other inner class name */
        public static class C0888a implements t {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14410a;

            public C0888a(IBinder iBinder) {
                this.f14410a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14410a;
            }

            @Override // com.xiaomi.wearable.hm.t
            public void onMemory(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.SkinStorageStatusCallback");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14410a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.hm.SkinStorageStatusCallback");
        }

        public static t asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.SkinStorageStatusCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof t)) ? new C0888a(iBinder) : (t) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.SkinStorageStatusCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.SkinStorageStatusCallback");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onMemory(parcel.readInt() != 0);
            parcel2.writeNoException();
            return true;
        }
    }

    void onMemory(boolean z) throws RemoteException;
}
