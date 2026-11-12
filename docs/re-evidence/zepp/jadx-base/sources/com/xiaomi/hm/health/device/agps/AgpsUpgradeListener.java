package com.xiaomi.hm.health.device.agps;

import com.huami.device.core.agps.impl.upgrade.Listener;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.mifit.analytics.Analytics;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.device.event.HMDeviceFwUpgradeEvent;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J!\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016R\u0019\u0010\u0014\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/device/agps/AgpsUpgradeListener;", "Lcom/huami/device/core/agps/impl/upgrade/Listener;", "", "errorCode", "", "a", "(Ljava/lang/Integer;)V", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "onProgress", "", "isSuccess", "onResult", "(ZLjava/lang/Integer;)V", "onStart", "onStop", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/xiaomi/hm/health/device/agps/AgpsUpgradeApi;", "b", "Lcom/xiaomi/hm/health/device/agps/AgpsUpgradeApi;", "upgradeManagerApi", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Lcom/xiaomi/hm/health/device/agps/AgpsUpgradeApi;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AgpsUpgradeListener implements Listener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceSource source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AgpsUpgradeApi upgradeManagerApi;

    public AgpsUpgradeListener(@NotNull HMDeviceSource hMDeviceSource, @NotNull AgpsUpgradeApi agpsUpgradeApi) {
        this.source = hMDeviceSource;
        this.upgradeManagerApi = agpsUpgradeApi;
    }

    private final void a(Integer errorCode) {
        if (errorCode != null) {
            HMDeviceFwUpgradeEvent hMDeviceFwUpgradeEvent = new HMDeviceFwUpgradeEvent(this.source, HMFirmwareType.FIRMWARE_AGPS_BATCH, 2, false);
            hMDeviceFwUpgradeEvent.setErrorCode(errorCode.intValue());
            hMDeviceFwUpgradeEvent.setFwVersion("");
            EventBus.getDefault().postSticky(hMDeviceFwUpgradeEvent);
        }
    }

    @NotNull
    public final HMDeviceSource getSource() {
        return this.source;
    }

    @Override // com.huami.device.core.agps.impl.upgrade.Listener
    public void onProgress(@NotNull Progress progress) {
        this.upgradeManagerApi.updateAgpsProgress(progress);
        EventBus.getDefault().post(new HMDeviceFwUpgradeEvent(this.source, HMFirmwareType.FIRMWARE_GPS_CEP, progress));
    }

    @Override // com.huami.device.core.agps.impl.upgrade.Listener
    public void onResult(boolean isSuccess, @Nullable Integer errorCode) {
        EventBus.getDefault().post(new HMDeviceFwUpgradeEvent(this.source, HMFirmwareType.FIRMWARE_GPS_CEP, 2, isSuccess));
        if (!isSuccess) {
            Analytics.event(DeviceXFunctionsKt.getContext(), "SyncFail_AGPS");
            a(errorCode);
        }
        EventBus.getDefault().post(new HMDeviceFwUpgradeEvent(this.source, HMFirmwareType.FIRMWARE_AGPS_BATCH, 2, isSuccess));
    }

    @Override // com.huami.device.core.agps.impl.upgrade.Listener
    public void onStart() {
        EventBus.getDefault().post(new HMDeviceFwUpgradeEvent(this.source, HMFirmwareType.FIRMWARE_GPS_CEP, 0));
    }

    @Override // com.huami.device.core.agps.impl.upgrade.Listener
    public void onStop() {
        this.upgradeManagerApi.updateAgpsProgress(null);
    }
}
