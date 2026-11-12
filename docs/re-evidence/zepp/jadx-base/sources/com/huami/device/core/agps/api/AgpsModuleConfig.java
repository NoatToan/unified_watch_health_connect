package com.huami.device.core.agps.api;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/device/core/agps/api/AgpsModuleConfig;", "", "Lcom/huami/device/core/agps/api/AgpsLogger;", "a", "Lcom/huami/device/core/agps/api/AgpsLogger;", "getLogger", "()Lcom/huami/device/core/agps/api/AgpsLogger;", "setLogger", "(Lcom/huami/device/core/agps/api/AgpsLogger;)V", "logger", "<init>", "()V", "agps-api_release"}, k = 1, mv = {1, 4, 0})
public final class AgpsModuleConfig {
    public static final AgpsModuleConfig INSTANCE = new AgpsModuleConfig();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static AgpsLogger logger = new AgpsLogger() { // from class: com.huami.device.core.agps.api.AgpsModuleConfig$logger$1
        @Override // com.huami.device.core.agps.api.AgpsLogger
        public void onProgress(@NotNull String message, int progress) {
        }
    };

    private AgpsModuleConfig() {
    }

    @NotNull
    public final AgpsLogger getLogger() {
        return logger;
    }

    public final void setLogger(@NotNull AgpsLogger agpsLogger) {
        logger = agpsLogger;
    }
}
