package com.xiaomi.fitness.sleep.trace.db;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/db/ILogTranslator;", "", "hasInteractive", "", "log", "Lcom/xiaomi/fitness/sleep/trace/db/SleepTraceLog;", "hasMotion", "hasActivity", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ILogTranslator {
    boolean hasActivity(@NotNull SleepTraceLog log);

    boolean hasInteractive(@NotNull SleepTraceLog log);

    boolean hasMotion(@NotNull SleepTraceLog log);
}
