package com.huawei.hwservicesmgr.remoterequestdata;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.Result;

/* JADX INFO: loaded from: classes11.dex */
public interface RequestDataProvider {
    Result getData(DeviceInfo deviceInfo, String str);
}
