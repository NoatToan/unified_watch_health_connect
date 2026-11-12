package com.huawei.health.devicemgr.business.callback;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import defpackage.eec;

/* JADX INFO: loaded from: classes2.dex */
public interface DataReceiveCallback {
    void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar);
}
