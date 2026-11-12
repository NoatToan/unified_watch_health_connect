package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes17.dex */
public class rtg extends FeatureBaseStrategy {
    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        return false;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy, com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        if (this.mDeviceInfo == null) {
            LogUtil.j("WatchFaceStrategy", "jumpPageToFace deviceInfo == null");
            return false;
        }
        if (a(this.mDeviceInfo)) {
            return true;
        }
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(BaseApplication.getContext()).e(this.mDeviceInfo.getDeviceIdentify());
        if (deviceCapabilityE != null) {
            bundle.putParcelable("key_bundle_cache_capability", deviceCapabilityE);
        } else {
            LogUtil.j("WatchFaceStrategy", "mActivity.mDeviceCapability is null.");
        }
        intent.putExtra("key_cache_capability", bundle);
        intent.setPackage(dmz.y);
        intent.setClassName(dmz.y, "com.huawei.ui.device.activity.weatherreport.WeatherReportActivity");
        iov.d(BaseApplication.getContext(), intent);
        return true;
    }

    private boolean a(DeviceInfo deviceInfo) {
        DeviceFeatureSupportApi deviceFeatureSupportApi = (DeviceFeatureSupportApi) Services.d("Module_Device_Feature", DeviceFeatureSupportApi.class);
        if (deviceFeatureSupportApi == null || deviceFeatureSupportApi.isSupportWeatherPush(deviceInfo)) {
            return false;
        }
        String strA = top.a(deviceInfo);
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        try {
            String strD = qxg.d(BaseApplication.getContext(), strA);
            Intent intent = new Intent("com.huawei.intent.action.APP_DATA_SYNC_SWITCH");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setPackage(strA);
            qrs.c(intent, strA, BaseApplication.getActivity(), strD);
            return true;
        } catch (SecurityException unused) {
            LogUtil.e("WatchFaceStrategy", "checkJumpToWeatherSync SecurityException");
            return false;
        }
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
        rdt.d(HwExerciseConstants.JSON_NAME_WORKOUT_WEATHER);
    }
}
