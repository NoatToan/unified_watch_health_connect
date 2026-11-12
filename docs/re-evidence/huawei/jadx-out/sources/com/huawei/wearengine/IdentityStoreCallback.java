package com.huawei.wearengine;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes20.dex */
public interface IdentityStoreCallback extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.wearengine.IdentityStoreCallback";

    void storePermissionIdentity(String str) throws RemoteException;

    public static abstract class Stub extends Binder implements IdentityStoreCallback {
        static final int TRANSACTION_storePermissionIdentity = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IdentityStoreCallback.DESCRIPTOR);
        }

        public static IdentityStoreCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IdentityStoreCallback.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IdentityStoreCallback)) {
                return (IdentityStoreCallback) iInterfaceQueryLocalInterface;
            }
            return new c(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IdentityStoreCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IdentityStoreCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                storePermissionIdentity(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        static class c implements IdentityStoreCallback {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f30734b;

            c(IBinder iBinder) {
                this.f30734b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30734b;
            }

            @Override // com.huawei.wearengine.IdentityStoreCallback
            public void storePermissionIdentity(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IdentityStoreCallback.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.f30734b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
