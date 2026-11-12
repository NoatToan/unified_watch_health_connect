package com.huawei.health.device.api;

/* JADX INFO: loaded from: classes7.dex */
public interface DeviceManagerCommonConfigApi {
    void downLoadCommonConfig();

    <T> T getConfig(String str, Class<T> cls);

    boolean hasFutureConfig(String str);

    boolean isSupportFeature(String str, String str2);

    boolean refreshCommonConfigSupportInfo();
}
