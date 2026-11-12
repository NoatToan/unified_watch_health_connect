package com.xiaomi.hm.health.device.watchskinnew.ui;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "", "supportDiy", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class HMDialListActivityKt {
    public static final boolean supportDiy(@NotNull HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(hMDeviceSource, Feature.CINCO_SERIES_S) || (((HMDeviceConfig.isFalconSeries(hMDeviceSource) || HMDeviceConfig.isKestrelSeries(hMDeviceSource) || HMDeviceConfig.isHawkSeries(hMDeviceSource)) || ConfigHelperKt.hasFeature(hMDeviceSource, Feature.PYH_SERIES_S) || hMDeviceSource == HMDeviceSource.MILI_ONYX || hMDeviceSource == HMDeviceSource.MILI_CORSICA || hMDeviceSource == HMDeviceSource.MILI_OSPREY || hMDeviceSource == HMDeviceSource.MILI_OSPREY_C) && WatchSkinUtils.isFwSupport(hMDeviceSource, DialConfig.INSTANCE.dialSupportFwVersion(hMDeviceSource)));
    }
}
