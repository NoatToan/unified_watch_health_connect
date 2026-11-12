package defpackage;

import android.app.Activity;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes17.dex */
public class rqz extends FeatureBaseStrategy {
    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        return false;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy, com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        String strE = tqp.e(BaseApplication.b(), deviceInfo.getDeviceIdentify(), "exclusiveGuardStatus");
        ReleaseLogUtil.d("DEVMGR_ExclusiveGuardStrategy", "status：", strE);
        if ("1".equals(strE)) {
            e();
        } else if ("2".equals(strE) || "3".equals(strE)) {
            b("#/ExclusiveGuardService?from=3");
        } else {
            LogUtil.j("ExclusiveGuardStrategy", "status error");
        }
        return true;
    }

    private static void e() {
        Activity activityJ = BaseApplication.j();
        if (activityJ != null) {
            irz.b(activityJ, 5, 2);
        } else {
            LogUtil.e("ExclusiveGuardStrategy", "topActivity is  null");
        }
    }

    private void b(String str) {
        Activity activityJ = BaseApplication.j();
        if (activityJ != null) {
            H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
            builder.addPath(str);
            ddv.b().loadH5ProApp(activityJ, "com.huawei.health.h5.vip", builder);
            return;
        }
        LogUtil.e("ExclusiveGuardStrategy", "activity is  null");
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
        rdt.d("guardian_service");
    }
}
