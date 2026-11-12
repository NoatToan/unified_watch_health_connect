package com.huawei.health.device.api;

/* JADX INFO: loaded from: classes7.dex */
public interface EventBusApi {
    void publishDeviceDownMsg();

    void publishHmsLoginState(String str);

    void publishSingleDeviceDownMsg();

    void subscribeAm16Bind();
}
