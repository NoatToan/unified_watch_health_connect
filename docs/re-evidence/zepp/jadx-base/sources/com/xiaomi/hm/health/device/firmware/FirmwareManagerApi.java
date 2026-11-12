package com.xiaomi.hm.health.device.firmware;

import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.model.fw_upgrade.ItemFwResponse;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH&J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0004H&J\u0012\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H&J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0004H&J\u0018\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0004H&J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0004H&J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0014\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001f0\u001eH&R\u001c\u0010%\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/device/firmware/FirmwareManagerApi;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "allowDataSync", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "deviceInfo", "Lcom/xiaomi/hm/health/device/firmware/HMFirmware;", "getCurrentFwInfo", "", "name", "", "getVersionCode", "Lcom/xiaomi/hm/health/model/fw_upgrade/ItemFwResponse;", "item", "downloadTempPath", "downloadSuccessPath", "Lcom/xiaomi/hm/health/device/firmware/FwDownloaderApi;", "getDownloadApi", "force", "", "checkFw", "deviceType", "getFwLocalUpgradeVer", "isForce", "checkFwUpgrade", "enable", "enableFwUpgrade", "hasFwUpgrade", "Ljava/util/ArrayList;", "Ljava/lang/Class;", "getIgnoreFwUpgradeList", "getAllowUpgrade", "()Z", "setAllowUpgrade", "(Z)V", "allowUpgrade", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface FirmwareManagerApi {
    boolean allowDataSync(@NotNull HMDeviceType type);

    void checkFw(@NotNull HMDeviceType type, boolean force);

    boolean checkFwUpgrade(@NotNull HMDeviceType type, boolean isForce);

    void enableFwUpgrade(int type, boolean enable);

    void enableFwUpgrade(boolean enable);

    boolean getAllowUpgrade();

    @Nullable
    HMFirmware getCurrentFwInfo(@NotNull DeviceInfo deviceInfo);

    @NotNull
    FwDownloaderApi getDownloadApi(@NotNull ItemFwResponse item, @NotNull String downloadTempPath, @NotNull String downloadSuccessPath);

    @NotNull
    String getFwLocalUpgradeVer(@Nullable HMDeviceType deviceType);

    @NotNull
    ArrayList<Class<Object>> getIgnoreFwUpgradeList();

    int getVersionCode(@NotNull String name);

    boolean hasFwUpgrade(@NotNull HMDeviceType type);

    void setAllowUpgrade(boolean z);
}
