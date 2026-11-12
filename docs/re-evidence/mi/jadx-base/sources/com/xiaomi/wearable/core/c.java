package com.xiaomi.wearable.core;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface c extends IInterface {

    public static abstract class a extends Binder implements c {
        static final int TRANSACTION_handleData = 1;

        /* JADX INFO: renamed from: com.xiaomi.wearable.core.c$a$a, reason: collision with other inner class name */
        public static class C0861a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14382a;

            public C0861a(IBinder iBinder) {
                this.f14382a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14382a;
            }

            @Override // com.xiaomi.wearable.core.c
            public void handleData(String str, int i, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IDataHandlerCore");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeByteArray(bArr);
                    this.f14382a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.core.IDataHandlerCore");
        }

        public static c asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.core.IDataHandlerCore");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new C0861a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.core.IDataHandlerCore");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.core.IDataHandlerCore");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            handleData(parcel.readString(), parcel.readInt(), parcel.createByteArray());
            parcel2.writeNoException();
            return true;
        }
    }

    void handleData(String str, int i, byte[] bArr) throws RemoteException;
}
