package com.xiaomi.hm.health.ui.smartplay.logsit;

import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/xiaomi/hm/health/ui/smartplay/logsit/LongSitMode;", "getLongSitMode", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class LongSitLogicKt {
    @NotNull
    public static final LongSitMode getLongSitMode(@NotNull HMDeviceSource hMDeviceSource) {
        boolean zHasFeature = ConfigHelperKt.hasFeature(hMDeviceSource, Feature.SUPPORT_STAND_ALERT);
        boolean zHasFeature2 = ConfigHelperKt.hasFeature(hMDeviceSource, Feature.SUPPORT_FAKE_STAND_ALERT);
        if (zHasFeature) {
            return LongSitMode.STAND_ALERT;
        }
        return zHasFeature2 ? LongSitMode.FAKE_STAND_ALERT : LongSitMode.LONG_SIT;
    }

    public static /* synthetic */ LongSitMode getLongSitMode$default(HMDeviceSource hMDeviceSource, int i, Object obj) {
        if ((i & 1) != 0) {
            hMDeviceSource = ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI);
        }
        return getLongSitMode(hMDeviceSource);
    }
}
