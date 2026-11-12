package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.LifeCycleJsApi;
import com.huawei.operation.h5pro.jsmodules.common.HealthCommonApi;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService;
import com.huawei.operation.h5pro.jsmodules.device.DeviceManagerService;
import com.huawei.operation.h5pro.jsmodules.device.DevicePairingManagerService;
import com.huawei.operation.h5pro.jsmodules.device.LegalInfoManagerService;
import com.huawei.operation.h5pro.jsmodules.device.UpdateDeviceManagerService;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes17.dex */
public class rqp extends FeatureBaseStrategy {
    private boolean e = false;

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

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy, com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        return jumpToFeaturePage(deviceInfo, null, emitter);
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, Bundle bundle, SimpleChain.Emitter emitter) {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        if (bundle != null) {
            this.e = bundle.getBoolean("isSupportService", false);
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        LogUtil.a("DeviceSettingStrategy", "jumpPageToFace deviceMac: ", CommonUtil.n(deviceIdentify));
        if (this.mDeviceInfo == null && !BluetoothAdapter.checkBluetoothAddress(deviceIdentify)) {
            LogUtil.j("DeviceSettingStrategy", "jumpPageToFace deviceInfo == null");
            return false;
        }
        if (this.mDeviceInfo != null) {
            deviceIdentify = this.mDeviceInfo.getDeviceIdentify();
        }
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        ddv ddvVarB = ddv.b();
        LogUtil.a("DeviceSettingStrategy", "jumpToFeaturePage isServiceSupport :", Boolean.valueOf(this.e));
        builder.addPath("#/commonSetting?deviceId=" + deviceIdentify + "&isShowServiceSupport=" + this.e);
        builder.addCustomizeJsModule("innerapi", ddvVarB.getCommonJsModule("innerapi"));
        builder.addCustomizeJsModule("device", ddvVarB.getCommonJsModule("device"));
        builder.addCustomizeJsModule("BasePairManager", BasePairManagerJsApi.class);
        builder.addCustomizeJsModule("lifeCycle", LifeCycleJsApi.class);
        builder.setImmerse().showStatusBar().setForceDarkMode(1).setTextZoom();
        ddvVarB.initH5Pro();
        H5ProClient.getServiceManager().registerService(DeviceManagerService.class);
        H5ProClient.getServiceManager().registerService(DeviceGeneralSettingManagerService.class);
        H5ProClient.getServiceManager().registerService(LegalInfoManagerService.class);
        H5ProClient.getServiceManager().registerService(UpdateDeviceManagerService.class);
        H5ProClient.getServiceManager().registerService(HealthCommonApi.class);
        H5ProClient.getServiceManager().registerService(DevicePairingManagerService.class);
        H5ProClient.startH5MiniProgram(BaseApplication.getContext(), "com.huawei.health.h5.dm-ccbk", builder.build());
        return true;
    }
}
