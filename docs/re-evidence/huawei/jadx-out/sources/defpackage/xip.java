package defpackage;

import android.text.TextUtils;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.unitedevice.callback.IResultAIDLCallback;
import com.huawei.unitedevice.callback.ITransferFileCallback;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.unitedevice.hwcommonfilemgr.SendFileCallbackProxy;
import com.huawei.unitedevice.hwcommonfilemgr.TransferFileQueueManager;
import com.huawei.unitedevice.hwcommonfilemgr.entity.CommonFileInfoParcel;
import com.huawei.unitedevice.hwcommonfilemgr.entity.FileInfo;
import com.huawei.unitedevice.p2p.EngineManagementInterface;
import com.huawei.unitedevice.p2p.EnumCapabilityItem;
import com.huawei.unitedevice.p2p.IdentityInfo;
import com.huawei.unitedevice.p2p.MessageParcel;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes20.dex */
public class xip implements EngineManagementInterface {
    private String e;

    private xip() {
        this.e = "EngineManagement";
    }

    public static xip a() {
        return e.f53069b;
    }

    @Override // com.huawei.unitedevice.p2p.EngineManagementInterface
    public void registerReceiver(IdentityInfo identityInfo, IdentityInfo identityInfo2, xiy xiyVar, SendCallback sendCallback) {
        if (!d(xiyVar)) {
            LogUtil.e(this.e, "registerReceiver Parameter is invalid");
            if (sendCallback != null) {
                sendCallback.onSendResult(500001);
                return;
            }
            return;
        }
        if (xio.c().b() == null) {
            LogUtil.e(this.e, "registerReceiver device is not connect.");
            if (sendCallback != null) {
                sendCallback.onSendResult(520003);
                return;
            }
            return;
        }
        LogUtil.b(this.e, "registerReceiver register to UDS.");
        int iC = xjc.b().c(identityInfo, identityInfo2, xiyVar);
        if (sendCallback != null) {
            if (iC == 0) {
                sendCallback.onSendResult(500000);
            } else {
                sendCallback.onSendResult(iC);
            }
        }
    }

    private boolean d(xiy xiyVar) {
        if (xiyVar != null) {
            return true;
        }
        LogUtil.e(this.e, "receiver is null");
        return false;
    }

    @Override // com.huawei.unitedevice.p2p.EngineManagementInterface
    public void unregisterReceiver(xiy xiyVar) {
        if (!d(xiyVar)) {
            LogUtil.e(this.e, "unregisterReceiver Parameter is invalid");
        } else {
            LogUtil.b(this.e, "unregisterReceiver unregister to UDS.");
            xjc.b().d(xiyVar);
        }
    }

    @Override // com.huawei.unitedevice.p2p.EngineManagementInterface
    public void p2pSend(UniteDevice uniteDevice, IdentityInfo identityInfo, IdentityInfo identityInfo2, MessageParcel messageParcel, SendCallback sendCallback) {
        LogUtil.b(this.e, "enter p2pSend");
        if (!c(identityInfo, identityInfo2, messageParcel)) {
            if (sendCallback != null) {
                sendCallback.onSendResult(500001);
            }
            LogUtil.e(this.e, "p2pSend Parameter is invalid");
        } else {
            try {
                b(xio.c().e((uniteDevice == null || uniteDevice.getDeviceInfo() == null) ? null : uniteDevice.getDeviceInfo().getDeviceMac()), identityInfo, identityInfo2, messageParcel, sendCallback);
            } catch (IllegalStateException unused) {
                LogUtil.d(this.e, "send data RemoteException");
                if (sendCallback != null) {
                    sendCallback.onSendResult(520001);
                }
            }
        }
    }

    private boolean c(IdentityInfo identityInfo, IdentityInfo identityInfo2, MessageParcel messageParcel) {
        if (identityInfo == null) {
            LogUtil.e(this.e, "srcInfo is empty");
            return false;
        }
        if (identityInfo2 == null) {
            LogUtil.e(this.e, "destInfo is empty");
            return false;
        }
        if (messageParcel != null) {
            return true;
        }
        LogUtil.e(this.e, "message is empty");
        return false;
    }

    private void b(UniteDevice uniteDevice, IdentityInfo identityInfo, IdentityInfo identityInfo2, MessageParcel messageParcel, SendCallback sendCallback) {
        if (uniteDevice != null && uniteDevice.getDeviceInfo().isUsing()) {
            LogUtil.b(this.e, "use p2pmanager to send p2p message.");
            a(uniteDevice, identityInfo, identityInfo2, messageParcel, sendCallback);
        } else {
            LogUtil.e(this.e, "sendP2pMessage send p2p message fail,the device is null or not connected");
            if (sendCallback != null) {
                sendCallback.onSendResult(520003);
            }
        }
    }

