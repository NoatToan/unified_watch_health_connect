package com.huawei.hwservicesmgr;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.datatype.DeviceStatusParam;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;

/* JADX INFO: loaded from: classes2.dex */
public interface IDeviceStateAIDLCallback extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.hwservicesmgr.IDeviceStateAIDLCallback";

    void onAckReceived(DeviceInfo deviceInfo, int i, byte[] bArr) throws RemoteException;

    void onDataReceived(DeviceInfo deviceInfo, int i, byte[] bArr) throws RemoteException;

    void onDatasReceived(DeviceInfo deviceInfo, int i, String str) throws RemoteException;

    void onDeviceConnectionStateChanged(DeviceInfo deviceInfo, int i, DeviceStatusParam deviceStatusParam) throws RemoteException;

    /* JADX INFO: loaded from: classes11.dex */
    public static abstract class Stub extends Binder implements IDeviceStateAIDLCallback {
        static final int TRANSACTION_onAckReceived = 3;
        static final int TRANSACTION_onDataReceived = 2;
        static final int TRANSACTION_onDatasReceived = 4;
        static final int TRANSACTION_onDeviceConnectionStateChanged = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IDeviceStateAIDLCallback.DESCRIPTOR);
        }

        public static IDeviceStateAIDLCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDeviceStateAIDLCallback.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IDeviceStateAIDLCallback)) {
                return (IDeviceStateAIDLCallback) iInterfaceQueryLocalInterface;
            }
            return new b(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IDeviceStateAIDLCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IDeviceStateAIDLCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onDeviceConnectionStateChanged((DeviceInfo) a.c(parcel, DeviceInfo.CREATOR), parcel.readInt(), (DeviceStatusParam) a.c(parcel, DeviceStatusParam.CREATOR));
                parcel2.writeNoException();
            } else if (i == 2) {
                onDataReceived((DeviceInfo) a.c(parcel, DeviceInfo.CREATOR), parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
            } else if (i == 3) {
                onAckReceived((DeviceInfo) a.c(parcel, DeviceInfo.CREATOR), parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
            } else if (i == 4) {
                onDatasReceived((DeviceInfo) a.c(parcel, DeviceInfo.CREATOR), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        static class b implements IDeviceStateAIDLCallback {
            private IBinder e;

            b(IBinder iBinder) {
                this.e = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.e;
            }

            @Override // com.huawei.hwservicesmgr.IDeviceStateAIDLCallback
            public void onDeviceConnectionStateChanged(DeviceInfo deviceInfo, int i, DeviceStatusParam deviceStatusParam) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceStateAIDLCallback.DESCRIPTOR);
                    a.b(parcelObtain, deviceInfo, 0);
                    parcelObtain.writeInt(i);
                    a.b(parcelObtain, deviceStatusParam, 0);
                    this.e.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IDeviceStateAIDLCallback
            public void onDataReceived(DeviceInfo deviceInfo, int i, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceStateAIDLCallback.DESCRIPTOR);
                    a.b(parcelObtain, deviceInfo, 0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeByteArray(bArr);
                    this.e.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IDeviceStateAIDLCallback
            public void onAckReceived(DeviceInfo deviceInfo, int i, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceStateAIDLCallback.DESCRIPTOR);
                    a.b(parcelObtain, deviceInfo, 0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeByteArray(bArr);
                    this.e.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IDeviceStateAIDLCallback
            public void onDatasReceived(DeviceInfo deviceInfo, int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceStateAIDLCallback.DESCRIPTOR);
                    a.b(parcelObtain, deviceInfo, 0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.e.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void b(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
