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
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public class mar extends EngineLogicBaseManager {
    public static mar e() {
        return e.f41288a;
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final mar f41288a = new mar(BaseApplication.getContext());
    }

    protected mar(Context context) {
        super(context);
    }

    public void c(String str, SendCallback sendCallback) {
        LogUtil.a("HwNotifyPictureEngineManager", "sendNotifyImageToDevice enter");
        xiu.c cVar = new xiu.c();
        File file = new File(str);
        if (!file.exists()) {
            LogUtil.a("HwNotifyPictureEngineManager", "assembleFile not exists");
        } else {
            cVar.a(file);
            sendComand(cVar.c(), sendCallback);
        }
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        LogUtil.a("HwNotifyPictureEngineManager", "HwNotifyPictureEngineManager onReceiveDeviceCommand");
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.NOTIFYPICTURE_MODULE;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return "hw.watch.notify.picture";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        return OfflineMapWearEngineManager.WEAR_FINGERPRINT;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
        LogUtil.j("HwNotifyPictureEngineManager", "onDeviceConnectionChange");
    }
}
