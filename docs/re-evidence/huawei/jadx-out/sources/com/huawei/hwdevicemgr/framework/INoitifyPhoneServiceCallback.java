package com.huawei.hwdevicemgr.framework;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;

/* JADX INFO: loaded from: classes11.dex */
public interface INoitifyPhoneServiceCallback extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.hwdevicemgr.framework.INoitifyPhoneServiceCallback";

    void executeResponse(String str, int i, DeviceInfo deviceInfo, int i2, String str2) throws RemoteException;

    public static abstract class Stub extends Binder implements INoitifyPhoneServiceCallback {
        static final int TRANSACTION_executeResponse = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, INoitifyPhoneServiceCallback.DESCRIPTOR);
        }

        public static INoitifyPhoneServiceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(INoitifyPhoneServiceCallback.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof INoitifyPhoneServiceCallback)) {
                return (INoitifyPhoneServiceCallback) iInterfaceQueryLocalInterface;
            }
            return new b(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(INoitifyPhoneServiceCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(INoitifyPhoneServiceCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                executeResponse(parcel.readString(), parcel.readInt(), (DeviceInfo) e.e(parcel, DeviceInfo.CREATOR), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        static class b implements INoitifyPhoneServiceCallback {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private IBinder f17561c;

            b(IBinder iBinder) {
                this.f17561c = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17561c;
            }

            @Override // com.huawei.hwdevicemgr.framework.INoitifyPhoneServiceCallback
            public void executeResponse(String str, int i, DeviceInfo deviceInfo, int i2, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INoitifyPhoneServiceCallback.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    e.e(parcelObtain, deviceInfo, 0);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str2);
                    this.f17561c.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    public static class e {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T e(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void e(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
