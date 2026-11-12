package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.unitedevice.api.EngineChannelInterface;
import com.huawei.unitedevice.callback.IResultAIDLCallback;
import com.huawei.unitedevice.callback.ITransferFileCallback;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.unitedevice.hwcommonfilemgr.entity.RequestFileInfo;
import com.huawei.unitedevice.p2p.P2pReceiver;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes20.dex */
public class xgu implements EngineChannelInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xgv f52905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f52906c;

    private xgu() {
        this.f52906c = "EngineLogicService";
        this.f52905b = xgv.b();
    }

    public static xgu c() {
        return e.e;
    }

    @Override // com.huawei.unitedevice.api.EngineChannelInterface
    public void registerReceiver(Context context, xgz xgzVar, P2pReceiver p2pReceiver, SendCallback sendCallback) {
        if (xgzVar == null || !c(context, p2pReceiver)) {
            LogUtil.d(this.f52906c, "registerReceiver Parameter is invalid");
            if (sendCallback != null) {
                sendCallback.onSendResult(500001);
                return;
            }
            return;
        }
        this.f52905b.registerReceiver(context, xgzVar, p2pReceiver, sendCallback);
    }

    private boolean c(Context context, P2pReceiver p2pReceiver) {
        if (context == null) {
            LogUtil.d(this.f52906c, "context is null");
            return false;
        }
        if (p2pReceiver != null) {
            return true;
        }
        LogUtil.d(this.f52906c, "receiver is null");
        return false;
    }

    @Override // com.huawei.unitedevice.api.EngineChannelInterface
    public void unregisterReceiver(Context context, P2pReceiver p2pReceiver, xgz xgzVar) {
        if (xgzVar == null || !c(context, p2pReceiver)) {
            LogUtil.d(this.f52906c, "unregisterReceiver Parameter is invalid");
        } else {
            LogUtil.b(this.f52906c, "unregisterReceiver unregister to UDS.");
            this.f52905b.unregisterReceiver(context, p2pReceiver, xgzVar);
        }
    }

    @Override // com.huawei.unitedevice.api.EngineChannelInterface
    public void p2pSendForWearEngine(Context context, UniteDevice uniteDevice, xgz xgzVar, SendCallback sendCallback) {
        if (!d(context, xgzVar)) {
            if (sendCallback != null) {
                sendCallback.onSendResult(500001);
            }
            lng.c("P2PMessage", "P2PMessage p2pSendForWearEngine context/message/WearPkgName/WearFingerprint is null");
            LogUtil.d(this.f52906c, "Parameter is invalid");
            return;
        }
        this.f52905b.p2pSendForWearEngine(context, uniteDevice, xgzVar, sendCallback);
    }

    private boolean d(Context context, xgz xgzVar) {
        if (context == null) {
            LogUtil.d(this.f52906c, "context is null");
            return false;
        }
        if (xgzVar == null) {
            LogUtil.d(this.f52906c, "message is null");
            return false;
        }
        if (TextUtils.isEmpty(xgzVar.o())) {
            LogUtil.d(this.f52906c, "message WearPkgName is empty");
            return false;
        }
        if (!TextUtils.isEmpty(xgzVar.i())) {
            return true;
        }
        LogUtil.d(this.f52906c, "message WearFingerprint is empty");
        return false;
    }

    @Override // com.huawei.unitedevice.api.EngineChannelInterface
    public void startTransferFileToWear(xhr xhrVar, IResultAIDLCallback iResultAIDLCallback) {
        if (xhrVar == null) {
            LogUtil.d(this.f52906c, "fileInfo is invalid");
        } else {
            this.f52905b.startTransferFileToWear(xhrVar, iResultAIDLCallback);
        }
    }

    @Override // com.huawei.unitedevice.api.EngineChannelInterface
    public void pingSendForWearEngine(Context context, UniteDevice uniteDevice, String str, PingCallback pingCallback, int i) {
        if (!b(context, str)) {
            pingCallback.onPingResult(500001);
            LogUtil.d(this.f52906c, "Parameter is invalid");
        } else {
            this.f52905b.pingSendForWearEngine(context, uniteDevice, str, pingCallback, i);
        }
    }

    @Override // com.huawei.unitedevice.api.EngineChannelInterface
    public void startReceiveFileFromWear(RequestFileInfo requestFileInfo, ITransferFileCallback iTransferFileCallback) {
        if (requestFileInfo == null) {
            LogUtil.d(this.f52906c, "startRequestFile RequestFileInfo is null");
        } else if (iTransferFileCallback == null) {
            LogUtil.d(this.f52906c, "startRequestFile ITransferFileCallback is null");
        } else {
            this.f52905b.startReceiveFileFromWear(requestFileInfo, iTransferFileCallback);
        }
    }

    @Override // com.huawei.unitedevice.api.EngineChannelInterface
    public void stopReceiveFileFromWear(RequestFileInfo requestFileInfo, ITransferFileCallback iTransferFileCallback) {
        if (requestFileInfo == null) {
            LogUtil.d(this.f52906c, "stopRequestFile RequestFileInfo is null");
        } else if (iTransferFileCallback == null) {
            LogUtil.d(this.f52906c, "stopRequestFile IBaseCallback is null");
        } else {
            this.f52905b.stopReceiveFileFromWear(requestFileInfo, iTransferFileCallback);
        }
    }

    @Override // com.huawei.unitedevice.api.EngineChannelInterface
    public void stopTransferFileToWear(xhr xhrVar, ITransferFileCallback iTransferFileCallback) {
        if (xhrVar == null || iTransferFileCallback == null) {
            LogUtil.d(this.f52906c, "stopTransferByQueue param invalid");
        } else {
            this.f52905b.stopTransferFileToWear(xhrVar, iTransferFileCallback);
        }
    }

    private boolean b(Context context, String str) {
        if (context == null) {
            LogUtil.d(this.f52906c, "ping context is null");
            return false;
        }
        if (str != null) {
            return true;
        }
        LogUtil.d(this.f52906c, "ping packageName is null");
        return false;
    }

    static class e {
        private static xgu e = new xgu();
    }
}
