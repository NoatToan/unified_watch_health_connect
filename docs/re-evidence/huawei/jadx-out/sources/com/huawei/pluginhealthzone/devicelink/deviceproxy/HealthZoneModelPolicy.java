package com.huawei.pluginhealthzone.devicelink.deviceproxy;

import com.huawei.pluginhealthzone.devicelink.callback.DeviceDataListener;
import defpackage.pfx;
import defpackage.xiu;

/* JADX INFO: loaded from: classes42.dex */
public interface HealthZoneModelPolicy {
    void activeSendMsgToDevice(int i, pfx pfxVar, DeviceDataListener deviceDataListener);

    void receiveDataFromDevice(int i, xiu xiuVar);
}
