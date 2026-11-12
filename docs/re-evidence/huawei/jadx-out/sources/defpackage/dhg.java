package defpackage;

import com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.featureaction.FeatureType;

/* JADX INFO: loaded from: classes7.dex */
public class dhg extends JumpDeviceStrategy {
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
        return this.featureSupportApi.isSupportEsim(deviceInfo);
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpStrategy
    public void jump() {
        rpq.c(FeatureType.E_SIM).jumpToFeaturePage(this.d, new SimpleChain.Emitter() { // from class: dhh
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("JumpESimStrategy", "jumpToESimPage onSuccess");
            }
        });
    }
}
