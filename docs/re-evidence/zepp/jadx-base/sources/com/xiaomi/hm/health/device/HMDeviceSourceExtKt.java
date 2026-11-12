package com.xiaomi.hm.health.device;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getHrRealtimeSource", "()[Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class HMDeviceSourceExtKt {
    @NotNull
    public static final HMDeviceSource[] getHrRealtimeSource() {
        HMDeviceSource[] hMDeviceSourceArrValues = HMDeviceSource.values();
        ArrayList arrayList = new ArrayList();
        for (HMDeviceSource hMDeviceSource : hMDeviceSourceArrValues) {
            if (ConfigHelperKt.hasFeature(hMDeviceSource, Feature.HR_REALTIME_SOURCE_S)) {
                arrayList.add(hMDeviceSource);
            }
        }
        Object[] array = arrayList.toArray(new HMDeviceSource[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (HMDeviceSource[]) array;
    }
}
