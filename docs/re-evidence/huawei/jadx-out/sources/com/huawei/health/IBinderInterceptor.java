package com.huawei.health;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface IBinderInterceptor extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.health.IBinderInterceptor";

    IBinder getServiceBinder(String str) throws RemoteException;

    public static abstract class Stub extends Binder implements IBinderInterceptor {
        static final int TRANSACTION_getServiceBinder = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IBinderInterceptor.DESCRIPTOR);
        }

        public static IBinderInterceptor asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IBinderInterceptor.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IBinderInterceptor)) {
                return (IBinderInterceptor) iInterfaceQueryLocalInterface;
            }
            return new e(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IBinderInterceptor.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IBinderInterceptor.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                IBinder serviceBinder = getServiceBinder(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(serviceBinder);
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        /* JADX INFO: loaded from: classes23.dex */
        static class e implements IBinderInterceptor {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f6119b;

            e(IBinder iBinder) {
                this.f6119b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f6119b;
            }

            @Override // com.huawei.health.IBinderInterceptor
            public IBinder getServiceBinder(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IBinderInterceptor.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.f6119b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readStrongBinder();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
