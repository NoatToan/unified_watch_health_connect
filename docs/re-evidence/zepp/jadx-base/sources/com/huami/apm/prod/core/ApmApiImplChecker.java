package com.huami.apm.prod.core;

import com.huami.apm.prod.core.impl.ApmApiImpl;
import com.huami.apm.prod.core.impl.ApmCrashApiImpl;
import com.huami.apm.prod.service.AbstractApmApi;
import com.huami.apm.prod.service.ApmApi;
import com.huami.apm.prod.service.ApmApiChecker;
import com.huami.apm.prod.service.ApmCrashApi;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/huami/apm/prod/core/ApmApiImplChecker;", "Lcom/huami/apm/prod/service/ApmApiChecker;", "Lcom/huami/apm/prod/service/AbstractApmApi;", "api", "check", "<init>", "()V", "apm-prod-core_release"}, k = 1, mv = {1, 5, 1})
public final class ApmApiImplChecker implements ApmApiChecker {
    @Override // com.huami.apm.prod.service.ApmApiChecker
    @NotNull
    public AbstractApmApi check(@NotNull AbstractApmApi api) {
        if (api instanceof ApmApi) {
            return new ApmApiImpl();
        }
        if (api instanceof ApmCrashApi) {
            return new ApmCrashApiImpl();
        }
        throw new NoWhenBranchMatchedException();
    }
}
