package com.xiaomi.fitness.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.xiaomi.fitness.service.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0734a extends Binder implements a {
        static final int TRANSACTION_getVersion = 2;
        static final int TRANSACTION_queryBinder = 1;

        /* JADX INFO: renamed from: com.xiaomi.fitness.service.a$a$a, reason: collision with other inner class name */
        public static class C0735a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f12861a;

            public C0735a(IBinder iBinder) {
                this.f12861a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12861a;
            }

            @Override // com.xiaomi.fitness.service.a
            public IBinder queryBinder(BinderRequest binderRequest) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.service.IBinderPool");
                    b.d(parcelObtain, binderRequest, 0);
                    this.f12861a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readStrongBinder();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0734a() {
            attachInterface(this, "com.xiaomi.fitness.service.IBinderPool");
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.service.IBinderPool");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0735a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.service.IBinderPool");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.service.IBinderPool");
                return true;
            }
            if (i == 1) {
                IBinder iBinderQueryBinder = queryBinder((BinderRequest) b.c(parcel, BinderRequest.CREATOR));
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iBinderQueryBinder);
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                int version = getVersion();
                parcel2.writeNoException();
                parcel2.writeInt(version);
            }
            return true;
        }
    }

    public static class b {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    int getVersion() throws RemoteException;

    IBinder queryBinder(BinderRequest binderRequest) throws RemoteException;
}
