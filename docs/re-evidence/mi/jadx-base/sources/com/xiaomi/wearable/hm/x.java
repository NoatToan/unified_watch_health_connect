package com.xiaomi.wearable.hm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface x extends IInterface {

    public static abstract class a extends Binder implements x {
        static final int TRANSACTION_onHeartRateChanged = 1;
        static final int TRANSACTION_onOpen = 2;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.x$a$a, reason: collision with other inner class name */
        public static class C0892a implements x {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14414a;

            public C0892a(IBinder iBinder) {
                this.f14414a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14414a;
            }

            @Override // com.xiaomi.wearable.hm.x
            public void onHeartRateChanged(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.SportHrCallback");
                    parcelObtain.writeInt(i);
                    this.f14414a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.x
            public void onOpen(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.SportHrCallback");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14414a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.hm.SportHrCallback");
        }

        public static x asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.SportHrCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof x)) ? new C0892a(iBinder) : (x) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.SportHrCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.SportHrCallback");
                return true;
            }
            if (i == 1) {
                onHeartRateChanged(parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onOpen(parcel.readInt() != 0);
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onHeartRateChanged(int i) throws RemoteException;

    void onOpen(boolean z) throws RemoteException;
}
