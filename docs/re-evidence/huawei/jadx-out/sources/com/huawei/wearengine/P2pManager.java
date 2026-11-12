package com.huawei.wearengine;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.p2p.FileIdentificationParcel;
import com.huawei.wearengine.p2p.IdentityInfo;
import com.huawei.wearengine.p2p.MessageParcel;
import com.huawei.wearengine.p2p.MessageParcelExtra;
import com.huawei.wearengine.p2p.P2pCancelFileTransferCallBack;
import com.huawei.wearengine.p2p.P2pPingCallback;
import com.huawei.wearengine.p2p.P2pSendCallback;
import com.huawei.wearengine.p2p.ReceiverCallback;

/* JADX INFO: loaded from: classes46.dex */
public interface P2pManager extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.wearengine.P2pManager";

    int cancelFileTransfer(Device device, FileIdentificationParcel fileIdentificationParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pCancelFileTransferCallBack p2pCancelFileTransferCallBack) throws RemoteException;

    int getDeviceAppVersionCode(Device device, String str, String str2) throws RemoteException;

    int ping(Device device, String str, String str2, P2pPingCallback p2pPingCallback) throws RemoteException;

    int registerReceiver(Device device, IdentityInfo identityInfo, IdentityInfo identityInfo2, ReceiverCallback receiverCallback, int i) throws RemoteException;

    int registerReceiverInternal(Device device, IdentityInfo identityInfo, IdentityInfo identityInfo2, ReceiverCallback receiverCallback, int i) throws RemoteException;

    int send(Device device, MessageParcel messageParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pSendCallback p2pSendCallback) throws RemoteException;

    int sendExtra(Device device, MessageParcelExtra messageParcelExtra, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pSendCallback p2pSendCallback) throws RemoteException;

    int sendInternal(Device device, MessageParcelExtra messageParcelExtra, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pSendCallback p2pSendCallback) throws RemoteException;

    int unregisterReceiver(ReceiverCallback receiverCallback, int i) throws RemoteException;

    public static abstract class Stub extends Binder implements P2pManager {
        static final int TRANSACTION_cancelFileTransfer = 9;
        static final int TRANSACTION_getDeviceAppVersionCode = 6;
        static final int TRANSACTION_ping = 1;
        static final int TRANSACTION_registerReceiver = 3;
        static final int TRANSACTION_registerReceiverInternal = 8;
        static final int TRANSACTION_send = 2;
        static final int TRANSACTION_sendExtra = 5;
        static final int TRANSACTION_sendInternal = 7;
        static final int TRANSACTION_unregisterReceiver = 4;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, P2pManager.DESCRIPTOR);
        }

        public static P2pManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(P2pManager.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof P2pManager)) {
                return (P2pManager) iInterfaceQueryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(P2pManager.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(P2pManager.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    int iPing = ping((Device) c.e(parcel, Device.CREATOR), parcel.readString(), parcel.readString(), P2pPingCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iPing);
                    return true;
                case 2:
                    int iSend = send((Device) c.e(parcel, Device.CREATOR), (MessageParcel) c.e(parcel, MessageParcel.CREATOR), (IdentityInfo) c.e(parcel, IdentityInfo.CREATOR), (IdentityInfo) c.e(parcel, IdentityInfo.CREATOR), P2pSendCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iSend);
                    return true;
                case 3:
                    int iRegisterReceiver = registerReceiver((Device) c.e(parcel, Device.CREATOR), (IdentityInfo) c.e(parcel, IdentityInfo.CREATOR), (IdentityInfo) c.e(parcel, IdentityInfo.CREATOR), ReceiverCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iRegisterReceiver);
                    return true;
                case 4:
                    int iUnregisterReceiver = unregisterReceiver(ReceiverCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iUnregisterReceiver);
                    return true;
                case 5:
                    int iSendExtra = sendExtra((Device) c.e(parcel, Device.CREATOR), (MessageParcelExtra) c.e(parcel, MessageParcelExtra.CREATOR), (IdentityInfo) c.e(parcel, IdentityInfo.CREATOR), (IdentityInfo) c.e(parcel, IdentityInfo.CREATOR), P2pSendCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iSendExtra);
                    return true;
                case 6:
                    int deviceAppVersionCode = getDeviceAppVersionCode((Device) c.e(parcel, Device.CREATOR), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(deviceAppVersionCode);
                    return true;
                case 7:
                    int iSendInternal = sendInternal((Device) c.e(parcel, Device.CREATOR), (MessageParcelExtra) c.e(parcel, MessageParcelExtra.CREATOR), (IdentityInfo) c.e(parcel, IdentityInfo.CREATOR), (IdentityInfo) c.e(parcel, IdentityInfo.CREATOR), P2pSendCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iSendInternal);
                    return true;
                case 8:
                    int iRegisterReceiverInternal = registerReceiverInternal((Device) c.e(parcel, Device.CREATOR), (IdentityInfo) c.e(parcel, IdentityInfo.CREATOR), (IdentityInfo) c.e(parcel, IdentityInfo.CREATOR), ReceiverCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iRegisterReceiverInternal);
                    return true;
                case 9:
                    int iCancelFileTransfer = cancelFileTransfer((Device) c.e(parcel, Device.CREATOR), (FileIdentificationParcel) c.e(parcel, FileIdentificationParcel.CREATOR), (IdentityInfo) c.e(parcel, IdentityInfo.CREATOR), (IdentityInfo) c.e(parcel, IdentityInfo.CREATOR), P2pCancelFileTransferCallBack.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iCancelFileTransfer);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        static class a implements P2pManager {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f30736a;

            a(IBinder iBinder) {
                this.f30736a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30736a;
            }

            @Override // com.huawei.wearengine.P2pManager
            public int ping(Device device, String str, String str2, P2pPingCallback p2pPingCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(P2pManager.DESCRIPTOR);
                    c.d(parcelObtain, device, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(p2pPingCallback);
                    this.f30736a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.P2pManager
            public int send(Device device, MessageParcel messageParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pSendCallback p2pSendCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(P2pManager.DESCRIPTOR);
                    c.d(parcelObtain, device, 0);
                    c.d(parcelObtain, messageParcel, 0);
                    c.d(parcelObtain, identityInfo, 0);
                    c.d(parcelObtain, identityInfo2, 0);
                    parcelObtain.writeStrongInterface(p2pSendCallback);
                    this.f30736a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.P2pManager
            public int registerReceiver(Device device, IdentityInfo identityInfo, IdentityInfo identityInfo2, ReceiverCallback receiverCallback, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(P2pManager.DESCRIPTOR);
                    c.d(parcelObtain, device, 0);
                    c.d(parcelObtain, identityInfo, 0);
                    c.d(parcelObtain, identityInfo2, 0);
                    parcelObtain.writeStrongInterface(receiverCallback);
                    parcelObtain.writeInt(i);
                    this.f30736a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.P2pManager
            public int unregisterReceiver(ReceiverCallback receiverCallback, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(P2pManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(receiverCallback);
                    parcelObtain.writeInt(i);
                    this.f30736a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.P2pManager
            public int sendExtra(Device device, MessageParcelExtra messageParcelExtra, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pSendCallback p2pSendCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(P2pManager.DESCRIPTOR);
                    c.d(parcelObtain, device, 0);
                    c.d(parcelObtain, messageParcelExtra, 0);
                    c.d(parcelObtain, identityInfo, 0);
                    c.d(parcelObtain, identityInfo2, 0);
                    parcelObtain.writeStrongInterface(p2pSendCallback);
                    this.f30736a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.P2pManager
            public int getDeviceAppVersionCode(Device device, String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(P2pManager.DESCRIPTOR);
                    c.d(parcelObtain, device, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f30736a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.P2pManager
            public int sendInternal(Device device, MessageParcelExtra messageParcelExtra, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pSendCallback p2pSendCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(P2pManager.DESCRIPTOR);
                    c.d(parcelObtain, device, 0);
                    c.d(parcelObtain, messageParcelExtra, 0);
                    c.d(parcelObtain, identityInfo, 0);
                    c.d(parcelObtain, identityInfo2, 0);
                    parcelObtain.writeStrongInterface(p2pSendCallback);
                    this.f30736a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.P2pManager
            public int registerReceiverInternal(Device device, IdentityInfo identityInfo, IdentityInfo identityInfo2, ReceiverCallback receiverCallback, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(P2pManager.DESCRIPTOR);
                    c.d(parcelObtain, device, 0);
                    c.d(parcelObtain, identityInfo, 0);
                    c.d(parcelObtain, identityInfo2, 0);
                    parcelObtain.writeStrongInterface(receiverCallback);
                    parcelObtain.writeInt(i);
                    this.f30736a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.P2pManager
            public int cancelFileTransfer(Device device, FileIdentificationParcel fileIdentificationParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pCancelFileTransferCallBack p2pCancelFileTransferCallBack) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(P2pManager.DESCRIPTOR);
                    c.d(parcelObtain, device, 0);
                    c.d(parcelObtain, fileIdentificationParcel, 0);
                    c.d(parcelObtain, identityInfo, 0);
                    c.d(parcelObtain, identityInfo2, 0);
                    parcelObtain.writeStrongInterface(p2pCancelFileTransferCallBack);
                    this.f30736a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    public static class c {
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
    }
}
