package defpackage;

import android.app.Activity;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.motiontrack.model.runningroute.HotPathCityInfo;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.hms.hihealth.HiHealthActivities;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;

/* JADX INFO: loaded from: classes17.dex */
public class rsl extends FeatureBaseStrategy {
    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        return false;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy, com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        final Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            LogUtil.a("OutdoorAdventureStrategy", "jumpToFeaturePage activity is null ");
            return false;
        }
        activityJ.runOnUiThread(new Runnable() { // from class: rso
            @Override // java.lang.Runnable
            public final void run() {
                rsl.d(activityJ);
            }
        });
        return true;
    }

    static /* synthetic */ void d(Activity activity) {
        LogUtil.a("OutdoorAdventureStrategy", "enter OutDoorAdventure");
        RunningRouteUtils.b(activity, 222, (HotPathCityInfo) null);
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
        rdt.d(HiHealthActivities.OUTDOOR_ADVENTURE);
    }
}
