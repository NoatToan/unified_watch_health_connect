package com.xiaomi.wearable.hm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface n extends IInterface {

    public static abstract class a extends Binder implements n {
        static final int TRANSACTION_onConnectionStateChange = 1;
        static final int TRANSACTION_onGetSignData = 2;
        static final int TRANSACTION_onStepChanged = 3;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.n$a$a, reason: collision with other inner class name */
        public static class C0882a implements n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14404a;

            public C0882a(IBinder iBinder) {
                this.f14404a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14404a;
            }

            @Override // com.xiaomi.wearable.hm.n
            public void onConnectionStateChange(int i, int i2, int i3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiDeviceCallback");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    this.f14404a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.n
            public String onGetSignData(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiDeviceCallback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f14404a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.n
            public void onStepChanged(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiDeviceCallback");
                    parcelObtain.writeInt(i);
                    this.f14404a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.hm.HuamiDeviceCallback");
        }

        public static n asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.HuamiDeviceCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof n)) ? new C0882a(iBinder) : (n) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.HuamiDeviceCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.HuamiDeviceCallback");
                return true;
            }
            if (i == 1) {
                onConnectionStateChange(parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
            } else if (i == 2) {
                String strOnGetSignData = onGetSignData(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strOnGetSignData);
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onStepChanged(parcel.readInt());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onConnectionStateChange(int i, int i2, int i3) throws RemoteException;

    String onGetSignData(String str, String str2) throws RemoteException;

    void onStepChanged(int i) throws RemoteException;
}
