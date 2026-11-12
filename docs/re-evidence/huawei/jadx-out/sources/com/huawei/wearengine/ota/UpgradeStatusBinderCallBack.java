package com.huawei.wearengine.ota;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.wearengine.device.Device;

/* JADX INFO: loaded from: classes46.dex */
public interface UpgradeStatusBinderCallBack extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.wearengine.ota.UpgradeStatusBinderCallBack";

    void onStatus(Device device, String str) throws RemoteException;

    public static abstract class Stub extends Binder implements UpgradeStatusBinderCallBack {
        static final int TRANSACTION_onStatus = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, UpgradeStatusBinderCallBack.DESCRIPTOR);
        }

        public static UpgradeStatusBinderCallBack asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(UpgradeStatusBinderCallBack.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof UpgradeStatusBinderCallBack)) {
                return (UpgradeStatusBinderCallBack) iInterfaceQueryLocalInterface;
            }
            return new c(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(UpgradeStatusBinderCallBack.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(UpgradeStatusBinderCallBack.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            Device device = (Device) c.b(parcel, Device.CREATOR);
            onStatus(device, parcel.readString());
            parcel2.writeNoException();
            c.c(parcel2, device, 1);
            return true;
        }

        static class c implements UpgradeStatusBinderCallBack {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private IBinder f30771c;

            c(IBinder iBinder) {
                this.f30771c = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30771c;
            }

            @Override // com.huawei.wearengine.ota.UpgradeStatusBinderCallBack
            public void onStatus(Device device, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(UpgradeStatusBinderCallBack.DESCRIPTOR);
                    c.c(parcelObtain, device, 0);
                    parcelObtain.writeString(str);
                    this.f30771c.transact(1, parcelObtain, parcelObtain2, 0);
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

    public static class c {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
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
