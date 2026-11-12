package com.xiaomi.hm.health.bt.profile.dfu;

import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/IFirmwareInterruptedUpgradeCallback;", "Lcom/xiaomi/hm/health/bt/profile/dfu/IFirmwareUpgradeCallback;", "", "onInterrupted", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IFirmwareInterruptedUpgradeCallback extends IFirmwareUpgradeCallback {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static void onError(@NotNull IFirmwareInterruptedUpgradeCallback iFirmwareInterruptedUpgradeCallback, int i) {
            IFirmwareUpgradeCallback.DefaultImpls.onError(iFirmwareInterruptedUpgradeCallback, i);
        }

        public static void upgradingProgress(@NotNull IFirmwareInterruptedUpgradeCallback iFirmwareInterruptedUpgradeCallback, @NotNull HMFirmwareType hMFirmwareType, @NotNull Progress progress) {
            IFirmwareUpgradeCallback.DefaultImpls.upgradingProgress(iFirmwareInterruptedUpgradeCallback, hMFirmwareType, progress);
        }
    }

    boolean onInterrupted();
}
