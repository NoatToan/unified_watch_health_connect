package com.xiaomi.hm.health.devicex.manage.api.repository;

import com.facebook.appevents.integrity.IntegrityManager;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\b\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H&¢\u0006\u0004\b\b\u0010\u0007J#\u0010\t\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H&¢\u0006\u0004\b\t\u0010\u0007J#\u0010\n\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H&¢\u0006\u0004\b\n\u0010\u0007J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000bH&J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH&J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\rH&J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\rH&J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\rH&J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0002\"\u00020\u000bH&¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u001b\u001a\u00020\u001aH&J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\rH&J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H&J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H&J\n\u0010 \u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceRepositoryApi;", "", "", "Lcom/xiaomi/hm/health/databases/model/Device;", "devices", "", "insertOrReplaceInTx", "([Lcom/xiaomi/hm/health/databases/model/Device;)V", "insertOrReplace", "update", "updateDeviceInTx", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "mac", "findBoundDevice", "findTopOneDevice", "findBoundDeviceId", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "findDeviceByAddress", "findBoundDeviceByAddress", "id", "findDeviceById", "", "findBoundDevices", "([Lcom/xiaomi/hm/health/bt/device/HMDeviceType;)Ljava/util/List;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "findActiveDevices", "deleteById", "findAllActiveDevices", "findAll", "getActiveHeadset", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface DeviceRepositoryApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @Nullable
        public static Device getActiveHeadset(@NotNull DeviceRepositoryApi deviceRepositoryApi) {
            return null;
        }
    }

    void deleteById(@NotNull String id);

    @NotNull
    List<Device> findActiveDevices(@NotNull HMDeviceType type);

    @NotNull
    List<Device> findAll();

    @NotNull
    List<Device> findAllActiveDevices();

    @Nullable
    Device findBoundDevice(@NotNull HMDeviceType type, @NotNull String mac);

    @NotNull
    List<Device> findBoundDevice(@NotNull HMDeviceSource source);

    @Nullable
    Device findBoundDeviceByAddress(@Nullable String address);

    @Nullable
    String findBoundDeviceId(@NotNull HMDeviceType type);

    @NotNull
    List<Device> findBoundDevices(@NotNull HMDeviceType... type);

    @Nullable
    Device findDeviceByAddress(@Nullable String address);

    @Nullable
    Device findDeviceById(@NotNull String id);

    @Nullable
    Device findTopOneDevice(@NotNull HMDeviceType type);

    @Nullable
    Device getActiveHeadset();

    void insertOrReplace(@NotNull Device... devices);

    void insertOrReplaceInTx(@NotNull Device... devices);

    void update(@NotNull Device... devices);

    void updateDeviceInTx(@NotNull Device... devices);
}
