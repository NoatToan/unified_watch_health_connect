package com.huawei.health.device.api;

import com.huawei.health.device.callback.DownloadCityCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import defpackage.jpg;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface OfflineMapApi {
    void initOfflineMap(String str);

    void jumpToOfflineMap(DeviceInfo deviceInfo, List<String> list);

    void queryingDownloadCity(List<jpg> list, DownloadCityCallback downloadCityCallback);
}
