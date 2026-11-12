package defpackage;

import com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy;
import com.huawei.health.device.callback.DeviceGeneralSettingCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class dio extends JumpDeviceStrategy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f31814b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DeviceInfo f31815c = getJumpDeviceInfo();

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean onPretreatment() {
        if (!isConnected()) {
            showNotConnectedToast();
            return false;
        }
        if (this.f31815c != null) {
            return true;
        }
        showUnsupportedToast();
        return false;
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean checkSupportCapability(DeviceInfo deviceInfo) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (this.deviceGeneralSettingApi == null || deviceInfo == null) {
            return false;
        }
        this.deviceGeneralSettingApi.querySupportDetection(deviceInfo.getDeviceIdentify(), new DeviceGeneralSettingCallback() { // from class: dio.3
            @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
            public void onResult(boolean z) {
                dio.this.f31814b = z;
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("JumpWearSmartDetectStrategy", "checkSupportCapability InterruptedException");
        }
        return this.f31814b;
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpStrategy
    public void jump() {
        if (this.deviceGeneralSettingApi == null) {
            LogUtil.j("JumpWearSmartDetectStrategy", "DeviceGeneralSettingApi is null.");
        } else {
            this.deviceGeneralSettingApi.jumpWearSmartDetect(this.f31815c.getDeviceIdentify(), new DeviceGeneralSettingCallback() { // from class: dio.4
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public void onResult(boolean z) {
                    LogUtil.a("JumpWearSmartDetectStrategy", "jumpWearSmartDetect result:", Boolean.valueOf(z));
                }
            });
        }
    }
}
