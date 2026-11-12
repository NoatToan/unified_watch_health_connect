package com.xiaomi.fitness.sleep.trace.db;

import android.util.SparseArray;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/db/LogTranslator;", "Lcom/xiaomi/fitness/sleep/trace/db/ILogTranslator;", "<init>", "()V", "mTranslators", "Landroid/util/SparseArray;", "hasInteractive", "", "log", "Lcom/xiaomi/fitness/sleep/trace/db/SleepTraceLog;", "hasMotion", "hasActivity", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LogTranslator implements ILogTranslator {

    @NotNull
    private final SparseArray<ILogTranslator> mTranslators;

    public LogTranslator() {
        SparseArray<ILogTranslator> sparseArray = new SparseArray<>();
        this.mTranslators = sparseArray;
        sparseArray.put(0, new LogTranslatorV1());
        sparseArray.put(1, new LogTranslatorV2());
    }

    @Override // com.xiaomi.fitness.sleep.trace.db.ILogTranslator
    public boolean hasActivity(@NotNull SleepTraceLog log) {
        Intrinsics.checkNotNullParameter(log, "log");
        StringBuilder sb = new StringBuilder();
        sb.append("hasActivity: log=");
        sb.append(log);
        ILogTranslator iLogTranslator = this.mTranslators.get(log.getVersion());
        return iLogTranslator != null && iLogTranslator.hasActivity(log);
    }

    @Override // com.xiaomi.fitness.sleep.trace.db.ILogTranslator
    public boolean hasInteractive(@NotNull SleepTraceLog log) {
        Intrinsics.checkNotNullParameter(log, "log");
        StringBuilder sb = new StringBuilder();
        sb.append("hasInteractive: log=");
        sb.append(log);
        ILogTranslator iLogTranslator = this.mTranslators.get(log.getVersion());
        return iLogTranslator != null && iLogTranslator.hasInteractive(log);
    }

    @Override // com.xiaomi.fitness.sleep.trace.db.ILogTranslator
    public boolean hasMotion(@NotNull SleepTraceLog log) {
        Intrinsics.checkNotNullParameter(log, "log");
        StringBuilder sb = new StringBuilder();
        sb.append("hasMotion: log=");
        sb.append(log);
        ILogTranslator iLogTranslator = this.mTranslators.get(log.getVersion());
        return iLogTranslator != null && iLogTranslator.hasMotion(log);
    }
}
