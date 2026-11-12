package defpackage;

import com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.featureaction.FeatureType;

/* JADX INFO: loaded from: classes7.dex */
public class did extends JumpDeviceStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeviceInfo f31806a = getJumpDeviceInfo();

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean onPretreatment() {
        if (!isConnected()) {
            showNotConnectedToast();
            return false;
        }
        if (this.f31806a != null) {
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
        return this.featureSupportApi.isSupportSleepBreathe(deviceInfo);
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpStrategy
    public void jump() {
        rpq.c(FeatureType.SLEEP_BREATHE).jumpToFeaturePage(this.f31806a, new SimpleChain.Emitter() { // from class: dia
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("JumpSleepBreatheStrategy", "jumpToSleepBreathePage onSuccess");
            }
        });
    }
}
