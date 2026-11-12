package com.xiaomi.hm.health.devicex.proxy.fw;

import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.firmware.FirmwareOnlineManagerApi;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeInfo;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/fw/FirmwareOnlineManagerImpl;", "Lcom/xiaomi/hm/health/device/firmware/FirmwareOnlineManagerApi;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "useOnline", "hasFwUpgrade", "isForce", "checkFwUpgrade", "Lcom/xiaomi/hm/health/device/firmware/HMFwOnlineUpgradeInfo;", "getFwUpgradeInfo", "deviceType", "", "getFwUpgradeVer", "force", "", "checkFw", "enable", "enableFwUpgrade", "", "clearFwUpgradeTime", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class FirmwareOnlineManagerImpl implements FirmwareOnlineManagerApi {
    @Override // com.xiaomi.hm.health.device.firmware.FirmwareOnlineManagerApi
    public void checkFw(@Nullable HMDeviceType type, boolean force) {
        HMFwOnlineManager.getInstance().checkFw(type, force);
    }

    @Override // com.xiaomi.hm.health.device.firmware.FirmwareOnlineManagerApi
    public boolean checkFwUpgrade(@Nullable HMDeviceType type, boolean isForce) {
        return HMFwOnlineUpgradeManager.getInstance().checkFwUpgrade(DeviceXFunctionsKt.getContext(), type, isForce);
    }

    @Override // com.xiaomi.hm.health.device.firmware.FirmwareOnlineManagerApi
    public void clearFwUpgradeTime() {
        HMFwOnlineUpgradeManager.getInstance().clearFwUpgradeTime();
    }

    @Override // com.xiaomi.hm.health.device.firmware.FirmwareOnlineManagerApi
    public void enableFwUpgrade(boolean enable) {
        HMFwOnlineUpgradeManager.getInstance().enableFwUpgrade(enable);
    }

    @Override // com.xiaomi.hm.health.device.firmware.FirmwareOnlineManagerApi
    @Nullable
    public HMFwOnlineUpgradeInfo getFwUpgradeInfo() {
        return HMFwOnlineUpgradeManager.getInstance().getFwUpgradeInfo();
    }

    @Override // com.xiaomi.hm.health.device.firmware.FirmwareOnlineManagerApi
    @NotNull
    public String getFwUpgradeVer(@Nullable HMDeviceType deviceType) {
        return HMFwOnlineUpgradeManager.getInstance().getFwUpgradeVer(DeviceXFunctionsKt.getContext(), deviceType);
    }

    @Override // com.xiaomi.hm.health.device.firmware.FirmwareOnlineManagerApi
    public boolean hasFwUpgrade(@Nullable HMDeviceType type) {
        return HMFwOnlineUpgradeManager.getInstance().hasFwUpgrade(DeviceXFunctionsKt.getContext(), type);
    }

    @Override // com.xiaomi.hm.health.device.firmware.FirmwareOnlineManagerApi
    public boolean useOnline(@NotNull HMDeviceType type) {
        return HMFwOnlineUpgradeManager.getInstance().useOnline(type);
    }

    @Override // com.xiaomi.hm.health.device.firmware.FirmwareOnlineManagerApi
    public void enableFwUpgrade(int type, boolean enable) {
        HMFwOnlineUpgradeManager.getInstance().enableFwUpgrade(type, enable);
    }
}
