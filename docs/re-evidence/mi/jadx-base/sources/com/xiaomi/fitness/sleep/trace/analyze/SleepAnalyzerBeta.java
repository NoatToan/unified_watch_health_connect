package com.xiaomi.fitness.sleep.trace.analyze;

import android.content.Context;
import com.xiaomi.fitness.sleep.trace.db.LogTranslator;
import com.xiaomi.fitness.sleep.trace.db.SleepTraceDatabase;
import com.xiaomi.fitness.sleep.trace.db.SleepTraceLog;
import com.xiaomi.fitness.sleep.trace.model.SleepPeriodInfo;
import com.xiaomi.fitness.sleep.trace.model.UserSleepModel;
import com.xiaomi.fitness.sleep.trace.util.SleepTraceUtil;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014¢\u0006\u0002\u0010\u0014J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0007H\u0014J\u0018\u0010\u001f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/analyze/SleepAnalyzerBeta;", "Lcom/xiaomi/fitness/sleep/trace/analyze/SleepStageAnalyzer;", "<init>", "()V", "mTranslator", "Lcom/xiaomi/fitness/sleep/trace/db/LogTranslator;", "mAwakeTime", "", "mLastStage", "", "mLastStageTime", "onParseSleepStage", "", "Lcom/xiaomi/fitness/sleep/trace/analyze/SleepTracePoint;", "appContext", "Landroid/content/Context;", "log", "Lcom/xiaomi/fitness/sleep/trace/db/SleepTraceLog;", "factory", "Lcom/xiaomi/fitness/sleep/trace/analyze/SleepTracePoint$RecyclerFactory;", "(Landroid/content/Context;Lcom/xiaomi/fitness/sleep/trace/db/SleepTraceLog;Lcom/xiaomi/fitness/sleep/trace/analyze/SleepTracePoint$RecyclerFactory;)[Lcom/xiaomi/fitness/sleep/trace/analyze/SleepTracePoint;", "name", "", "getName", "()Ljava/lang/String;", "version", "getVersion", "()I", "onLoadSleepTraceLog", "", "dateTimeMillis", "parseSleepLogStage", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepAnalyzerBeta.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAnalyzerBeta.kt\ncom/xiaomi/fitness/sleep/trace/analyze/SleepAnalyzerBeta\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,97:1\n37#2:98\n36#2,3:99\n37#2:102\n36#2,3:103\n37#2:106\n36#2,3:107\n*S KotlinDebug\n*F\n+ 1 SleepAnalyzerBeta.kt\ncom/xiaomi/fitness/sleep/trace/analyze/SleepAnalyzerBeta\n*L\n41#1:98\n41#1:99,3\n48#1:102\n48#1:103,3\n57#1:106\n57#1:107,3\n*E\n"})
public final class SleepAnalyzerBeta extends SleepStageAnalyzer {

    @NotNull
    public static final String NAME_BETA = "beta";
    private static final long NO_DATA = -1;
    private int mLastStage;
    private long mLastStageTime;
    private static final long AWAKE_WINDOW = TimeUnit.MINUTES.toMillis(5);

    @NotNull
    private final LogTranslator mTranslator = new LogTranslator();
    private long mAwakeTime = -1;

    private final int parseSleepLogStage(Context appContext, SleepTraceLog log) {
        if (this.mTranslator.hasMotion(log) || this.mTranslator.hasInteractive(log)) {
            return 6;
        }
        int iRequireSleepState = UserSleepModel.INSTANCE.getInstance().requireSleepState(appContext, log.getTimestamp());
        if (iRequireSleepState == 2 && this.mTranslator.hasActivity(log)) {
            return 6;
        }
        return (iRequireSleepState == 2 || iRequireSleepState == 3) ? 8 : 0;
    }

    @Override // com.xiaomi.fitness.sleep.trace.analyze.SleepStageAnalyzer, com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzer
    @NotNull
    public String getName() {
        return NAME_BETA;
    }

    @Override // com.xiaomi.fitness.sleep.trace.analyze.SleepStageAnalyzer, com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzer
    public int getVersion() {
        return 7;
    }

    @Override // com.xiaomi.fitness.sleep.trace.analyze.SleepStageAnalyzer
    @NotNull
    public List<SleepTraceLog> onLoadSleepTraceLog(@NotNull Context appContext, long dateTimeMillis) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        SleepPeriodInfo sleepPeriodInfoRequireRecentSleepPeriod = UserSleepModel.INSTANCE.getInstance().requireRecentSleepPeriod(appContext, dateTimeMillis);
        long earliestSleepTime = sleepPeriodInfoRequireRecentSleepPeriod.getEarliestSleepTime();
        long latestWakeupTime = sleepPeriodInfoRequireRecentSleepPeriod.getLatestWakeupTime();
        SleepTraceUtil.INSTANCE.sleepTrace("sleep trace log form " + earliestSleepTime + " to " + latestWakeupTime, new Object[0]);
        return SleepTraceDatabase.INSTANCE.get(appContext).sleepTraceDao().query(1, earliestSleepTime, latestWakeupTime);
    }

    @Override // com.xiaomi.fitness.sleep.trace.analyze.SleepStageAnalyzer
    @NotNull
    public SleepTracePoint[] onParseSleepStage(@NotNull Context appContext, @NotNull SleepTraceLog log, @NotNull SleepTracePoint.RecyclerFactory factory) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(log, "log");
        Intrinsics.checkNotNullParameter(factory, "factory");
        int i = this.mLastStage;
        long j = this.mLastStageTime;
        this.mLastStage = 0;
        this.mLastStageTime = 0L;
        int sleepLogStage = parseSleepLogStage(appContext, log);
        LinkedList linkedList = new LinkedList();
        long timestamp = log.getTimestamp();
        long j2 = this.mAwakeTime;
        if (j2 == -1) {
            if (sleepLogStage == 6) {
                this.mAwakeTime = timestamp;
            }
            linkedList.add(factory.obtain().inflate(sleepLogStage, timestamp));
            return (SleepTracePoint[]) linkedList.toArray(new SleepTracePoint[0]);
        }
        if (timestamp > j2) {
            if (timestamp - j2 < AWAKE_WINDOW) {
                this.mLastStage = sleepLogStage;
                this.mLastStageTime = timestamp;
                linkedList.add(factory.obtain().inflate(6, timestamp - 1));
                return (SleepTracePoint[]) linkedList.toArray(new SleepTracePoint[0]);
            }
            if (i != 0 && j != 0) {
                linkedList.add(factory.obtain().inflate(i, j));
            }
            linkedList.add(factory.obtain().inflate(sleepLogStage, timestamp));
        }
        this.mAwakeTime = -1L;
        return (SleepTracePoint[]) linkedList.toArray(new SleepTracePoint[0]);
    }
}
