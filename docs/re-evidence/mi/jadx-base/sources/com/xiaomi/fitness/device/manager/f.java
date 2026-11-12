package com.xiaomi.fitness.device.manager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface f extends IInterface {

    public static abstract class a extends Binder implements f {
        static final int TRANSACTION_onAccessoryDeviceModeChange = 1;
        static final int TRANSACTION_onAccessoryDeviceModeDuplicate = 2;

        /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.f$a$a, reason: collision with other inner class name */
        public static class C0427a implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f11920a;

            public C0427a(IBinder iBinder) {
                this.f11920a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11920a;
            }

            @Override // com.xiaomi.fitness.device.manager.f
            public void onAccessoryDeviceModeChange(String str, int i, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.OnAccessoryDeviceStateRemoteListener");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f11920a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.f
            public void onAccessoryDeviceModeDuplicate(String str, int i, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.OnAccessoryDeviceStateRemoteListener");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f11920a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.device.manager.OnAccessoryDeviceStateRemoteListener");
        }

        public static f asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.device.manager.OnAccessoryDeviceStateRemoteListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof f)) ? new C0427a(iBinder) : (f) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.device.manager.OnAccessoryDeviceStateRemoteListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.device.manager.OnAccessoryDeviceStateRemoteListener");
                return true;
            }
            if (i == 1) {
                onAccessoryDeviceModeChange(parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onAccessoryDeviceModeDuplicate(parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onAccessoryDeviceModeChange(String str, int i, boolean z) throws RemoteException;

    void onAccessoryDeviceModeDuplicate(String str, int i, boolean z) throws RemoteException;
}
