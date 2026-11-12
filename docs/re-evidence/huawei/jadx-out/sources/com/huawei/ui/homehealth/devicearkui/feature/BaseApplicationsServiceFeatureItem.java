package com.huawei.ui.homehealth.devicearkui.feature;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import com.huawei.devicefeature.FeatureSupportCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.ui.homehealth.R;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BaseApplicationsServiceFeatureItem extends BaseFeatureItem {
    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    protected abstract void isSupportFeature(DeviceInfo deviceInfo, FeatureSupportCallback featureSupportCallback);

    protected abstract void setupViews(View view);

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public abstract void updateDevice(DeviceInfo deviceInfo);

    public BaseApplicationsServiceFeatureItem(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(getLayoutId(), viewGroup, false);
        setupViews(viewInflate);
        return viewInflate;
    }

    protected int getLayoutId() {
        return R.layout.item_device_feature;
    }
}
