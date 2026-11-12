package defpackage;

import android.os.Bundle;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.device.BacklogManagerService;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService;
import com.huawei.operation.h5pro.jsmodules.device.DeviceManagerService;
import com.huawei.operation.h5pro.jsmodules.device.UpdateDeviceManagerService;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;

/* JADX INFO: loaded from: classes17.dex */
public class rsx extends FeatureBaseStrategy {
    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        return true;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithOtaTransfering() {
        return true;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, Bundle bundle, SimpleChain.Emitter emitter) {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        if (this.mDeviceInfo == null) {
            LogUtil.j("TodoListStrategy", "jumpToFeaturePage deviceInfo == null");
            return false;
        }
        riq.a(this.mDeviceInfo);
        c(String.format("%s?deviceId=%s&isWatch=%s", "#/unCompleteSetting", this.mDeviceInfo.getDeviceIdentify(), bundle.getString("isWatch", "")));
        return true;
    }

    private void c(String str) {
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        ddv ddvVarB = ddv.b();
        builder.addPath(str).setForceDarkMode(1);
        builder.addCustomizeJsModule("innerapi", ddvVarB.getCommonJsModule("innerapi"));
        builder.addCustomizeJsModule("EarphonePairManager", ddvVarB.getCommonJsModule("EarphonePairManager"));
        builder.addCustomizeJsModule("device", ddvVarB.getCommonJsModule("device"));
        builder.addCustomizeJsModule("BasePairManager", BasePairManagerJsApi.class);
        builder.setImmerse().showStatusBar().setTextZoom();
        ddvVarB.initH5Pro();
        H5ProClient.getServiceManager().registerService(DeviceManagerService.class);
        H5ProClient.getServiceManager().registerService(BacklogManagerService.class);
        H5ProClient.getServiceManager().registerService(UpdateDeviceManagerService.class);
        H5ProClient.getServiceManager().registerService(DeviceGeneralSettingManagerService.class);
        H5ProClient.startH5MiniProgram(BaseApplication.getContext(), "com.huawei.health.h5.dm-ccbk", builder.build());
    }
}
