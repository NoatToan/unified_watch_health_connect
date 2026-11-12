package com.xiaomi.fitness.sleep.trace.db;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/db/LogTranslatorV1;", "Lcom/xiaomi/fitness/sleep/trace/db/ILogTranslator;", "<init>", "()V", "hasInteractive", "", "log", "Lcom/xiaomi/fitness/sleep/trace/db/SleepTraceLog;", "hasMotion", "hasActivity", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LogTranslatorV1 implements ILogTranslator {
    @Override // com.xiaomi.fitness.sleep.trace.db.ILogTranslator
    public boolean hasActivity(@NotNull SleepTraceLog log) {
        Intrinsics.checkNotNullParameter(log, "log");
        return false;
    }

    @Override // com.xiaomi.fitness.sleep.trace.db.ILogTranslator
    public boolean hasInteractive(@NotNull SleepTraceLog log) {
        Intrinsics.checkNotNullParameter(log, "log");
        return log.getEvent() == 2;
    }

    @Override // com.xiaomi.fitness.sleep.trace.db.ILogTranslator
    public boolean hasMotion(@NotNull SleepTraceLog log) {
        Intrinsics.checkNotNullParameter(log, "log");
        return log.getEvent() == 1;
    }
}
