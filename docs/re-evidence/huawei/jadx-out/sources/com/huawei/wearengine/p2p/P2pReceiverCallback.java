package com.huawei.wearengine.p2p;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.wearengine.device.Device;

/* JADX INFO: loaded from: classes20.dex */
public interface P2pReceiverCallback extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.wearengine.p2p.P2pReceiverCallback";

    /* JADX INFO: loaded from: classes46.dex */
    public static class Default implements P2pReceiverCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.wearengine.p2p.P2pReceiverCallback
        public void onDataReceived(Device device, MessageParcel messageParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, ReceiveResultCallback receiveResultCallback) throws RemoteException {
        }
    }

    void onDataReceived(Device device, MessageParcel messageParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, ReceiveResultCallback receiveResultCallback) throws RemoteException;

    public static abstract class Stub extends Binder implements P2pReceiverCallback {
        static final int TRANSACTION_onDataReceived = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, P2pReceiverCallback.DESCRIPTOR);
        }

        public static P2pReceiverCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(P2pReceiverCallback.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof P2pReceiverCallback)) {
                return (P2pReceiverCallback) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(P2pReceiverCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(P2pReceiverCallback.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            Device device = (Device) c.d(parcel, Device.CREATOR);
            MessageParcel messageParcel = (MessageParcel) c.d(parcel, MessageParcel.CREATOR);
            onDataReceived(device, messageParcel, (IdentityInfo) c.d(parcel, IdentityInfo.CREATOR), (IdentityInfo) c.d(parcel, IdentityInfo.CREATOR), ReceiveResultCallback.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            c.b(parcel2, device, 1);
            c.b(parcel2, messageParcel, 1);
            return true;
        }

        static class Proxy implements P2pReceiverCallback {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return P2pReceiverCallback.DESCRIPTOR;
            }

            @Override // com.huawei.wearengine.p2p.P2pReceiverCallback
            public void onDataReceived(Device device, MessageParcel messageParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, ReceiveResultCallback receiveResultCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(P2pReceiverCallback.DESCRIPTOR);
                    c.b(parcelObtain, device, 0);
                    c.b(parcelObtain, messageParcel, 0);
                    c.b(parcelObtain, identityInfo, 0);
                    c.b(parcelObtain, identityInfo2, 0);
                    parcelObtain.writeStrongInterface(receiveResultCallback);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        device.readFromParcel(parcelObtain2);
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

    public static class c {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T d(Parcel parcel, Parcelable.Creator<T> creator) {
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
