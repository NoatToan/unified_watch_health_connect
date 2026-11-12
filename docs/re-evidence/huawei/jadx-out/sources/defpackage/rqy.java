package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class rqy extends FeatureBaseStrategy {
    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        return false;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy, com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        if (this.mDeviceInfo == null) {
            LogUtil.j("EsimStrategy", "jumpPageToFace deviceInfo == null");
            return false;
        }
        DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(BaseApplication.getContext()).e(this.mDeviceInfo.getDeviceIdentify());
        if (deviceCapabilityE != null && deviceCapabilityE.isSupportNewEsim()) {
            boolean zD = eey.d(this.mDeviceInfo, 148);
            LogUtil.a("EsimStrategy", "openEsimCard isSupportStandaloneNum = ", Boolean.valueOf(zD));
            if (zD) {
                startActivity("com.huawei.sim.esim.view.EsimCardStatusGetActivity", null);
            } else {
                startActivity("com.huawei.sim.esim.view.EsimManagerActivity", null);
            }
        } else {
            startActivity("com.huawei.sim.esim.view.WirelessManagerActivity", null);
        }
        return true;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HOME_1010021.value(), new HashMap(16), 0);
    }
}
