package com.huami.phn.coach.koin;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@FunctionalInterface
public interface PhnDeviceNameDelegate {
    @NotNull
    String nameForSource(HMDeviceSource source);
}
