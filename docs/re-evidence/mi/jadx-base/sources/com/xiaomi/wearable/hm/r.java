package com.xiaomi.wearable.hm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface r extends IInterface {

    public static abstract class a extends Binder implements r {
        static final int TRANSACTION_onStep = 1;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.r$a$a, reason: collision with other inner class name */
        public static class C0886a implements r {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14408a;

            public C0886a(IBinder iBinder) {
                this.f14408a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14408a;
            }

            @Override // com.xiaomi.wearable.hm.r
            public void onStep(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.IStepCallback");
                    parcelObtain.writeInt(i);
                    this.f14408a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.hm.IStepCallback");
        }

        public static r asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.IStepCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof r)) ? new C0886a(iBinder) : (r) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.IStepCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.IStepCallback");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onStep(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void onStep(int i) throws RemoteException;
}
