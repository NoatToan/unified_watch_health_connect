package com.xiaomi.fitness.device.manager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface e extends IInterface {

    public static abstract class a extends Binder implements e {
        static final int TRANSACTION_onCanceled = 2;
        static final int TRANSACTION_onConfirm = 1;

        /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.e$a$a, reason: collision with other inner class name */
        public static class C0425a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f11916a;

            public C0425a(IBinder iBinder) {
                this.f11916a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11916a;
            }

            @Override // com.xiaomi.fitness.device.manager.e
            public void onCanceled() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.OOBCallback");
                    this.f11916a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.e
            public void onConfirm() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.OOBCallback");
                    this.f11916a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.device.manager.OOBCallback");
        }

        public static e asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.device.manager.OOBCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e)) ? new C0425a(iBinder) : (e) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.device.manager.OOBCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.device.manager.OOBCallback");
                return true;
            }
            if (i == 1) {
                onConfirm();
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onCanceled();
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onCanceled() throws RemoteException;

    void onConfirm() throws RemoteException;
}
