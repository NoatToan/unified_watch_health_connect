package com.xiaomi.fitness.device.manager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface l extends IInterface {

    public static abstract class a extends Binder implements l {
        static final int TRANSACTION_onFail = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.l$a$a, reason: collision with other inner class name */
        public static class C0433a implements l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f11926a;

            public C0433a(IBinder iBinder) {
                this.f11926a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11926a;
            }

            @Override // com.xiaomi.fitness.device.manager.l
            public void onFail(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.UnbindCallback");
                    parcelObtain.writeInt(i);
                    this.f11926a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.l
            public void onSuccess() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.UnbindCallback");
                    this.f11926a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.device.manager.UnbindCallback");
        }

        public static l asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.device.manager.UnbindCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof l)) ? new C0433a(iBinder) : (l) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.device.manager.UnbindCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.device.manager.UnbindCallback");
                return true;
            }
            if (i == 1) {
                onSuccess();
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onFail(parcel.readInt());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onFail(int i) throws RemoteException;

    void onSuccess() throws RemoteException;
}
