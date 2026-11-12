package com.xiaomi.hm.health.device.kongmingentrance;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.base.HardwareInfo;
import com.xiaomi.hm.health.device.cincoentrance.CincoEntranceHelperKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "isKongmingMainland", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class KongmingEntranceHelperKt {
    public static final boolean isKongmingMainland(@NotNull HMDeviceSource hMDeviceSource) {
        return (HMDeviceSource.MILI_KONGMING_PRO == hMDeviceSource || HMDeviceSource.MILI_KONGMING == hMDeviceSource) && HardwareInfo.isMiliKongmingMainLand(CincoEntranceHelperKt.getHardwareVersion());
    }
}
