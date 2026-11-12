package com.huawei.devicesdk.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.devicesdk.callback.CompatibleFitterCallback;
import com.huawei.devicesdk.callback.DeviceHandshakeCallback;
import com.huawei.devicesdk.callback.FrameReceiver;
import com.huawei.devicesdk.callback.ScanCallback;
import com.huawei.devicesdk.callback.StatusCallback;
import com.huawei.devicesdk.entity.CommandMessageParcel;
import com.huawei.devicesdk.entity.ScanFilterParcel;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.unitedevice.callback.IResultAIDLCallback;
import com.huawei.unitedevice.callback.ITransferFileCallback;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.unitedevice.hwcommonfilemgr.entity.CommonFileInfoParcel;
import com.huawei.unitedevice.hwcommonfilemgr.entity.FileInfo;
import com.huawei.unitedevice.hwcommonfilemgr.entity.RequestFileInfo;
import com.huawei.unitedevice.p2p.IdentityInfo;
import com.huawei.unitedevice.p2p.MessageParcel;
import com.huawei.unitedevice.p2p.P2pPingCallback;
import com.huawei.unitedevice.p2p.P2pSendCallback;
import com.huawei.unitedevice.p2p.ReceiverCallback;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface DevicesManagementBinderInterface extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.devicesdk.service.DevicesManagementBinderInterface";

    int connectDevice(UniteDevice uniteDevice, boolean z, int i, DeviceHandshakeCallback deviceHandshakeCallback) throws RemoteException;

    int disconnectDevice(UniteDevice uniteDevice) throws RemoteException;

    List<UniteDevice> getDeviceList() throws RemoteException;

    List<DeviceInfo> getDeviceMgrList(int i, String str) throws RemoteException;

    int initUniteService(CompatibleFitterCallback compatibleFitterCallback) throws RemoteException;

    boolean isSupportCharacteristic(UniteDevice uniteDevice, String str, String str2) throws RemoteException;

    boolean isSupportService(UniteDevice uniteDevice, String str) throws RemoteException;

    int pairDevice(UniteDevice uniteDevice, int i) throws RemoteException;

    void ping(UniteDevice uniteDevice, String str, String str2, P2pPingCallback p2pPingCallback, int i) throws RemoteException;

    int registerDeviceFrameListener(FrameReceiver frameReceiver) throws RemoteException;

    int registerDeviceStatusListener(StatusCallback statusCallback) throws RemoteException;

    void registerHandshakeCallback(DeviceHandshakeCallback deviceHandshakeCallback) throws RemoteException;

    void registerListener(String str, String str2, FrameReceiver frameReceiver) throws RemoteException;

    int scanDevice(int i, List<ScanFilterParcel> list, ScanCallback scanCallback) throws RemoteException;

    int send(UniteDevice uniteDevice, MessageParcel messageParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pSendCallback p2pSendCallback) throws RemoteException;

    int sendCommand(UniteDevice uniteDevice, CommandMessageParcel commandMessageParcel) throws RemoteException;

    int setCharacteristicNotify(UniteDevice uniteDevice, String str, String str2, int i, boolean z) throws RemoteException;

    void startRequestFile(RequestFileInfo requestFileInfo, ITransferFileCallback iTransferFileCallback) throws RemoteException;

    int startTransferFile(FileInfo fileInfo, IResultAIDLCallback iResultAIDLCallback) throws RemoteException;

    void stopRequestFile(RequestFileInfo requestFileInfo, ITransferFileCallback iTransferFileCallback) throws RemoteException;

    void stopScanDevice() throws RemoteException;

    void stopTransferByQueue(CommonFileInfoParcel commonFileInfoParcel, ITransferFileCallback iTransferFileCallback) throws RemoteException;

    void subscribeDeviceDataReceiver(IdentityInfo identityInfo, IdentityInfo identityInfo2, ReceiverCallback receiverCallback, String str, P2pSendCallback p2pSendCallback) throws RemoteException;

    int unpairDevice(UniteDevice uniteDevice) throws RemoteException;

    int unregisterDeviceFrameListener(FrameReceiver frameReceiver) throws RemoteException;

    int unregisterDeviceStatusListener(StatusCallback statusCallback) throws RemoteException;

    void unregisterListener(String str, String str2) throws RemoteException;

    void unsubscribeDeviceDataReceiver(ReceiverCallback receiverCallback, String str, String str2, String str3) throws RemoteException;

    void updateDeviceAfterSimulatConnected(String str) throws RemoteException;

    public static abstract class Stub extends Binder implements DevicesManagementBinderInterface {
        static final int TRANSACTION_connectDevice = 5;
        static final int TRANSACTION_disconnectDevice = 9;
        static final int TRANSACTION_getDeviceList = 7;
        static final int TRANSACTION_getDeviceMgrList = 29;
        static final int TRANSACTION_initUniteService = 1;
        static final int TRANSACTION_isSupportCharacteristic = 11;
        static final int TRANSACTION_isSupportService = 10;
        static final int TRANSACTION_pairDevice = 4;
        static final int TRANSACTION_ping = 17;
        static final int TRANSACTION_registerDeviceFrameListener = 14;
        static final int TRANSACTION_registerDeviceStatusListener = 12;
        static final int TRANSACTION_registerHandshakeCallback = 27;
        static final int TRANSACTION_registerListener = 25;
        static final int TRANSACTION_scanDevice = 2;
        static final int TRANSACTION_send = 18;
        static final int TRANSACTION_sendCommand = 6;
        static final int TRANSACTION_setCharacteristicNotify = 16;
        static final int TRANSACTION_startRequestFile = 21;
        static final int TRANSACTION_startTransferFile = 23;
        static final int TRANSACTION_stopRequestFile = 22;
        static final int TRANSACTION_stopScanDevice = 3;
        static final int TRANSACTION_stopTransferByQueue = 24;
        static final int TRANSACTION_subscribeDeviceDataReceiver = 19;
        static final int TRANSACTION_unpairDevice = 8;
        static final int TRANSACTION_unregisterDeviceFrameListener = 15;
        static final int TRANSACTION_unregisterDeviceStatusListener = 13;
        static final int TRANSACTION_unregisterListener = 26;
        static final int TRANSACTION_unsubscribeDeviceDataReceiver = 20;
        static final int TRANSACTION_updateDeviceAfterSimulatConnected = 28;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DevicesManagementBinderInterface.DESCRIPTOR);
        }

        public static DevicesManagementBinderInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DevicesManagementBinderInterface.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof DevicesManagementBinderInterface)) {
                return (DevicesManagementBinderInterface) iInterfaceQueryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(DevicesManagementBinderInterface.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(DevicesManagementBinderInterface.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    int iInitUniteService = initUniteService(CompatibleFitterCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iInitUniteService);
                    return true;
                case 2:
                    int iScanDevice = scanDevice(parcel.readInt(), parcel.createTypedArrayList(ScanFilterParcel.CREATOR), ScanCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iScanDevice);
                    return true;
                case 3:
                    stopScanDevice();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    int iPairDevice = pairDevice((UniteDevice) c.e(parcel, UniteDevice.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iPairDevice);
                    return true;
                case 5:
                    int iConnectDevice = connectDevice((UniteDevice) c.e(parcel, UniteDevice.CREATOR), parcel.readInt() != 0, parcel.readInt(), DeviceHandshakeCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iConnectDevice);
                    return true;
                case 6:
                    int iSendCommand = sendCommand((UniteDevice) c.e(parcel, UniteDevice.CREATOR), (CommandMessageParcel) c.e(parcel, CommandMessageParcel.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iSendCommand);
                    return true;
                case 7:
                    List<UniteDevice> deviceList = getDeviceList();
                    parcel2.writeNoException();
                    c.d(parcel2, deviceList, 1);
                    return true;
                case 8:
                    int iUnpairDevice = unpairDevice((UniteDevice) c.e(parcel, UniteDevice.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iUnpairDevice);
                    return true;
                case 9:
                    int iDisconnectDevice = disconnectDevice((UniteDevice) c.e(parcel, UniteDevice.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iDisconnectDevice);
                    return true;
                case 10:
                    boolean zIsSupportService = isSupportService((UniteDevice) c.e(parcel, UniteDevice.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsSupportService ? 1 : 0);
                    return true;
                case 11:
                    boolean zIsSupportCharacteristic = isSupportCharacteristic((UniteDevice) c.e(parcel, UniteDevice.CREATOR), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsSupportCharacteristic ? 1 : 0);
                    return true;
                case 12:
                    int iRegisterDeviceStatusListener = registerDeviceStatusListener(StatusCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iRegisterDeviceStatusListener);
                    return true;
                case 13:
                    int iUnregisterDeviceStatusListener = unregisterDeviceStatusListener(StatusCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iUnregisterDeviceStatusListener);
                    return true;
                case 14:
                    int iRegisterDeviceFrameListener = registerDeviceFrameListener(FrameReceiver.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iRegisterDeviceFrameListener);
                    return true;
                case 15:
                    int iUnregisterDeviceFrameListener = unregisterDeviceFrameListener(FrameReceiver.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iUnregisterDeviceFrameListener);
                    return true;
                case 16:
                    int characteristicNotify = setCharacteristicNotify((UniteDevice) c.e(parcel, UniteDevice.CREATOR), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(characteristicNotify);
                    return true;
                case 17:
                    ping((UniteDevice) c.e(parcel, UniteDevice.CREATOR), parcel.readString(), parcel.readString(), P2pPingCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    int iSend = send((UniteDevice) c.e(parcel, UniteDevice.CREATOR), (MessageParcel) c.e(parcel, MessageParcel.CREATOR), (IdentityInfo) c.e(parcel, IdentityInfo.CREATOR), (IdentityInfo) c.e(parcel, IdentityInfo.CREATOR), P2pSendCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iSend);
                    return true;
                case 19:
                    subscribeDeviceDataReceiver((IdentityInfo) c.e(parcel, IdentityInfo.CREATOR), (IdentityInfo) c.e(parcel, IdentityInfo.CREATOR), ReceiverCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), P2pSendCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 20:
                    unsubscribeDeviceDataReceiver(ReceiverCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 21:
                    startRequestFile((RequestFileInfo) c.e(parcel, RequestFileInfo.CREATOR), ITransferFileCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 22:
                    stopRequestFile((RequestFileInfo) c.e(parcel, RequestFileInfo.CREATOR), ITransferFileCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    int iStartTransferFile = startTransferFile((FileInfo) c.e(parcel, FileInfo.CREATOR), IResultAIDLCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iStartTransferFile);
                    return true;
                case 24:
                    stopTransferByQueue((CommonFileInfoParcel) c.e(parcel, CommonFileInfoParcel.CREATOR), ITransferFileCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 25:
                    registerListener(parcel.readString(), parcel.readString(), FrameReceiver.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    unregisterListener(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 27:
                    registerHandshakeCallback(DeviceHandshakeCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 28:
                    updateDeviceAfterSimulatConnected(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 29:
                    List<DeviceInfo> deviceMgrList = getDeviceMgrList(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    c.d(parcel2, deviceMgrList, 1);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        static class a implements DevicesManagementBinderInterface {
            private IBinder d;

            a(IBinder iBinder) {
                this.d = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.d;
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public int initUniteService(CompatibleFitterCallback compatibleFitterCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(compatibleFitterCallback);
                    this.d.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public int scanDevice(int i, List<ScanFilterParcel> list, ScanCallback scanCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    c.d(parcelObtain, list, 0);
                    parcelObtain.writeStrongInterface(scanCallback);
                    this.d.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public void stopScanDevice() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    this.d.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public int pairDevice(UniteDevice uniteDevice, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    c.e(parcelObtain, uniteDevice, 0);
                    parcelObtain.writeInt(i);
                    this.d.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public int connectDevice(UniteDevice uniteDevice, boolean z, int i, DeviceHandshakeCallback deviceHandshakeCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    c.e(parcelObtain, uniteDevice, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(deviceHandshakeCallback);
                    this.d.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public int sendCommand(UniteDevice uniteDevice, CommandMessageParcel commandMessageParcel) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    c.e(parcelObtain, uniteDevice, 0);
                    c.e(parcelObtain, commandMessageParcel, 0);
                    this.d.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public List<UniteDevice> getDeviceList() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    this.d.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(UniteDevice.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public int unpairDevice(UniteDevice uniteDevice) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    c.e(parcelObtain, uniteDevice, 0);
                    this.d.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public int disconnectDevice(UniteDevice uniteDevice) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    c.e(parcelObtain, uniteDevice, 0);
                    this.d.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public boolean isSupportService(UniteDevice uniteDevice, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    c.e(parcelObtain, uniteDevice, 0);
                    parcelObtain.writeString(str);
                    this.d.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public boolean isSupportCharacteristic(UniteDevice uniteDevice, String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    c.e(parcelObtain, uniteDevice, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.d.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public int registerDeviceStatusListener(StatusCallback statusCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(statusCallback);
                    this.d.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public int unregisterDeviceStatusListener(StatusCallback statusCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(statusCallback);
                    this.d.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public int registerDeviceFrameListener(FrameReceiver frameReceiver) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(frameReceiver);
                    this.d.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public int unregisterDeviceFrameListener(FrameReceiver frameReceiver) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(frameReceiver);
                    this.d.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public int setCharacteristicNotify(UniteDevice uniteDevice, String str, String str2, int i, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    c.e(parcelObtain, uniteDevice, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.d.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public void ping(UniteDevice uniteDevice, String str, String str2, P2pPingCallback p2pPingCallback, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    c.e(parcelObtain, uniteDevice, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(p2pPingCallback);
                    parcelObtain.writeInt(i);
                    this.d.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public int send(UniteDevice uniteDevice, MessageParcel messageParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pSendCallback p2pSendCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    c.e(parcelObtain, uniteDevice, 0);
                    c.e(parcelObtain, messageParcel, 0);
                    c.e(parcelObtain, identityInfo, 0);
                    c.e(parcelObtain, identityInfo2, 0);
                    parcelObtain.writeStrongInterface(p2pSendCallback);
                    this.d.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public void subscribeDeviceDataReceiver(IdentityInfo identityInfo, IdentityInfo identityInfo2, ReceiverCallback receiverCallback, String str, P2pSendCallback p2pSendCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    c.e(parcelObtain, identityInfo, 0);
                    c.e(parcelObtain, identityInfo2, 0);
                    parcelObtain.writeStrongInterface(receiverCallback);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(p2pSendCallback);
                    this.d.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public void unsubscribeDeviceDataReceiver(ReceiverCallback receiverCallback, String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(receiverCallback);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.d.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public void startRequestFile(RequestFileInfo requestFileInfo, ITransferFileCallback iTransferFileCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    c.e(parcelObtain, requestFileInfo, 0);
                    parcelObtain.writeStrongInterface(iTransferFileCallback);
                    this.d.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public void stopRequestFile(RequestFileInfo requestFileInfo, ITransferFileCallback iTransferFileCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    c.e(parcelObtain, requestFileInfo, 0);
                    parcelObtain.writeStrongInterface(iTransferFileCallback);
                    this.d.transact(22, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public int startTransferFile(FileInfo fileInfo, IResultAIDLCallback iResultAIDLCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    c.e(parcelObtain, fileInfo, 0);
                    parcelObtain.writeStrongInterface(iResultAIDLCallback);
                    this.d.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public void stopTransferByQueue(CommonFileInfoParcel commonFileInfoParcel, ITransferFileCallback iTransferFileCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    c.e(parcelObtain, commonFileInfoParcel, 0);
                    parcelObtain.writeStrongInterface(iTransferFileCallback);
                    this.d.transact(24, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public void registerListener(String str, String str2, FrameReceiver frameReceiver) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(frameReceiver);
                    this.d.transact(25, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public void unregisterListener(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.d.transact(26, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public void registerHandshakeCallback(DeviceHandshakeCallback deviceHandshakeCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(deviceHandshakeCallback);
                    this.d.transact(27, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public void updateDeviceAfterSimulatConnected(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.d.transact(28, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
            public List<DeviceInfo> getDeviceMgrList(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DevicesManagementBinderInterface.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.d.transact(29, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(DeviceInfo.CREATOR);
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
        public static <T extends Parcelable> void e(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void d(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                e(parcel, list.get(i2), i);
            }
        }
    }
}
