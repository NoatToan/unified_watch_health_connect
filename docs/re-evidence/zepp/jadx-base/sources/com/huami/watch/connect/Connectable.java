package com.huami.watch.connect;

import com.ingenic.iwds.DeviceDescriptor;

/* JADX INFO: loaded from: classes16.dex */
public interface Connectable {
    void onConnectedDevice(DeviceDescriptor deviceDescriptor);

    void onCreateDeviceDescription(DeviceDescriptor deviceDescriptor);

    void onDisconnectedDevice(DeviceDescriptor deviceDescriptor);
}