    private void a(UniteDevice uniteDevice, IdentityInfo identityInfo, IdentityInfo identityInfo2, MessageParcel messageParcel, SendCallback sendCallback) {
        LogUtil.b(this.e, "send enter");
        if (c(uniteDevice, identityInfo, identityInfo2, messageParcel, sendCallback)) {
            if (messageParcel.getType() == 1) {
                e(uniteDevice, identityInfo, identityInfo2, messageParcel, sendCallback);
            } else {
                d(uniteDevice, identityInfo, identityInfo2, messageParcel, sendCallback);
            }
        }
    }

    private boolean c(UniteDevice uniteDevice, IdentityInfo identityInfo, IdentityInfo identityInfo2, MessageParcel messageParcel, SendCallback sendCallback) {
        if (messageParcel == null) {
            LogUtil.e(this.e, "checkSendParams message is null");
            return false;
        }
        if (identityInfo == null || identityInfo2 == null) {
            LogUtil.e(this.e, "checkSendParams pkgInfo is null");
            return false;
        }
        LogUtil.b(this.e, "checkSendParams srcPkgName is ", identityInfo.getPackageName(), " destPkgName is ", identityInfo2.getPackageName());
        if (!TextUtils.isEmpty(uniteDevice.getIdentify()) && xiw.c(identityInfo.getPackageName()) && xiw.c(identityInfo2.getPackageName())) {
            return true;
        }
        LogUtil.e(this.e, "checkSendParams device id is null or pkgName is invalid");
        if (sendCallback != null) {
            sendCallback.onSendProgress(0L);
        }
        return false;
    }

    private void e(UniteDevice uniteDevice, IdentityInfo identityInfo, IdentityInfo identityInfo2, MessageParcel messageParcel, SendCallback sendCallback) {
        if (messageParcel.getData().length == 0) {
            LogUtil.e(this.e, "send message data is invalid");
            if (sendCallback != null) {
                sendCallback.onSendProgress(0L);
            }
            lng.c("P2PMessage", "P2PMessage sendData message data is invalid");
            return;
        }
        int iA = xio.c().a();
        LogUtil.b(this.e, "send sequenceNum is ", Integer.valueOf(iA));
        cmg cmgVarC = xiw.c(uniteDevice, iA, identityInfo, identityInfo2, messageParcel);
        if (cmgVarC == null) {
            LogUtil.e(this.e, "ping deviceCommand is null");
            if (sendCallback != null) {
                sendCallback.onSendResult(12);
            }
            lng.c("P2PMessage", "P2PMessage sendData commandMessage is null");
            return;
        }
        if (!col.b(uniteDevice.getIdentify(), EnumCapabilityItem.POINT_TO_POINT_PING_AND_SEND_BYTES_ENUM)) {
            LogUtil.e(this.e, "send device is not support");
            return;
        }
        cpl.b(this.e, cmgVarC.b(), "send deviceCommand is ");
        xjb.c().c(iA, sendCallback);
        e(uniteDevice, cmgVarC);
    }

    private void d(UniteDevice uniteDevice, IdentityInfo identityInfo, IdentityInfo identityInfo2, MessageParcel messageParcel, SendCallback sendCallback) {
        LogUtil.b(this.e, "sendFile enter");
        if (!col.b(uniteDevice.getIdentify(), EnumCapabilityItem.POINT_TO_POINT_SEND_FILES_TO_WATCH_ENUM)) {
            LogUtil.e(this.e, "sendFile device is not support");
        }
        xhr xhrVarA = a(messageParcel, identityInfo, identityInfo2, new SendFileCallbackProxy(sendCallback));
        xhrVarA.c(uniteDevice);
        xhrVarA.c(TransferFileQueueManager.TaskMode.ENGINE);
        if (TransferFileQueueManager.b().e(xhrVarA, "engineManagement.sendFile")) {
            xhj.c().d(uniteDevice, xhrVarA);
        } else {
            LogUtil.b(this.e, "wait send file queue over.");
        }
    }

    private xhr a(MessageParcel messageParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, SendFileCallbackProxy sendFileCallbackProxy) {
        xhr xhrVar = new xhr();
        xhrVar.e(messageParcel.getParcelFileDescriptor());
        xhrVar.c(messageParcel.getFileName());
        xhrVar.g(7);
        xhrVar.b(messageParcel.getDescription());
        xhrVar.g(identityInfo.getPackageName());
        xhrVar.a(identityInfo2.getPackageName());
        xhrVar.j(identityInfo.getFingerPrint());
        xhrVar.e(identityInfo2.getFingerPrint());
        xhrVar.i(messageParcel.getFileSha256());
        xhrVar.e(sendFileCallbackProxy);
        xhrVar.d(messageParcel.getFilePath());
        return xhrVar;
    }

    public void e(UniteDevice uniteDevice, cmg cmgVar) {
        cju.d().sendCommand(uniteDevice.getDeviceInfo(), cmgVar);
    }

