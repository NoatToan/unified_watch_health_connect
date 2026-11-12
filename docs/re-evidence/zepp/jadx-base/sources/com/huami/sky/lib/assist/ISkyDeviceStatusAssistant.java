package com.huami.sky.lib.assist;

import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H&¨\u0006\n"}, d2 = {"Lcom/huami/sky/lib/assist/ISkyDeviceStatusAssistant;", "", "Lcom/huami/sky/lib/assist/SkyDeviceStatus;", "getDeviceConnectStatus", "", "getDevicePower", "Lkotlinx/coroutines/flow/Flow;", "deviceConnectNotifiers", "devicePowerNotifiers", "deviceBoundNotifiers", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public interface ISkyDeviceStatusAssistant {
    @NotNull
    Flow<SkyDeviceStatus> deviceBoundNotifiers();

    @NotNull
    Flow<SkyDeviceStatus> deviceConnectNotifiers();

    @NotNull
    Flow<Integer> devicePowerNotifiers();

    @NotNull
    SkyDeviceStatus getDeviceConnectStatus();

    int getDevicePower();
}
