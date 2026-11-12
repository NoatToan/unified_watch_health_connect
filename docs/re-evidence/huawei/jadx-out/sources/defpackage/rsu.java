package defpackage;

import android.app.Activity;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;

/* JADX INFO: loaded from: classes17.dex */
public class rsu extends FeatureBaseStrategy {
    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        return false;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy, com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        LogUtil.a("StadiumMapStrategy", "enter  SleepBreathe");
        final Activity activityJ = BaseApplication.j();
        if (activityJ != null) {
            activityJ.runOnUiThread(new Runnable() { // from class: rsy
                @Override // java.lang.Runnable
                public final void run() {
                    kjy.b().startOsaH5(activityJ, "Device_0001");
                }
            });
        } else {
            LogUtil.a("StadiumMapStrategy", "activity is null ");
        }
        return true;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
        rdt.d("sleep_apnea");
    }
}
