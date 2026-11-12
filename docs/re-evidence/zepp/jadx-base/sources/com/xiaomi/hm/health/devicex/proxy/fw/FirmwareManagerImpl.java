package com.xiaomi.hm.health.devicex.proxy.fw;

import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.device.firmware.FirmwareManagerApi;
import com.xiaomi.hm.health.device.firmware.FwDownloaderApi;
import com.xiaomi.hm.health.device.firmware.HMFirmware;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUtils;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import com.xiaomi.hm.health.devicex.proxy.other.FwDownloader;
import com.xiaomi.hm.health.model.fw_upgrade.ItemFwResponse;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\u0012\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0004H\u0016J\u0018\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0004H\u0016J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0004H\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eH\u0016R\"\u0010(\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/fw/FirmwareManagerImpl;", "Lcom/xiaomi/hm/health/device/firmware/FirmwareManagerApi;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "allowDataSync", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "deviceInfo", "Lcom/xiaomi/hm/health/device/firmware/HMFirmware;", "getCurrentFwInfo", "", "name", "", "getVersionCode", "Lcom/xiaomi/hm/health/model/fw_upgrade/ItemFwResponse;", "item", "downloadTempPath", "downloadSuccessPath", "Lcom/xiaomi/hm/health/device/firmware/FwDownloaderApi;", "getDownloadApi", "force", "", "checkFw", "deviceType", "getFwLocalUpgradeVer", "isForce", "checkFwUpgrade", "enable", "enableFwUpgrade", "hasFwUpgrade", "Ljava/util/ArrayList;", "Ljava/lang/Class;", "", "getIgnoreFwUpgradeList", "a", "Z", "getAllowUpgrade", "()Z", "setAllowUpgrade", "(Z)V", "allowUpgrade", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class FirmwareManagerImpl implements FirmwareManagerApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean allowUpgrade;

    @Override // com.xiaomi.hm.health.device.firmware.FirmwareManagerApi
    public boolean allowDataSync(@NotNull HMDeviceType type) {
        return HMFwUtils.allowDataSync(type);
    }

    @Override // com.xiaomi.hm.health.device.firmware.FirmwareManagerApi
    public void checkFw(@NotNull HMDeviceType type, boolean force) {
        HMFwOnlineManager.getInstance().checkFw(type, force);
    }

    @Override // com.xiaomi.hm.health.device.firmware.FirmwareManagerApi
    public boolean checkFwUpgrade(@NotNull HMDeviceType type, boolean isForce) {
        return HMFwUpgradeManager.getInstance().checkFwUpgrade(DeviceXFunctionsKt.getContext(), type, isForce);
    }

    @Override // com.xiaomi.hm.health.device.firmware.FirmwareManagerApi
    public void enableFwUpgrade(int type, boolean enable) {
        HMFwUpgradeManager.getInstance().enableFwUpgrade(type, enable);
    }

    @Override // com.xiaomi.hm.health.device.firmware.FirmwareManagerApi
    public boolean getAllowUpgrade() {
        return this.allowUpgrade;
    }

    @Override // com.xiaomi.hm.health.device.firmware.FirmwareManagerApi
    @Nullable
    public HMFirmware getCurrentFwInfo(@NotNull DeviceInfo deviceInfo) {
        return HMFwUpgradeManager.getInstance().getCurrentFwInfo(deviceInfo);
    }

    @Override // com.xiaomi.hm.health.device.firmware.FirmwareManagerApi
    @NotNull
    public FwDownloaderApi getDownloadApi(@NotNull ItemFwResponse item, @NotNull String downloadTempPath, @NotNull String downloadSuccessPath) {
        return new FwDownloader(item, downloadTempPath, downloadSuccessPath);
    }

    @Override // com.xiaomi.hm.health.device.firmware.FirmwareManagerApi
    @NotNull
    public String getFwLocalUpgradeVer(@Nullable HMDeviceType deviceType) {
        return HMFwUpgradeManager.getInstance().getFwUpgradeVer(DeviceXFunctionsKt.getContext(), deviceType);
    }

    @Override // com.xiaomi.hm.health.device.firmware.FirmwareManagerApi
    @NotNull
    public ArrayList<Class<Object>> getIgnoreFwUpgradeList() {
        return FwUpgradeManagerUtils.ignoreFwUpgradeList;
    }

    @Override // com.xiaomi.hm.health.device.firmware.FirmwareManagerApi
    public int getVersionCode(@NotNull String name) {
        return HMFwUtils.getVersionCode(name);
    }

    @Override // com.xiaomi.hm.health.device.firmware.FirmwareManagerApi
    public boolean hasFwUpgrade(@NotNull HMDeviceType type) {
        return HMFwUpgradeManager.getInstance().hasFwUpgrade(DeviceXFunctionsKt.getContext(), type);
    }

    @Override // com.xiaomi.hm.health.device.firmware.FirmwareManagerApi
    public void setAllowUpgrade(boolean z) {
        this.allowUpgrade = z;
    }

    @Override // com.xiaomi.hm.health.device.firmware.FirmwareManagerApi
    public void enableFwUpgrade(boolean enable) {
        HMFwUpgradeManager.getInstance().enableFwUpgrade(enable);
    }
}
