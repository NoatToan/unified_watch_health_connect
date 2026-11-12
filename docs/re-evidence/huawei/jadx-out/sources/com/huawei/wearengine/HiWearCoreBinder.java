package com.huawei.wearengine;

import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hms.network.embedded.r3;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.wearengine.HiWearCoreBinder;
import com.huawei.wearengine.capability.EnumWearEngineCapabilityItem;
import com.huawei.wearengine.channel.WearEngineChannel;
import com.huawei.wearengine.common.WearEngineBiOperate;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.device.FoundListener;
import com.huawei.wearengine.device.GetAttributeListener;
import com.huawei.wearengine.monitor.MonitorCallback;
import com.huawei.wearengine.monitor.MonitorMessage;
import com.huawei.wearengine.monitor.QueryDataCallback;
import com.huawei.wearengine.monitor.SwitchStatusCallback;
import com.huawei.wearengine.notify.NotificationParcel;
import com.huawei.wearengine.notify.NotifySendCallback;
import com.huawei.wearengine.p2p.CancelFileTransferCallBackProxy;
import com.huawei.wearengine.p2p.FileIdentificationParcel;
import com.huawei.wearengine.p2p.IdentityInfo;
import com.huawei.wearengine.p2p.MessageParcelExtra;
import com.huawei.wearengine.p2p.P2pCancelFileTransferCallBack;
import com.huawei.wearengine.p2p.P2pPingCallback;
import com.huawei.wearengine.p2p.P2pReceiverCallback;
import com.huawei.wearengine.p2p.P2pSendCallback;
import com.huawei.wearengine.p2p.SendFileCallbackCleanup;
import com.huawei.wearengine.p2p.SendFileCallbackProxy;
import com.huawei.wearengine.utils.DeviceProcessor;
import defpackage.ecu;
import defpackage.mrk;
import defpackage.mro;
import defpackage.yht;
import defpackage.yhu;
import defpackage.yid;
import defpackage.yie;
import defpackage.yif;
import defpackage.yih;
import defpackage.yjq;
import defpackage.yjx;
import defpackage.yke;
import defpackage.ykx;
import defpackage.ylf;
import defpackage.yli;
import defpackage.ylj;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class HiWearCoreBinder extends HiWearEngineService.Stub implements SendFileCallbackCleanup {
    private static final String ASSISTANT_PACKAGE_NAME = "com.huawei.deveco.assistant";
    private static final String BI_NAME_P2PCHANNEL_STATE = "wearEngineP2pChannelStateClosed";
    private static final String GENERATE_ERROR_RESULT = "generateErrorResult remoteException";
    private static final String PERMISSION_FAILED = "Permission failed";
    private static final String TAG = "WearEngine_HiWearCoreBinder";
    private List<SendFileCallbackProxy> mSendFileProxyList = new ArrayList();
    private List<CancelFileTransferCallBackProxy> mCancelFileTransferProxyList = new ArrayList();
    private final Map<String, Map<String, List<String>>> mFileTransferredRecordMap = new HashMap();
    private final Object mFileTransferRecordLock = new Object();
    private IBinder.DeathRecipient deviceDataDeathRecipient = new IBinder.DeathRecipient() { // from class: com.huawei.wearengine.HiWearCoreBinder.5
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            yhu.b().a();
        }
    };
    private IBinder.DeathRecipient monitorCallbackDeathRecipient = new IBinder.DeathRecipient() { // from class: com.huawei.wearengine.HiWearCoreBinder.2
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            yht.d().a();
        }
    };

    public HiWearCoreBinder() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: yhx
            @Override // java.lang.Runnable
            public final void run() {
                HiWearCoreBinder.lambda$new$0();
            }
        });
    }

    public static /* synthetic */ void lambda$new$0() {
        LogUtil.a(TAG, "loadProductMapConfig");
        ProductMapParseUtil.a(BaseApplication.b());
    }

    @Override // com.huawei.wearengine.HiWearEngineService
    public void getBondedDevices(FoundListener foundListener, String str, boolean z) {
        LogUtil.a(TAG, "getBondedDevices enter");
        if (!checkPermission()) {
            LogUtil.e(TAG, PERMISSION_FAILED);
        } else if (foundListener == null) {
            LogUtil.j(TAG, "getBondedDevices listener is null");
        } else {
            yhu.b().d(foundListener, str, z);
        }
    }

    @Override // com.huawei.wearengine.HiWearEngineService
    public void getAllBondedDevices(FoundListener foundListener, String str) {
        LogUtil.a(TAG, "getAllBondedDevices enter");
        if (!checkPermission()) {
            LogUtil.e(TAG, PERMISSION_FAILED);
        } else if (foundListener == null) {
            LogUtil.j(TAG, "getAllBondedDevices listener is null");
        } else {
            yhu.b().d(foundListener, str);
        }
    }

    @Override // com.huawei.wearengine.HiWearEngineService
    public void getCommonDevices(FoundListener foundListener, String str, boolean z) {
        LogUtil.a(TAG, "getCommonDevices enter");
        if (!checkPermission()) {
            LogUtil.e(TAG, PERMISSION_FAILED);
        } else if (foundListener == null) {
            LogUtil.j(TAG, "getCommonDevices listener is null");
        } else {
            yhu.b().a(foundListener, str, z);
        }
    }

    @Override // com.huawei.wearengine.HiWearEngineService
    public void getHiLinkDeviceId(Device device, GetAttributeListener getAttributeListener) {
        LogUtil.a(TAG, "getHiLinkDeviceId enter");
        if (!checkPermission()) {
            LogUtil.e(TAG, PERMISSION_FAILED);
            throw new IllegalStateException(String.valueOf(12));
        }
        if (device == null) {
            LogUtil.e(TAG, "getHiLinkDeviceId device is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        String strD = yhu.b().d(device.getUuid());
        LogUtil.d(TAG, "getHiLinkDeviceId identify is:", strD);
        if (StringUtils.g(strD)) {
            LogUtil.e(TAG, "getHiLinkDeviceId device identify is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        yhu.b().d(device, getAttributeListener);
    }

    @Override // com.huawei.wearengine.HiWearEngineService
    public void queryDeviceCapability(Device device, int i, GetAttributeListener getAttributeListener) throws RemoteException {
        LogUtil.a(TAG, "queryDeviceCapability enter");
        if (!checkPermission()) {
            LogUtil.e(TAG, PERMISSION_FAILED);
            throw new IllegalStateException(String.valueOf(12));
        }
        if (device == null) {
            LogUtil.e(TAG, "queryDeviceCapability device is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        String strD = yhu.b().d(device.getUuid());
        LogUtil.d(TAG, "queryDeviceCapability identify is:", strD);
        if (StringUtils.g(strD)) {
            LogUtil.e(TAG, "queryDeviceCapability device identify is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        yhu.b().d(device, i, getAttributeListener);
    }

    @Override // com.huawei.wearengine.HiWearEngineService
    public void ping(Device device, String str, String str2, P2pPingCallback p2pPingCallback) {
        LogUtil.a(TAG, "ping enter");
        String strPingPreCheckAndGetIdentity = pingPreCheckAndGetIdentity(device, str, str2, p2pPingCallback);
        if (isSuperCall(str)) {
            ping(strPingPreCheckAndGetIdentity, str, str2, p2pPingCallback);
        } else {
            handleThreePartyPingCall(strPingPreCheckAndGetIdentity, device.getUuid(), str, str2, p2pPingCallback);
        }
    }

    private void ping(String str, String str2, String str3, P2pPingCallback p2pPingCallback) {
        int iC = yhu.b().c();
        LogUtil.a(TAG, "ping sequenceNum is:", Integer.valueOf(iC));
        DeviceCommand deviceCommandC = ylj.c(iC, 1, str2, str3);
        if (deviceCommandC == null) {
            LogUtil.e(TAG, "ping deviceCommand is null");
            generateErrorResult(p2pPingCallback, 12);
            throw new IllegalStateException(String.valueOf(12));
        }
        LogUtil.a(TAG, "ping deviceCommand is:", deviceCommandC.toString());
        deviceCommandC.setmIdentify(str);
        ykx.c(deviceCommandC);
        yhu.b().d(iC, p2pPingCallback);
    }

    private String pingPreCheckAndGetIdentity(Device device, String str, String str2, P2pPingCallback p2pPingCallback) {
        if (p2pPingCallback != null) {
            LogUtil.a(TAG, "ping srcPkgName is:", str, ", destPkgName is:", str2);
            if (device == null || !ylj.d(str) || !ylj.d(str2)) {
                LogUtil.j(TAG, "ping device or pkgName is invalid");
                generateErrorResult(p2pPingCallback, 5);
                throw new IllegalStateException(String.valueOf(5));
            }
            String uuid = device.getUuid();
            if (TextUtils.isEmpty(uuid)) {
                LogUtil.e(TAG, "ping deviceId is empty");
                throw new IllegalStateException(String.valueOf(5));
            }
            String strD = yhu.b().d(uuid);
            LogUtil.d(TAG, "ping identify is:", strD);
            if (TextUtils.isEmpty(strD)) {
                LogUtil.e(TAG, "ping device identify is null");
                generateErrorResult(p2pPingCallback, 5);
                throw new IllegalStateException(String.valueOf(5));
            }
            if (yie.b(uuid, EnumWearEngineCapabilityItem.POINT_TO_POINT_PING_AND_SEND_BYTES_ENUM)) {
                return strD;
            }
            LogUtil.e(TAG, "ping device is not support");
            throw new IllegalStateException(String.valueOf(13));
        }
        LogUtil.j(TAG, "ping pingCallback is null");
        throw new IllegalStateException(String.valueOf(5));
    }

    private boolean isSuperCall(String str) {
        Set<String> superCallerSet = DeviceProcessor.getSuperCallerSet();
        superCallerSet.add(BaseApplication.d());
        boolean zContains = superCallerSet.contains(str);
        LogUtil.d(TAG, "isSuperCall is ", Boolean.valueOf(zContains));
        return zContains;
    }

    private P2pPingCallback getPingCallBackProxy(final String str, final String str2, final String str3, final P2pPingCallback p2pPingCallback) {
        return new P2pPingCallback.Stub() { // from class: com.huawei.wearengine.HiWearCoreBinder.3
            @Override // com.huawei.wearengine.p2p.P2pPingCallback
            public void onResult(int i) throws RemoteException {
                LogUtil.a(HiWearCoreBinder.TAG, "proxyPingCallBack resultCode is ", Integer.valueOf(i));
                HiWearCoreBinder.this.handleProxyPingCallBack(i, str, str2, str3, p2pPingCallback);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleProxyPingCallBack(int i, String str, String str2, String str3, P2pPingCallback p2pPingCallback) {
        int i2;
        int i3 = 1;
        if (i == 200) {
            i2 = 1;
            i3 = 0;
        } else {
            i2 = 0;
        }
        yih yihVarB = yih.b();
        if (getWearEngineP2pChannelList(str, str2, str3).size() == 0) {
            LogUtil.a(TAG, "pingCallBackProxy add new P2pChannel");
            yif yifVar = new yif();
            yifVar.updateChannelState(i2);
            yihVarB.b(str, str2, str3, yifVar);
        } else {
            LogUtil.a(TAG, "pingCallBackProxy update P2pChannel");
            yid yidVar = new yid();
            yidVar.d(i3);
            yidVar.c(str3);
            yihVarB.a(str, yidVar);
        }
        if (i == 200) {
            WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
            wearEngineBiOperate.init();
            wearEngineBiOperate.biApiCalling(BaseApplication.b(), str2, BI_NAME_P2PCHANNEL_STATE, String.valueOf(0));
        }
        generateErrorResult(p2pPingCallback, i);
    }

    private void handleThreePartyPingCall(String str, String str2, String str3, String str4, P2pPingCallback p2pPingCallback) {
        if (!yie.c(str2, EnumWearEngineCapabilityItem.WEAR_APP_INSTALLATION_REPORT_ENUM)) {
            LogUtil.a(TAG, "handleThreePartyPingCall isWearAppInstallationSupport is't support");
            ping(str, str3, str4, p2pPingCallback);
            return;
        }
        P2pPingCallback pingCallBackProxy = getPingCallBackProxy(str, str3, str4, p2pPingCallback);
        List<WearEngineChannel> wearEngineP2pChannelList = getWearEngineP2pChannelList(str, str3, str4);
        if (wearEngineP2pChannelList.size() == 0) {
            LogUtil.a(TAG, "handleThreePartyPingCall p2pChannelSize is zero");
            ping(str, str3, str4, pingCallBackProxy);
        } else if (checkWearEngineP2pChannel(r3.r, wearEngineP2pChannelList)) {
            LogUtil.a(TAG, "handleThreePartyPingCall P2pChannel is open");
            ping(str, str3, str4, pingCallBackProxy);
        } else {
            LogUtil.a(TAG, "handleThreePartyPingCall srcPkgName ", str3, "，P2pChannel is close");
            generateErrorResult(p2pPingCallback, 200);
        }
    }

    private boolean checkWearEngineP2pChannel(String str, List<WearEngineChannel> list) {
        if (list.size() == 0) {
            return true;
        }
        Iterator<WearEngineChannel> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().isChannelOpen()) {
                LogUtil.a(TAG, str, " wearEngineChannel is close");
                return false;
            }
        }
        return true;
    }

    private List<WearEngineChannel> getWearEngineP2pChannelList(String str, String str2, String str3) {
        return yih.b().e(str, str2, str3);
    }

    private void generateErrorResult(Object obj, int i) {
        try {
            if (obj instanceof P2pPingCallback) {
                ((P2pPingCallback) obj).onResult(i);
            } else if (!(obj instanceof QueryDataCallback)) {
                LogUtil.e(TAG, "generateErrorResult callback not target class");
            } else {
                ((QueryDataCallback) obj).onDataReceived(i, new MonitorMessage());
            }
        } catch (RemoteException unused) {
            LogUtil.e(TAG, GENERATE_ERROR_RESULT);
        }
    }

    @Override // com.huawei.wearengine.HiWearEngineService
    public void send(String str, MessageParcelExtra messageParcelExtra, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pSendCallback p2pSendCallback) {
        LogUtil.a(TAG, "send enter");
        if (!checkSendParams(str, messageParcelExtra, identityInfo, identityInfo2, p2pSendCallback)) {
            throw new IllegalStateException(String.valueOf(5));
        }
        String strD = yhu.b().d(str);
        LogUtil.d(TAG, "send identify is:", strD);
        if (TextUtils.isEmpty(strD)) {
            LogUtil.e(TAG, "send device identify is null");
            sendErrorResult(p2pSendCallback, 5);
            throw new IllegalStateException(String.valueOf(5));
        }
        yke ykeVar = new yke(identityInfo, identityInfo2);
        if (messageParcelExtra.getType() == 1) {
            sendData(strD, str, messageParcelExtra, ykeVar, p2pSendCallback);
        } else {
            sendFile(str, messageParcelExtra, identityInfo, identityInfo2, p2pSendCallback);
        }
    }

    private boolean checkSendParams(String str, MessageParcelExtra messageParcelExtra, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pSendCallback p2pSendCallback) {
        if (p2pSendCallback == null) {
            LogUtil.j(TAG, "checkSendParams sendCallback is null");
            return false;
        }
        if (messageParcelExtra == null) {
            LogUtil.j(TAG, "checkSendParams message is null");
            sendErrorResult(p2pSendCallback, 12);
            return false;
        }
        if (identityInfo == null || identityInfo2 == null) {
            sendErrorResult(p2pSendCallback, 5);
            LogUtil.j(TAG, "checkSendParams pkgInfo is null");
            return false;
        }
        LogUtil.a(TAG, "checkSendParams srcPkgName is:", identityInfo.getPackageName(), " destPkgName is:", identityInfo2.getPackageName());
        if (!TextUtils.isEmpty(str) && ylj.d(identityInfo.getPackageName()) && ylj.d(identityInfo2.getPackageName())) {
            return true;
        }
        LogUtil.j(TAG, "checkSendParams device id is null or pkgName is invalid");
        sendErrorResult(p2pSendCallback, 5);
        return false;
    }

    private void sendData(String str, String str2, MessageParcelExtra messageParcelExtra, yke ykeVar, P2pSendCallback p2pSendCallback) {
        byte[] data = messageParcelExtra.getData();
        if (data == null || data.length == 0) {
            LogUtil.j(TAG, "send message data is invalid");
            sendErrorResult(p2pSendCallback, 5);
            throw new IllegalStateException(String.valueOf(5));
        }
        if (!yie.b(str2, EnumWearEngineCapabilityItem.POINT_TO_POINT_PING_AND_SEND_BYTES_ENUM)) {
            LogUtil.e(TAG, "send device is not support");
            throw new IllegalStateException(String.valueOf(13));
        }
        String packageName = ykeVar.d().getPackageName();
        String packageName2 = ykeVar.c().getPackageName();
        if (isSuperCall(packageName)) {
            innerSendData(str, ykeVar, getSendCallbackProxy(str, packageName, packageName2, p2pSendCallback, false), data);
        } else {
            handleThreePartySendDataCall(str, str2, messageParcelExtra, ykeVar, p2pSendCallback);
        }
    }

    private void handleThreePartySendDataCall(String str, String str2, MessageParcelExtra messageParcelExtra, yke ykeVar, P2pSendCallback p2pSendCallback) {
        byte[] data = messageParcelExtra.getData();
        String packageName = ykeVar.d().getPackageName();
        String packageName2 = ykeVar.c().getPackageName();
        if (!yie.b(str2, EnumWearEngineCapabilityItem.WEAR_APP_INSTALLATION_REPORT_ENUM)) {
            LogUtil.a(TAG, "handleThreePartySendDataCall isWearAppInstallationSupport is't support");
            innerSendData(str, ykeVar, getSendCallbackProxy(str, packageName, packageName2, p2pSendCallback, false), data);
            return;
        }
        P2pSendCallback sendCallbackProxy = getSendCallbackProxy(str, packageName, packageName2, p2pSendCallback, true);
        List<WearEngineChannel> wearEngineP2pChannelList = getWearEngineP2pChannelList(str, packageName, packageName2);
        if (wearEngineP2pChannelList.size() == 0) {
            LogUtil.a(TAG, "handleThreePartySendDataCall p2pChannelSize is zero");
            innerSendData(str, ykeVar, sendCallbackProxy, data);
        } else if (checkWearEngineP2pChannel("sendData", wearEngineP2pChannelList)) {
            LogUtil.a(TAG, "handleThreePartySendDataCall P2pChannel is open");
            innerSendData(str, ykeVar, sendCallbackProxy, data);
        } else {
            LogUtil.a(TAG, "handleThreePartySendDataCall srcName ", packageName, "，P2pChannel is close");
            sendErrorResult(p2pSendCallback, 206);
        }
    }

    private P2pSendCallback getSendCallbackProxy(final String str, final String str2, final String str3, final P2pSendCallback p2pSendCallback, final boolean z) {
        return new P2pSendCallback.Stub() { // from class: com.huawei.wearengine.HiWearCoreBinder.4
            @Override // com.huawei.wearengine.p2p.P2pSendCallback
            public void onFileTransferReport(String str4) throws RemoteException {
            }

            @Override // com.huawei.wearengine.p2p.P2pSendCallback
            public void onSendResult(int i) {
                LogUtil.a(HiWearCoreBinder.TAG, "sendData resultCode is ", Integer.valueOf(i));
                int i2 = i == 200 ? 206 : i;
                if (z) {
                    HiWearCoreBinder.this.addOrUpdateWearEngineP2pChannel(i, str, str2, str3);
                }
                LogUtil.a(HiWearCoreBinder.TAG, "sendData sendBack resultCode is ", Integer.valueOf(i2));
                sendCallback(i2);
            }

            @Override // com.huawei.wearengine.p2p.P2pSendCallback
            public void onSendProgress(long j) throws RemoteException {
                p2pSendCallback.onSendProgress(j);
            }

            private void sendCallback(int i) {
                try {
                    p2pSendCallback.onSendResult(i);
                } catch (Exception unused) {
                    LogUtil.e(HiWearCoreBinder.TAG, "SendErrorResult e");
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOrUpdateWearEngineP2pChannel(int i, String str, String str2, String str3) {
        int i2;
        int i3 = 1;
        if (i == 200) {
            i2 = 1;
            i3 = 0;
        } else {
            i2 = 0;
        }
        yih yihVarB = yih.b();
        if (getWearEngineP2pChannelList(str, str2, str3).size() == 0) {
            LogUtil.a(TAG, "addOrUpdateWearEngineP2pChannel add new P2pChannel");
            yif yifVar = new yif();
            yifVar.updateChannelState(i2);
            yihVarB.b(str, str2, str3, yifVar);
        } else {
            LogUtil.a(TAG, "addOrUpdateWearEngineP2pChannel update P2pChannel");
            yid yidVar = new yid();
            yidVar.d(i3);
            yidVar.c(str3);
            yihVarB.a(str, yidVar);
        }
        if (i == 200) {
            WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
            wearEngineBiOperate.init();
            wearEngineBiOperate.biApiCalling(BaseApplication.b(), str2, BI_NAME_P2PCHANNEL_STATE, String.valueOf(0));
        }
    }

    private void innerSendData(String str, yke ykeVar, P2pSendCallback p2pSendCallback, byte[] bArr) {
        LogUtil.a(TAG, "send message data is:", Arrays.toString(bArr));
        int iC = yhu.b().c();
        LogUtil.a(TAG, "send sequenceNum is:", Integer.valueOf(iC));
        DeviceCommand deviceCommandB = ylj.b(iC, ykeVar.d(), ykeVar.c(), bArr);
        if (deviceCommandB == null) {
            LogUtil.e(TAG, "ping deviceCommand is null");
            sendErrorResult(p2pSendCallback, 12);
            throw new IllegalStateException(String.valueOf(12));
        }
        LogUtil.a(TAG, "send deviceCommand is:", deviceCommandB.toString());
        deviceCommandB.setmIdentify(str);
        yhu.b().d(iC, p2pSendCallback);
        ykx.c(deviceCommandB);
    }

    private void sendFile(String str, MessageParcelExtra messageParcelExtra, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pSendCallback p2pSendCallback) {
        LogUtil.a(TAG, "sendFile enter");
        String packageName = identityInfo.getPackageName();
        String packageName2 = identityInfo2.getPackageName();
        if (!ASSISTANT_PACKAGE_NAME.equals(packageName)) {
            if (!yie.b(str, EnumWearEngineCapabilityItem.POINT_TO_POINT_SEND_FILES_TO_WATCH_ENUM)) {
                LogUtil.e(TAG, "sendFile device is not support");
                throw new IllegalStateException(String.valueOf(13));
            }
        } else {
            LogUtil.a(TAG, "The watch capability does not need to be verified.");
        }
        SendFileCallbackProxy sendFileCallbackProxy = new SendFileCallbackProxy(this, p2pSendCallback, packageName, packageName2, messageParcelExtra.getFileName());
        this.mSendFileProxyList.add(sendFileCallbackProxy);
        addSrcFileRecord(packageName, packageName2, messageParcelExtra.getFileName());
        mro.e().d(getSendFileInfo(messageParcelExtra, identityInfo, identityInfo2, sendFileCallbackProxy), getDevice(str));
    }

    private mrk getSendFileInfo(MessageParcelExtra messageParcelExtra, IdentityInfo identityInfo, IdentityInfo identityInfo2, SendFileCallbackProxy sendFileCallbackProxy) {
        mrk mrkVar = new mrk();
        mrkVar.a(messageParcelExtra.getParcelFileDescriptor());
        mrkVar.b(messageParcelExtra.getFileName());
        mrkVar.f(7);
        mrkVar.e(messageParcelExtra.getDescription());
        mrkVar.g(identityInfo.getPackageName());
        mrkVar.d(identityInfo2.getPackageName());
        mrkVar.i(identityInfo.getFingerPrint());
        mrkVar.a(identityInfo2.getFingerPrint());
        mrkVar.j(messageParcelExtra.getFileSha256());
        mrkVar.b(sendFileCallbackProxy);
        return mrkVar;
    }

    @Override // com.huawei.wearengine.HiWearEngineService
    public void subscribeDeviceDataReceiver(P2pReceiverCallback p2pReceiverCallback) {
        if (!checkPermission()) {
            LogUtil.e(TAG, PERMISSION_FAILED);
            return;
        }
        yhu.b().d(p2pReceiverCallback);
        if (p2pReceiverCallback != null) {
            try {
                p2pReceiverCallback.asBinder().linkToDeath(this.deviceDataDeathRecipient, 0);
            } catch (RemoteException unused) {
                LogUtil.e(TAG, "subscribeDevice discoverDevices remoteException");
            }
        }
    }

    @Override // com.huawei.wearengine.HiWearEngineService
    public void unsubscribeDeviceDataReceiver() {
        P2pReceiverCallback p2pReceiverCallbackD = yhu.b().d();
        if (p2pReceiverCallbackD != null) {
            p2pReceiverCallbackD.asBinder().unlinkToDeath(this.deviceDataDeathRecipient, 0);
        }
        yhu.b().a();
    }

    private void sendErrorResult(P2pSendCallback p2pSendCallback, int i) {
        try {
            p2pSendCallback.onSendResult(i);
            p2pSendCallback.onSendProgress(0L);
        } catch (Exception unused) {
            LogUtil.e(TAG, "SendErrorResult e");
        }
    }

    @Override // com.huawei.wearengine.HiWearEngineService
    public void query(Device device, String str, QueryDataCallback queryDataCallback) {
        LogUtil.a(TAG, "query enter");
        if (queryDataCallback == null) {
            LogUtil.j(TAG, "queryDataCallback is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        if (str == null || device == null) {
            generateErrorResult(queryDataCallback, 5);
            LogUtil.j(TAG, "query device or eventType is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        if (str.equals("powerMode")) {
            handlePowerModeQuery(device, queryDataCallback);
            return;
        }
        String uuid = device.getUuid();
        if (TextUtils.isEmpty(uuid)) {
            LogUtil.e(TAG, "queryDataCallback deviceId is empty");
            throw new IllegalStateException(String.valueOf(5));
        }
        String strD = yhu.b().d(uuid);
        LogUtil.d(TAG, "query identify is:", strD);
        if (StringUtils.g(strD)) {
            LogUtil.e(TAG, "query device identify is null");
            generateErrorResult(queryDataCallback, 5);
            throw new IllegalStateException(String.valueOf(5));
        }
        checkDeviceQueryCapability(uuid, str);
        yht.d().e(strD, str, queryDataCallback);
    }

    private void handlePowerModeQuery(Device device, QueryDataCallback queryDataCallback) {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, TAG);
        if (deviceList == null || deviceList.isEmpty()) {
            LogUtil.e(TAG, "handlePowerModeQuery deviceInfoList is empty");
            throw new IllegalStateException(String.valueOf(16));
        }
        DeviceInfo deviceInfoD = ykx.d(device, deviceList);
        if (deviceInfoD == null) {
            LogUtil.e(TAG, "handlePowerModeQuery deviceInfo is null");
            throw new IllegalStateException(String.valueOf(16));
        }
        try {
            Device deviceA = ykx.a(deviceInfoD);
            if (deviceA == null) {
                LogUtil.e(TAG, "handlePowerModeQuery hiWearDevice is null");
                throw new IllegalStateException(String.valueOf(12));
            }
            queryDataCallback.onDataReceived(0, new MonitorMessage().setMonitorItemType("powerMode").setDeviceId(deviceA.getUuid()).setProductType(deviceA.getProductType()).setIntData(ykx.b(deviceInfoD)));
        } catch (RemoteException unused) {
            LogUtil.e(TAG, "handlePowerModeQuery RemoteException");
        }
    }

    @Override // com.huawei.wearengine.HiWearEngineService
    public void subscribeMonitorReceiver(MonitorCallback monitorCallback) {
        if (!checkPermission()) {
            LogUtil.e(TAG, PERMISSION_FAILED);
            return;
        }
        yht.d().b(monitorCallback);
        if (monitorCallback != null) {
            try {
                monitorCallback.asBinder().linkToDeath(this.monitorCallbackDeathRecipient, 0);
            } catch (RemoteException unused) {
                LogUtil.e(TAG, "subscribeDevice discoverDevices remoteException");
            }
        }
    }

    @Override // com.huawei.wearengine.HiWearEngineService
    public void unsubscribeMonitorReceiver() {
        MonitorCallback monitorCallbackB = yht.d().b();
        if (monitorCallbackB != null) {
            monitorCallbackB.asBinder().unlinkToDeath(this.monitorCallbackDeathRecipient, 0);
        }
        yht.d().a();
    }

    @Override // com.huawei.wearengine.HiWearEngineService
    public void notify(String str, NotificationParcel notificationParcel, NotifySendCallback notifySendCallback) {
        LogUtil.a(TAG, "notify enter");
        if (notifySendCallback == null || notificationParcel == null) {
            LogUtil.j(TAG, "notifySendCallback or notificationParcel is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "notify deviceId is empty");
            try {
                notifySendCallback.onError(notificationParcel, 5);
            } catch (RemoteException unused) {
                LogUtil.e(TAG, GENERATE_ERROR_RESULT);
            } catch (Exception unused2) {
                LogUtil.e(TAG, "notifySendCallback onError has exception");
            }
            throw new IllegalStateException(String.valueOf(5));
        }
        String strD = yhu.b().d(str);
        LogUtil.d(TAG, "notify identify is:", strD);
        if (StringUtils.g(strD)) {
            LogUtil.e(TAG, "notify device identify is null");
            try {
                notifySendCallback.onError(notificationParcel, 5);
            } catch (RemoteException unused3) {
                LogUtil.e(TAG, GENERATE_ERROR_RESULT);
            } catch (Exception unused4) {
                LogUtil.e(TAG, "notifySendCallback onError has exception");
            }
            throw new IllegalStateException(String.valueOf(5));
        }
        if (!yie.b(str, EnumWearEngineCapabilityItem.SEND_NOTIFY_TO_WATCH_ENUM)) {
            LogUtil.e(TAG, "notify device is not support");
            throw new IllegalStateException(String.valueOf(13));
        }
        String strE = yjx.a().e();
        LogUtil.a(TAG, "notificationId is:", strE);
        DeviceCommand deviceCommandA = ylf.a(notificationParcel, strE);
        LogUtil.a(TAG, "notification command is:", deviceCommandA.toString());
        deviceCommandA.setmIdentify(strD);
        yjx.a().e(strE, notificationParcel, notifySendCallback);
        ykx.c(deviceCommandA);
    }

    @Override // com.huawei.wearengine.HiWearEngineService
    public void switchMonitorStatus(int i, String str, String str2, SwitchStatusCallback switchStatusCallback) {
        if (switchStatusCallback == null) {
            LogUtil.j(TAG, "callback is null in switchMonitorStatus");
            throw new IllegalStateException(String.valueOf(5));
        }
        if (i == 0 || str2 == null) {
            LogUtil.j(TAG, "switchStatus invalid or eventType is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "deviceId is empty in switchMonitorStatus");
            throw new IllegalStateException(String.valueOf(5));
        }
        String strD = yhu.b().d(str);
        LogUtil.d(TAG, "switchMonitorStatus identify is:", strD);
        if (StringUtils.g(strD)) {
            LogUtil.e(TAG, "switchMonitorStatus device identify is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        checkDeviceReportCapability(str, str2);
        DeviceCommand deviceCommandD = yli.d(i, str2);
        if (deviceCommandD != null) {
            LogUtil.a(TAG, "transform switch command is:", deviceCommandD.toString());
            deviceCommandD.setmIdentify(strD);
            yjq.a().c(str2, i, switchStatusCallback);
            ykx.c(deviceCommandD);
            return;
        }
        LogUtil.e(TAG, "transform switch command is null");
        throw new IllegalStateException(String.valueOf(12));
    }

    private void checkDeviceReportCapability(String str, String str2) {
        EnumWearEngineCapabilityItem reportCapabilityItemByEventType = getReportCapabilityItemByEventType(str2);
        if (reportCapabilityItemByEventType == null) {
            LogUtil.e(TAG, "checkDeviceReportCapability eventType not support report");
            throw new IllegalStateException(String.valueOf(5));
        }
        if (yie.b(str, reportCapabilityItemByEventType)) {
            return;
        }
        LogUtil.e(TAG, "checkDeviceReportCapability device is not support");
        throw new IllegalStateException(String.valueOf(13));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    private EnumWearEngineCapabilityItem getReportCapabilityItemByEventType(String str) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "wearStatus":
                b2 = 0;
                break;
            case "lowPower":
                b2 = 1;
                break;
            case "sportStatus":
                b2 = 2;
                break;
            case "sleepStatus":
                b2 = 3;
                break;
            case "heartRateAlarm":
                b2 = 4;
                break;
            case "chargeStatus":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return EnumWearEngineCapabilityItem.WEAR_STATUS_QUERY_AND_REPORT_ENUM;
        }
        if (b2 == 1) {
            return EnumWearEngineCapabilityItem.LOW_POWER_REPORT_ENUM;
        }
        if (b2 == 2) {
            return EnumWearEngineCapabilityItem.SPORT_STATUS_QUERY_AND_REPORT_ENUM;
        }
        if (b2 == 3) {
            return EnumWearEngineCapabilityItem.SLEEP_STATUS_QUERY_AND_REPORT_ENUM;
        }
        if (b2 == 4) {
            return EnumWearEngineCapabilityItem.HEART_RATE_ALARM_REPORT_ENUM;
        }
        if (b2 != 5) {
            return null;
        }
        return EnumWearEngineCapabilityItem.CHARGING_STATUS_QUERY_AND_REPORT_ENUM;
    }

    private void checkDeviceQueryCapability(String str, String str2) {
        EnumWearEngineCapabilityItem queryCapabilityItemByEventType = getQueryCapabilityItemByEventType(str2);
        if (queryCapabilityItemByEventType == null) {
            LogUtil.e(TAG, "checkDeviceQueryCapability eventType not support query");
            throw new IllegalStateException(String.valueOf(5));
        }
        if (yie.b(str, queryCapabilityItemByEventType)) {
            return;
        }
        LogUtil.e(TAG, "checkDeviceQueryCapability device is not support");
        throw new IllegalStateException(String.valueOf(13));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    private EnumWearEngineCapabilityItem getQueryCapabilityItemByEventType(String str) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "wearStatus":
                b2 = 0;
                break;
            case "sportStatus":
                b2 = 1;
                break;
            case "powerStatus":
                b2 = 2;
                break;
            case "sleepStatus":
                b2 = 3;
                break;
            case "chargeStatus":
                b2 = 4;
                break;
            case "userAvailableKbytes":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return EnumWearEngineCapabilityItem.WEAR_STATUS_QUERY_AND_REPORT_ENUM;
        }
        if (b2 == 1) {
            return EnumWearEngineCapabilityItem.SPORT_STATUS_QUERY_AND_REPORT_ENUM;
        }
        if (b2 == 2) {
            return EnumWearEngineCapabilityItem.POWER_STATUS_QUERY_ENUM;
        }
        if (b2 == 3) {
            return EnumWearEngineCapabilityItem.SLEEP_STATUS_QUERY_AND_REPORT_ENUM;
        }
        if (b2 == 4) {
            return EnumWearEngineCapabilityItem.CHARGING_STATUS_QUERY_AND_REPORT_ENUM;
        }
        if (b2 != 5) {
            return null;
        }
        return EnumWearEngineCapabilityItem.QUERY_DEVICE_AVAILABLE_SPACE_ENUM;
    }

    private boolean checkPermission() {
        return Binder.getCallingUid() == getCallingUid();
    }

    @Override // com.huawei.wearengine.p2p.SendFileCallbackCleanup
    public void onCleanup(SendFileCallbackProxy sendFileCallbackProxy, String str, String str2, String str3) {
        LogUtil.d(TAG, "onCleanup enter");
        if (!checkPermission()) {
            LogUtil.e(TAG, PERMISSION_FAILED);
        } else {
            this.mSendFileProxyList.remove(sendFileCallbackProxy);
            removeFileRecord(str, str2, str3);
        }
    }

    @Override // com.huawei.wearengine.p2p.SendFileCallbackCleanup
    public void onCleanupCancelFileTransfer(CancelFileTransferCallBackProxy cancelFileTransferCallBackProxy, String str, String str2, String str3) {
        LogUtil.d(TAG, "onCleanupCancelFileTransfer enter");
        if (!checkPermission()) {
            LogUtil.e(TAG, PERMISSION_FAILED);
        } else {
            this.mCancelFileTransferProxyList.remove(cancelFileTransferCallBackProxy);
            removeFileRecord(str, str2, str3);
        }
    }

    public void setHwWearEngineNative(HwWearEngineNative hwWearEngineNative) {
        LogUtil.a(TAG, "setHwWearEngineNative enter");
        if (!checkPermission()) {
            LogUtil.e(TAG, PERMISSION_FAILED);
        } else {
            yhu.b().b(hwWearEngineNative);
        }
    }

    @Override // com.huawei.wearengine.HiWearEngineService
    public void getDeviceAppVersionCode(Device device, String str, String str2, P2pPingCallback p2pPingCallback) {
        LogUtil.a(TAG, "getDeviceAppVersionCode enter");
        if (p2pPingCallback == null) {
            LogUtil.j(TAG, "getDeviceAppVersionCode versionCodeCallback is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        if (device == null || !ylj.d(str) || !ylj.d(str2)) {
            LogUtil.e(TAG, "getDeviceAppVersionCode device or pkgName is invalid");
            throw new IllegalStateException(String.valueOf(5));
        }
        String uuid = device.getUuid();
        if (TextUtils.isEmpty(uuid)) {
            LogUtil.e(TAG, "getDeviceAppVersionCode deviceId is empty");
            throw new IllegalStateException(String.valueOf(5));
        }
        String strD = yhu.b().d(uuid);
        LogUtil.d(TAG, "getDeviceAppVersionCode identify is:", strD);
        if (TextUtils.isEmpty(strD)) {
            LogUtil.e(TAG, "getDeviceAppVersionCode device identify is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        if (!yie.b(uuid, EnumWearEngineCapabilityItem.QUERY_DEVICE_APP_INSTALL_INFO_ENUM)) {
            LogUtil.e(TAG, "getDeviceAppVersionCode device is not support");
            throw new IllegalStateException(String.valueOf(13));
        }
        int iC = yhu.b().c();
        LogUtil.a(TAG, "getDeviceAppVersionCode sequenceNum is:", Integer.valueOf(iC));
        DeviceCommand deviceCommandC = ylj.c(iC, 4, str, str2);
        if (deviceCommandC == null) {
            LogUtil.e(TAG, "getDeviceAppVersionCode deviceCommand is null");
            throw new IllegalStateException(String.valueOf(12));
        }
        LogUtil.a(TAG, "getDeviceAppVersionCode deviceCommand is:", deviceCommandC.toString());
        deviceCommandC.setmIdentify(strD);
        ykx.c(deviceCommandC);
        yhu.b().d(iC, p2pPingCallback);
    }

    @Override // com.huawei.wearengine.HiWearEngineService
    public void cancelFileTransfer(Device device, FileIdentificationParcel fileIdentificationParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pCancelFileTransferCallBack p2pCancelFileTransferCallBack) {
        LogUtil.a(TAG, "cancelFileTransfer enter");
        if (!checkCancelFileTransferParams(device, fileIdentificationParcel, identityInfo, identityInfo2, p2pCancelFileTransferCallBack)) {
            throw new IllegalStateException(String.valueOf(5));
        }
        String strD = yhu.b().d(device.getUuid());
        LogUtil.d(TAG, "cancelFileTransfer identify is:", strD);
        if (TextUtils.isEmpty(strD)) {
            LogUtil.e(TAG, "cancelFileTransfer device identify is null");
            cancelFileTransferErrorResult(p2pCancelFileTransferCallBack, 5, "Invalid argument");
            throw new IllegalStateException(String.valueOf(5));
        }
        if (!checkFileRecordExist(identityInfo.getPackageName(), identityInfo2.getPackageName(), fileIdentificationParcel.getFileName())) {
            LogUtil.e(TAG, "cancelFileTransfer file transfer not exit");
            cancelFileTransferErrorResult(p2pCancelFileTransferCallBack, 5, "Invalid argument");
            throw new IllegalStateException(String.valueOf(5));
        }
        if (!ASSISTANT_PACKAGE_NAME.equals(identityInfo.getPackageName())) {
            if (!yie.b(device.getUuid(), EnumWearEngineCapabilityItem.POINT_TO_POINT_SEND_FILES_TO_WATCH_ENUM)) {
                LogUtil.e(TAG, "cancelFileTransfer device is not support");
                throw new IllegalStateException(String.valueOf(13));
            }
        } else {
            LogUtil.a(TAG, "The watch capability does not need to be verified.");
        }
        CancelFileTransferCallBackProxy cancelFileTransferCallBackProxy = new CancelFileTransferCallBackProxy(this, p2pCancelFileTransferCallBack, identityInfo.getPackageName(), identityInfo2.getPackageName(), fileIdentificationParcel.getFileName());
        this.mCancelFileTransferProxyList.add(cancelFileTransferCallBackProxy);
        mro.e().d(getCancelFileInfo(fileIdentificationParcel, identityInfo, identityInfo2, cancelFileTransferCallBackProxy), cancelFileTransferCallBackProxy, getDevice(device.getUuid()));
    }

    private void cancelFileTransferErrorResult(P2pCancelFileTransferCallBack p2pCancelFileTransferCallBack, int i, String str) {
        try {
            p2pCancelFileTransferCallBack.onCancelFileTransferResult(i, str);
        } catch (Exception unused) {
            LogUtil.e(TAG, "stopSendFileErrorResult e");
        }
    }

    private boolean checkCancelFileTransferParams(Device device, FileIdentificationParcel fileIdentificationParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pCancelFileTransferCallBack p2pCancelFileTransferCallBack) {
        if (p2pCancelFileTransferCallBack == null) {
            LogUtil.e(TAG, "checkCancelFileTransferParams p2pStopSendFileCallBack is null");
            return false;
        }
        if (fileIdentificationParcel == null || TextUtils.isEmpty(fileIdentificationParcel.getFileName())) {
            LogUtil.e(TAG, "checkCancelFileTransferParams fileIdentificationParcel is null or fileName is empty");
            cancelFileTransferErrorResult(p2pCancelFileTransferCallBack, 5, "Invalid argument");
            return false;
        }
        if (device == null) {
            LogUtil.e(TAG, "checkCancelFileTransferParams device is null");
            cancelFileTransferErrorResult(p2pCancelFileTransferCallBack, 5, "Invalid argument");
            return false;
        }
        if (identityInfo == null || identityInfo2 == null) {
            cancelFileTransferErrorResult(p2pCancelFileTransferCallBack, 5, "Invalid argument");
            LogUtil.e(TAG, "checkCancelFileTransferParams pkgInfo is null");
            return false;
        }
        LogUtil.a(TAG, "checkCancelFileTransferParams srcPkgName is:", identityInfo.getPackageName(), " destPkgName is:", identityInfo2.getPackageName());
        if (ylj.d(identityInfo.getPackageName()) && ylj.d(identityInfo2.getPackageName())) {
            return true;
        }
        cancelFileTransferErrorResult(p2pCancelFileTransferCallBack, 5, "Invalid argument");
        LogUtil.e(TAG, "checkCancelFileTransferParams device id is null or pkgName is invalid");
        return false;
    }

    private mrk getCancelFileInfo(FileIdentificationParcel fileIdentificationParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, CancelFileTransferCallBackProxy cancelFileTransferCallBackProxy) {
        mrk mrkVar = new mrk();
        mrkVar.b(fileIdentificationParcel.getFileName());
        mrkVar.f(7);
        mrkVar.g(identityInfo.getPackageName());
        mrkVar.d(identityInfo2.getPackageName());
        return mrkVar;
    }

    private void addSrcFileRecord(String str, String str2, String str3) {
        synchronized (this.mFileTransferRecordLock) {
            Map<String, List<String>> map = this.mFileTransferredRecordMap.get(str);
            if (map == null) {
                LogUtil.j(TAG, "addExistSrcFileRecord srcFileRecordMap is null");
                map = new HashMap<>(16);
            }
            List<String> arrayList = map.get(str2);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(str3)) {
                arrayList.add(str3);
            }
            map.put(str2, arrayList);
            this.mFileTransferredRecordMap.put(str, map);
            LogUtil.a(TAG, "addSrcFileRecord srcPkgName: ", str, " destPkgName: " + str2 + " file size is: ", Integer.valueOf(arrayList.size()));
        }
    }

    private void removeFileRecord(String str, String str2, String str3) {
        synchronized (this.mFileTransferRecordLock) {
            Map<String, List<String>> map = this.mFileTransferredRecordMap.get(str);
            if (map == null) {
                LogUtil.j(TAG, "removeFileRecord srcFileRecordMap is null");
                return;
            }
            List<String> list = map.get(str2);
            if (list == null) {
                LogUtil.j(TAG, "removeFileRecord destFileRecordList is null");
                return;
            }
            LogUtil.a(TAG, "removeFileRecord srcPackageName: ", str, " destPackageName: " + str2 + " file size: ", Integer.valueOf(list.size()));
            for (int size = list.size() - 1; size >= 0; size--) {
                if (str3.equals(list.get(size))) {
                    list.remove(size);
                    LogUtil.a(TAG, "removeFileRecord srcPackageName: ", str, " destPackageName: " + str2 + " file size: ", Integer.valueOf(list.size()));
                    return;
                }
            }
        }
    }

    private boolean checkFileRecordExist(String str, String str2, String str3) {
        synchronized (this.mFileTransferRecordLock) {
            Map<String, List<String>> map = this.mFileTransferredRecordMap.get(str);
            if (map == null) {
                LogUtil.j(TAG, "checkFileRecordExist srcFileRecordMap is null");
                return false;
            }
            List<String> list = map.get(str2);
            if (list != null && !list.isEmpty()) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (str3.equals(list.get(size))) {
                        return true;
                    }
                }
                return false;
            }
            LogUtil.j(TAG, "checkFileRecordExist destFileRecordList is null or isEmpty");
            return false;
        }
    }

    private UniteDevice getDevice(String str) {
        DeviceInfo next;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "getDevice deviceId s empty");
            return null;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, TAG);
        if (deviceList.size() != 0) {
            Iterator<DeviceInfo> it = deviceList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (str.equals(next.getDeviceUdid())) {
                    break;
                }
            } while (!str.equals(next.getUuid()));
            if (next != null) {
                com.huawei.devicesdk.entity.DeviceInfo deviceInfo = new com.huawei.devicesdk.entity.DeviceInfo();
                deviceInfo.setDeviceBtType(next.getDeviceBluetoothType());
                deviceInfo.setDeviceName(next.getDeviceName());
                deviceInfo.setDeviceMac(next.getDeviceIdentify());
                deviceInfo.setDeviceType(next.getProductType());
                UniteDevice uniteDevice = new UniteDevice();
                uniteDevice.build(deviceInfo.getDeviceMac(), deviceInfo, null);
                return uniteDevice;
            }
        }
        return null;
    }
}
