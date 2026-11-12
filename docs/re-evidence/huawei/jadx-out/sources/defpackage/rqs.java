package defpackage;

import android.app.Activity;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;

/* JADX INFO: loaded from: classes17.dex */
public class rqs extends FeatureBaseStrategy {
    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        return false;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithOtaTransfering() {
        return true;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy, com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        Activity activityJ = BaseApplication.j();
        if (activityJ != null) {
            activityJ.runOnUiThread(new Runnable() { // from class: rqu
                @Override // java.lang.Runnable
                public final void run() {
                    rqs.c();
                }
            });
        } else {
            LogUtil.a("心电图", "activity is null ");
        }
        return true;
    }

    static /* synthetic */ void c() {
        LogUtil.a("心电图", "enter  ECGAnalysis");
        qrg.a(false);
        prf.d(BaseApplication.b(), "com.huawei.health.h5.ecgce", 3, (String) null);
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
        rdt.d("electrocardiogram");
    }
}
