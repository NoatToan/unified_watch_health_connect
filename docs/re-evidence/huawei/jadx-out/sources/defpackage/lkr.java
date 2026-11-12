package defpackage;

import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.manager.EngineLogicBaseManager;

/* JADX INFO: loaded from: classes10.dex */
public class lkr extends EngineLogicBaseManager {
    private static final Object d = new Object();
    private static volatile lkr e;

    private lkr() {
        super(BaseApplication.getContext());
    }

    public static lkr b() {
        LogUtil.a("HwSyncDeviceMgr", "HwSyncDeviceMgr getInstance.");
        if (e == null) {
            synchronized (d) {
                if (e == null) {
                    e = new lkr();
                }
            }
        }
        return e;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        LogUtil.j("HwSyncDeviceMgr", "onReceiveDeviceCommand code：", Integer.valueOf(i));
        if (i == 207 || i == 206) {
            return;
        }
        prd.a().receiveFromDevice(i, xiuVar);
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        if (lku.c(155)) {
            return WearEngineModule.MEDAL_WORKOUT_MODULE;
        }
        return WearEngineModule.MEDAL_MODULE;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        LogUtil.a("HwSyncDeviceMgr", "getWearPkgName: ", "com.huawei.sport.workout");
        return "com.huawei.sport.workout";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        LogUtil.a("HwSyncDeviceMgr", "getWearFingerprint: ", "com.huawei.sport.workout_BO2t/bvVsvJi32wxoQnpxZwLsOp31g7NVRM5bgxjEyD+7UzFWoNcyB8VkMgg0fABbknE4tU+Y34vfAzpSD8TJ5g=");
        return "com.huawei.sport.workout_BO2t/bvVsvJi32wxoQnpxZwLsOp31g7NVRM5bgxjEyD+7UzFWoNcyB8VkMgg0fABbknE4tU+Y34vfAzpSD8TJ5g=";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
        if (connectState == ConnectState.CONNECTED) {
            prd.a().a(0);
        }
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
