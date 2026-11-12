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
public class dit extends JumpDeviceStrategy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f31823b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeviceInfo f31822a = getJumpDeviceInfo();

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean onPretreatment() {
        if (!isConnected()) {
            showNotConnectedToast();
            return false;
        }
        if (this.f31822a != null) {
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
        this.featureSupportApi.isSupportWechatBind(deviceInfo, new FeatureSupportCallback() { // from class: diq
            @Override // com.huawei.devicefeature.FeatureSupportCallback
            public final void success(boolean z) {
                this.f31820a.c(countDownLatch, z);
            }
        });
        try {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("JumpWechatDeviceStrategy", "checkSupportCapability InterruptedException");
        }
        return this.f31823b;
    }

    /* synthetic */ void c(CountDownLatch countDownLatch, boolean z) {
        this.f31823b = z;
        countDownLatch.countDown();
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpStrategy
    public void jump() {
        rpq.c(FeatureType.WECHAT_DEVICE).jumpToFeaturePage(this.f31822a, new SimpleChain.Emitter() { // from class: dir
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("JumpWechatDeviceStrategy", "jumpToWechatDevicePage onSuccess");
            }
        });
    }
}
