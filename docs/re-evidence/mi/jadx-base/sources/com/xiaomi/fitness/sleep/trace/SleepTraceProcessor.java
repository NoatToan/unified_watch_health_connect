package com.xiaomi.fitness.sleep.trace;

import android.content.Context;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.xiaomi.fitness.sleep.trace.extensions.LogExtKt;
import com.xiaomi.fitness.sleep.trace.model.UserSleepModel;
import com.xiaomi.fitness.sleep.trace.util.SleepTraceUtil;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepTraceProcessor;", "Lcom/xiaomi/fitness/sleep/trace/IProcessor;", "<init>", "()V", "onHandle", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "onPerformTraceStop", "onActionBegin", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepTraceProcessor implements IProcessor {

    @NotNull
    private static final String ID_DEVICE_IDLE = "id_device_idle";

    @NotNull
    private static final String ID_WAKEUP = "services.sleep:wakeup";

    private final void onActionBegin(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long latestWakeupTime = UserSleepModel.INSTANCE.getInstance().requireRecentSleepPeriod(context, jCurrentTimeMillis).getLatestWakeupTime();
        long j = latestWakeupTime - jCurrentTimeMillis;
        if (j > 0) {
            SleepTraceUtil.INSTANCE.sleepTrace("register latest wake up task at " + latestWakeupTime, new Object[0]);
            WorkManager.INSTANCE.getInstance(context).enqueueUniqueWork(ID_WAKEUP, ExistingWorkPolicy.REPLACE, new OneTimeWorkRequest.Builder((Class<? extends androidx.work.a>) WakeupWork.class).setInitialDelay(j, TimeUnit.MILLISECONDS).build());
        }
    }

    private final void onPerformTraceStop(Context context) {
        LogExtKt.logi("finish sleep trace");
        WorkManager.Companion companion = WorkManager.INSTANCE;
        companion.getInstance(context).cancelUniqueWork(ID_WAKEUP);
        companion.getInstance(context).cancelUniqueWork(ID_DEVICE_IDLE);
        SleepTraceScheduler.INSTANCE.endSleepTrace(context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (r0.equals(com.xiaomi.fitness.sleep.trace.ActionManager.ACTION_EXECUTE_TRACE) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cb, code lost:
    
        if (r0.equals(com.xiaomi.fitness.sleep.trace.ActionManager.ACTION_RESTART_TRACE) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e6, code lost:
    
        r8 = r8.getByteArrayExtra(com.xiaomi.fitness.sleep.trace.ActionManager.EXTRA_TRACE_SCHEDULE_DATA);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ea, code lost:
    
        if (r8 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ec, code lost:
    
        r1 = com.xiaomi.fitness.sleep.trace.policy.TraceSchedule.INSTANCE.from(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f2, code lost:
    
        com.xiaomi.fitness.sleep.trace.util.SleepTraceUtil.INSTANCE.sleepTrace("Trace schedule: " + r1, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010e, code lost:
    
        if (com.xiaomi.fitness.sleep.trace.SleepTraceScheduler.INSTANCE.performSleepTracing(r7, r1) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0110, code lost:
    
        onPerformTraceStop(r7);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.xiaomi.fitness.sleep.trace.IProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onHandle(@org.jetbrains.annotations.NotNull android.content.Context r7, @org.jetbrains.annotations.NotNull android.content.Intent r8) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.sleep.trace.SleepTraceProcessor.onHandle(android.content.Context, android.content.Intent):void");
    }
}
