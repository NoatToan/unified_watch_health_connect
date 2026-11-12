package com.huawei.wearengine;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.device.FoundListener;
import com.huawei.wearengine.device.GetAttributeListener;
import com.huawei.wearengine.monitor.MonitorCallback;
import com.huawei.wearengine.monitor.QueryDataCallback;
import com.huawei.wearengine.monitor.SwitchStatusCallback;
import com.huawei.wearengine.notify.NotificationParcel;
import com.huawei.wearengine.notify.NotifySendCallback;
import com.huawei.wearengine.p2p.FileIdentificationParcel;
import com.huawei.wearengine.p2p.IdentityInfo;
import com.huawei.wearengine.p2p.MessageParcelExtra;
import com.huawei.wearengine.p2p.P2pCancelFileTransferCallBack;
import com.huawei.wearengine.p2p.P2pPingCallback;
import com.huawei.wearengine.p2p.P2pReceiverCallback;
import com.huawei.wearengine.p2p.P2pSendCallback;

/* JADX INFO: loaded from: classes3.dex */
public interface HiWearEngineService extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.wearengine.HiWearEngineService";

    /* JADX INFO: loaded from: classes46.dex */
    public static class Default implements HiWearEngineService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.wearengine.HiWearEngineService
        public void cancelFileTransfer(Device device, FileIdentificationParcel fileIdentificationParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pCancelFileTransferCallBack p2pCancelFileTransferCallBack) throws RemoteException {
        }

        @Override // com.huawei.wearengine.HiWearEngineService
        public void getAllBondedDevices(FoundListener foundListener, String str) throws RemoteException {
        }

        @Override // com.huawei.wearengine.HiWearEngineService
        public void getBondedDevices(FoundListener foundListener, String str, boolean z) throws RemoteException {
        }

        @Override // com.huawei.wearengine.HiWearEngineService
        public void getCommonDevices(FoundListener foundListener, String str, boolean z) throws RemoteException {
        }

        @Override // com.huawei.wearengine.HiWearEngineService
        public void getDeviceAppVersionCode(Device device, String str, String str2, P2pPingCallback p2pPingCallback) throws RemoteException {
        }

        @Override // com.huawei.wearengine.HiWearEngineService
        public void getHiLinkDeviceId(Device device, GetAttributeListener getAttributeListener) throws RemoteException {
        }

        @Override // com.huawei.wearengine.HiWearEngineService
        public void notify(String str, NotificationParcel notificationParcel, NotifySendCallback notifySendCallback) throws RemoteException {
        }

        @Override // com.huawei.wearengine.HiWearEngineService
        public void ping(Device device, String str, String str2, P2pPingCallback p2pPingCallback) throws RemoteException {
        }

        @Override // com.huawei.wearengine.HiWearEngineService
        public void query(Device device, String str, QueryDataCallback queryDataCallback) throws RemoteException {
        }

        @Override // com.huawei.wearengine.HiWearEngineService
        public void queryDeviceCapability(Device device, int i, GetAttributeListener getAttributeListener) throws RemoteException {
        }

        @Override // com.huawei.wearengine.HiWearEngineService
        public void send(String str, MessageParcelExtra messageParcelExtra, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pSendCallback p2pSendCallback) throws RemoteException {
        }

        @Override // com.huawei.wearengine.HiWearEngineService
        public void subscribeDeviceDataReceiver(P2pReceiverCallback p2pReceiverCallback) throws RemoteException {
        }

        @Override // com.huawei.wearengine.HiWearEngineService
        public void subscribeMonitorReceiver(MonitorCallback monitorCallback) throws RemoteException {
        }

        @Override // com.huawei.wearengine.HiWearEngineService
        public void switchMonitorStatus(int i, String str, String str2, SwitchStatusCallback switchStatusCallback) throws RemoteException {
        }

        @Override // com.huawei.wearengine.HiWearEngineService
        public void unsubscribeDeviceDataReceiver() throws RemoteException {
        }

        @Override // com.huawei.wearengine.HiWearEngineService
        public void unsubscribeMonitorReceiver() throws RemoteException {
        }
    }

    void cancelFileTransfer(Device device, FileIdentificationParcel fileIdentificationParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pCancelFileTransferCallBack p2pCancelFileTransferCallBack) throws RemoteException;

    void getAllBondedDevices(FoundListener foundListener, String str) throws RemoteException;

    void getBondedDevices(FoundListener foundListener, String str, boolean z) throws RemoteException;

    void getCommonDevices(FoundListener foundListener, String str, boolean z) throws RemoteException;

    void getDeviceAppVersionCode(Device device, String str, String str2, P2pPingCallback p2pPingCallback) throws RemoteException;

    void getHiLinkDeviceId(Device device, GetAttributeListener getAttributeListener) throws RemoteException;

    void notify(String str, NotificationParcel notificationParcel, NotifySendCallback notifySendCallback) throws RemoteException;

    void ping(Device device, String str, String str2, P2pPingCallback p2pPingCallback) throws RemoteException;

    void query(Device device, String str, QueryDataCallback queryDataCallback) throws RemoteException;

    void queryDeviceCapability(Device device, int i, GetAttributeListener getAttributeListener) throws RemoteException;

    void send(String str, MessageParcelExtra messageParcelExtra, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pSendCallback p2pSendCallback) throws RemoteException;

    void subscribeDeviceDataReceiver(P2pReceiverCallback p2pReceiverCallback) throws RemoteException;

    void subscribeMonitorReceiver(MonitorCallback monitorCallback) throws RemoteException;

    void switchMonitorStatus(int i, String str, String str2, SwitchStatusCallback switchStatusCallback) throws RemoteException;

    void unsubscribeDeviceDataReceiver() throws RemoteException;

    void unsubscribeMonitorReceiver() throws RemoteException;

    public static abstract class Stub extends Binder implements HiWearEngineService {
        static final int TRANSACTION_cancelFileTransfer = 13;
        static final int TRANSACTION_getAllBondedDevices = 14;
        static final int TRANSACTION_getBondedDevices = 1;
        static final int TRANSACTION_getCommonDevices = 15;
        static final int TRANSACTION_getDeviceAppVersionCode = 12;
        static final int TRANSACTION_getHiLinkDeviceId = 11;
        static final int TRANSACTION_notify = 10;
        static final int TRANSACTION_ping = 2;
        static final int TRANSACTION_query = 6;
        static final int TRANSACTION_queryDeviceCapability = 16;
        static final int TRANSACTION_send = 3;
        static final int TRANSACTION_subscribeDeviceDataReceiver = 4;
        static final int TRANSACTION_subscribeMonitorReceiver = 7;
        static final int TRANSACTION_switchMonitorStatus = 9;
        static final int TRANSACTION_unsubscribeDeviceDataReceiver = 5;
        static final int TRANSACTION_unsubscribeMonitorReceiver = 8;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, HiWearEngineService.DESCRIPTOR);
        }

        public static HiWearEngineService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(HiWearEngineService.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof HiWearEngineService)) {
                return (HiWearEngineService) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(HiWearEngineService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(HiWearEngineService.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    getBondedDevices(FoundListener.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    ping((Device) b.d(parcel, Device.CREATOR), parcel.readString(), parcel.readString(), P2pPingCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    send(parcel.readString(), (MessageParcelExtra) b.d(parcel, MessageParcelExtra.CREATOR), (IdentityInfo) b.d(parcel, IdentityInfo.CREATOR), (IdentityInfo) b.d(parcel, IdentityInfo.CREATOR), P2pSendCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    subscribeDeviceDataReceiver(P2pReceiverCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    unsubscribeDeviceDataReceiver();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    query((Device) b.d(parcel, Device.CREATOR), parcel.readString(), QueryDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    subscribeMonitorReceiver(MonitorCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    unsubscribeMonitorReceiver();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    switchMonitorStatus(parcel.readInt(), parcel.readString(), parcel.readString(), SwitchStatusCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    notify(parcel.readString(), (NotificationParcel) b.d(parcel, NotificationParcel.CREATOR), NotifySendCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    getHiLinkDeviceId((Device) b.d(parcel, Device.CREATOR), GetAttributeListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    getDeviceAppVersionCode((Device) b.d(parcel, Device.CREATOR), parcel.readString(), parcel.readString(), P2pPingCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    cancelFileTransfer((Device) b.d(parcel, Device.CREATOR), (FileIdentificationParcel) b.d(parcel, FileIdentificationParcel.CREATOR), (IdentityInfo) b.d(parcel, IdentityInfo.CREATOR), (IdentityInfo) b.d(parcel, IdentityInfo.CREATOR), P2pCancelFileTransferCallBack.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    getAllBondedDevices(FoundListener.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 15:
                    getCommonDevices(FoundListener.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    queryDeviceCapability((Device) b.d(parcel, Device.CREATOR), parcel.readInt(), GetAttributeListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: loaded from: classes46.dex */
        static class Proxy implements HiWearEngineService {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return HiWearEngineService.DESCRIPTOR;
            }

            @Override // com.huawei.wearengine.HiWearEngineService
            public void getBondedDevices(FoundListener foundListener, String str, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(HiWearEngineService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(foundListener);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.HiWearEngineService
            public void ping(Device device, String str, String str2, P2pPingCallback p2pPingCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(HiWearEngineService.DESCRIPTOR);
                    b.c(parcelObtain, device, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(p2pPingCallback);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.HiWearEngineService
            public void send(String str, MessageParcelExtra messageParcelExtra, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pSendCallback p2pSendCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(HiWearEngineService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    b.c(parcelObtain, messageParcelExtra, 0);
                    b.c(parcelObtain, identityInfo, 0);
                    b.c(parcelObtain, identityInfo2, 0);
                    parcelObtain.writeStrongInterface(p2pSendCallback);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.HiWearEngineService
            public void subscribeDeviceDataReceiver(P2pReceiverCallback p2pReceiverCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(HiWearEngineService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(p2pReceiverCallback);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.HiWearEngineService
            public void unsubscribeDeviceDataReceiver() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(HiWearEngineService.DESCRIPTOR);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.HiWearEngineService
            public void query(Device device, String str, QueryDataCallback queryDataCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(HiWearEngineService.DESCRIPTOR);
                    b.c(parcelObtain, device, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(queryDataCallback);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.HiWearEngineService
            public void subscribeMonitorReceiver(MonitorCallback monitorCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(HiWearEngineService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(monitorCallback);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.HiWearEngineService
            public void unsubscribeMonitorReceiver() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(HiWearEngineService.DESCRIPTOR);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.HiWearEngineService
            public void switchMonitorStatus(int i, String str, String str2, SwitchStatusCallback switchStatusCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(HiWearEngineService.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(switchStatusCallback);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.HiWearEngineService
            public void notify(String str, NotificationParcel notificationParcel, NotifySendCallback notifySendCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(HiWearEngineService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    b.c(parcelObtain, notificationParcel, 0);
                    parcelObtain.writeStrongInterface(notifySendCallback);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.HiWearEngineService
            public void getHiLinkDeviceId(Device device, GetAttributeListener getAttributeListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(HiWearEngineService.DESCRIPTOR);
                    b.c(parcelObtain, device, 0);
                    parcelObtain.writeStrongInterface(getAttributeListener);
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.HiWearEngineService
            public void getDeviceAppVersionCode(Device device, String str, String str2, P2pPingCallback p2pPingCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(HiWearEngineService.DESCRIPTOR);
                    b.c(parcelObtain, device, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(p2pPingCallback);
                    this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.HiWearEngineService
            public void cancelFileTransfer(Device device, FileIdentificationParcel fileIdentificationParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pCancelFileTransferCallBack p2pCancelFileTransferCallBack) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(HiWearEngineService.DESCRIPTOR);
                    b.c(parcelObtain, device, 0);
                    b.c(parcelObtain, fileIdentificationParcel, 0);
                    b.c(parcelObtain, identityInfo, 0);
                    b.c(parcelObtain, identityInfo2, 0);
                    parcelObtain.writeStrongInterface(p2pCancelFileTransferCallBack);
                    this.mRemote.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.HiWearEngineService
            public void getAllBondedDevices(FoundListener foundListener, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(HiWearEngineService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(foundListener);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.HiWearEngineService
            public void getCommonDevices(FoundListener foundListener, String str, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(HiWearEngineService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(foundListener);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.HiWearEngineService
            public void queryDeviceCapability(Device device, int i, GetAttributeListener getAttributeListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(HiWearEngineService.DESCRIPTOR);
                    b.c(parcelObtain, device, 0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(getAttributeListener);
                    this.mRemote.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T d(Parcel parcel, Parcelable.Creator<T> creator) {
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
