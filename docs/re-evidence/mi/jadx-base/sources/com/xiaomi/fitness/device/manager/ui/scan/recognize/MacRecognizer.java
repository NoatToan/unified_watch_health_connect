package com.xiaomi.fitness.device.manager.ui.scan.recognize;

import com.xiaomi.fitness.device.manager.export.scan.BleDevice;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import no.nordicsemi.android.support.v18.scanner.ScanResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/scan/recognize/MacRecognizer;", "Lcom/xiaomi/fitness/device/manager/ui/scan/recognize/Recognizer;", "mMac", "", "<init>", "(Ljava/lang/String;)V", "recognize", "Lcom/xiaomi/fitness/device/manager/export/scan/BleDevice;", "scanResult", "Lno/nordicsemi/android/support/v18/scanner/ScanResult;", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MacRecognizer implements Recognizer {

    @NotNull
    private final String mMac;

    public MacRecognizer(@NotNull String mMac) {
        Intrinsics.checkNotNullParameter(mMac, "mMac");
        this.mMac = mMac;
    }

    @Override // com.xiaomi.fitness.device.manager.ui.scan.recognize.Recognizer
    @Nullable
    public BleDevice recognize(@NotNull ScanResult scanResult) {
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        String address = scanResult.a().getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
        if (!StringsKt__StringsJVMKt.equals(address, this.mMac, true)) {
            return null;
        }
        String address2 = scanResult.a().getAddress();
        Intrinsics.checkNotNullExpressionValue(address2, "getAddress(...)");
        return new BleDevice(address2, null, 0, null, null, null, 0, false, 254, null);
    }
}
