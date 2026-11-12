package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;

/* JADX INFO: loaded from: classes17.dex */
public class rpx extends FeatureBaseStrategy {
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
        String strE = etn.e("isWatch", "");
        String strE2 = etn.e("type", "");
        String strE3 = etn.e("value", "");
        LogUtil.a("BenefitStrategy", "jumpToFeaturePage isWatch:", strE, " type:", strE2, " value:", strE3);
        rtk.d(BaseApplication.getActivity(), Integer.parseInt(strE2), strE3);
        if (Boolean.TRUE.equals(Boolean.valueOf(strE))) {
            roj.b(1);
        }
        return true;
    }
}
