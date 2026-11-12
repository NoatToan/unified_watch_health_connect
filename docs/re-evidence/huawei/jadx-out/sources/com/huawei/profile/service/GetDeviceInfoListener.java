package com.huawei.profile.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.profile.profile.DeviceProfile;
import com.huawei.profile.profile.Result;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public interface GetDeviceInfoListener extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.profile.service.GetDeviceInfoListener";

    public static class Default implements GetDeviceInfoListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.profile.service.GetDeviceInfoListener
        public void onComplete(Result result, List<DeviceProfile> list) throws RemoteException {
        }
    }

    void onComplete(Result result, List<DeviceProfile> list) throws RemoteException;

    public static abstract class Stub extends Binder implements GetDeviceInfoListener {
        static final int TRANSACTION_onComplete = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, GetDeviceInfoListener.DESCRIPTOR);
        }

        public static GetDeviceInfoListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(GetDeviceInfoListener.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof GetDeviceInfoListener)) {
                return (GetDeviceInfoListener) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(GetDeviceInfoListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(GetDeviceInfoListener.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onComplete((Result) _Parcel.readTypedObject(parcel, Result.CREATOR), parcel.createTypedArrayList(DeviceProfile.CREATOR));
                parcel2.writeNoException();
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        static class Proxy implements GetDeviceInfoListener {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return GetDeviceInfoListener.DESCRIPTOR;
            }

            @Override // com.huawei.profile.service.GetDeviceInfoListener
            public void onComplete(Result result, List<DeviceProfile> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(GetDeviceInfoListener.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, result, 0);
                    _Parcel.writeTypedList(parcelObtain, list, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
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
