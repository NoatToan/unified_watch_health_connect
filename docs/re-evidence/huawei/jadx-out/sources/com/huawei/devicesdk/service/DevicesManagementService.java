package com.huawei.devicesdk.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.huawei.devicesdk.callback.CompatibleFitterCallback;
import com.huawei.devicesdk.callback.ConnectFilter;
import com.huawei.devicesdk.callback.DeviceCompatibleCallback;
import com.huawei.devicesdk.callback.DeviceHandshakeCallback;
import com.huawei.devicesdk.callback.DeviceScanCallback;
import com.huawei.devicesdk.callback.DeviceStatusChangeCallback;
import com.huawei.devicesdk.callback.FrameReceiver;
import com.huawei.devicesdk.callback.MessageReceiveCallback;
import com.huawei.devicesdk.callback.ScanCallback;
import com.huawei.devicesdk.callback.StatusCallback;
import com.huawei.devicesdk.entity.CharacterOperationType;
import com.huawei.devicesdk.entity.CommandMessageParcel;
import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.devicesdk.entity.ScanFilterParcel;
import com.huawei.devicesdk.entity.ScanMode;
import com.huawei.devicesdk.entity.SendMode;
import com.huawei.devicesdk.service.DevicesManagementService;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.unitedevice.callback.IResultAIDLCallback;
import com.huawei.unitedevice.callback.ITransferFileCallback;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.unitedevice.hwcommonfilemgr.entity.CommonFileInfoParcel;
import com.huawei.unitedevice.hwcommonfilemgr.entity.FileInfo;
import com.huawei.unitedevice.hwcommonfilemgr.entity.RequestFileInfo;
import com.huawei.unitedevice.hwwifip2ptransfermgr.HwWifiP2pTransferManager;
import com.huawei.unitedevice.p2p.IdentityInfo;
import com.huawei.unitedevice.p2p.MessageParcel;
import com.huawei.unitedevice.p2p.P2pPingCallback;
import com.huawei.unitedevice.p2p.P2pReceiver;
import com.huawei.unitedevice.p2p.P2pSendCallback;
import com.huawei.unitedevice.p2p.ReceiverCallback;
import defpackage.cju;
import defpackage.cmg;
import defpackage.cmm;
import defpackage.cmy;
import defpackage.cnk;
import defpackage.cnl;
import defpackage.cnq;
import defpackage.cok;
import defpackage.cqf;
import defpackage.cqp;
import defpackage.lng;
import defpackage.xgx;
import defpackage.xhe;
import defpackage.xhj;
import defpackage.xip;
import defpackage.xit;
import defpackage.xiu;
import defpackage.xiy;
import defpackage.xje;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes23.dex */
public class DevicesManagementService extends Service {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f5448c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private xhe f5447b = xhe.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBinder.DeathRecipient f5446a = new IBinder.DeathRecipient() { // from class: com.huawei.devicesdk.service.DevicesManagementService.1
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            LogUtil.b("DevicesManagementService", "mMessageReceiveDeathRecipient binderDied");
            for (FrameReceiver frameReceiver : cnq.b().d()) {
                if (!frameReceiver.asBinder().pingBinder()) {
                    LogUtil.b("DevicesManagementService", "messageReceiveBinderDied");
                    frameReceiver.asBinder().unlinkToDeath(this, 0);
                    cnq.b().d(frameReceiver);
                }
            }
        }
    };
    private IBinder.DeathRecipient d = new IBinder.DeathRecipient() { // from class: com.huawei.devicesdk.service.DevicesManagementService.3
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            LogUtil.b("DevicesManagementService", "mDeviceStatusDeathRecipient binderDied");
            for (StatusCallback statusCallback : cnq.b().a()) {
                if (!statusCallback.asBinder().pingBinder()) {
                    LogUtil.b("DevicesManagementService", "deviceStatusBinderDied");
                    statusCallback.asBinder().unlinkToDeath(this, 0);
                    cnq.b().c(statusCallback);
                }
            }
        }
    };
    private final DevicesManagementBinderInterface.Stub e = new AnonymousClass2();

    /* JADX INFO: renamed from: com.huawei.devicesdk.service.DevicesManagementService$2, reason: invalid class name */
    public class AnonymousClass2 extends DevicesManagementBinderInterface.Stub {
        AnonymousClass2() {
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public int initUniteService(final CompatibleFitterCallback compatibleFitterCallback) {
            synchronized (DevicesManagementService.this.f5448c) {
                ReleaseLogUtil.c("DEVMGR_DevicesManagementService", "enter initUniteService");
                cqp.a(100082, "", "", "");
                cju.d().initUniteService(new DeviceCompatibleCallback() { // from class: cnu
                    @Override // com.huawei.devicesdk.callback.DeviceCompatibleCallback
                    public final void adapterOperate(List list) {
                        DevicesManagementService.AnonymousClass2.d(compatibleFitterCallback, list);
                    }
                });
            }
            return 0;
        }

        public static /* synthetic */ void d(CompatibleFitterCallback compatibleFitterCallback, List list) {
            if (compatibleFitterCallback != null) {
                try {
                    compatibleFitterCallback.adapterOperate(list);
                } catch (RemoteException unused) {
                    ReleaseLogUtil.b("DEVMGR_DevicesManagementService", "adapterOperate RemoteException");
                }
            }
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public int scanDevice(int i, List<ScanFilterParcel> list, final ScanCallback scanCallback) {
            if (list == null || list.size() == 0 || scanCallback == null) {
                LogUtil.d("DevicesManagementService", "type filters or callback is null");
                return 1;
            }
            ScanMode value = ScanMode.getValue(i);
            if (value == null) {
                return 1;
            }
            ArrayList arrayList = new ArrayList(16);
            for (ScanFilterParcel scanFilterParcel : list) {
                cmy.a aVar = new cmy.a();
                aVar.b(scanFilterParcel.getType());
                aVar.a(scanFilterParcel.getMatcher());
                arrayList.add(aVar.c());
            }
            cju.d().scanDevice(value, arrayList, new DeviceScanCallback() { // from class: com.huawei.devicesdk.service.DevicesManagementService.2.3
                @Override // com.huawei.devicesdk.callback.DeviceScanCallback
                public void scanResult(UniteDevice uniteDevice, byte[] bArr, String str, int i2) {
                    try {
                        scanCallback.onScanResult(i2, uniteDevice, bArr, str);
                    } catch (RemoteException unused) {
                        LogUtil.d("DevicesManagementService", "remoteException");
                    }
                }
            });
            LogUtil.b("DevicesManagementService", "enter DevicesManagement ScanDevice success");
            return 0;
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public void stopScanDevice() {
            cju.d().stopScanDevice();
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public int pairDevice(UniteDevice uniteDevice, int i) {
            if (uniteDevice == null) {
                LogUtil.d("DevicesManagementService", "Device Error");
                return 1;
            }
            if (i != 2) {
                LogUtil.d("DevicesManagementService", "type is not correct");
                return 1;
            }
            cju.d().createSystemBond(uniteDevice.getDeviceInfo(), ConnectMode.getValue(i));
            LogUtil.b("DevicesManagementService", "enter DevicesManagement createSystemBond success");
            return 0;
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public int connectDevice(UniteDevice uniteDevice, boolean z, int i, final DeviceHandshakeCallback deviceHandshakeCallback) {
            synchronized (DevicesManagementService.this.f5448c) {
                ConnectMode value = ConnectMode.getValue(i);
                if (uniteDevice != null && value != null) {
                    if (deviceHandshakeCallback != null) {
                        cju.d().registerHandshakeFilter(new ConnectFilter() { // from class: com.huawei.devicesdk.service.DevicesManagementService.2.2
                            @Override // com.huawei.devicesdk.callback.ConnectFilter
                            public int onFilter(UniteDevice uniteDevice2, String str, cmg cmgVar) {
                                try {
                                    CommandMessageParcel commandMessageParcelE = AnonymousClass2.this.e(cmgVar);
                                    int iOnProcess = deviceHandshakeCallback.onProcess(uniteDevice2, str, commandMessageParcelE);
                                    AnonymousClass2.this.b(cmgVar, commandMessageParcelE);
                                    return iOnProcess;
                                } catch (RemoteException unused) {
                                    LogUtil.d("DevicesManagementService", "onFilter remoteException");
                                    return -1;
                                }
                            }

                            @Override // com.huawei.devicesdk.callback.ConnectFilter
                            public String preProcess(UniteDevice uniteDevice2, String str) {
                                try {
                                    return deviceHandshakeCallback.preProcess(uniteDevice2, str);
                                } catch (RemoteException unused) {
                                    LogUtil.d("DevicesManagementService", "preProcess RemoteException");
                                    return "";
                                }
                            }
                        });
                    }
                    cju.d().connectDevice(uniteDevice.getDeviceInfo(), z, value);
                    LogUtil.b("DevicesManagementService", "enter DevicesManagement connectDevice success");
                    return 0;
                }
                LogUtil.d("DevicesManagementService", "device or connect is null");
                return 1;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CommandMessageParcel e(cmg cmgVar) {
            CommandMessageParcel commandMessageParcel = new CommandMessageParcel();
            if (cmgVar == null) {
                return commandMessageParcel;
            }
            commandMessageParcel.setCharacteristicUuid(cmgVar.c());
            if (cmgVar.f() != null) {
                commandMessageParcel.setCommandType(cmgVar.f().value());
            }
            commandMessageParcel.setCommand(cmgVar.b());
            commandMessageParcel.setServiceUuid(cmgVar.i());
            return commandMessageParcel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(cmg cmgVar, CommandMessageParcel commandMessageParcel) {
            if (cmgVar == null || commandMessageParcel == null) {
                return;
            }
            cmgVar.e(commandMessageParcel.getCharacteristicUuid());
            cmgVar.b(commandMessageParcel.getServiceUuid());
            cmgVar.d(SendMode.getValue(commandMessageParcel.getCommandType()));
            cmgVar.a(commandMessageParcel.getCommand());
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public int sendCommand(UniteDevice uniteDevice, CommandMessageParcel commandMessageParcel) throws RemoteException {
            if (uniteDevice == null || commandMessageParcel == null) {
                LogUtil.d("DevicesManagementService", "device or command is null");
                return 1;
            }
            SendMode value = SendMode.getValue(commandMessageParcel.getCommandType());
            if (value == null) {
                LogUtil.d("DevicesManagementService", "send mode is error");
                return 1;
            }
            cmg.b bVar = new cmg.b();
            bVar.b(commandMessageParcel.isNeedEncrypt());
            bVar.a(commandMessageParcel.getPriorityType());
            CharacterOperationType value2 = CharacterOperationType.getValue(commandMessageParcel.getOptionsType());
            if (value2 != null) {
                bVar.a(value2);
            }
            cmg cmgVar = new cmg();
            cmgVar.e(commandMessageParcel.getCharacteristicUuid());
            cmgVar.b(commandMessageParcel.getServiceUuid());
            cmgVar.a(commandMessageParcel.getCommand());
            cmgVar.d(value);
            cmgVar.d(commandMessageParcel.getSocketChannel());
            cju.d().sendCommand(uniteDevice.getDeviceInfo(), bVar.a(cmgVar));
            LogUtil.b("DevicesManagementService", "enter DevicesManagement sendCommand success");
            return 0;
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public List<UniteDevice> getDeviceList() {
            return new ArrayList(cju.d().getDeviceList().values());
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public int unpairDevice(UniteDevice uniteDevice) {
            if (uniteDevice == null) {
                LogUtil.d("DevicesManagementService", "Device Error");
                return 1;
            }
            cju.d().unPairDevice(uniteDevice.getDeviceInfo());
            LogUtil.b("DevicesManagementService", "enter DevicesManagement unpairDevice success");
            return 0;
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public int disconnectDevice(UniteDevice uniteDevice) {
            if (uniteDevice == null) {
                LogUtil.d("DevicesManagementService", "Device Error");
                return 1;
            }
            cju.d().disconnect(uniteDevice.getDeviceInfo());
            LogUtil.b("DevicesManagementService", "enter DevicesManagement disconnectDevice success");
            return 0;
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public boolean isSupportService(UniteDevice uniteDevice, String str) {
            if (uniteDevice == null || str == null) {
                LogUtil.d("DevicesManagementService", "device or serviceId is null");
                return false;
            }
            LogUtil.b("DevicesManagementService", "enter DevicesManagement isSupportService success");
            return cju.d().isSupportService(uniteDevice.getDeviceInfo(), str);
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public boolean isSupportCharacteristic(UniteDevice uniteDevice, String str, String str2) {
            if (uniteDevice == null || str == null || str2 == null) {
                LogUtil.d("DevicesManagementService", "device serviceid or characteristicId is null");
                return false;
            }
            LogUtil.b("DevicesManagementService", "enter DevicesManagement isSupportCharacteristic success");
            return cju.d().isSupportCharacter(uniteDevice.getDeviceInfo(), str, str2);
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public int registerDeviceStatusListener(StatusCallback statusCallback) {
            if (statusCallback == null) {
                return 1;
            }
            cnq.b().a(statusCallback);
            LogUtil.b("DevicesManagementService", "registerDeviceStatusListener success pid:", Integer.valueOf(getCallingPid()));
            try {
                statusCallback.asBinder().linkToDeath(DevicesManagementService.this.d, 0);
            } catch (RemoteException unused) {
                LogUtil.d("DevicesManagementService", "registerDeviceStatusListener remoteException");
            }
            return 0;
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public int unregisterDeviceStatusListener(StatusCallback statusCallback) {
            cnq.b().c(statusCallback);
            LogUtil.b("DevicesManagementService", "unregisterDeviceStatusListener success pid:", Integer.valueOf(getCallingPid()));
            if (statusCallback != null) {
                statusCallback.asBinder().unlinkToDeath(DevicesManagementService.this.d, 0);
            }
            return 0;
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public int registerDeviceFrameListener(FrameReceiver frameReceiver) {
            if (frameReceiver == null) {
                return 1;
            }
            cnq.b().c(frameReceiver);
            LogUtil.b("DevicesManagementService", "registerDeviceFrameListener success pid:", Integer.valueOf(getCallingPid()));
            try {
                frameReceiver.asBinder().linkToDeath(DevicesManagementService.this.f5446a, 0);
            } catch (RemoteException unused) {
                LogUtil.d("DevicesManagementService", "registerDeviceFrameListener remoteException");
            }
            return 0;
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public int unregisterDeviceFrameListener(FrameReceiver frameReceiver) {
            cnq.b().d(frameReceiver);
            LogUtil.b("DevicesManagementService", "unregisterDeviceFrameListener success pid:", Integer.valueOf(getCallingPid()));
            if (frameReceiver != null) {
                frameReceiver.asBinder().unlinkToDeath(DevicesManagementService.this.f5446a, 0);
            }
            return 0;
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public int setCharacteristicNotify(UniteDevice uniteDevice, String str, String str2, int i, boolean z) {
            CharacterOperationType characterOperationType;
            if (uniteDevice == null) {
                return 1;
            }
            cmg.b bVar = new cmg.b();
            if (z) {
                characterOperationType = CharacterOperationType.ENABLE;
            } else {
                characterOperationType = CharacterOperationType.DISABLE;
            }
            bVar.a(characterOperationType);
            cmg cmgVar = new cmg();
            cmgVar.b(str);
            cmgVar.e(str2);
            cmgVar.d(SendMode.getValue(i));
            cju.d().sendCommand(uniteDevice.getDeviceInfo(), bVar.a(cmgVar));
            LogUtil.b("DevicesManagementService", "enter sendCommand enabled success");
            return 0;
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public void ping(UniteDevice uniteDevice, final String str, final String str2, final P2pPingCallback p2pPingCallback, int i) throws RemoteException {
            LogUtil.b("DevicesManagementService", "enter ping");
            if (str == null) {
                LogUtil.d("DevicesManagementService", "srcPkgName is null");
                return;
            }
            if (str2 == null) {
                LogUtil.d("DevicesManagementService", "destPkgName is null");
            } else if (p2pPingCallback == null) {
                LogUtil.d("DevicesManagementService", "pingCallback is null");
            } else {
                xip.a().ping(str, str2, new PingCallback() { // from class: com.huawei.devicesdk.service.DevicesManagementService.2.4
                    @Override // com.huawei.health.deviceconnect.callback.PingCallback
                    public void onPingResult(int i2) {
                        P2pPingCallback p2pPingCallback2 = p2pPingCallback;
                        if (p2pPingCallback2 != null) {
                            try {
                                p2pPingCallback2.onResult(i2);
                            } catch (RemoteException unused) {
                                LogUtil.d("DevicesManagementService", "ping remoteException");
                            } catch (NullPointerException unused2) {
                                ReleaseLogUtil.b("DEVMGR_DevicesManagementService", "ping NullPointerException:", str, ",", str2);
                                lng.c("P2PMessage", "ping NullPointerException:" + str + "," + str2);
                            }
                        }
                    }
                }, uniteDevice, i);
            }
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public int send(UniteDevice uniteDevice, MessageParcel messageParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pSendCallback p2pSendCallback) throws RemoteException {
            LogUtil.b("DevicesManagementService", "enter send");
            if (identityInfo == null) {
                LogUtil.d("DevicesManagementService", "srcInfo is null");
                lng.c("P2PMessage", "P2PMessage send srcInfo is null");
                return 1;
            }
            if (identityInfo2 == null) {
                LogUtil.d("DevicesManagementService", "destInfo is null");
                lng.c("P2PMessage", "P2PMessage send destInfo is null");
                return 1;
            }
            if (messageParcel != null) {
                xip.a().p2pSend(uniteDevice, identityInfo, identityInfo2, messageParcel, DevicesManagementService.this.d(p2pSendCallback));
                return 0;
            }
            LogUtil.d("DevicesManagementService", "messageParcel is null");
            lng.c("P2PMessage", "P2PMessage send messageParcel is null");
            return 1;
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public int startTransferFile(FileInfo fileInfo, IResultAIDLCallback iResultAIDLCallback) {
            LogUtil.b("DevicesManagementService", "transferCommonFile send");
            if (fileInfo == null || iResultAIDLCallback == null) {
                LogUtil.d("DevicesManagementService", "filePath is null");
                return 1;
            }
            xip.a().startTransferFile(fileInfo, iResultAIDLCallback);
            return 0;
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public void stopTransferByQueue(CommonFileInfoParcel commonFileInfoParcel, ITransferFileCallback iTransferFileCallback) throws RemoteException {
            if (commonFileInfoParcel == null || iTransferFileCallback == null) {
                LogUtil.d("DevicesManagementService", "fileInfo or callback is null");
            } else {
                LogUtil.b("DevicesManagementService", "stopTransferByQueue");
                xip.a().stopTransferByQueue(commonFileInfoParcel, iTransferFileCallback);
            }
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public void subscribeDeviceDataReceiver(IdentityInfo identityInfo, IdentityInfo identityInfo2, ReceiverCallback receiverCallback, String str, P2pSendCallback p2pSendCallback) throws RemoteException {
            if (identityInfo == null) {
                LogUtil.d("DevicesManagementService", "srcInfo is null");
                return;
            }
            if (identityInfo2 == null) {
                LogUtil.d("DevicesManagementService", "destInfo is null");
                return;
            }
            if (receiverCallback == null) {
                LogUtil.d("DevicesManagementService", "receiverCallback is null");
                return;
            }
            if (p2pSendCallback == null) {
                LogUtil.d("DevicesManagementService", "p2pSendCallback is null");
                return;
            }
            xiy xiyVarB = DevicesManagementService.this.b(receiverCallback, str, identityInfo.getPackageName(), identityInfo2.getPackageName());
            LogUtil.b("DevicesManagementService", "registerReceiver processName is: ", str, "srcInfo name: ", identityInfo.getPackageName(), "destInfo name: ", identityInfo2.getPackageName());
            xip.a().registerReceiver(identityInfo, identityInfo2, xiyVarB, DevicesManagementService.this.d(p2pSendCallback));
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public void unsubscribeDeviceDataReceiver(ReceiverCallback receiverCallback, String str, String str2, String str3) throws RemoteException {
            if (receiverCallback == null) {
                return;
            }
            xip.a().unregisterReceiver(DevicesManagementService.this.b(receiverCallback, str, str2, str3));
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public void startRequestFile(RequestFileInfo requestFileInfo, ITransferFileCallback iTransferFileCallback) throws RemoteException {
            LogUtil.b("DevicesManagementService", "enter startRequestFile");
            if (requestFileInfo == null) {
                LogUtil.d("DevicesManagementService", "RequestFileInfo is null");
            } else if (iTransferFileCallback != null) {
                DevicesManagementService.this.f5447b.a(requestFileInfo, iTransferFileCallback);
            } else {
                LogUtil.d("DevicesManagementService", "callback is null");
            }
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public void stopRequestFile(RequestFileInfo requestFileInfo, ITransferFileCallback iTransferFileCallback) throws RemoteException {
            LogUtil.b("DevicesManagementService", "enter stopRequestFile");
            if (requestFileInfo == null) {
                LogUtil.d("DevicesManagementService", "fileInfo is null");
            } else if (iTransferFileCallback != null) {
                DevicesManagementService.this.f5447b.d(requestFileInfo, iTransferFileCallback);
            } else {
                LogUtil.d("DevicesManagementService", "IBaseCallback is null");
            }
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public void registerListener(String str, String str2, FrameReceiver frameReceiver) {
            if ("sampleCommandCallback".equals(str2)) {
                xje.e().a(str, frameReceiver);
            }
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public void unregisterListener(String str, String str2) {
            if ("sampleCommandCallback".equals(str2)) {
                xje.e().c(str);
            }
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public void registerHandshakeCallback(final DeviceHandshakeCallback deviceHandshakeCallback) {
            if (deviceHandshakeCallback == null) {
                LogUtil.e("DevicesManagementService", "registerHandshakeCallback callback is null");
            }
            cju.d().registerHandshakeFilter(new ConnectFilter() { // from class: com.huawei.devicesdk.service.DevicesManagementService.2.1
                @Override // com.huawei.devicesdk.callback.ConnectFilter
                public int onFilter(UniteDevice uniteDevice, String str, cmg cmgVar) {
                    try {
                        CommandMessageParcel commandMessageParcelE = AnonymousClass2.this.e(cmgVar);
                        int iOnProcess = deviceHandshakeCallback.onProcess(uniteDevice, str, commandMessageParcelE);
                        AnonymousClass2.this.b(cmgVar, commandMessageParcelE);
                        return iOnProcess;
                    } catch (RemoteException unused) {
                        LogUtil.d("DevicesManagementService", "onProcess remoteException");
                        return -1;
                    }
                }

                @Override // com.huawei.devicesdk.callback.ConnectFilter
                public String preProcess(UniteDevice uniteDevice, String str) {
                    try {
                        return deviceHandshakeCallback.preProcess(uniteDevice, str);
                    } catch (RemoteException unused) {
                        LogUtil.d("DevicesManagementService", "preProcess RemoteException");
                        return "";
                    }
                }
            });
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public void updateDeviceAfterSimulatConnected(String str) {
            cnk.c().m(str);
        }

        @Override // com.huawei.devicesdk.service.DevicesManagementBinderInterface
        public List<DeviceInfo> getDeviceMgrList(int i, String str) {
            return xgx.d().getDeviceMgrList(i, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public xiy b(final ReceiverCallback receiverCallback, String str, String str2, String str3) {
        return new xiy(str, str2, str3, new P2pReceiver() { // from class: com.huawei.devicesdk.service.DevicesManagementService.5
            @Override // com.huawei.unitedevice.p2p.P2pReceiver
            public void onReceiveMessage(com.huawei.devicesdk.entity.DeviceInfo deviceInfo, xiu xiuVar) {
                ReceiverCallback receiverCallback2 = receiverCallback;
                if (receiverCallback2 == null || xiuVar == null) {
                    return;
                }
                try {
                    receiverCallback2.onReceiveMessage(deviceInfo, xit.e(xiuVar));
                } catch (RemoteException unused) {
                    LogUtil.d("DevicesManagementService", "onReceiveMessage remoteException");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SendCallback d(final P2pSendCallback p2pSendCallback) {
        if (p2pSendCallback != null) {
            return new SendCallback() { // from class: com.huawei.devicesdk.service.DevicesManagementService.4
                @Override // com.huawei.health.deviceconnect.callback.SendCallback
                public void onSendResult(int i) {
                    P2pSendCallback p2pSendCallback2 = p2pSendCallback;
                    if (p2pSendCallback2 != null) {
                        try {
                            p2pSendCallback2.onSendResult(i);
                        } catch (RemoteException unused) {
                            LogUtil.d("DevicesManagementService", "onSendResult send remoteException");
                        }
                    }
                }

                @Override // com.huawei.health.deviceconnect.callback.SendCallback
                public void onSendProgress(long j) {
                    P2pSendCallback p2pSendCallback2 = p2pSendCallback;
                    if (p2pSendCallback2 != null) {
                        try {
                            p2pSendCallback2.onSendProgress(j);
                        } catch (RemoteException unused) {
                            LogUtil.d("DevicesManagementService", "onSendProgress send remoteException");
                        }
                    }
                }

                @Override // com.huawei.health.deviceconnect.callback.SendCallback
                public void onFileTransferReport(String str) {
                    if (p2pSendCallback != null) {
                        try {
                            LogUtil.b("DevicesManagementService", "getSendCallback onFileTransferReport transferWay:", str);
                            p2pSendCallback.onFileTransferReport(str);
                        } catch (RemoteException unused) {
                            LogUtil.d("DevicesManagementService", "onFileTransferReport send remoteException");
                        }
                    }
                }
            };
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        a();
        cju.d().registerDeviceStateListener(new DeviceStatusChangeCallback() { // from class: com.huawei.devicesdk.service.DevicesManagementService.10
            @Override // com.huawei.devicesdk.callback.DeviceStatusChangeCallback
            public void onConnectStatusChanged(com.huawei.devicesdk.entity.DeviceInfo deviceInfo, int i, int i2) {
                DevicesManagementService.this.a(deviceInfo, i, i2);
            }
        });
        cju.d().registerDeviceMessageListener(new MessageReceiveCallback() { // from class: com.huawei.devicesdk.service.DevicesManagementService.9
            @Override // com.huawei.devicesdk.callback.MessageReceiveCallback
            public void onDataReceived(com.huawei.devicesdk.entity.DeviceInfo deviceInfo, cmm cmmVar, int i) {
                if (deviceInfo == null) {
                    LogUtil.d("DevicesManagementService", "deviceInfo is null");
                } else {
                    cnl.b().e(deviceInfo, cmmVar, i);
                }
            }

            @Override // com.huawei.devicesdk.callback.MessageReceiveCallback
            public void onChannelEnable(com.huawei.devicesdk.entity.DeviceInfo deviceInfo, String str, int i) {
                if (deviceInfo == null) {
                    LogUtil.d("DevicesManagementService", "DeviceInfo is null");
                    return;
                }
                UniteDevice uniteDevice = new UniteDevice();
                uniteDevice.setIdentify(deviceInfo.getDeviceMac());
                uniteDevice.setDeviceInfo(deviceInfo);
                for (FrameReceiver frameReceiver : cnq.b().d()) {
                    if (frameReceiver != null) {
                        try {
                            frameReceiver.onChannelResult(i, uniteDevice, str);
                        } catch (RemoteException unused) {
                            LogUtil.d("DevicesManagementService", "onChannelEnable RemoteException");
                        }
                    }
                }
            }
        });
        e();
    }

    private void a() {
        ThreadPoolManager.c().a("initDms", new Runnable() { // from class: cnw
            @Override // java.lang.Runnable
            public final void run() {
                DevicesManagementService.b();
            }
        });
    }

    public static /* synthetic */ void b() {
        LogUtil.b("DevicesManagementService", "start initDms");
        if (cqf.b(BaseApplication.b(), "com.huawei.hwservicesmgr.PhoneService")) {
            LogUtil.b("DevicesManagementService", "startPhoneService is running");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.huawei.bone.action.StartPhoneService");
        intent.setPackage(BaseApplication.b().getPackageName());
        try {
            LogUtil.b("DevicesManagementService", "ready initDms");
            BaseApplication.b().startService(intent);
        } catch (IllegalStateException | SecurityException e) {
            LogUtil.d("DevicesManagementService", "startPhoneService exception:", ExceptionUtils.c(e));
        }
    }

    private void e() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: cnp
            @Override // java.lang.Runnable
            public final void run() {
                DevicesManagementService.d();
            }
        });
    }

    public static /* synthetic */ void d() {
        LogUtil.b("DevicesManagementService", "start initHfpAndHid");
        cok.d();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        LogUtil.b("DevicesManagementService", "onStartCommand() intent = ", intent, ",flags = ", Integer.valueOf(i), ",startId = ", Integer.valueOf(i2));
        if (!CommonUtil.ap()) {
            return 2;
        }
        LogUtil.b("DevicesManagementService", "stopDevicesManagementService startId:", Integer.valueOf(i2));
        stopSelf(i2);
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.huawei.devicesdk.entity.DeviceInfo deviceInfo, int i, int i2) {
        if (deviceInfo == null) {
            LogUtil.d("DevicesManagementService", "DeviceInfo is null");
            return;
        }
        UniteDevice uniteDevice = new UniteDevice();
        uniteDevice.setIdentify(deviceInfo.getDeviceMac());
        uniteDevice.setDeviceInfo(deviceInfo);
        CopyOnWriteArraySet<StatusCallback> copyOnWriteArraySetA = cnq.b().a();
        if (copyOnWriteArraySetA == null || copyOnWriteArraySetA.isEmpty()) {
            LogUtil.e("DevicesManagementService", "onConnectStatusChanged: callbacks is empty.");
            return;
        }
        for (StatusCallback statusCallback : copyOnWriteArraySetA) {
            if (statusCallback == null) {
                LogUtil.d("DevicesManagementService", "onConnectStatusChanged: callback is null.");
            } else {
                try {
                    statusCallback.onStatusChanged(i2, uniteDevice, i);
                } catch (RemoteException unused) {
                    LogUtil.d("DevicesManagementService", "onStatusChanged RemoteException");
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        LogUtil.b("DevicesManagementService", "enter onBind success");
        return this.e;
    }

    @Override // android.app.Service
    public void onDestroy() {
        LogUtil.b("DevicesManagementService", "onDestroy");
        super.onDestroy();
        cju.d().unregisterDeviceStateListener();
        cju.d().unregisterDeviceMessageListener();
        cju.d().destory();
        this.f5447b.e();
        xhj.c().b();
        HwWifiP2pTransferManager.a().t();
    }
}
