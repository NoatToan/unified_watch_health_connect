package defpackage;

import android.net.Uri;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;
import com.huawei.ui.main.stories.health.util.BloodPressureUtil;

/* JADX INFO: loaded from: classes17.dex */
public class rqd extends FeatureBaseStrategy {
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
        BloodPressureUtil.c(new BaseResponseCallback<String>() { // from class: rqd.3
            @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onResponse(int i, String str) {
                if (i == -1) {
                    LogUtil.j("BloodPressureSettingStrategy", "updOldBloodPressurePlan error ", str);
                }
                AppRouter.e(Uri.parse("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.health-data-subpage?h5pro=true&path=bloodPressureSettingNew")).e(268435456).b(BaseApplication.getContext());
            }
        });
        return true;
    }
}
