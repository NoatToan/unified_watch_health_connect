package com.huawei.hwservicesmgr;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes38.dex */
public interface IPhoneServiceAIDL extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.hwservicesmgr.IPhoneServiceAIDL";

    DeviceCapability getDeviceCapability() throws RemoteException;

    List<DeviceInfo> getUsedDeviceList() throws RemoteException;

    void registerBinder(IBinder iBinder, String str, String str2) throws RemoteException;

    public static abstract class Stub extends Binder implements IPhoneServiceAIDL {
        static final int TRANSACTION_getDeviceCapability = 3;
        static final int TRANSACTION_getUsedDeviceList = 2;
        static final int TRANSACTION_registerBinder = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IPhoneServiceAIDL.DESCRIPTOR);
        }

        public static IPhoneServiceAIDL asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IPhoneServiceAIDL.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IPhoneServiceAIDL)) {
                return (IPhoneServiceAIDL) iInterfaceQueryLocalInterface;
            }
            return new d(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IPhoneServiceAIDL.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IPhoneServiceAIDL.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                registerBinder(parcel.readStrongBinder(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 2) {
                List<DeviceInfo> usedDeviceList = getUsedDeviceList();
                parcel2.writeNoException();
                a.e(parcel2, usedDeviceList, 1);
            } else if (i == 3) {
                DeviceCapability deviceCapability = getDeviceCapability();
                parcel2.writeNoException();
                a.d(parcel2, deviceCapability, 1);
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        static class d implements IPhoneServiceAIDL {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f17673a;

            d(IBinder iBinder) {
                this.f17673a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17673a;
            }

            @Override // com.huawei.hwservicesmgr.IPhoneServiceAIDL
            public void registerBinder(IBinder iBinder, String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f17673a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IPhoneServiceAIDL
            public List<DeviceInfo> getUsedDeviceList() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPhoneServiceAIDL.DESCRIPTOR);
                    this.f17673a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(DeviceInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IPhoneServiceAIDL
            public DeviceCapability getDeviceCapability() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPhoneServiceAIDL.DESCRIPTOR);
                    this.f17673a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (DeviceCapability) a.e(parcelObtain2, DeviceCapability.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T e(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void e(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                d(parcel, list.get(i2), i);
            }
        }
    }
}
