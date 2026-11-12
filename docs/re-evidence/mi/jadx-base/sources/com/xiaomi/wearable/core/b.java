package com.xiaomi.wearable.core;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        static final int TRANSACTION_getMiWearCoreBinder = 1;

        /* JADX INFO: renamed from: com.xiaomi.wearable.core.b$a$a, reason: collision with other inner class name */
        public static class C0860a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14381a;

            public C0860a(IBinder iBinder) {
                this.f14381a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14381a;
            }

            @Override // com.xiaomi.wearable.core.b
            public e getMiWearCoreBinder() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.ICoreInstance");
                    this.f14381a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return e.a.asInterface(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.core.ICoreInstance");
        }

        public static b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.core.ICoreInstance");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0860a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.core.ICoreInstance");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.core.ICoreInstance");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            e miWearCoreBinder = getMiWearCoreBinder();
            parcel2.writeNoException();
            parcel2.writeStrongInterface(miWearCoreBinder);
            return true;
        }
    }

    e getMiWearCoreBinder() throws RemoteException;
}
