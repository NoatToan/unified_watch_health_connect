package com.xiaomi.hm.health.device.amazfit_watch;

import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.device.agps.SmartWatchUpgradeAgpsApi;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/amazfit_watch/SmartWatchUpgradeAgpsImpl;", "Lcom/xiaomi/hm/health/device/agps/SmartWatchUpgradeAgpsApi;", "Lcom/xiaomi/hm/health/bt/profile/dfu/IHMFirmwareUpgradeCallback;", "callback", "", "agpsUpgrade", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SmartWatchUpgradeAgpsImpl implements SmartWatchUpgradeAgpsApi {
    @Override // com.xiaomi.hm.health.device.agps.SmartWatchUpgradeAgpsApi
    public void agpsUpgrade(@Nullable IHMFirmwareUpgradeCallback callback) {
        HMWatchLogic.getInstance().agpsUpgrade(callback);
    }
}
