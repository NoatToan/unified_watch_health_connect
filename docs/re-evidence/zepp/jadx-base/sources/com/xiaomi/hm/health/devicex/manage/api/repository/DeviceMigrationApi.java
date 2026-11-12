package com.xiaomi.hm.health.devicex.manage.api.repository;

import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\"\u0010\n\u001a\u00020\t2\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0006H&J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceMigrationApi;", "", "", "Lcom/xiaomi/hm/health/databases/model/Device;", "findMigrateDevices", "findMigrateDevicesAll", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceMap", "", "migrateDeviceInfoToDb", "", "fromVersion", "targetVersion", "migrate", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface DeviceMigrationApi {
    @NotNull
    List<Device> findMigrateDevices();

    @NotNull
    List<Device> findMigrateDevicesAll();

    void migrate(int fromVersion, int targetVersion);

    void migrateDeviceInfoToDb(@NotNull Map<HMDeviceType, ? extends List<? extends Device>> deviceMap);
}
