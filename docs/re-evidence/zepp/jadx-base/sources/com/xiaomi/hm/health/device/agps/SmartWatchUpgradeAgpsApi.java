package com.xiaomi.hm.health.device.agps;

import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/agps/SmartWatchUpgradeAgpsApi;", "", "Lcom/xiaomi/hm/health/bt/profile/dfu/IHMFirmwareUpgradeCallback;", "callback", "", "agpsUpgrade", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface SmartWatchUpgradeAgpsApi {
    void agpsUpgrade(@Nullable IHMFirmwareUpgradeCallback callback);
}
