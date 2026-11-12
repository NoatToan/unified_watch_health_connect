package com.xiaomi.hm.health.lab.init;

/* JADX INFO: loaded from: classes21.dex */
public interface LabEventListener {
    void onEvent(LabEventAccountStatus labEventAccountStatus);

    void onEvent(LabEventBluetooth labEventBluetooth);

    void onEvent(LabHMDeviceConnectionEvent labHMDeviceConnectionEvent);
}
