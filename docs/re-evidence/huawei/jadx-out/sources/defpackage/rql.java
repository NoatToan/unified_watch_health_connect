package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class rql extends FeatureBaseStrategy {
    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        return false;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy, com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        if (this.mDeviceInfo == null) {
            LogUtil.j("ContinueHeartRateStrategy", "jumpPageToFace deviceInfo == null");
            return false;
        }
        DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(BaseApplication.getContext()).e(this.mDeviceInfo.getDeviceIdentify());
        if (!deviceCapabilityE.isSupportContinueHeartRate() && !deviceCapabilityE.isSupportHeartRateEnable()) {
            return true;
        }
        c();
        if (deviceCapabilityE.isSupportContinueHeartRate()) {
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SETTING_1090022.value(), new HashMap(16), 0);
        }
        return true;
    }

    private void c() {
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        ddv ddvVarB = ddv.b();
        builder.addPath("#/healthCheck/continuousHeartRate?isHeartRate=true");
        ddvVarB.loadH5ProApp(BaseApplication.getContext(), "com.huawei.health.h5.dm-ccbk", builder);
    }
}
