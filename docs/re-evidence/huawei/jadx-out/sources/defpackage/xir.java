package defpackage;

import android.content.Context;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.manager.EngineLogicBaseManager;
import health.compact.a.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes20.dex */
public class xir extends EngineLogicBaseManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f53072b = new Object();
    protected static final Object d = new Object();
    private static volatile xir e;

    private xir(Context context) {
        super(context);
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        LogUtil.a("HiWearEngineHttpProxyManager", "HiWearEngineHttpProxyManager onReceiveDeviceCommand");
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.HTTPPROXY_MODULE;
    }

    public static xir b() {
        xir xirVar;
        synchronized (f53072b) {
            LogUtil.a("HiWearEngineHttpProxyManager", "getInstance()");
            if (e == null) {
                e = new xir(BaseApplication.getContext());
            }
            xirVar = e;
        }
        return xirVar;
    }

    private static String c() {
        try {
            File filesDir = BaseApplication.getContext().getFilesDir();
            if (filesDir != null) {
                return filesDir.getCanonicalPath();
            }
            return "";
        } catch (IOException unused) {
            LogUtil.e("HiWearEngineHttpProxyManager", "getSourcePath catch IOException");
            return "";
        }
    }

    public void c(final String str) {
        LogUtil.a("HiWearEngineHttpProxyManager", "sendCloudResponseFileToDevice");
        final String str2 = c() + File.separator + "7" + File.separator + str;
        xiu.c cVar = new xiu.c();
        cVar.a(new File(str2));
        sendComand(cVar.c(), new SendCallback() { // from class: xir.3
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                ReleaseLogUtil.c("R_HiWearEngineHttpProxyManager", "send HttpProxy response FileToDevice errorCode: ", Integer.valueOf(i));
                File file = new File(str2);
                if (file.exists()) {
                    if (!file.delete()) {
                        LogUtil.j("HiWearEngineHttpProxyManager", "Failed to delete httpProxy cloud response file: ", str);
                    }
                    LogUtil.a("HiWearEngineHttpProxyManager", "Successfully delete httpProxy cloud response file: ", str);
                }
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.a("HiWearEngineHttpProxyManager", "sendCloudResponseFileToDevice progress: ", Long.valueOf(j));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str3) {
                LogUtil.a("HiWearEngineHttpProxyManager", "Current HttpProxy response file transferWay: ", str3);
            }
        });
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return "hw.wearable.httpProxy";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        return OfflineMapWearEngineManager.WEAR_FINGERPRINT;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
        LogUtil.j("HiWearEngineHttpProxyManager", "onDeviceConnectionChange");
    }
}
