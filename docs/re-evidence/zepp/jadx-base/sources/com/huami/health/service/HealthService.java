package com.huami.health.service;

import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/huami/health/service/HealthService;", "", "Lcom/huami/health/service/HealthServiceType;", "type", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/health/service/HealthEntry;", "loadLatestHealthData", "health-service_release"}, k = 1, mv = {1, 4, 0})
public interface HealthService {
    @NotNull
    Flow<HealthEntry> loadLatestHealthData(@NotNull HealthServiceType type);
}
