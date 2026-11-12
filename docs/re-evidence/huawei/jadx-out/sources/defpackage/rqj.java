package defpackage;

import android.net.Uri;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;

/* JADX INFO: loaded from: classes17.dex */
public class rqj extends FeatureBaseStrategy {
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
            LogUtil.j("CycleCalendarStrategy", "jumpPageToFace deviceInfo == null");
            return false;
        }
        AppRouter.e(Uri.parse("huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.cycle-calendar?h5pro=true&path=Settings&from=deviceTab&type=dual")).i();
        return true;
    }
}
