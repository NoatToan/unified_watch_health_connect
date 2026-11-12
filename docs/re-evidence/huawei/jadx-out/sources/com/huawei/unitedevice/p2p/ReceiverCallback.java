package com.huawei.unitedevice.p2p;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.devicesdk.entity.DeviceInfo;

/* JADX INFO: loaded from: classes20.dex */
public interface ReceiverCallback extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.unitedevice.p2p.ReceiverCallback";

    void onReceiveMessage(DeviceInfo deviceInfo, MessageParcel messageParcel) throws RemoteException;

    public static abstract class Stub extends Binder implements ReceiverCallback {
        static final int TRANSACTION_onReceiveMessage = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, ReceiverCallback.DESCRIPTOR);
        }

        public static ReceiverCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ReceiverCallback.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof ReceiverCallback)) {
                return (ReceiverCallback) iInterfaceQueryLocalInterface;
            }
            return new d(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ReceiverCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ReceiverCallback.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            DeviceInfo deviceInfo = (DeviceInfo) d.c(parcel, DeviceInfo.CREATOR);
            MessageParcel messageParcel = (MessageParcel) d.c(parcel, MessageParcel.CREATOR);
            onReceiveMessage(deviceInfo, messageParcel);
            parcel2.writeNoException();
            d.a(parcel2, deviceInfo, 1);
            d.a(parcel2, messageParcel, 1);
            return true;
        }

        static class d implements ReceiverCallback {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f29886b;

            d(IBinder iBinder) {
                this.f29886b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29886b;
            }

            @Override // com.huawei.unitedevice.p2p.ReceiverCallback
            public void onReceiveMessage(DeviceInfo deviceInfo, MessageParcel messageParcel) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ReceiverCallback.DESCRIPTOR);
                    d.a(parcelObtain, deviceInfo, 0);
                    d.a(parcelObtain, messageParcel, 0);
                    this.f29886b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        deviceInfo.readFromParcel(parcelObtain2);
                    }
                    if (parcelObtain2.readInt() != 0) {
                        messageParcel.readFromParcel(parcelObtain2);
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
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void a(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
