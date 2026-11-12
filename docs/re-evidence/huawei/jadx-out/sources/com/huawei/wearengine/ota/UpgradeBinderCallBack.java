package com.huawei.wearengine.ota;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.wearengine.device.Device;

/* JADX INFO: loaded from: classes46.dex */
public interface UpgradeBinderCallBack extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.wearengine.ota.UpgradeBinderCallBack";

    void onUpgradeStatus(Device device, String str) throws RemoteException;

    public static abstract class Stub extends Binder implements UpgradeBinderCallBack {
        static final int TRANSACTION_onUpgradeStatus = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, UpgradeBinderCallBack.DESCRIPTOR);
        }

        public static UpgradeBinderCallBack asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(UpgradeBinderCallBack.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof UpgradeBinderCallBack)) {
                return (UpgradeBinderCallBack) iInterfaceQueryLocalInterface;
            }
            return new c(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(UpgradeBinderCallBack.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(UpgradeBinderCallBack.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            Device device = (Device) d.a(parcel, Device.CREATOR);
            onUpgradeStatus(device, parcel.readString());
            parcel2.writeNoException();
            d.c(parcel2, device, 1);
            return true;
        }

        static class c implements UpgradeBinderCallBack {
            private IBinder e;

            c(IBinder iBinder) {
                this.e = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.e;
            }

            @Override // com.huawei.wearengine.ota.UpgradeBinderCallBack
            public void onUpgradeStatus(Device device, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(UpgradeBinderCallBack.DESCRIPTOR);
                    d.c(parcelObtain, device, 0);
                    parcelObtain.writeString(str);
                    this.e.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        device.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    public static class d {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T a(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void c(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
