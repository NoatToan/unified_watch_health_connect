package com.huawei.multisimservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes12.dex */
public interface IServiceBinder extends IInterface {
    IBinder getServiceBinder(String str) throws RemoteException;

    public static abstract class Stub extends Binder implements IServiceBinder {
        private static final String DESCRIPTOR = "com.huawei.multisimservice.IServiceBinder";
        static final int TRANSACTION_getServiceBinder = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IServiceBinder asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IServiceBinder)) {
                return (IServiceBinder) iInterfaceQueryLocalInterface;
            }
            return new a(iBinder);
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
            IBinder serviceBinder = getServiceBinder(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeStrongBinder(serviceBinder);
            return true;
        }

        static class a implements IServiceBinder {
            public static IServiceBinder e;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f18075b;

            a(IBinder iBinder) {
                this.f18075b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18075b;
            }

            @Override // com.huawei.multisimservice.IServiceBinder
            public IBinder getServiceBinder(String str) throws RemoteException {
                IBinder strongBinder;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.f18075b.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        strongBinder = Stub.getDefaultImpl().getServiceBinder(str);
                    } else {
                        parcelObtain2.readException();
                        strongBinder = parcelObtain2.readStrongBinder();
                    }
                    return strongBinder;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IServiceBinder iServiceBinder) {
            if (a.e != null || iServiceBinder == null) {
                return false;
            }
            a.e = iServiceBinder;
            return true;
        }

        public static IServiceBinder getDefaultImpl() {
            return a.e;
        }
    }
}
