package com.huawei.profile.service;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.profile.profile.DeviceProfile;
import com.huawei.profile.profile.ParcelableDeviceProfileChange;
import com.huawei.profile.profile.SubscribeInfo;
import com.huawei.profile.subscription.event.EventInfo;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public interface SubscribeProfileListener extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.profile.service.SubscribeProfileListener";

    public static class Default implements SubscribeProfileListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.profile.service.SubscribeProfileListener
        public void onNotifyDeviceListChange(int i, List<DeviceProfile> list, Bundle bundle) throws RemoteException {
        }

        @Override // com.huawei.profile.service.SubscribeProfileListener
        public void onNotifyDeviceListInfoChange(int i, List<DeviceProfile> list, Bundle bundle) throws RemoteException {
        }

        @Override // com.huawei.profile.service.SubscribeProfileListener
        public void onNotifyDeviceProfileChange(SubscribeInfo subscribeInfo, Bundle bundle) throws RemoteException {
        }

        @Override // com.huawei.profile.service.SubscribeProfileListener
        public void onNotifyDeviceProfileChangeList(com.huawei.profile.subscription.deviceinfo.SubscribeInfo subscribeInfo, List<ParcelableDeviceProfileChange> list, Bundle bundle) throws RemoteException {
        }

        @Override // com.huawei.profile.service.SubscribeProfileListener
        public void onNotifyEvent(EventInfo eventInfo, String str) throws RemoteException {
        }
    }

    void onNotifyDeviceListChange(int i, List<DeviceProfile> list, Bundle bundle) throws RemoteException;

    void onNotifyDeviceListInfoChange(int i, List<DeviceProfile> list, Bundle bundle) throws RemoteException;

    void onNotifyDeviceProfileChange(SubscribeInfo subscribeInfo, Bundle bundle) throws RemoteException;

    void onNotifyDeviceProfileChangeList(com.huawei.profile.subscription.deviceinfo.SubscribeInfo subscribeInfo, List<ParcelableDeviceProfileChange> list, Bundle bundle) throws RemoteException;

    void onNotifyEvent(EventInfo eventInfo, String str) throws RemoteException;

    public static abstract class Stub extends Binder implements SubscribeProfileListener {
        static final int TRANSACTION_onNotifyDeviceListChange = 2;
        static final int TRANSACTION_onNotifyDeviceListInfoChange = 4;
        static final int TRANSACTION_onNotifyDeviceProfileChange = 1;
        static final int TRANSACTION_onNotifyDeviceProfileChangeList = 3;
        static final int TRANSACTION_onNotifyEvent = 5;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, SubscribeProfileListener.DESCRIPTOR);
        }

        public static SubscribeProfileListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(SubscribeProfileListener.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof SubscribeProfileListener)) {
                return (SubscribeProfileListener) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(SubscribeProfileListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(SubscribeProfileListener.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onNotifyDeviceProfileChange((SubscribeInfo) _Parcel.readTypedObject(parcel, SubscribeInfo.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            } else if (i == 2) {
                onNotifyDeviceListChange(parcel.readInt(), parcel.createTypedArrayList(DeviceProfile.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            } else if (i == 3) {
                onNotifyDeviceProfileChangeList((com.huawei.profile.subscription.deviceinfo.SubscribeInfo) _Parcel.readTypedObject(parcel, com.huawei.profile.subscription.deviceinfo.SubscribeInfo.CREATOR), parcel.createTypedArrayList(ParcelableDeviceProfileChange.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            } else if (i == 4) {
                onNotifyDeviceListInfoChange(parcel.readInt(), parcel.createTypedArrayList(DeviceProfile.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            } else if (i == 5) {
                onNotifyEvent((EventInfo) _Parcel.readTypedObject(parcel, EventInfo.CREATOR), parcel.readString());
                parcel2.writeNoException();
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        static class Proxy implements SubscribeProfileListener {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return SubscribeProfileListener.DESCRIPTOR;
            }

            @Override // com.huawei.profile.service.SubscribeProfileListener
            public void onNotifyDeviceProfileChange(SubscribeInfo subscribeInfo, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(SubscribeProfileListener.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, subscribeInfo, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.SubscribeProfileListener
            public void onNotifyDeviceListChange(int i, List<DeviceProfile> list, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(SubscribeProfileListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    _Parcel.writeTypedList(parcelObtain, list, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.SubscribeProfileListener
            public void onNotifyDeviceProfileChangeList(com.huawei.profile.subscription.deviceinfo.SubscribeInfo subscribeInfo, List<ParcelableDeviceProfileChange> list, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(SubscribeProfileListener.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, subscribeInfo, 0);
                    _Parcel.writeTypedList(parcelObtain, list, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.SubscribeProfileListener
            public void onNotifyDeviceListInfoChange(int i, List<DeviceProfile> list, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(SubscribeProfileListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    _Parcel.writeTypedList(parcelObtain, list, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.SubscribeProfileListener
            public void onNotifyEvent(EventInfo eventInfo, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(SubscribeProfileListener.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, eventInfo, 0);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedList(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                writeTypedObject(parcel, list.get(i2), i);
            }
        }
    }
}
