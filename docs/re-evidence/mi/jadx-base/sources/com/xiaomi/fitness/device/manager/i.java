package com.xiaomi.fitness.device.manager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface i extends IInterface {

    public static abstract class a extends Binder implements i {
        static final int TRANSACTION_onRemoteChange = 1;

        /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.i$a$a, reason: collision with other inner class name */
        public static class C0430a implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f11923a;

            public C0430a(IBinder iBinder) {
                this.f11923a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11923a;
            }

            @Override // com.xiaomi.fitness.device.manager.i
            public void onRemoteChange() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.OnProductChangeRemoteListener");
                    this.f11923a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.device.manager.OnProductChangeRemoteListener");
        }

        public static i asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.device.manager.OnProductChangeRemoteListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof i)) ? new C0430a(iBinder) : (i) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.device.manager.OnProductChangeRemoteListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.device.manager.OnProductChangeRemoteListener");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onRemoteChange();
            parcel2.writeNoException();
            return true;
        }
    }

    void onRemoteChange() throws RemoteException;
}
