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
public class dgv extends JumpDeviceStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f31784a = false;
    private final DeviceInfo d = getJumpDeviceInfo();

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean onPretreatment() {
        if (!isConnected()) {
            showNotConnectedToast();
            return false;
        }
        if (this.d != null) {
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
        this.featureSupportApi.isSupportAPPMarket(deviceInfo, new FeatureSupportCallback() { // from class: dgs
            @Override // com.huawei.devicefeature.FeatureSupportCallback
            public final void success(boolean z) {
                this.f31782b.d(countDownLatch, z);
            }
        });
        try {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("JumpAppMarketStrategy", "checkSupportCapability InterruptedException");
        }
        return this.f31784a;
    }

    /* synthetic */ void d(CountDownLatch countDownLatch, boolean z) {
        this.f31784a = z;
        countDownLatch.countDown();
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpStrategy
    public void jump() {
        rpq.c(FeatureType.APP_MARKET).jumpToFeaturePage(this.d, new SimpleChain.Emitter() { // from class: dgu
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("JumpAppMarketStrategy", "jumpToAppMarketPage onSuccess");
            }
        });
    }
}
