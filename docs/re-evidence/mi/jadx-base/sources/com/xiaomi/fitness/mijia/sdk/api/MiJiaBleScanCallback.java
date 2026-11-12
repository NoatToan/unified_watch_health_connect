package com.xiaomi.fitness.mijia.sdk.api;

import com.xiaomi.fitness.mijia.sdk.data.MiJiaScanDevice;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/mijia/sdk/api/MiJiaBleScanCallback;", "", "onScanStarted", "", "onDeviceFounded", "device", "Lcom/xiaomi/fitness/mijia/sdk/data/MiJiaScanDevice;", "onScanStopped", "onScanCanceled", "mijia-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MiJiaBleScanCallback {
    void onDeviceFounded(@NotNull MiJiaScanDevice device);

    void onScanCanceled();

    void onScanStarted();

    void onScanStopped();
}
