package com.huami.devicex.injection.keeper;

import com.facebook.appevents.integrity.IntegrityManager;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import java.util.Calendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\u0004H&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0014\u001a\u00020\u0004H&J\b\u0010\u0015\u001a\u00020\u0004H&J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0010H&¨\u0006\u001c"}, d2 = {"Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "Ljava/util/Calendar;", "calendar", "", "setBoundDeviceSyncTime", "getBoundDeviceSyncTime", "setGpsSyncTime", "getProHrSyncTime", "setProHrSyncTime", "getGpsSyncTime", "getDeviceBoundTime", "setEcgSyncTime", "getEcgSyncTime", "", "key", "", "getSyncTime", "getPressureAllDaySyncTime", "getPressureSingleSyncTime", "setPressureAllDaySyncTime", "setPressureSingleSyncTime", "getPaiSyncTime", "setPaiSyncTime", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "getEarliestBoundTime", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface DeviceTimeStoreApi {
    @NotNull
    Calendar getBoundDeviceSyncTime(@Nullable HMDeviceType type);

    @NotNull
    Calendar getDeviceBoundTime(@NotNull HMDeviceType type);

    @NotNull
    Calendar getEarliestBoundTime(@NotNull String address);

    @NotNull
    Calendar getEcgSyncTime(@NotNull HMDeviceType type);

    @NotNull
    Calendar getGpsSyncTime(@NotNull HMDeviceType type);

    @NotNull
    Calendar getPaiSyncTime(@NotNull HMDeviceType type);

    @NotNull
    Calendar getPressureAllDaySyncTime();

    @NotNull
    Calendar getPressureSingleSyncTime();

    @NotNull
    Calendar getProHrSyncTime();

    long getSyncTime(@NotNull HMDeviceType type, @NotNull String key);

    void setBoundDeviceSyncTime(@NotNull HMDeviceType type, @NotNull Calendar calendar);

    void setEcgSyncTime(@NotNull HMDeviceType type, @NotNull Calendar calendar);

    void setGpsSyncTime(@NotNull HMDeviceType type, @NotNull Calendar calendar);

    void setPaiSyncTime(@NotNull HMDeviceType type, @NotNull Calendar calendar);

    void setPressureAllDaySyncTime(@NotNull Calendar calendar);

    void setPressureSingleSyncTime(@NotNull Calendar calendar);

    void setProHrSyncTime(@NotNull Calendar calendar);
}
