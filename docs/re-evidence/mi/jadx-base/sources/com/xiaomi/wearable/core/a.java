package com.xiaomi.wearable.core;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.xiaomi.wearable.core.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0858a extends Binder implements a {
        static final int TRANSACTION_onConnectFailed = 2;
        static final int TRANSACTION_onConnected = 1;
        static final int TRANSACTION_onDisconnect = 3;

        /* JADX INFO: renamed from: com.xiaomi.wearable.core.a$a$a, reason: collision with other inner class name */
        public static class C0859a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14380a;

            public C0859a(IBinder iBinder) {
                this.f14380a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14380a;
            }

            @Override // com.xiaomi.wearable.core.a
            public void onConnectFailed(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IConnectionCallback");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.f14380a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.a
            public void onConnected(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IConnectionCallback");
                    parcelObtain.writeInt(i);
                    this.f14380a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0858a() {
            attachInterface(this, "com.xiaomi.wearable.core.IConnectionCallback");
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.core.IConnectionCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0859a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.core.IConnectionCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.core.IConnectionCallback");
                return true;
            }
            if (i == 1) {
                onConnected(parcel.readInt());
                parcel2.writeNoException();
            } else if (i == 2) {
                onConnectFailed(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onDisconnect();
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onConnectFailed(int i, String str) throws RemoteException;

    void onConnected(int i) throws RemoteException;

    void onDisconnect() throws RemoteException;
}
