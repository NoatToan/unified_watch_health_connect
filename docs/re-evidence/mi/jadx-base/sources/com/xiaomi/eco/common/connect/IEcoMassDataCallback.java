package com.xiaomi.eco.common.connect;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface IEcoMassDataCallback extends IInterface {
    public static final String DESCRIPTOR = "com.xiaomi.eco.common.connect.IEcoMassDataCallback";

    public static abstract class a extends Binder implements IEcoMassDataCallback {
        static final int TRANSACTION_onComplete = 1;
        static final int TRANSACTION_onFail = 3;
        static final int TRANSACTION_onProgress = 2;

        /* JADX INFO: renamed from: com.xiaomi.eco.common.connect.IEcoMassDataCallback$a$a, reason: collision with other inner class name */
        public static class C0356a implements IEcoMassDataCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f11285a;

            public C0356a(IBinder iBinder) {
                this.f11285a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11285a;
            }

            @Override // com.xiaomi.eco.common.connect.IEcoMassDataCallback
            public void onComplete() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IEcoMassDataCallback.DESCRIPTOR);
                    this.f11285a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.eco.common.connect.IEcoMassDataCallback
            public void onFail(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IEcoMassDataCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.f11285a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.eco.common.connect.IEcoMassDataCallback
            public void onProgress(int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IEcoMassDataCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.f11285a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, IEcoMassDataCallback.DESCRIPTOR);
        }

        public static IEcoMassDataCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IEcoMassDataCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IEcoMassDataCallback)) ? new C0356a(iBinder) : (IEcoMassDataCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IEcoMassDataCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IEcoMassDataCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onComplete();
                parcel2.writeNoException();
            } else if (i == 2) {
                onProgress(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onFail(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onComplete() throws RemoteException;

    void onFail(int i, String str) throws RemoteException;

    void onProgress(int i, int i2) throws RemoteException;
}
