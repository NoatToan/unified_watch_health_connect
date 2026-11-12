package com.huawei.wearengine;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.wearengine.connect.ServiceConnectCallback;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.ota.CheckBinderCallback;
import com.huawei.wearengine.ota.DeviceListBinderCallback;
import com.huawei.wearengine.ota.UpgradeBinderCallBack;
import com.huawei.wearengine.ota.UpgradeStatusBinderCallBack;

/* JADX INFO: loaded from: classes46.dex */
public interface OtaManager extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.wearengine.OtaManager";

    void doUpgrade(Device device, String str, UpgradeBinderCallBack upgradeBinderCallBack) throws RemoteException;

    void getConnectedDevices(DeviceListBinderCallback deviceListBinderCallback) throws RemoteException;

    void getDeviceNewVersion(Device device, CheckBinderCallback checkBinderCallback) throws RemoteException;

    void getUpgradeStatus(Device device, UpgradeStatusBinderCallBack upgradeStatusBinderCallBack) throws RemoteException;

    int registerOtaServiceConnectCallback(ServiceConnectCallback serviceConnectCallback) throws RemoteException;

    void registerUpgradeListener(Device device, UpgradeStatusBinderCallBack upgradeStatusBinderCallBack) throws RemoteException;

    void unRegisterUpgradeListener(Device device) throws RemoteException;

    int unregisterOtaServiceConnectCallback(ServiceConnectCallback serviceConnectCallback) throws RemoteException;

    public static abstract class Stub extends Binder implements OtaManager {
        static final int TRANSACTION_doUpgrade = 3;
        static final int TRANSACTION_getConnectedDevices = 1;
        static final int TRANSACTION_getDeviceNewVersion = 2;
        static final int TRANSACTION_getUpgradeStatus = 4;
        static final int TRANSACTION_registerOtaServiceConnectCallback = 7;
        static final int TRANSACTION_registerUpgradeListener = 5;
        static final int TRANSACTION_unRegisterUpgradeListener = 6;
        static final int TRANSACTION_unregisterOtaServiceConnectCallback = 8;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, OtaManager.DESCRIPTOR);
        }

        public static OtaManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(OtaManager.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof OtaManager)) {
                return (OtaManager) iInterfaceQueryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(OtaManager.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(OtaManager.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    getConnectedDevices(DeviceListBinderCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    Device device = (Device) e.b(parcel, Device.CREATOR);
                    getDeviceNewVersion(device, CheckBinderCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    e.c(parcel2, device, 1);
                    return true;
                case 3:
                    Device device2 = (Device) e.b(parcel, Device.CREATOR);
                    doUpgrade(device2, parcel.readString(), UpgradeBinderCallBack.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    e.c(parcel2, device2, 1);
                    return true;
                case 4:
                    Device device3 = (Device) e.b(parcel, Device.CREATOR);
                    getUpgradeStatus(device3, UpgradeStatusBinderCallBack.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    e.c(parcel2, device3, 1);
                    return true;
                case 5:
                    Device device4 = (Device) e.b(parcel, Device.CREATOR);
                    registerUpgradeListener(device4, UpgradeStatusBinderCallBack.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    e.c(parcel2, device4, 1);
                    return true;
                case 6:
                    Device device5 = (Device) e.b(parcel, Device.CREATOR);
                    unRegisterUpgradeListener(device5);
                    parcel2.writeNoException();
                    e.c(parcel2, device5, 1);
                    return true;
                case 7:
                    int iRegisterOtaServiceConnectCallback = registerOtaServiceConnectCallback(ServiceConnectCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iRegisterOtaServiceConnectCallback);
                    return true;
                case 8:
                    int iUnregisterOtaServiceConnectCallback = unregisterOtaServiceConnectCallback(ServiceConnectCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iUnregisterOtaServiceConnectCallback);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        static class a implements OtaManager {
            private IBinder e;

            a(IBinder iBinder) {
                this.e = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.e;
            }

            @Override // com.huawei.wearengine.OtaManager
            public void getConnectedDevices(DeviceListBinderCallback deviceListBinderCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(OtaManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(deviceListBinderCallback);
                    this.e.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.OtaManager
            public void getDeviceNewVersion(Device device, CheckBinderCallback checkBinderCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(OtaManager.DESCRIPTOR);
                    e.c(parcelObtain, device, 0);
                    parcelObtain.writeStrongInterface(checkBinderCallback);
                    this.e.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        device.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.OtaManager
            public void doUpgrade(Device device, String str, UpgradeBinderCallBack upgradeBinderCallBack) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(OtaManager.DESCRIPTOR);
                    e.c(parcelObtain, device, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(upgradeBinderCallBack);
                    this.e.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        device.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.OtaManager
            public void getUpgradeStatus(Device device, UpgradeStatusBinderCallBack upgradeStatusBinderCallBack) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(OtaManager.DESCRIPTOR);
                    e.c(parcelObtain, device, 0);
                    parcelObtain.writeStrongInterface(upgradeStatusBinderCallBack);
                    this.e.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        device.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.OtaManager
            public void registerUpgradeListener(Device device, UpgradeStatusBinderCallBack upgradeStatusBinderCallBack) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(OtaManager.DESCRIPTOR);
                    e.c(parcelObtain, device, 0);
                    parcelObtain.writeStrongInterface(upgradeStatusBinderCallBack);
                    this.e.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        device.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.OtaManager
            public void unRegisterUpgradeListener(Device device) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(OtaManager.DESCRIPTOR);
                    e.c(parcelObtain, device, 0);
                    this.e.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        device.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.OtaManager
            public int registerOtaServiceConnectCallback(ServiceConnectCallback serviceConnectCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(OtaManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(serviceConnectCallback);
                    this.e.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.OtaManager
            public int unregisterOtaServiceConnectCallback(ServiceConnectCallback serviceConnectCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(OtaManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(serviceConnectCallback);
                    this.e.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    public static class e {
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
