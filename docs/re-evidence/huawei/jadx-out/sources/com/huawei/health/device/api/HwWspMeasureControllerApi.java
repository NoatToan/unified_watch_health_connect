package com.huawei.health.device.api;

import com.huawei.health.device.callback.IHealthDeviceCallback;

/* JADX INFO: loaded from: classes7.dex */
public interface HwWspMeasureControllerApi {
    int getState();

    void unRegisterCallback(IHealthDeviceCallback iHealthDeviceCallback);
}
