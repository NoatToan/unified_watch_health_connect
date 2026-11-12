package com.huawei.wearengine.service.api;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.network.embedded.r3;
import com.huawei.operation.ble.BleConstants;
import com.huawei.wearengine.P2pManager;
import com.huawei.wearengine.auth.Permission;
import com.huawei.wearengine.common.WearEngineBiOperate;
import com.huawei.wearengine.core.common.ClientBinderDied;
import com.huawei.wearengine.core.device.PowerModeChangeManager;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.p2p.FileIdentificationParcel;
import com.huawei.wearengine.p2p.IdentityInfo;
import com.huawei.wearengine.p2p.MessageParcel;
import com.huawei.wearengine.p2p.MessageParcelExtra;
import com.huawei.wearengine.p2p.P2pCancelFileTransferCallBack;
import com.huawei.wearengine.p2p.P2pPingCallback;
import com.huawei.wearengine.p2p.P2pSendCallback;
import com.huawei.wearengine.p2p.ReceiverCallback;
import com.huawei.wearengine.utils.DeviceProcessor;
import defpackage.yik;
import defpackage.yiq;
import defpackage.yit;
import defpackage.yiv;
import defpackage.yiw;
import defpackage.yjb;
import defpackage.ykh;
import defpackage.ykl;
import defpackage.yln;
import defpackage.ylt;

/* JADX INFO: loaded from: classes46.dex */
public class P2pManagerImpl extends P2pManager.Stub implements ClientBinderDied, PowerModeChangeManager.HandlePowerModeChange {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBinder.DeathRecipient f30808a = new IBinder.DeathRecipient() { // from class: com.huawei.wearengine.service.api.P2pManagerImpl.2
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            P2pManagerImpl.this.f30809b.c();
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private yjb f30809b;
    private yik d;
    private yiw e;

    public P2pManagerImpl(yik yikVar, yiw yiwVar) {
        yjb yjbVar = new yjb(yiwVar);
        this.f30809b = yjbVar;
        this.d = yikVar;
        this.e = yiwVar;
        yjbVar.j();
    }

