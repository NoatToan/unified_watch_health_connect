package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes17.dex */
public class rtn extends FeatureBaseStrategy {
    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        return true;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithOtaTransfering() {
        return true;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy, com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, SimpleChain.Emitter emitter) throws Throwable {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        String strD = dmp.d(deviceIdentify);
        LogUtil.a("WeightMeasureStrategy", "jumpPageToWeightMeasure code:", CommonUtil.n(deviceIdentify), " productId:", strD);
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        intent.setAction("SWITCH_PLUGINDEVICE");
        bundle.putString("productId", strD);
        bundle.putString("uniqueId", deviceIdentify);
        bundle.putString("view", "SpecifiedMeasureDevice");
        intent.setPackage(roq.f47547c);
        intent.setClassName(roq.f47547c, "com.huawei.health.device.ui.DeviceMainActivity");
        intent.putExtras(bundle);
        iov.d(BaseApplication.getActivity(), intent);
        return true;
    }
}
