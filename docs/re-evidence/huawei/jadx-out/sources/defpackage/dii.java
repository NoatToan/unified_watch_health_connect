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
public class dii extends JumpDeviceStrategy {
    private boolean d = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DeviceInfo f31811c = getJumpDeviceInfo();

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean onPretreatment() {
        if (!isConnected()) {
            showNotConnectedToast();
            return false;
        }
        if (this.f31811c != null) {
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
        this.featureSupportApi.isSupportWallet(deviceInfo, new FeatureSupportCallback() { // from class: dif
            @Override // com.huawei.devicefeature.FeatureSupportCallback
            public final void success(boolean z) {
                this.f31807a.c(countDownLatch, z);
            }
        });
        try {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("JumpWalletStrategy", "checkSupportCapability InterruptedException");
        }
        return this.d;
    }

    /* synthetic */ void c(CountDownLatch countDownLatch, boolean z) {
        this.d = z;
        countDownLatch.countDown();
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpStrategy
    public void jump() {
        rpq.c(FeatureType.WALLET).jumpToFeaturePage(this.f31811c, new SimpleChain.Emitter() { // from class: dij
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("JumpWalletStrategy", "jumpToWalletPage onSuccess");
            }
        });
    }
}
