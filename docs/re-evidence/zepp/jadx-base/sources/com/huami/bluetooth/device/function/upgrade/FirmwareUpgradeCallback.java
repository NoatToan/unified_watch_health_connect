package com.huami.bluetooth.device.function.upgrade;

import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/device/function/upgrade/FirmwareUpgradeCallback;", "", "", "onPreLoad", "onStart", "Lcom/huami/bluetooth/device/function/upgrade/FirmwareUpgradeResult;", "result", "onComplete", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "onProgress", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface FirmwareUpgradeCallback {
    void onComplete(@NotNull FirmwareUpgradeResult result);

    void onPreLoad();

    void onProgress(@NotNull Progress progress);

    void onStart();
}
