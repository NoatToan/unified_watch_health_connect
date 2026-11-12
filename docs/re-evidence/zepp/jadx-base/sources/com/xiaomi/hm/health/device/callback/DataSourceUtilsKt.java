package com.xiaomi.hm.health.device.callback;

import com.huami.mifit.sportlib.common.DataTypeSource;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "mSource", "", "getRecordSource", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class DataSourceUtilsKt {
    public static final int getRecordSource(@NotNull HMDeviceSource hMDeviceSource) {
        if (hMDeviceSource == HMDeviceSource.MILI_PEYTO) {
            return DataTypeSource.RunSource.RUN_SOURCE_CHAOHU.getValue();
        }
        if (hMDeviceSource == HMDeviceSource.MILI_TEMPO) {
            return DataTypeSource.RunSource.RUN_SOURCE_TEMPO.getValue();
        }
        if (hMDeviceSource == HMDeviceSource.MILI_BEATS || hMDeviceSource == HMDeviceSource.MILI_BEATS_W) {
            return DataTypeSource.RunSource.RUN_SOURCE_BEATS.getValue();
        }
        if (hMDeviceSource == HMDeviceSource.MILI_BEATS_P) {
            return DataTypeSource.RunSource.RUN_SOURCE_BEATS_P.getValue();
        }
        if (hMDeviceSource == HMDeviceSource.MILI_CHONGQING) {
            return DataTypeSource.RunSource.RUN_SOURCE_CHONGQING.getValue();
        }
        if (hMDeviceSource == HMDeviceSource.MILI_WUHAN) {
            return DataTypeSource.RunSource.RUN_SOURCE_WUHAN.getValue();
        }
        return (hMDeviceSource == HMDeviceSource.MILI_DTH || hMDeviceSource == HMDeviceSource.MILI_DTH_W) ? DataTypeSource.RunSource.RUN_SOURCE_DONGTINGHU.getValue() : hMDeviceSource.getValue() + 100;
    }
}
