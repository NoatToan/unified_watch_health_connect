package com.huami.apm.prod.service;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\b\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H&J\u001c\u0010\u000b\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H&J*\u0010\u000e\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH&¨\u0006\u000f"}, d2 = {"Lcom/huami/apm/prod/service/ApmCrashApi;", "Lcom/huami/apm/prod/service/AbstractApmApi;", "", "", "keys", "", "throwable", "", "recordException", "message", "log", "setCustomKeys", "Lkotlin/Function0;", "action", "setTempKey", "apm-prod-service_release"}, k = 1, mv = {1, 5, 1})
public interface ApmCrashApi extends AbstractApmApi {
    void log(@NotNull String message);

    void recordException(@NotNull Map<String, String> keys, @NotNull Throwable throwable);

    void setCustomKeys(@NotNull Map<String, String> keys);

    void setTempKey(@NotNull Map<String, String> keys, @NotNull Function0<Unit> action);
}
