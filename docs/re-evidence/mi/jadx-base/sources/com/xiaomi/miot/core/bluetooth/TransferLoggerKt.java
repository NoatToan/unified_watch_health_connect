package com.xiaomi.miot.core.bluetooth;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"logger", "Lcom/xiaomi/miot/core/bluetooth/TransferLogger;", "getLogger", "()Lcom/xiaomi/miot/core/bluetooth/TransferLogger;", "setLogger", "(Lcom/xiaomi/miot/core/bluetooth/TransferLogger;)V", "miot-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TransferLoggerKt {
    public static TransferLogger logger;

    @NotNull
    public static final TransferLogger getLogger() {
        TransferLogger transferLogger = logger;
        if (transferLogger != null) {
            return transferLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("logger");
        return null;
    }

    public static final void setLogger(@NotNull TransferLogger transferLogger) {
        Intrinsics.checkNotNullParameter(transferLogger, "<set-?>");
        logger = transferLogger;
    }
}
