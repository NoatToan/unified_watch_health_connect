package com.xiaomi.fitness.device.manager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        static final int TRANSACTION_onFail = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.b$a$a, reason: collision with other inner class name */
        public static class C0421a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f11903a;

            public C0421a(IBinder iBinder) {
                this.f11903a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11903a;
            }

            @Override // com.xiaomi.fitness.device.manager.b
            public void onFail(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.Callback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f11903a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.b
            public void onSuccess() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.Callback");
                    this.f11903a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.device.manager.Callback");
        }

        public static b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.device.manager.Callback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0421a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.device.manager.Callback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.device.manager.Callback");
                return true;
            }
            if (i == 1) {
                onSuccess();
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onFail(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onFail(String str, int i) throws RemoteException;

    void onSuccess() throws RemoteException;
}
