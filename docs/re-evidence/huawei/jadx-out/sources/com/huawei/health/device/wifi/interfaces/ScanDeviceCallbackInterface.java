package com.huawei.health.device.wifi.interfaces;

import defpackage.ebv;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface ScanDeviceCallbackInterface {
    void onDeviceDiscovered(List<ebv> list);

    void onDeviceDiscoveryFinished();

    void onFailure(Object obj);
}
