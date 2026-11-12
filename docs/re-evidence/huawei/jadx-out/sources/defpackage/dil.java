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
public class dil extends JumpDeviceStrategy {
    private boolean e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DeviceInfo f31812c = getJumpDeviceInfo();

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean onPretreatment() {
        if (!isConnected()) {
            showNotConnectedToast();
            return false;
        }
        if (this.f31812c != null) {
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
        this.featureSupportApi.isSupportWeatherItem(deviceInfo, new FeatureSupportCallback() { // from class: dim
            @Override // com.huawei.devicefeature.FeatureSupportCallback
            public final void success(boolean z) {
                this.e.a(countDownLatch, z);
            }
        });
        try {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("JumpWeatherStrategy", "checkSupportCapability InterruptedException");
        }
        return this.e;
    }

    /* synthetic */ void a(CountDownLatch countDownLatch, boolean z) {
        this.e = z;
        countDownLatch.countDown();
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpStrategy
    public void jump() {
        rpq.c(FeatureType.WEATHER).jumpToFeaturePage(this.f31812c, new SimpleChain.Emitter() { // from class: dik
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("JumpWeatherStrategy", "jumpToWeatherPage onSuccess");
            }
        });
    }
}
