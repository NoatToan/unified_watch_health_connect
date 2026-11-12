package com.huawei.controlcenter.featureability.sdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes23.dex */
public interface IAuthCallback extends IInterface {
    void onAuthResult(boolean z) throws RemoteException;

    public static abstract class Stub extends Binder implements IAuthCallback {
        private static final String DESCRIPTOR = "com.huawei.controlcenter.featureability.sdk.IAuthCallback";
        static final int TRANSACTION_onAuthResult = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IAuthCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IAuthCallback)) {
                return (IAuthCallback) iInterfaceQueryLocalInterface;
            }
            return new c(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(DESCRIPTOR);
            onAuthResult(parcel.readInt() != 0);
            parcel2.writeNoException();
            return true;
        }

        static class c implements IAuthCallback {
            public static IAuthCallback e;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f5407a;

            c(IBinder iBinder) {
                this.f5407a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5407a;
            }

            @Override // com.huawei.controlcenter.featureability.sdk.IAuthCallback
            public void onAuthResult(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (!this.f5407a.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onAuthResult(z);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IAuthCallback iAuthCallback) {
            if (c.e != null || iAuthCallback == null) {
                return false;
            }
            c.e = iAuthCallback;
            return true;
        }

        public static IAuthCallback getDefaultImpl() {
            return c.e;
        }
    }
}
