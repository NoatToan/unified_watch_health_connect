package com.huami.flutter.bluechannelplugin;

import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/huami/flutter/bluechannelplugin/BlueChannelDeviceApi;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getConnectedDevice", "", "supportLowVersion", "", "obtainOtaStatus", "blue_channel_plugin_release"}, k = 1, mv = {1, 5, 1})
public interface BlueChannelDeviceApi {
    @Nullable
    HMBaseDevice getConnectedDevice();

    long obtainOtaStatus(@NotNull String supportLowVersion);
}
