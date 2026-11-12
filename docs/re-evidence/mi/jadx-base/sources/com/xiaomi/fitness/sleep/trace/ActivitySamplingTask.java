package com.xiaomi.fitness.sleep.trace;

import android.content.Context;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.sleep.trace.db.SleepTraceDao;
import com.xiaomi.fitness.sleep.trace.db.SleepTraceDatabase;
import com.xiaomi.fitness.sleep.trace.db.SleepTraceLog;
import com.xiaomi.fitness.sleep.trace.extensions.TraceExtKt;
import com.xiaomi.fitness.sleep.trace.sampling.SamplingTask;
import com.xiaomi.fitness.sleep.trace.util.SleepTraceUtil;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0002J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u001e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0002R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/ActivitySamplingTask;", "Lcom/xiaomi/fitness/sleep/trace/sampling/SamplingTask;", "", "Lcom/xiaomi/fitness/sleep/trace/db/SleepTraceLog;", "ctx", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", LifecycleConstantKt.ON_START, "", LifecycleConstantKt.ON_STOP, "type", "", "getType", "()Ljava/lang/String;", "checkActivityTime", "addActivityLogIfNeed", "", StatConstants.PARAM_START, "", "current", "addActivityLog", "beginTime", "logs", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActivitySamplingTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivitySamplingTask.kt\ncom/xiaomi/fitness/sleep/trace/ActivitySamplingTask\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,84:1\n37#2:85\n36#2,3:86\n*S KotlinDebug\n*F\n+ 1 ActivitySamplingTask.kt\ncom/xiaomi/fitness/sleep/trace/ActivitySamplingTask\n*L\n40#1:85\n40#1:86,3\n*E\n"})
public final class ActivitySamplingTask extends SamplingTask<List<? extends SleepTraceLog>> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivitySamplingTask(@NotNull Context ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    private final void addActivityLog(long beginTime, List<SleepTraceLog> logs) {
        logs.add(new SleepTraceLog(1, 2, 1, Boolean.TRUE, beginTime));
        SleepTraceUtil.INSTANCE.sleepTrace("has step event " + beginTime, new Object[0]);
    }

    private final List<SleepTraceLog> addActivityLogIfNeed(long start, long current) {
        List<Long> listInvoke = TraceExtKt.getInstance(SleepTracer.INSTANCE).getStepTimes().invoke(Long.valueOf(start + 1), Long.valueOf(current));
        LinkedList linkedList = new LinkedList();
        if (!listInvoke.isEmpty()) {
            long millis = TimeUnit.MINUTES.toMillis(10L);
            Iterator<Long> it = listInvoke.iterator();
            Long lValueOf = null;
            long j = 0;
            while (it.hasNext()) {
                long jLongValue = it.next().longValue();
                if (j == 0 || j - jLongValue > millis) {
                    if (lValueOf != null) {
                        addActivityLog(lValueOf.longValue(), linkedList);
                    }
                    addActivityLog(jLongValue, linkedList);
                    lValueOf = null;
                    j = jLongValue;
                } else {
                    lValueOf = Long.valueOf(jLongValue);
                }
            }
            if (lValueOf != null) {
                addActivityLog(lValueOf.longValue(), linkedList);
            }
        }
        return linkedList;
    }

    private final void checkActivityTime() {
        long timestamp;
        Context applicationContext = getApplicationContext();
        SleepTraceDatabase.Companion companion = SleepTraceDatabase.INSTANCE;
        SleepTraceLog last = companion.get(applicationContext).sleepTraceDao().getLast(1, 2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long millis = TimeUnit.HOURS.toMillis(6L);
        if (last == null || jCurrentTimeMillis <= last.getTimestamp() || jCurrentTimeMillis - last.getTimestamp() >= millis) {
            timestamp = jCurrentTimeMillis - millis;
            SleepTraceUtil.INSTANCE.sleepTrace("last activity time(" + (last != null ? last.getTimestamp() : 0L) + ") with gap " + timestamp, new Object[0]);
        } else {
            timestamp = last.getTimestamp();
            SleepTraceUtil.INSTANCE.sleepTrace("last activity time " + timestamp, new Object[0]);
        }
        List<SleepTraceLog> listAddActivityLogIfNeed = addActivityLogIfNeed(timestamp, jCurrentTimeMillis);
        List<SleepTraceLog> list = listAddActivityLogIfNeed;
        if (!(true ^ list.isEmpty())) {
            inputSamplingData(null);
            return;
        }
        SleepTraceDao sleepTraceDao = companion.get(getApplicationContext()).sleepTraceDao();
        SleepTraceLog[] sleepTraceLogArr = (SleepTraceLog[]) list.toArray(new SleepTraceLog[0]);
        sleepTraceDao.insert((SleepTraceLog[]) Arrays.copyOf(sleepTraceLogArr, sleepTraceLogArr.length));
        inputSamplingData(listAddActivityLogIfNeed);
    }

    @Override // com.xiaomi.fitness.sleep.trace.sampling.SamplingTask
    @NotNull
    public String getType() {
        return "Activity";
    }

    @Override // com.xiaomi.fitness.sleep.trace.sampling.SamplingTask
    public void onStart() {
        checkActivityTime();
    }

    @Override // com.xiaomi.fitness.sleep.trace.sampling.SamplingTask
    public void onStop() {
    }
}
