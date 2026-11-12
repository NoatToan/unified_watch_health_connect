package com.xiaomi.hm.health.devicex;

import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.devicex.injection.basic.InstallValidState;
import com.huami.devicex.injection.basic.JsAppInstallValidApi;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.dfu.UpgradeStatueResponse;
import com.xiaomi.hm.health.device.feature.sync.SyncCenterManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/devicex/JsAppInstallValidApiImpl;", "Lcom/huami/devicex/injection/basic/JsAppInstallValidApi;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "Lcom/huami/devicex/injection/basic/InstallValidState;", "valid", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class JsAppInstallValidApiImpl implements JsAppInstallValidApi {

    @NotNull
    private static final String a = "JsAppInstallValidApiImpl";
    private static final int b = 10;

    @Override // com.huami.devicex.injection.basic.JsAppInstallValidApi
    @NotNull
    public InstallValidState valid(@NotNull HMDeviceType type) {
        HMBaseDevice device = ManagerFunctionsKt.getDeviceManagerApi().getDevice(type);
        if (device == null) {
            Debug.fi(a, "Device is null");
            return InstallValidState.OHTER;
        }
        if (!(device instanceof HMMiLiProDevice)) {
            Debug.fi(a, "Device is not pro device");
            return InstallValidState.OHTER;
        }
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) device;
        if (!hMMiLiProDevice.isConnected()) {
            return InstallValidState.DISCONNECT;
        }
        if (hMMiLiProDevice.getBatteryInfo() != null && hMMiLiProDevice.getBatteryInfo().getLevel() < 10) {
            return InstallValidState.LOW_BATTERY;
        }
        if (SyncCenterManager.INSTANCE.isSyncing(device)) {
            return InstallValidState.DATA_SYNC;
        }
        UpgradeStatueResponse upgradeStatusSync = hMMiLiProDevice.getUpgradeStatusSync();
        if (upgradeStatusSync == null) {
            return InstallValidState.OHTER;
        }
        return !upgradeStatusSync.available() ? InstallValidState.DFU_BUSY : InstallValidState.AVAILABLE;
    }
}
