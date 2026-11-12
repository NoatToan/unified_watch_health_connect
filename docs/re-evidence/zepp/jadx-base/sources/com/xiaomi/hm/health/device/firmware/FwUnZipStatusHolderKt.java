package com.xiaomi.hm.health.device.firmware;

import com.xiaomi.hm.health.bt.profile.dfu.UpgradeStatueResponse;
import com.xiaomi.hm.health.bt.profile.dfu.UpgradeStatus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/UpgradeStatueResponse;", "Lcom/xiaomi/hm/health/bt/profile/dfu/UpgradeStatus;", "upgradeStatus", "", "match", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class FwUnZipStatusHolderKt {
    public static final boolean match(@Nullable UpgradeStatueResponse upgradeStatueResponse, @NotNull UpgradeStatus upgradeStatus) {
        return upgradeStatueResponse != null && upgradeStatueResponse.isOk() && upgradeStatueResponse.getUpgradeStatus() == upgradeStatus;
    }
}
