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
public class xim extends EngineLogicBaseManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f53058a = new Object();
    protected static final Object d = new Object();
    private static volatile xim e;

    private xim(Context context) {
        super(context);
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        LogUtil.a("HiWearEngineHttpForAPProxyManager", "HiWearEngineHttpProxyManager onReceiveDeviceCommand");
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.HTTPPROXY_MODULE;
    }

    public static xim a() {
        xim ximVar;
        synchronized (f53058a) {
            LogUtil.a("HiWearEngineHttpForAPProxyManager", "getInstance()");
            if (e == null) {
                e = new xim(BaseApplication.getContext());
            }
            ximVar = e;
        }
        return ximVar;
    }

    private static String b() {
        try {
            File filesDir = BaseApplication.getContext().getFilesDir();
            if (filesDir != null) {
                return filesDir.getCanonicalPath();
            }
            return "";
        } catch (IOException unused) {
            LogUtil.e("HiWearEngineHttpForAPProxyManager", "getSourcePath catch IOException");
            return "";
        }
    }

    public void d(final String str) {
        LogUtil.a("HiWearEngineHttpForAPProxyManager", "sendCloudResponseFileToDevice");
        final String str2 = b() + File.separator + "7" + File.separator + str;
        xiu.c cVar = new xiu.c();
        cVar.a(new File(str2));
        sendComand(cVar.c(), new SendCallback() { // from class: xim.2
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                ReleaseLogUtil.c("R_HiWearEngineHttpForAPProxyManager", "send HttpProxy response FileToDevice errorCode: ", Integer.valueOf(i));
                File file = new File(str2);
                if (file.exists()) {
                    if (!file.delete()) {
                        LogUtil.j("HiWearEngineHttpForAPProxyManager", "Failed to delete httpProxy cloud response file: ", str);
                    }
                    LogUtil.a("HiWearEngineHttpForAPProxyManager", "Successfully delete httpProxy cloud response file: ", str);
                }
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.a("HiWearEngineHttpForAPProxyManager", "sendCloudResponseFileToDevice progress: ", Long.valueOf(j));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str3) {
                LogUtil.a("HiWearEngineHttpForAPProxyManager", "Current HttpProxy response file transferWay: ", str3);
            }
        });
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return "hw.wearable.httpProxyAp";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        return OfflineMapWearEngineManager.WEAR_FINGERPRINT;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
        LogUtil.j("HiWearEngineHttpForAPProxyManager", "onDeviceConnectionChange");
    }
}
