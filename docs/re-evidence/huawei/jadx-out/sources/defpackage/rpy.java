package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;

/* JADX INFO: loaded from: classes17.dex */
public class rpy extends FeatureBaseStrategy {
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
        if (activityJ != null) {
            activityJ.runOnUiThread(new Runnable() { // from class: rqb
                @Override // java.lang.Runnable
                public final void run() {
                    rpy.a(activityJ);
                }
            });
        } else {
            LogUtil.a("ArrhythmiaStrategy", "activity is null ");
        }
        return true;
    }

    static /* synthetic */ void a(final Activity activity) {
        LogUtil.a("ArrhythmiaStrategy", "enter  Arrhythmia");
        final H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath("#/?from=2");
        pfi.c().launchActivity(activity, new Intent(), new AppBundleLauncher.InstallCallback() { // from class: rpz
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context, Intent intent) {
                return rpy.e(activity, builder, context, intent);
            }
        });
    }

    static /* synthetic */ boolean e(Activity activity, H5ProLaunchOption.Builder builder, Context context, Intent intent) {
        ddv.b().loadH5ProApp(activity, "com.huawei.health.h5.ppg", builder);
        return false;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
        rdt.d("pulse_wave_arrhythmia_analysis");
    }
}
