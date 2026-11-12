package com.xiaomi.fitness.aggregation.di;

import com.xiaomi.fit.fitness.export.api.ISummarySyncManager;
import com.xiaomi.fitness.aggregation.summary.SummarySyncManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/aggregation/di/SummaryModule;", "", "<init>", "()V", "getSummarySyncManager", "Lcom/xiaomi/fit/fitness/export/api/ISummarySyncManager;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SummaryModule {
    @NotNull
    public final ISummarySyncManager getSummarySyncManager() {
        return SummarySyncManager.INSTANCE.getInstance();
    }
}
