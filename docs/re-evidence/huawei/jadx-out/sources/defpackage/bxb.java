package defpackage;

import android.text.TextUtils;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.manager.EngineLogicBaseManager;

/* JADX INFO: loaded from: classes23.dex */
public class bxb extends EngineLogicBaseManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile bxb f1268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f1269b;
    private static final Object e = new Object();

    private bxb() {
        super(BaseApplication.getContext());
        registerNotificationAction();
        LogUtil.a("HL_DeviceManager", "DeviceManager");
    }

    public static bxb a() {
        if (f1268a == null) {
            synchronized (e) {
                if (f1268a == null) {
                    f1268a = new bxb();
                }
            }
        }
        return f1268a;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        if (i == 207 || i == 206) {
            return;
        }
        bxp.b().e(i, xiuVar);
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.HEALTH_MODEL_MODULE;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return "com.huawei.health.healthyliving";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        return "com.huawei.health.healthyliving_BBLV5gbaG5WYtIAUCOwrnqycG0TTHvDSFCf1skDcwpWT+tu2wJ2tOwPYFzjV+ZsiVJrV1nO/KsbJ687t7b9a6Jg=";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void sendComand(xiu xiuVar, SendCallback sendCallback) {
        super.sendComand(xiuVar, sendCallback);
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void pingComand(PingCallback pingCallback, String str) {
        super.pingComand(pingCallback, str);
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
        LogUtil.a("HL_DeviceManager", "onDeviceConnectionChange device ", deviceInfo, " state ", connectState);
        if (deviceInfo == null) {
            return;
        }
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        LogUtil.a("HL_DeviceManager", "onDeviceConnectionChange connectState ", Integer.valueOf(deviceConnectState));
        if (deviceConnectState != 2) {
            if (deviceConnectState == 3) {
                ccy.a("connect_device_identify", deviceInfo.getDeviceIdentify());
                return;
            }
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f1269b < 10000) {
            return;
        }
        f1269b = jCurrentTimeMillis;
        bxp.b().b(0);
        b(deviceInfo);
        bxp.b().n();
        bxp.b().o();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0017  */
    private void b(DeviceInfo deviceInfo) {
        boolean zEquals;
        if (deviceInfo != null) {
            String deviceIdentify = deviceInfo.getDeviceIdentify();
            if (TextUtils.isEmpty(deviceIdentify)) {
                zEquals = false;
            } else {
                zEquals = deviceIdentify.equals(ccy.i("connect_device_identify"));
            }
        } else {
            zEquals = false;
        }
        LogUtil.a("HL_DeviceManager", "removeDeviceMsgVersion isSameDevice ", Boolean.valueOf(zEquals));
        if (zEquals) {
            return;
        }
        ccy.c("health_model_device_link_version", "");
        ccy.c("health_model_device_link_package_size", "");
    }

    public void a(String str) {
        LogUtil.a("HL_DeviceManager", "unregister source ", str);
        bxp.b().b(false);
        bxp.b().b(0);
        onDestroy();
        f1268a = null;
    }
}
