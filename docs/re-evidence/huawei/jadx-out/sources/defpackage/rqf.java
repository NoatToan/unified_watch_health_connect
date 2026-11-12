package defpackage;

import android.app.Activity;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes17.dex */
public class rqf extends FeatureBaseStrategy {
    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        return false;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy, com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        d(this.mDeviceInfo, emitter);
        return true;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
        rdt.d("lingxi_assistant");
    }

    public void d(DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        ReleaseLogUtil.d("R_CcmcAIStrategy", "startH5Page enter");
        if (deviceInfo == null) {
            ReleaseLogUtil.e("R_CcmcAIStrategy", "startH5Page device not connected");
            emitter.onError("startH5Page device not connected");
            return;
        }
        Activity activity = BaseApplication.getActivity();
        if (activity == null) {
            emitter.onError("startH5Page activity is  null");
        } else {
            lwa.b(activity);
            emitter.onSuccess(new Object[0]);
        }
    }
}
