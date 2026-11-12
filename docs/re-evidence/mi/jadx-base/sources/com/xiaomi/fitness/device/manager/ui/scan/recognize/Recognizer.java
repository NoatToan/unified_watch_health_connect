package com.xiaomi.fitness.device.manager.ui.scan.recognize;

import com.xiaomi.fitness.device.manager.export.scan.BleDevice;
import kotlin.Metadata;
import no.nordicsemi.android.support.v18.scanner.ScanResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/scan/recognize/Recognizer;", "", "recognize", "Lcom/xiaomi/fitness/device/manager/export/scan/BleDevice;", "scanResult", "Lno/nordicsemi/android/support/v18/scanner/ScanResult;", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Recognizer {
    @Nullable
    BleDevice recognize(@NotNull ScanResult scanResult);
}
