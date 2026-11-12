package com.huami.watchfacesstore.device.channel;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H&¨\u0006\u000b"}, d2 = {"Lcom/huami/watchfacesstore/device/channel/IBlueToothChannel;", "", "", "isOpen", "", "onBleOpened", "", "status", "onDeviceConnectStatus", "isCharging", "onBatteryCharging", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface IBlueToothChannel {
    void onBatteryCharging(boolean isCharging);

    void onBleOpened(boolean isOpen);

    void onDeviceConnectStatus(int status);
}
