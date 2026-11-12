package com.xiaomi.fitness.sleep.trace;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.xiaomi.fitness.sleep.trace.policy.TraceSchedule;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0002\r\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepWorkManagerScheduler;", "Lcom/xiaomi/fitness/sleep/trace/SleepSamplingScheduler;", "<init>", "()V", "performRegisterNextSchedule", "", "context", "Landroid/content/Context;", "current", "Lcom/xiaomi/fitness/sleep/trace/policy/TraceSchedule;", "delay", "", "performEndSchedule", "ScheduleWorker", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepWorkManagerScheduler extends SleepSamplingScheduler {

    @NotNull
    private static final String ID_TRACE_WORK = "services:sleeps:id:sleep_trace_work";

    @NotNull
    private static final String KEY_SCHEDULE = "schedule";

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepWorkManagerScheduler$ScheduleWorker;", "Landroidx/work/Worker;", "Landroidx/work/a$a;", "doWork", "()Landroidx/work/a$a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class ScheduleWorker extends Worker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScheduleWorker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
            super(context, workerParams);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        }

        @Override // androidx.work.Worker
        @NotNull
        public androidx.work.a.AbstractC0080a doWork() {
            String string = getInputData().getString(SleepWorkManagerScheduler.KEY_SCHEDULE);
            if (string == null) {
                throw new IllegalStateException("KEY_SCHEDULE is null");
            }
            try {
                TraceSchedule traceScheduleFrom = TraceSchedule.INSTANCE.from(string);
                SleepTraceScheduler sleepTraceScheduler = SleepTraceScheduler.INSTANCE;
                Context applicationContext = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                sleepTraceScheduler.performSleepTracing(applicationContext, traceScheduleFrom);
                androidx.work.a.AbstractC0080a abstractC0080aC = androidx.work.a.AbstractC0080a.c();
                Intrinsics.checkNotNullExpressionValue(abstractC0080aC, "success(...)");
                return abstractC0080aC;
            } catch (JSONException e) {
                throw new IllegalStateException("Parse TraceSchedule fail", e);
            }
        }
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepSamplingScheduler
    public void performEndSchedule(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        WorkManager.INSTANCE.getInstance(context).cancelUniqueWork(ID_TRACE_WORK);
    }

    @Override // com.xiaomi.fitness.sleep.trace.SleepSamplingScheduler
    public void performRegisterNextSchedule(@NotNull Context context, @NotNull TraceSchedule current, long delay) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(current, "current");
        try {
            WorkManager.INSTANCE.getInstance(context).enqueueUniqueWork(ID_TRACE_WORK, ExistingWorkPolicy.REPLACE, new OneTimeWorkRequest.Builder((Class<? extends androidx.work.a>) ScheduleWorker.class).setInitialDelay(delay, TimeUnit.MILLISECONDS).setInputData(new Data.Builder().putString(KEY_SCHEDULE, TraceSchedule.INSTANCE.toJSON(current)).build()).build());
        } catch (JSONException e) {
            throw new IllegalStateException("traceSchedule toJSON fail", e);
        }
    }
}
