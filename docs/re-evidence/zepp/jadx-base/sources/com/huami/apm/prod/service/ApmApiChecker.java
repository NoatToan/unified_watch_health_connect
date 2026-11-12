package com.huami.apm.prod.service;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/huami/apm/prod/service/ApmApiChecker;", "", "Lcom/huami/apm/prod/service/AbstractApmApi;", "api", "check", "apm-prod-service_release"}, k = 1, mv = {1, 5, 1})
public interface ApmApiChecker {
    @NotNull
    AbstractApmApi check(@NotNull AbstractApmApi api);
}
