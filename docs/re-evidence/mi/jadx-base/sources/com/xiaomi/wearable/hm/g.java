package com.xiaomi.wearable.hm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface g extends IInterface {

    public static abstract class a extends Binder implements g {
        static final int TRANSACTION_onException = 1;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.g$a$a, reason: collision with other inner class name */
        public static class C0875a implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14397a;

            public C0875a(IBinder iBinder) {
                this.f14397a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14397a;
            }

            @Override // com.xiaomi.wearable.hm.g
            public void onException(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HMBTExceptionListener");
                    parcelObtain.writeInt(i);
                    this.f14397a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.hm.HMBTExceptionListener");
        }

        public static g asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.HMBTExceptionListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof g)) ? new C0875a(iBinder) : (g) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.HMBTExceptionListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.HMBTExceptionListener");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onException(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void onException(int i) throws RemoteException;
}
