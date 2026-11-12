package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;
import com.huawei.watchface.WatchFaceApi;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes17.dex */
public class rsa extends FeatureBaseStrategy {
    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        return true;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy, com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        ReleaseLogUtil.d("MyWatchFaceStrategy", "openMyWatchFace");
        WatchFaceApi watchFaceApi = (WatchFaceApi) Services.d("WatchFaceApiManager", WatchFaceApi.class);
        if (watchFaceApi != null) {
            watchFaceApi.openMyWatchFace(new IBaseResponseCallback() { // from class: rsd
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    rsa.c(i, obj);
                }
            });
        }
        return true;
    }

    static /* synthetic */ void c(int i, Object obj) {
        if (i == 0 && (obj instanceof H5ProLaunchOption.Builder)) {
            H5ProClient.startH5MiniProgram(BaseApplication.getContext(), "com.huawei.health.h5.watchface", ((H5ProLaunchOption.Builder) obj).build());
            mgu.a("e2");
        }
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
        rdt.d("my_face");
    }
}
