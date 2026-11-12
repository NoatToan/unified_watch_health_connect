package com.huawei.ui.homehealth.devicearkui.feature;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.devicefeature.FeatureSupportCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BaseFeatureItem {
    protected final ComponentActivity activity;
    protected final DeviceFeatureSupportApi featureSupportApi = (DeviceFeatureSupportApi) Services.d("Module_Device_Feature", DeviceFeatureSupportApi.class);

    public boolean isNeedUpdate() {
        return false;
    }

    protected abstract void isSupportFeature(DeviceInfo deviceInfo, FeatureSupportCallback featureSupportCallback);

    public abstract View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract void updateDevice(DeviceInfo deviceInfo);

    public BaseFeatureItem(ComponentActivity componentActivity) {
        this.activity = componentActivity;
    }

    public final void requestFeatureSupport(DeviceInfo deviceInfo, FeatureSupportCallback featureSupportCallback) {
        if (deviceInfo == null) {
            featureSupportCallback.success(false);
        } else {
            isSupportFeature(deviceInfo, featureSupportCallback);
        }
    }
}
