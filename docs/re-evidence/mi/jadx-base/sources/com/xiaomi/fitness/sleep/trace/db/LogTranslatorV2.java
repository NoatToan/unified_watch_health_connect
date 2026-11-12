package com.xiaomi.fitness.sleep.trace.db;

import java.util.Calendar;
import java.util.GregorianCalendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/db/LogTranslatorV2;", "Lcom/xiaomi/fitness/sleep/trace/db/ILogTranslator;", "<init>", "()V", "mCal", "Ljava/util/Calendar;", "hasInteractive", "", "log", "Lcom/xiaomi/fitness/sleep/trace/db/SleepTraceLog;", "hasMotion", "hasActivity", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LogTranslatorV2 implements ILogTranslator {

    @NotNull
    private final Calendar mCal = new GregorianCalendar();

    @Override // com.xiaomi.fitness.sleep.trace.db.ILogTranslator
    public boolean hasActivity(@NotNull SleepTraceLog log) {
        Intrinsics.checkNotNullParameter(log, "log");
        Float descFloat = log.getDescFloat();
        this.mCal.setTimeInMillis(log.getTimestamp());
        int i = this.mCal.get(11);
        return log.getEvent() == 3 && descFloat != null && descFloat.floatValue() >= ((i < 5 || i > 19) ? 30.0f : 70.0f);
    }

    @Override // com.xiaomi.fitness.sleep.trace.db.ILogTranslator
    public boolean hasInteractive(@NotNull SleepTraceLog log) {
        Intrinsics.checkNotNullParameter(log, "log");
        Boolean descBoolean = log.getDescBoolean();
        return log.getEvent() == 2 && descBoolean != null && descBoolean.booleanValue();
    }

    @Override // com.xiaomi.fitness.sleep.trace.db.ILogTranslator
    public boolean hasMotion(@NotNull SleepTraceLog log) {
        Intrinsics.checkNotNullParameter(log, "log");
        Boolean descBoolean = log.getDescBoolean();
        return log.getEvent() == 1 && descBoolean != null && descBoolean.booleanValue();
    }
}
