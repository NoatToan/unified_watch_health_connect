package defpackage;

import com.huawei.devicefeature.FeatureSupportCallback;
import com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.featureaction.FeatureType;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class dgw extends JumpDeviceStrategy {
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
        if (this.featureSupportApi == null || deviceInfo == null) {
            return false;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.featureSupportApi.isSupportHealthCalendarSync(deviceInfo, new FeatureSupportCallback() { // from class: dgx
            @Override // com.huawei.devicefeature.FeatureSupportCallback
            public final void success(boolean z) {
                this.f31785b.b(countDownLatch, z);
            }
        });
        try {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("JumpCalendarStrategy", "checkSupportCapability InterruptedException");
        }
        return this.d;
    }

    /* synthetic */ void b(CountDownLatch countDownLatch, boolean z) {
        this.d = z;
        countDownLatch.countDown();
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpStrategy
    public void jump() {
        rpq.c(FeatureType.CALENDAR).jumpToFeaturePage(this.e, new SimpleChain.Emitter() { // from class: dha
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("JumpCalendarStrategy", "jumpToCalendarPage onSuccess");
            }
        });
    }
}
