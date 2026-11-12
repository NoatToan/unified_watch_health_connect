package defpackage;

import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.manager.EngineLogicBaseManager;

/* JADX INFO: loaded from: classes42.dex */
public class pfv extends EngineLogicBaseManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile pfv f45299b;
    private static final Object e = new Object();

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
    }

    private pfv() {
        super(BaseApplication.getContext());
    }

    public static pfv e() {
        if (f45299b == null) {
            synchronized (e) {
                if (f45299b == null) {
                    f45299b = new pfv();
                }
            }
        }
        return f45299b;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        pfu.b().receiveDataFromDevice(i, xiuVar);
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.HEALTH_ZONE_MODULE;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return "com.huawei.watch.family";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        return "11CC31B7123B2AA2E6AEBB54BD4789104F0979F598BC63F3C0EE68698F442869";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void sendComand(xiu xiuVar, SendCallback sendCallback) {
        super.sendComand(xiuVar, sendCallback);
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void pingComand(PingCallback pingCallback, String str) {
        super.pingComand(pingCallback, str);
    }
}
