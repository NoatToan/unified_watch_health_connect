package com.xiaomi.fitness.sleep.trace;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.xiaomi.fitness.sleep.trace.util.SleepTraceUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/WakeupWork;", "Landroidx/work/Worker;", "Landroidx/work/a$a;", "doWork", "()Landroidx/work/a$a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WakeupWork extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WakeupWork(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    @Override // androidx.work.Worker
    @NotNull
    public androidx.work.a.AbstractC0080a doWork() {
        SleepTraceUtil.INSTANCE.sleepTrace("Latest wakeup work start.", new Object[0]);
        SleepTraceScheduler sleepTraceScheduler = SleepTraceScheduler.INSTANCE;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        sleepTraceScheduler.start(applicationContext);
        androidx.work.a.AbstractC0080a abstractC0080aC = androidx.work.a.AbstractC0080a.c();
        Intrinsics.checkNotNullExpressionValue(abstractC0080aC, "success(...)");
        return abstractC0080aC;
    }
}
