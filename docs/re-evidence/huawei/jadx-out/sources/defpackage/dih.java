package defpackage;

import com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy;
import com.huawei.health.device.callback.DeviceGeneralSettingCallback;
import com.huawei.health.device.callback.JumpToPageCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class dih extends JumpDeviceStrategy {
    private boolean d = false;
    private final DeviceInfo e = getJumpDeviceInfo();

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean onPretreatment() {
        if (!isConnected()) {
            showNotConnectedToast();
            return false;
        }
        if (this.e != null) {
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
        this.deviceGeneralSettingApi.querySupportOtaUpdate(deviceInfo.getDeviceIdentify(), new DeviceGeneralSettingCallback() { // from class: dih.3
            @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
            public void onResult(boolean z) {
                dih.this.d = z;
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("JumpVersionUpdateStrategy", "checkSupportCapability InterruptedException");
        }
        return this.d;
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpStrategy
    public void jump() {
        tqp.c(this.e.getDeviceIdentify(), new JumpToPageCallback() { // from class: dih.4
            @Override // com.huawei.health.device.callback.JumpToPageCallback
            public void onSuccess() {
                LogUtil.a("JumpVersionUpdateStrategy", "jump success");
            }

            @Override // com.huawei.health.device.callback.JumpToPageCallback
            public void onFail(String str) {
                LogUtil.a("JumpVersionUpdateStrategy", "jump fail");
            }
        });
    }
}
