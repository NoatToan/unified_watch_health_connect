package com.xiaomi.hm.health.stress.koin;

import com.huami.stress.domain.data.device.bean.StressDeviceBean;
import com.xiaomi.hm.health.bt.profile.gdsp.pressure.HMPressureData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/HMPressureData;", "Lcom/huami/stress/domain/data/device/bean/StressDeviceBean;", "toStressDeviceBean", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class StressExtKt {
    @NotNull
    public static final StressDeviceBean toStressDeviceBean(@NotNull HMPressureData hMPressureData) {
        return new StressDeviceBean(hMPressureData.getTime(), hMPressureData.getValue());
    }
}
