package defpackage;

import android.app.Activity;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;
import com.huawei.ui.homehealth.util.FeedBackLogHelper;

/* JADX INFO: loaded from: classes17.dex */
public class rqx extends FeatureBaseStrategy {
    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        return true;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy, com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(final DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            emitter.onError("activity  is null");
            return true;
        }
        activityJ.runOnUiThread(new Runnable() { // from class: rra
            @Override // java.lang.Runnable
            public final void run() {
                rqx.d(deviceInfo);
            }
        });
        return true;
    }

    static /* synthetic */ void d(DeviceInfo deviceInfo) {
        FeedBackLogHelper feedBackLogHelper = new FeedBackLogHelper();
        feedBackLogHelper.b(deviceInfo);
        feedBackLogHelper.j();
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
        rdt.d("beta_feedback");
    }
}
