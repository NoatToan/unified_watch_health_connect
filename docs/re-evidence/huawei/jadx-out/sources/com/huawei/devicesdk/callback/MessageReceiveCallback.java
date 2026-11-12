package com.huawei.devicesdk.callback;

import com.huawei.devicesdk.entity.DeviceInfo;
import defpackage.cmm;

/* JADX INFO: loaded from: classes4.dex */
public interface MessageReceiveCallback {
    void onChannelEnable(DeviceInfo deviceInfo, String str, int i);

    void onDataReceived(DeviceInfo deviceInfo, cmm cmmVar, int i);
}