    @Override // com.huawei.wearengine.P2pManager
    public int ping(Device device, String str, String str2, P2pPingCallback p2pPingCallback) throws RemoteException {
        yit.e("P2pManagerImpl", "Start ping");
        yiq.c(device, "device must not be null!");
        yiq.c(str, "srcPkgName must not be null!");
        yiq.c(str2, "destPkgName must not be null!");
        yiq.c(p2pPingCallback, "pingCallback must not be null!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        int callingUid = Binder.getCallingUid();
        String strB = yln.b(callingUid, contextA, this.e.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
        try {
            if (!yiv.c(callingUid, str)) {
                yit.b("P2pManagerImpl", "Ping Invalid srcPkgName");
                throw new IllegalStateException(String.valueOf(5));
            }
            PowerModeChangeManager.a().e(true);
            this.d.b(strB, r3.r, ykl.e, Permission.DEVICE_MANAGER);
            if (TextUtils.isEmpty(str2)) {
                str2 = str;
            }
            this.f30809b.a(DeviceProcessor.processInputDevice(strB, device), str, str2, p2pPingCallback);
            wearEngineBiOperate.biApiCalling(contextA, strB, r3.r, String.valueOf(0));
            return 0;
        } catch (IllegalStateException e) {
            yit.b("P2pManagerImpl", "ping illegalStateException");
            wearEngineBiOperate.biApiCalling(contextA, strB, r3.r, String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.P2pManager
    public int send(Device device, MessageParcel messageParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pSendCallback p2pSendCallback) throws RemoteException {
        yit.e("P2pManagerImpl", "Start send");
        yiq.c(device, "device must not be null!");
        yiq.c(messageParcel, "message must not be null!");
        yiq.c(identityInfo, "srcInfo must not be null!");
        yiq.c(identityInfo2, "destInfo must not be null!");
        yiq.c(p2pSendCallback, "sendCallback must not be null!");
        return sendExtra(device, b(messageParcel), identityInfo, identityInfo2, p2pSendCallback);
    }

    @Override // com.huawei.wearengine.P2pManager
    public int registerReceiver(Device device, IdentityInfo identityInfo, IdentityInfo identityInfo2, ReceiverCallback receiverCallback, int i) throws RemoteException {
        int callingPid = Binder.getCallingPid();
        yit.e("P2pManagerImpl", "Start registerReceiver pid is:" + callingPid + ", hashcode is:" + i);
        yiq.c(device, "device must not be null!");
        yiq.c(identityInfo, "srcInfo must not be null!");
        yiq.c(identityInfo2, "destInfo must not be null!");
        yiq.c(receiverCallback, "receiverCallback must not be null!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        int callingUid = Binder.getCallingUid();
        String strB = yln.b(callingUid, yiv.a(), this.e.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
        try {
            if (!yiv.c(callingUid, identityInfo.getPackageName())) {
                yit.b("registerReceiver", "Invalid srcPkgName");
                throw new IllegalStateException(String.valueOf(5));
            }
            if (TextUtils.isEmpty(identityInfo2.getFingerPrint())) {
                yit.b("P2pManagerImpl", "Invalid destination FingerPrint");
                throw new IllegalStateException(String.valueOf(5));
            }
            PowerModeChangeManager.a().e(true);
            this.d.b(strB, "registerReceiver", ykl.e, Permission.DEVICE_MANAGER);
            receiverCallback.asBinder().linkToDeath(this.f30808a, 0);
            int iD = this.f30809b.d(DeviceProcessor.processInputDevice(strB, device), identityInfo, c(identityInfo, identityInfo2), new ykh(callingPid, i, receiverCallback));
            wearEngineBiOperate.biApiCalling(yiv.a(), strB, "registerReceiver", String.valueOf(iD));
            return iD;
        } catch (IllegalStateException e) {
            yit.b("P2pManagerImpl", "registerReceiver illegalStateException");
            wearEngineBiOperate.biApiCalling(yiv.a(), strB, "registerReceiver", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.P2pManager
    public int unregisterReceiver(ReceiverCallback receiverCallback, int i) throws RemoteException {
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        int callingPid = Binder.getCallingPid();
        yit.e("P2pManagerImpl", "start unregisterReceiver pid is:" + callingPid + ", hashcode is:" + i);
        yiq.c(receiverCallback, "receiverCallback must not be null!");
        String strB = yln.b(Binder.getCallingUid(), yiv.a(), this.e.getApplicationIdByPid(Integer.valueOf(callingPid)));
        yit.e("P2pManagerImpl", "unregisterReceiver srcPackageName is:" + strB);
        try {
            PowerModeChangeManager.a().e(true);
            this.d.b(strB, "unregisterReceiver", ykl.e, Permission.DEVICE_MANAGER);
            ykh ykhVarC = this.f30809b.g().c(new ykh(callingPid, i, receiverCallback));
            if (ykhVarC == null) {
                yit.b("P2pManagerImpl", "unregisterReceiver map do not have the receiver");
                wearEngineBiOperate.biApiCalling(yiv.a(), strB, "unregisterReceiver", String.valueOf(0));
                return 0;
            }
            ykhVarC.e().asBinder().unlinkToDeath(this.f30808a, 0);
            int iE = this.f30809b.e(ykhVarC);
            wearEngineBiOperate.biApiCalling(yiv.a(), strB, "unregisterReceiver", String.valueOf(iE));
            return iE;
        } catch (IllegalStateException e) {
            yit.b("P2pManagerImpl", "unregisterReceiver illegalStateException");
            wearEngineBiOperate.biApiCalling(yiv.a(), strB, "unregisterReceiver", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.P2pManager
    public int sendExtra(Device device, MessageParcelExtra messageParcelExtra, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pSendCallback p2pSendCallback) throws RemoteException {
        yit.e("P2pManagerImpl", "Start sendExtra");
        yiq.c(device, "device must not be null!");
        yiq.c(messageParcelExtra, "message must not be null!");
        yiq.c(identityInfo, "srcInfo must not be null!");
        yiq.c(identityInfo2, "destInfo must not be null!");
        yiq.c(p2pSendCallback, "sendCallback must not be null!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        int callingUid = Binder.getCallingUid();
        String strB = yln.b(callingUid, contextA, this.e.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
        try {
            if (!yiv.c(callingUid, identityInfo.getPackageName())) {
                yit.b("P2pManagerImpl", "Invalid srcPkgName");
                throw new IllegalStateException(String.valueOf(5));
            }
            if (TextUtils.isEmpty(identityInfo2.getFingerPrint())) {
                yit.b("P2pManagerImpl", "Invalid destination FingerPrint");
                throw new IllegalStateException(String.valueOf(5));
            }
            PowerModeChangeManager.a().e(true);
            this.d.b(strB, "send", ykl.e, Permission.DEVICE_MANAGER);
            IdentityInfo identityInfoC = c(identityInfo, identityInfo2);
            this.f30809b.d(DeviceProcessor.processInputDevice(strB, device), messageParcelExtra, identityInfo, identityInfoC, p2pSendCallback);
            wearEngineBiOperate.biApiCalling(contextA, strB, "send", String.valueOf(0));
            return 0;
        } catch (IllegalStateException e) {
            yit.b("P2pManagerImpl", "sendExtra illegalStateException");
            wearEngineBiOperate.biApiCalling(contextA, strB, "send", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    private IdentityInfo c(IdentityInfo identityInfo, IdentityInfo identityInfo2) {
        return TextUtils.isEmpty(identityInfo2.getPackageName()) ? identityInfo : identityInfo2;
    }

    @Override // com.huawei.wearengine.P2pManager
    public int getDeviceAppVersionCode(Device device, String str, String str2) throws RemoteException {
        yit.e("P2pManagerImpl", "Start getDeviceAppVersionCode");
        yiq.c(device, "device must not be null!");
        yiq.e(str, "srcPkgName must not be null!");
        yiq.e(str2, "destPkgName must not be null!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        int callingUid = Binder.getCallingUid();
        String strB = yln.b(callingUid, contextA, this.e.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
        try {
            if (!yiv.c(callingUid, str)) {
                yit.b("P2pManagerImpl", "getDeviceAppVersionCode Invalid srcPkgName");
                throw new IllegalStateException(String.valueOf(5));
            }
            PowerModeChangeManager.a().e(true);
            this.d.b(strB, BleConstants.GET_APP_VERSION, ykl.e, Permission.DEVICE_MANAGER);
            int iE = this.f30809b.e(DeviceProcessor.processInputDevice(strB, device), str, str2);
            wearEngineBiOperate.biApiCalling(contextA, strB, BleConstants.GET_APP_VERSION, String.valueOf(iE));
            return iE;
        } catch (IllegalStateException e) {
            yit.b("P2pManagerImpl", "getDeviceAppVersionCode illegalStateException");
            wearEngineBiOperate.biApiCalling(contextA, strB, BleConstants.GET_APP_VERSION, String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.P2pManager
    public int sendInternal(Device device, MessageParcelExtra messageParcelExtra, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pSendCallback p2pSendCallback) throws RemoteException {
        yit.e("P2pManagerImpl", "sendInternal enter");
        yiq.c(device, "device must not be null!");
        yiq.c(messageParcelExtra, "message must not be null!");
        yiq.c(identityInfo, "srcInfo must not be null!");
        yiq.c(identityInfo2, "destInfo must not be null!");
        yiq.c(p2pSendCallback, "sendCallback must not be null!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        String strB = yln.b(Binder.getCallingUid(), contextA, this.e.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
        int callingUid = Binder.getCallingUid();
        try {
            PowerModeChangeManager.a().e(true);
            if (!this.d.d(Binder.getCallingUid(), strB)) {
                yit.b("P2pManagerImpl", "sendInternal invalid interface invoking");
                throw new IllegalStateException(String.valueOf(18));
            }
            if (!yiv.c(callingUid, identityInfo.getPackageName())) {
                yit.b("P2pManagerImpl", "Invalid srcPkgName");
                throw new IllegalStateException(String.valueOf(5));
            }
            IdentityInfo identityInfoC = c(identityInfo, identityInfo2);
            this.f30809b.d(DeviceProcessor.processInputDevice(strB, device), messageParcelExtra, identityInfo, identityInfoC, p2pSendCallback);
            wearEngineBiOperate.biApiCalling(contextA, strB, "send", String.valueOf(0));
            return 0;
        } catch (IllegalStateException e) {
            yit.b("P2pManagerImpl", "sendInternal illegalStateException");
            wearEngineBiOperate.biApiCalling(contextA, strB, "send", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.P2pManager
    public int registerReceiverInternal(Device device, IdentityInfo identityInfo, IdentityInfo identityInfo2, ReceiverCallback receiverCallback, int i) throws RemoteException {
        yit.e("P2pManagerImpl", "registerReceiverInternal enter");
        yiq.c(device, "device must not be null!");
        yiq.c(identityInfo, "srcInfo must not be null!");
        yiq.c(identityInfo2, "destInfo must not be null!");
        yiq.c(receiverCallback, "receiverCallback must not be null!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        String strB = yln.b(Binder.getCallingUid(), contextA, this.e.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
        int callingUid = Binder.getCallingUid();
        try {
            PowerModeChangeManager.a().e(true);
            if (!this.d.d(Binder.getCallingUid(), strB)) {
                yit.b("P2pManagerImpl", "registerReceiverInternal invalid interface invoking");
                throw new IllegalStateException(String.valueOf(18));
            }
            if (!yiv.c(callingUid, identityInfo.getPackageName())) {
                yit.b("registerReceiver", "Invalid srcPkgName");
                throw new IllegalStateException(String.valueOf(5));
            }
            receiverCallback.asBinder().linkToDeath(this.f30808a, 0);
            IdentityInfo identityInfoC = c(identityInfo, identityInfo2);
            int callingPid = Binder.getCallingPid();
            int iD = this.f30809b.d(DeviceProcessor.processInputDevice(strB, device), identityInfo, identityInfoC, new ykh(callingPid, i, receiverCallback));
            wearEngineBiOperate.biApiCalling(yiv.a(), strB, "registerReceiver", String.valueOf(iD));
            return iD;
        } catch (IllegalStateException e) {
            yit.b("P2pManagerImpl", "registerReceiverInternal illegalStateException");
            wearEngineBiOperate.biApiCalling(contextA, strB, "registerReceiver", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.P2pManager
    public int cancelFileTransfer(Device device, FileIdentificationParcel fileIdentificationParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pCancelFileTransferCallBack p2pCancelFileTransferCallBack) throws RemoteException {
        yit.e("P2pManagerImpl", "Start cancel file transfer");
        yiq.c(device, "device must not be null!");
        yiq.c(fileIdentificationParcel, "fileIdentification must not be null!");
        yiq.c(identityInfo, "srcInfo must not be null!");
        yiq.c(identityInfo2, "destInfo must not be null!");
        yiq.e(fileIdentificationParcel.getFileName(), "fileIdentification fileName must not be empty");
        yiq.c(p2pCancelFileTransferCallBack, "cancelFileTransferCallBack must not be null!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        String strB = yln.b(Binder.getCallingUid(), contextA, this.e.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
        try {
            PowerModeChangeManager.a().e(true);
            this.d.b(strB, "cancelFileTransfer", ykl.e, Permission.DEVICE_MANAGER);
            int iD = this.f30809b.d(DeviceProcessor.processInputDevice(strB, device), fileIdentificationParcel, identityInfo, identityInfo2, p2pCancelFileTransferCallBack);
            wearEngineBiOperate.biApiCalling(contextA, strB, "cancelFileTransfer", String.valueOf(iD));
            return iD;
        } catch (IllegalStateException e) {
            yit.b("P2pManagerImpl", "cancelFileTransfer illegalStateException");
            wearEngineBiOperate.biApiCalling(contextA, strB, "cancelFileTransfer", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.core.common.ClientBinderDied
    public void handleClientBinderDied(String str) {
        yit.a("P2pManagerImpl", "handleClientBinderDied clientPkgName is: " + str);
    }

    private MessageParcelExtra b(MessageParcel messageParcel) {
        MessageParcelExtra messageParcelExtra = new MessageParcelExtra();
        messageParcelExtra.setType(messageParcel.getType());
        messageParcelExtra.setData(messageParcel.getData());
        messageParcelExtra.setParcelFileDescriptor(messageParcel.getParcelFileDescriptor());
        messageParcelExtra.setFileName(messageParcel.getFileName());
        messageParcelExtra.setDescription(messageParcel.getDescription());
        messageParcelExtra.setFileSha256(messageParcel.getFileSha256());
        messageParcelExtra.setExtendJson("");
        return messageParcelExtra;
    }

    int a(int i) {
        if (!c()) {
            yit.b("P2pManagerImpl", "removeReceiver checkPermission failed");
            return 8;
        }
        int iA = this.f30809b.a(i);
        yit.e("P2pManagerImpl", "removeReceiver ret: " + iA);
        return iA;
    }

    private void b(String str) {
        yit.e("P2pManagerImpl", "removeReceiverByDevice ret: " + this.f30809b.a(str));
    }

    private boolean c() {
        return Binder.getCallingUid() == getCallingUid();
    }

    @Override // com.huawei.wearengine.core.device.PowerModeChangeManager.HandlePowerModeChange
    public void startClearData(String str) {
        yit.e("P2pManagerImpl", "startClearData");
        yit.a("P2pManagerImpl", "startClearData deviceId is: " + str);
        b(str);
    }
}
