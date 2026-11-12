package com.huawei.ui.homehealth.devicearkui.delegate;

import androidx.activity.ComponentActivity;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;

/* JADX INFO: loaded from: classes17.dex */
public abstract class DeviceViewDelegate extends BaseViewDelegate {
    public abstract void updateDevice(DeviceInfo deviceInfo);

    public DeviceViewDelegate(ComponentActivity componentActivity) {
        super(componentActivity);
    }
}
