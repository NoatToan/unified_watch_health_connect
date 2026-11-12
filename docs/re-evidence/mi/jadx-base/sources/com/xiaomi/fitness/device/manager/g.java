package com.xiaomi.fitness.device.manager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.fitness.device.manager.remote.DeviceModelRemote;

/* JADX INFO: loaded from: classes8.dex */
public interface g extends IInterface {

    public static abstract class a extends Binder implements g {
        static final int TRANSACTION_onChange = 1;

        /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.g$a$a, reason: collision with other inner class name */
        public static class C0428a implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f11921a;

            public C0428a(IBinder iBinder) {
                this.f11921a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11921a;
            }

            @Override // com.xiaomi.fitness.device.manager.g
            public void onChange(DeviceModelRemote deviceModelRemote) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.OnDeviceChangeListener");
                    b.d(parcelObtain, deviceModelRemote, 0);
                    this.f11921a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.device.manager.OnDeviceChangeListener");
        }

        public static g asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.device.manager.OnDeviceChangeListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof g)) ? new C0428a(iBinder) : (g) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.device.manager.OnDeviceChangeListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.device.manager.OnDeviceChangeListener");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onChange((DeviceModelRemote) b.c(parcel, DeviceModelRemote.CREATOR));
            parcel2.writeNoException();
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

    void onChange(DeviceModelRemote deviceModelRemote) throws RemoteException;
}
