package com.xiaomi.eco.reporter;

import com.xiaomi.eco.utils.EcoDataSizeUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f\u001a\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\f\u001a&\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005¨\u0006\u0016"}, d2 = {"time", "", "getTime", "()J", "setTime", "(J)V", "reportServiceConnect", "", "connect", "", "reportCreateCall", "productName", "", "reportAwaitCall", "method", "reportDataTransformSize", "type", "", "subType", "device", "byteArray", "", "eco-common-connect_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DataReporterKt {
    private static long time;

    public static final long getTime() {
        return time;
    }

    public static final void reportAwaitCall(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
    }

    public static final void reportCreateCall(@NotNull String productName) {
        Intrinsics.checkNotNullParameter(productName, "productName");
    }

    public static final void reportDataTransformSize(int i, int i2, @NotNull String device, @NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        EcoDataSizeUtilsKt.memorySize(byteArray);
    }

    public static final void reportServiceConnect(boolean z) {
        if (z) {
            time = System.currentTimeMillis();
        } else {
            if (time == 0) {
                return;
            }
            long jCurrentTimeMillis = ((System.currentTimeMillis() - time) / ((long) 1000)) / ((long) 60);
            time = 0L;
        }
    }

    public static final void setTime(long j) {
        time = j;
    }
}
