package com.xiaomi.fitness.sleep.di;

import com.xiaomi.fitness.sleep.behavior.collection.CollectionTaskManager;
import com.xiaomi.fitness.sleep.behavior.collection.ICollectionTaskManager;
import com.xiaomi.fitness.sleep.trace.SleepTraceConfigurationImpl;
import com.xiaomi.fitness.sleep.trace.SleepTracerImpl;
import com.xiaomi.fitness.sleep.trace.SleepTracerInternal;
import com.xiaomi.onetrack.c.q;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH'J\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH'¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sleep/di/SleepModule;", "", "<init>", "()V", "bindSleepTracer", "sleepTracerImpl", "Lcom/xiaomi/fitness/sleep/trace/SleepTracerImpl;", "bindSleepTracerInternal", "Lcom/xiaomi/fitness/sleep/trace/SleepTracerInternal;", "bindCollectionTaskManager", "Lcom/xiaomi/fitness/sleep/behavior/collection/ICollectionTaskManager;", "manager", "Lcom/xiaomi/fitness/sleep/behavior/collection/CollectionTaskManager;", "bindConfiguration", q.f13857a, "Lcom/xiaomi/fitness/sleep/trace/SleepTraceConfigurationImpl;", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SleepModule {
    @NotNull
    public abstract ICollectionTaskManager bindCollectionTaskManager(@NotNull CollectionTaskManager manager);

    @NotNull
    public abstract Object bindConfiguration(@NotNull SleepTraceConfigurationImpl config);

    @NotNull
    public abstract Object bindSleepTracer(@NotNull SleepTracerImpl sleepTracerImpl);

    @NotNull
    public abstract SleepTracerInternal bindSleepTracerInternal(@NotNull SleepTracerImpl sleepTracerImpl);
}
