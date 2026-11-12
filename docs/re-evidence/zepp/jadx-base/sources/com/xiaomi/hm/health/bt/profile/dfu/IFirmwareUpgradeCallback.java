package com.xiaomi.hm.health.bt.profile.dfu;

import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/IFirmwareUpgradeCallback;", "Lcom/xiaomi/hm/health/bt/profile/dfu/IHMFirmwareUpgradeCallback;", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareType;", "type", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "", "upgradingProgress", "", "errorCode", "onError", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IFirmwareUpgradeCallback extends IHMFirmwareUpgradeCallback {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static void onError(@NotNull IFirmwareUpgradeCallback iFirmwareUpgradeCallback, int i) {
        }

        public static void upgradingProgress(@NotNull IFirmwareUpgradeCallback iFirmwareUpgradeCallback, @NotNull HMFirmwareType hMFirmwareType, @NotNull Progress progress) {
        }
    }

    void onError(int errorCode);

    void upgradingProgress(@NotNull HMFirmwareType type, @NotNull Progress progress);
}
