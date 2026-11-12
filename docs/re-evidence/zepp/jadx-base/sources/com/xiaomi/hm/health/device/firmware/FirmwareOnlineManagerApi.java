package com.xiaomi.hm.health.device.firmware;

import com.xiaomi.hm.health.bt.device.HMDeviceType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0004H&J\n\u0010\t\u001a\u0004\u0018\u00010\bH&J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u0004H&J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H&J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0004H&J\b\u0010\u0014\u001a\u00020\u000fH&¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/device/firmware/FirmwareOnlineManagerApi;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "useOnline", "isForce", "checkFwUpgrade", "Lcom/xiaomi/hm/health/device/firmware/HMFwOnlineUpgradeInfo;", "getFwUpgradeInfo", "deviceType", "", "getFwUpgradeVer", "hasFwUpgrade", "force", "", "checkFw", "enable", "enableFwUpgrade", "", "clearFwUpgradeTime", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface FirmwareOnlineManagerApi {
    void checkFw(@Nullable HMDeviceType type, boolean force);

    boolean checkFwUpgrade(@Nullable HMDeviceType type, boolean isForce);

    void clearFwUpgradeTime();

    void enableFwUpgrade(int type, boolean enable);

    void enableFwUpgrade(boolean enable);

    @Nullable
    HMFwOnlineUpgradeInfo getFwUpgradeInfo();

    @NotNull
    String getFwUpgradeVer(@Nullable HMDeviceType deviceType);

    boolean hasFwUpgrade(@Nullable HMDeviceType type);

    boolean useOnline(@NotNull HMDeviceType type);
}
