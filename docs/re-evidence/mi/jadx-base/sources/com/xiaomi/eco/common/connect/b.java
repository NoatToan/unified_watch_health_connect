package com.xiaomi.eco.common.connect;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.eco.api.EcoApiResult;

/* JADX INFO: loaded from: classes7.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        static final int TRANSACTION_onCallback = 1;

        /* JADX INFO: renamed from: com.xiaomi.eco.common.connect.b$a$a, reason: collision with other inner class name */
        public static class C0359a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f11287a;

            public C0359a(IBinder iBinder) {
                this.f11287a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11287a;
            }

            @Override // com.xiaomi.eco.common.connect.b
            public void onCallback(EcoApiResult ecoApiResult) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoCallback");
                    C0360b.d(parcelObtain, ecoApiResult, 0);
                    this.f11287a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.eco.common.connect.IEcoCallback");
        }

        public static b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.eco.common.connect.IEcoCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0359a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.eco.common.connect.IEcoCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.eco.common.connect.IEcoCallback");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onCallback((EcoApiResult) C0360b.c(parcel, EcoApiResult.CREATOR));
            parcel2.writeNoException();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.eco.common.connect.b$b, reason: collision with other inner class name */
    public static class C0360b {
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

    void onCallback(EcoApiResult ecoApiResult) throws RemoteException;
}
