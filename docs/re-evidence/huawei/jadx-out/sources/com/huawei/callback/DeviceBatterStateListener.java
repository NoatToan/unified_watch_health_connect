package com.huawei.callback;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import defpackage.mgp;

/* JADX INFO: loaded from: classes4.dex */
public interface DeviceBatterStateListener {
    void onDeviceBatteryChange(DeviceInfo deviceInfo, mgp mgpVar);
}
