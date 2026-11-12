package com.huawei.appmarket.framework.coreservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes23.dex */
public interface a extends IInterface {
    void call(Status status) throws RemoteException;

    /* JADX INFO: renamed from: com.huawei.appmarket.framework.coreservice.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0060a extends Binder implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.huawei.appmarket.framework.coreservice.IAppGalleryCallback");
                return true;
            }
            parcel.enforceInterface("com.huawei.appmarket.framework.coreservice.IAppGalleryCallback");
            call(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }

        /* JADX INFO: renamed from: com.huawei.appmarket.framework.coreservice.a$a$a, reason: collision with other inner class name */
        static class C0061a implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static a f5261c;
            private IBinder e;

            @Override // com.huawei.appmarket.framework.coreservice.a
            public void call(Status status) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.appmarket.framework.coreservice.IAppGalleryCallback");
                    if (status != null) {
                        parcelObtain.writeInt(1);
                        status.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.e.transact(1, parcelObtain, parcelObtain2, 0) || AbstractBinderC0060a.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0060a.getDefaultImpl().call(status);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.e;
            }

            C0061a(IBinder iBinder) {
                this.e = iBinder;
            }
        }

        public static boolean setDefaultImpl(a aVar) {
            if (C0061a.f5261c != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (aVar == null) {
                return false;
            }
            C0061a.f5261c = aVar;
            return true;
        }

        public static a getDefaultImpl() {
            return C0061a.f5261c;
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.appmarket.framework.coreservice.IAppGalleryCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0061a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        public AbstractBinderC0060a() {
            attachInterface(this, "com.huawei.appmarket.framework.coreservice.IAppGalleryCallback");
        }
    }
}
