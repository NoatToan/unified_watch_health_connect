package com.xiaomi.fitness.sleep.behavior.analyze;

import com.xiaomi.fitness.sleep.trace.db.SleepReport;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/analyze/IReportGenerator;", "", "generateReport", "", "report", "Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IReportGenerator {
    void generateReport(@Nullable SleepReport report);
}