    @Override // com.huawei.unitedevice.p2p.EngineManagementInterface
    public void ping(String str, String str2, PingCallback pingCallback, UniteDevice uniteDevice, int i) {
        LogUtil.b(this.e, "enter ping");
        if (!c(str, str2, pingCallback)) {
            if (pingCallback != null) {
                pingCallback.onPingResult(500001);
            }
            LogUtil.e(this.e, "ping Parameter is invalid");
        } else {
            try {
                c(xio.c().e((uniteDevice == null || uniteDevice.getDeviceInfo() == null) ? null : uniteDevice.getDeviceInfo().getDeviceMac()), str, str2, pingCallback, i);
            } catch (IllegalStateException unused) {
                LogUtil.d(this.e, "ping RemoteException");
            }
        }
    }

    private void a(UniteDevice uniteDevice, String str, String str2, PingCallback pingCallback, int i) {
        if (pingCallback == null) {
            LogUtil.e(this.e, "ping pingCallback is null");
            return;
        }
        LogUtil.b(this.e, "ping enter ping srcPkgName is ", str, " destPkgName is ", str2);
        if (uniteDevice == null || !xiw.c(str2) || !xiw.c(str)) {
            LogUtil.e(this.e, "ping device or pkgName is invalid");
            pingCallback.onPingResult(5);
            return;
        }
        String identify = uniteDevice.getIdentify();
        if (TextUtils.isEmpty(identify)) {
            LogUtil.e(this.e, "ping deviceId is empty");
            pingCallback.onPingResult(5);
            return;
        }
        if (!col.b(identify, EnumCapabilityItem.POINT_TO_POINT_PING_AND_SEND_BYTES_ENUM)) {
            LogUtil.e(this.e, "ping device is not support");
            pingCallback.onPingResult(13);
            return;
        }
        int iA = xio.c().a();
        LogUtil.b(this.e, "ping sequenceNum is ", Integer.valueOf(iA));
        cmg cmgVarC = xiw.c(uniteDevice, iA, 1, str, str2, i);
        if (cmgVarC == null) {
            LogUtil.e(this.e, "ping deviceCommand is null");
            return;
        }
        LogUtil.c(this.e, "ping deviceCommand is ", cmgVarC.toString());
        xjb.c().b(iA, pingCallback);
        e(uniteDevice, cmgVarC);
    }

    private boolean c(String str, String str2, PingCallback pingCallback) {
        if (str == null) {
            LogUtil.e(this.e, "ping srcPkgName is null");
            return false;
        }
        if (str2 == null) {
            LogUtil.e(this.e, "ping packageName is null");
            return false;
        }
        if (pingCallback != null) {
            return true;
        }
        LogUtil.e(this.e, "ping pingCallback is null");
        return false;
    }

    private void c(UniteDevice uniteDevice, String str, String str2, PingCallback pingCallback, int i) {
        if (uniteDevice != null && uniteDevice.getDeviceInfo().isUsing()) {
            a(uniteDevice, str, str2, pingCallback, i);
        } else {
            pingCallback.onPingResult(520003);
        }
    }

    @Override // com.huawei.unitedevice.p2p.EngineManagementInterface
    public void startTransferFile(FileInfo fileInfo, IResultAIDLCallback iResultAIDLCallback) {
        LogUtil.b(this.e, "enter transferCommonFile");
        if (fileInfo == null || iResultAIDLCallback == null || fileInfo.getIdentify() == null) {
            LogUtil.d(this.e, "startTransferFile Parameter is invalid");
        } else {
            e(fileInfo, iResultAIDLCallback);
        }
    }

    @Override // com.huawei.unitedevice.p2p.EngineManagementInterface
    public void stopTransferByQueue(CommonFileInfoParcel commonFileInfoParcel, ITransferFileCallback iTransferFileCallback) {
        if (commonFileInfoParcel == null) {
            return;
        }
        UniteDevice uniteDeviceE = xio.c().e(commonFileInfoParcel.getIdentify());
        if (uniteDeviceE != null && uniteDeviceE.getDeviceInfo().isUsing()) {
            LogUtil.b(this.e, "stopTransferFile.");
            xhj.c().d(uniteDeviceE, commonFileInfoParcel, iTransferFileCallback);
        } else {
            LogUtil.b(this.e, "stopTransferByQueue send p2p message fail,the device is null or not connected");
        }
    }

    private void e(FileInfo fileInfo, IResultAIDLCallback iResultAIDLCallback) {
        UniteDevice uniteDeviceE = xio.c().e(fileInfo.getIdentify());
        if (uniteDeviceE != null && uniteDeviceE.getDeviceInfo().isUsing()) {
            LogUtil.b(this.e, "startTransferFileMessage. fileInfo.RequestType()", fileInfo.getRequestType());
            xhj.c().e(uniteDeviceE, fileInfo, iResultAIDLCallback);
        } else {
            LogUtil.e(this.e, "startTransferFileMessage send p2p message fail,the device is null or not connected");
        }
    }

    static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static xip f53069b = new xip();
    }
}
