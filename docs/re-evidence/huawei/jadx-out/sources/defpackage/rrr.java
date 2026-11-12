package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class rrr extends FeatureBaseStrategy {
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
            LogUtil.j("HighlandBloodOxygenStrategy", "jumpPageToFace deviceInfo == null");
            return false;
        }
        if (BaseApplication.j() == null) {
            LogUtil.e("HighlandBloodOxygenStrategy", "startActivity fail for activity is null");
        } else {
            HashMap<String, String> map = new HashMap<>();
            map.put("device_id", this.mDeviceInfo.getDeviceIdentify());
            startActivity("com.huawei.ui.device.activity.bloodoxygen.HighLandBloodOxygenSettingActivity", map);
        }
        return true;
    }
}
