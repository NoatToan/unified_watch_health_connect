package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.operation.h5pro.jsmodules.DeviceHiCare;
import com.huawei.operation.h5pro.jsmodules.JsInteractionCompact;
import com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;

/* JADX INFO: loaded from: classes17.dex */
public class rss extends FeatureBaseStrategy {
    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        return true;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, Bundle bundle, SimpleChain.Emitter emitter) {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        if (this.mDeviceInfo == null) {
            LogUtil.j("ServiceSupportStrategy", "jumpToFeaturePage deviceInfo == null");
            return false;
        }
        c(BaseApplication.j(), bundle.getString("url", ""), bundle, new H5ProLaunchOption.Builder());
        return true;
    }

    private void c(Context context, String str, Bundle bundle, H5ProLaunchOption.Builder builder) {
        H5proUtil.initH5pro();
        builder.addCustomizeJsModule("JsInteraction", JsInteractionCompact.class);
        H5ProBundle h5ProBundle = new H5ProBundle();
        h5ProBundle.putString("siteCode", bundle.getString("siteCode", ""));
        h5ProBundle.putString(DeviceHiCare.KEY_SITE_LANG, bundle.getString(DeviceHiCare.KEY_SITE_LANG, ""));
        h5ProBundle.putString("mac", this.mDeviceInfo.getDeviceIdentify());
        builder.addCustomizeJsModule("DeviceHiCare", DeviceHiCare.class, h5ProBundle);
        builder.disableImageProxy();
        H5ProClient.getServiceManager().registerService(DeviceGeneralSettingManagerService.class);
        H5ProClient.startH5LightApp(context, str, builder.build());
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
        rdt.d("service_support");
    }
}
