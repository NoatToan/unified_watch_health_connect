package com.huami.devicex.injection.data;

import com.huami.device.core.sync.api.type.SyncJob;
import com.huami.ecg.sync.mili.device.MiliDeviceEcgSync;
import com.huami.watch.dataflow.sync.bean.FirstbeatData;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.StringQualifier;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&J0\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH&J\b\u0010\u0015\u001a\u00020\u0014H&J\b\u0010\u0016\u001a\u00020\bH&J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H&J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001aH&J\b\u0010\u001e\u001a\u00020\u001dH&J\b\u0010\u001f\u001a\u00020\u001dH&¨\u0006 "}, d2 = {"Lcom/huami/devicex/injection/data/SyncDataApi;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "saveSpo2DataFromDevice", "", "time", "", "allDay", "saveStressSyncTime", "", "deviceType", "", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "saveStressSyncDeviceData", "Lorg/koin/core/qualifier/StringQualifier;", "getStressScopeName", "getFirstbeatUpdateTime", "Lcom/huami/watch/dataflow/sync/bean/FirstbeatData;", "data", "saveFirstbeatDdata", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "Lcom/huami/ecg/sync/mili/device/MiliDeviceEcgSync;", "getMiliDeviceEcgSync", "Lcom/huami/device/core/sync/api/type/SyncJob;", "getTemperatureSyncJob", "getSensorHubSyncJob", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface SyncDataApi {
    long getFirstbeatUpdateTime();

    @NotNull
    MiliDeviceEcgSync getMiliDeviceEcgSync(@NotNull HMMiLiProDevice device);

    @NotNull
    SyncJob getSensorHubSyncJob();

    @NotNull
    StringQualifier getStressScopeName();

    @NotNull
    SyncJob getTemperatureSyncJob();

    void saveFirstbeatDdata(@NotNull FirstbeatData data);

    void saveSpo2DataFromDevice(@Nullable HMDeviceSource deviceSource, @NotNull HMBaseDevice device);

    void saveStressSyncDeviceData(int deviceType, int deviceSource, @NotNull String deviceId, @NotNull String deviceMac, @NotNull String deviceSn);

    void saveStressSyncTime(long time, boolean allDay);
}
