package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.service.H5ProServiceManager;
import com.huawei.healthcloud.plugintrack.golf.h5.GolfH5DownloadInterface;
import com.huawei.healthcloud.plugintrack.golf.h5.GolfH5NativeInterface;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.operation.h5pro.jsmodules.device.DeviceManagerService;
import com.huawei.pluginhealthzone.jsmodule.PluginHealthH5InteractionUtil;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes17.dex */
public class rrs extends FeatureBaseStrategy {
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
        c("com.huawei.health.h5.golf", "", this.mDeviceInfo, emitter);
        return true;
    }

    public void c(String str, String str2, DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        ReleaseLogUtil.d("R_GolfStrategy", "startH5Page enter");
        if (deviceInfo == null) {
            ReleaseLogUtil.e("R_GolfStrategy", "startH5Page device not connected");
            emitter.onError("startH5Page device not connected");
            return;
        }
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        ddv ddvVarB = ddv.b();
        if (!TextUtils.isEmpty(str2)) {
            builder.addPath(str2);
        }
        builder.addCustomizeJsModule("innerapi", ddvVarB.getCommonJsModule("innerapi"));
        builder.addCustomizeJsModule("device", ddvVarB.getCommonJsModule("device"));
        builder.addCustomizeJsModule("BasePairManager", BasePairManagerJsApi.class);
        builder.addCustomizeJsModule("healthZoneApi", PluginHealthH5InteractionUtil.class);
        builder.addCustomizeJsModule("GolfDeviceInterface", GolfH5DownloadInterface.class);
        builder.setImmerse().showStatusBar().setForceDarkMode(1);
        ddvVarB.initH5Pro();
        H5ProClient.getServiceManager().registerService(DeviceManagerService.class);
        H5ProServiceManager.getInstance().registerService(GolfH5NativeInterface.class);
        H5ProClient.startH5MiniProgram(BaseApplication.getContext(), str, builder.build());
    }
}
