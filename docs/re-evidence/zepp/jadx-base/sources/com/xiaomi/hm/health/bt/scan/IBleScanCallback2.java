package com.xiaomi.hm.health.bt.scan;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/bt/scan/IBleScanCallback2;", "Lcom/xiaomi/hm/health/bt/scan/IBleScanCallback;", "Lcom/xiaomi/hm/health/bt/scan/BleScanOption;", "scanOption", "", "onScanTimeout", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IBleScanCallback2 extends IBleScanCallback {
    void onScanTimeout(@NotNull BleScanOption scanOption);
}
