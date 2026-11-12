package com.xiaomi.fitness.sleep.trace.analyze;

import android.content.Context;
import com.xiaomi.fitness.sleep.trace.db.SleepTraceDatabase;
import com.xiaomi.fitness.sleep.trace.db.SleepTraceLog;
import com.xiaomi.fitness.sleep.trace.model.SleepPeriodInfo;
import com.xiaomi.fitness.sleep.trace.model.UserSleepModel;
import com.xiaomi.fitness.sleep.trace.util.SleepTraceUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014¢\u0006\u0002\u0010\rJ\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0015R\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/analyze/SleepAnalyzerAlpha;", "Lcom/xiaomi/fitness/sleep/trace/analyze/SleepStageAnalyzer;", "<init>", "()V", "onParseSleepStage", "", "Lcom/xiaomi/fitness/sleep/trace/analyze/SleepTracePoint;", "appContext", "Landroid/content/Context;", "log", "Lcom/xiaomi/fitness/sleep/trace/db/SleepTraceLog;", "factory", "Lcom/xiaomi/fitness/sleep/trace/analyze/SleepTracePoint$RecyclerFactory;", "(Landroid/content/Context;Lcom/xiaomi/fitness/sleep/trace/db/SleepTraceLog;Lcom/xiaomi/fitness/sleep/trace/analyze/SleepTracePoint$RecyclerFactory;)[Lcom/xiaomi/fitness/sleep/trace/analyze/SleepTracePoint;", "name", "", "getName", "()Ljava/lang/String;", "version", "", "getVersion", "()I", "onLoadSleepTraceLog", "", "dateTimeMillis", "", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepAnalyzerAlpha extends SleepStageAnalyzer {

    @NotNull
    public static final String NAME_ALPHA = "alpha";

    @Override // com.xiaomi.fitness.sleep.trace.analyze.SleepStageAnalyzer, com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzer
    @NotNull
    public String getName() {
        return NAME_ALPHA;
    }

    @Override // com.xiaomi.fitness.sleep.trace.analyze.SleepStageAnalyzer, com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzer
    public int getVersion() {
        return 8;
    }

    @Override // com.xiaomi.fitness.sleep.trace.analyze.SleepStageAnalyzer
    @NotNull
    public List<SleepTraceLog> onLoadSleepTraceLog(@NotNull Context appContext, long dateTimeMillis) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        SleepPeriodInfo sleepPeriodInfoRequireRecentSleepPeriod = UserSleepModel.INSTANCE.getInstance().requireRecentSleepPeriod(appContext, dateTimeMillis);
        return SleepTraceDatabase.INSTANCE.get(appContext).sleepTraceDao().query(0, sleepPeriodInfoRequireRecentSleepPeriod.getEarliestSleepTime(), sleepPeriodInfoRequireRecentSleepPeriod.getLatestWakeupTime());
    }

    @Override // com.xiaomi.fitness.sleep.trace.analyze.SleepStageAnalyzer
    @NotNull
    public SleepTracePoint[] onParseSleepStage(@NotNull Context appContext, @NotNull SleepTraceLog log, @NotNull SleepTracePoint.RecyclerFactory factory) {
        int i;
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(log, "log");
        Intrinsics.checkNotNullParameter(factory, "factory");
        int event = log.getEvent();
        if (event == 1 || event == 2) {
            i = 6;
        } else if (event != 3) {
            SleepTraceUtil.INSTANCE.throwIfDebug(null, "New sleep event %s, please check", Integer.valueOf(log.getEvent()));
            i = 0;
        } else {
            i = 8;
        }
        return new SleepTracePoint[]{factory.obtain().inflate(i, log.getTimestamp())};
    }
}
