package com.xiaomi.fitness.sleep.trace;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.AlarmManagerExtKt;
import com.xiaomi.fitness.common.extensions.PendingIntentExtKt;
import com.xiaomi.fitness.sleep.trace.SleepTraceScheduler;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzeEngine;
import com.xiaomi.fitness.sleep.trace.db.SleepReport;
import com.xiaomi.fitness.sleep.trace.extensions.LogExtKt;
import com.xiaomi.fitness.sleep.trace.extensions.TraceInternalExtKt;
import com.xiaomi.fitness.sleep.trace.model.UserSleepModel;
import com.xiaomi.fitness.sleep.trace.policy.TraceSchedule;
import com.xiaomi.fitness.sleep.trace.util.SleepTraceUtil;
import com.xiaomi.fitness.sleep.trace.util.TradingSession;
import com.xiaomi.fitness.sleep.trace.util.WaitingHelper;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001,B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010H\u0007J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0014H\u0007J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u001a\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007J\u000e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0014J\u0010\u0010!\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0014H\u0007J\u0010\u0010#\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010$\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010H\u0007J\b\u0010%\u001a\u00020\u0012H\u0002J\u0018\u0010&\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0010H\u0003J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010)\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001a\u0010+\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepTraceScheduler;", "", "<init>", "()V", "SESSION_SLEEP_TRACE", "", "sSchedulerImpl", "Lcom/xiaomi/fitness/sleep/trace/SleepAlarmScheduler;", "sTraceLock", "sFirstInitFlag", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mFirstInitLock", "Ljava/lang/Object;", "sRestartIntent", "Landroid/app/PendingIntent;", "isInitialing", "", "init", "", "context", "Landroid/content/Context;", "enable", StatConstants.PARAM_START, "endSleepTrace", "app", BroadcastsKt.SILENT_PUSHING_STOP, "performSleepTracing", "schedule", "Lcom/xiaomi/fitness/sleep/trace/policy/TraceSchedule;", "beginSleepTrace", "registerNextSleepTrace", "startGenerateSleepReport", "ctx", "isDisable", "isSleepTracing", "getRestoreIntent", "onSleepTraceConfigChange", "waitInitDone", "performStart", "updateAlarm", "getBeginTracePendingIntent", "performStop", "unregisterNextSleepTrace", "performScheduling", "GenerateReportCallback", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepTraceScheduler {

    @NotNull
    private static final String SESSION_SLEEP_TRACE = "session:sleep:trace";
    private static volatile boolean isInitialing;

    @Nullable
    private static volatile PendingIntent sRestartIntent;

    @NotNull
    public static final SleepTraceScheduler INSTANCE = new SleepTraceScheduler();

    @NotNull
    private static final SleepAlarmScheduler sSchedulerImpl = new SleepAlarmScheduler();

    @NotNull
    private static final Object sTraceLock = new Object();

    @NotNull
    private static final AtomicBoolean sFirstInitFlag = new AtomicBoolean();

    @NotNull
    private static final Object mFirstInitLock = new Object();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepTraceScheduler$GenerateReportCallback;", "Lcom/xiaomi/fitness/sleep/trace/OnResult;", "Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;", "mContext", "Landroid/content/Context;", "mDateTimeMillis", "", "mRestart", "", "<init>", "(Landroid/content/Context;JZ)V", "onResult", "", "sleepReport", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GenerateReportCallback implements OnResult<SleepReport> {

        @NotNull
        private final Context mContext;
        private final long mDateTimeMillis;
        private boolean mRestart;

        public GenerateReportCallback(@NotNull Context mContext, long j, boolean z) {
            Intrinsics.checkNotNullParameter(mContext, "mContext");
            this.mContext = mContext;
            this.mDateTimeMillis = j;
            this.mRestart = z;
        }

        @Override // com.xiaomi.fitness.sleep.trace.OnResult
        public void onResult(@Nullable SleepReport sleepReport) {
            if (this.mRestart) {
                this.mRestart = false;
                SleepAnalyzeEngine.INSTANCE.get().startGenerateReport(this.mContext, this.mDateTimeMillis, this);
                return;
            }
            if (sleepReport == null || sleepReport == SleepReport.INSTANCE.empty()) {
                SleepTraceUtil.INSTANCE.sleepTrace("no sleep report generated!", new Object[0]);
            } else {
                SleepTraceUtil.INSTANCE.sleepTrace("sleep report generated: " + sleepReport.getSleepTime() + " -- " + sleepReport.getWakeTime(), new Object[0]);
            }
            TraceInternalExtKt.getInstance(SleepTracerInternal.INSTANCE).notifySleepReport(sleepReport);
        }
    }

    private SleepTraceScheduler() {
    }

    private final PendingIntent getBeginTracePendingIntent(Context context) {
        Intent intentPutExtra = new Intent(ActionManager.ACTION_BEGIN_TRACE).addCategory(ActionManager.CATEGORY_SLEEP_TRACE).putExtra(ActionManager.EXTRA_INTENT_TIMESTAMP, System.currentTimeMillis());
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return PendingIntentExtKt.getForegroundServicePendingIntent$default(context, 0, intentPutExtra, 0, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1(boolean z, Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        try {
            Object obj = mFirstInitLock;
            synchronized (obj) {
                try {
                    boolean zCompareAndSet = sFirstInitFlag.compareAndSet(false, true);
                    if (z) {
                        SleepTraceScheduler sleepTraceScheduler = INSTANCE;
                        sleepTraceScheduler.performStart(context, !zCompareAndSet);
                        sleepTraceScheduler.registerNextSleepTrace(context);
                    } else {
                        INSTANCE.performStop(context);
                    }
                    LogExtKt.logi("init done");
                    obj.notifyAll();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            isInitialing = false;
        } catch (Throwable th2) {
            isInitialing = false;
            throw th2;
        }
    }

    private final boolean performScheduling(Context app, TraceSchedule schedule) {
        LogExtKt.logi("performScheduling: " + schedule);
        TradingSession tradingSession = new TradingSession(app);
        if (!tradingSession.hasSession(SESSION_SLEEP_TRACE)) {
            return false;
        }
        TradingSession.Session sessionRequire = tradingSession.require(SESSION_SLEEP_TRACE);
        PendingIntent restoreIntent = getRestoreIntent(app);
        Intrinsics.checkNotNull(restoreIntent);
        sessionRequire.beginTransaction(restoreIntent);
        boolean z = true;
        try {
            ScheduleStatus scheduleStatus = sSchedulerImpl.onScheduling(app, schedule).get();
            Objects.requireNonNull(scheduleStatus, "Invalid status");
            ScheduleStatus scheduleStatus2 = scheduleStatus;
            if (!scheduleStatus2.hasNextSchedule()) {
                tradingSession.release(SESSION_SLEEP_TRACE);
                if (scheduleStatus2.getIsInterrupt()) {
                    TraceInternalExtKt.getInstance(SleepTracerInternal.INSTANCE).notifySleepReport(null);
                } else {
                    SleepTraceUtil.INSTANCE.sleepTrace("Schedule interrupt, start generate report.", new Object[0]);
                    startGenerateSleepReport(app);
                }
                z = false;
            }
            sessionRequire.endTransaction();
        } catch (Exception e) {
            SleepTraceUtil.INSTANCE.throwIfDebug(e, "Get schedule status failure.", new Object[0]);
        }
        return z;
    }

    private final void performStart(Context context, boolean updateAlarm) {
        int iRequireSleepState = UserSleepModel.INSTANCE.getInstance().requireSleepState(context, System.currentTimeMillis());
        SleepTraceUtil.INSTANCE.sleepTrace("Sleep trace scheduler start, " + iRequireSleepState, new Object[0]);
        if (iRequireSleepState == 0) {
            SleepTraceActionHelper.INSTANCE.dispatchActionStopTrace(context);
        } else if (iRequireSleepState == 2) {
            beginSleepTrace(context);
            SleepTraceActionHelper.INSTANCE.dispatchActionPerformSleepTrace(context);
        } else {
            if (iRequireSleepState != 3) {
                throw new IllegalStateException("please check this state");
            }
            SleepTraceActionHelper.INSTANCE.dispatchActionPerformSleepTrace(context);
        }
        if (updateAlarm) {
            registerNextSleepTrace(context);
        }
    }

    private final void performStop(Context context) {
        unregisterNextSleepTrace(context);
        SleepTraceActionHelper.INSTANCE.dispatchActionStopTrace(context);
        SleepTraceUtil.INSTANCE.sleepTrace("Sleep trace scheduler stop", new Object[0]);
    }

    private final void unregisterNextSleepTrace(Context context) {
        Object systemService = context.getSystemService(DialWidgetType.ALARM);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        ((AlarmManager) systemService).cancel(getBeginTracePendingIntent(context));
    }

    private final void waitInitDone() {
        WaitingHelper.startWait$default(new WaitingHelper(mFirstInitLock, new Function0() { // from class: w0n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(SleepTraceScheduler.isInitialing);
            }
        }).setTimeoutMessage("Wait SleepTraceScheduler first init done").setMinWaitTime(50L), TimeUnit.MINUTES.toMillis(1L), false, 2, null);
    }

    public final void beginSleepTrace(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (sTraceLock) {
            try {
                TradingSession tradingSession = new TradingSession(context);
                if (!tradingSession.hasSession(SESSION_SLEEP_TRACE)) {
                    tradingSession.require(SESSION_SLEEP_TRACE);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void endSleepTrace(@NotNull Context app) {
        Intrinsics.checkNotNullParameter(app, "app");
        synchronized (sTraceLock) {
            SleepTraceUtil.INSTANCE.sleepTrace("--Tracing stop--", new Object[0]);
            TradingSession tradingSession = new TradingSession(app);
            if (tradingSession.hasSession(SESSION_SLEEP_TRACE)) {
                sSchedulerImpl.onStopSchedule(app);
                tradingSession.release(SESSION_SLEEP_TRACE);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Nullable
    public final PendingIntent getRestoreIntent(@NotNull Context context) {
        PendingIntent pendingIntent;
        Intrinsics.checkNotNullParameter(context, "context");
        if (sRestartIntent != null) {
            return sRestartIntent;
        }
        synchronized (SleepTraceScheduler.class) {
            Intent intentPutExtra = new Intent(context, (Class<?>) SleepTraceService.class).setAction(ActionManager.ACTION_RESTART_TRACE).addCategory(ActionManager.CATEGORY_SLEEP_TRACE).putExtra(ActionManager.EXTRA_INTENT_TIMESTAMP, System.currentTimeMillis());
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            sRestartIntent = PendingIntentExtKt.getForegroundServicePendingIntent$default(context, 0, intentPutExtra, 0, 4, null);
            pendingIntent = sRestartIntent;
        }
        return pendingIntent;
    }

    public final void init(@NotNull final Context context, final boolean enable) {
        Intrinsics.checkNotNullParameter(context, "context");
        isInitialing = true;
        ExecutorHelper.runInBackground(new Runnable() { // from class: v0n
            @Override // java.lang.Runnable
            public final void run() {
                SleepTraceScheduler.init$lambda$1(enable, context);
            }
        });
    }

    public final boolean isDisable(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return !SleepTraceConfiguration.INSTANCE.isEnable(context);
    }

    public final boolean isSleepTracing(@NotNull Context app) {
        boolean zHasSession;
        Intrinsics.checkNotNullParameter(app, "app");
        synchronized (sTraceLock) {
            zHasSession = new TradingSession(app).hasSession(SESSION_SLEEP_TRACE);
        }
        return zHasSession;
    }

    public final void onSleepTraceConfigChange(@NotNull Context context, boolean enable) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (enable) {
            start(context);
        } else {
            stop(context);
        }
    }

    public final boolean performSleepTracing(@NotNull Context app, @Nullable TraceSchedule schedule) {
        Intrinsics.checkNotNullParameter(app, "app");
        SleepTraceUtil.INSTANCE.sleepTrace("--Tracing start--", new Object[0]);
        if (!isDisable(app)) {
            return performScheduling(app, schedule);
        }
        endSleepTrace(app);
        return false;
    }

    public final void registerNextSleepTrace(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        long nextSleepTime = UserSleepModel.INSTANCE.getNextSleepTime();
        PendingIntent beginTracePendingIntent = getBeginTracePendingIntent(context);
        SleepTraceUtil.INSTANCE.sleepTrace("Register begin trace alarm at " + nextSleepTime, new Object[0]);
        AlarmManagerExtKt.setExactAndAllowWhileIdleIfCan$default(context, nextSleepTime, beginTracePendingIntent, 0, 4, null);
    }

    public final void start(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        waitInitDone();
        if (isDisable(context)) {
            SleepTraceUtil.INSTANCE.sleepTrace("sleep trace disabled, start break.", new Object[0]);
        } else {
            performStart(context, true);
        }
    }

    public final void startGenerateSleepReport(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        SleepTraceUtil.INSTANCE.sleepTrace("Start generate sleep report...", new Object[0]);
        SleepAnalyzeEngine sleepAnalyzeEngine = SleepAnalyzeEngine.INSTANCE.get();
        long jCurrentTimeMillis = System.currentTimeMillis();
        sleepAnalyzeEngine.startGenerateReport(ctx, jCurrentTimeMillis, new GenerateReportCallback(ctx, jCurrentTimeMillis, sleepAnalyzeEngine.isGenerating(jCurrentTimeMillis)));
        TraceInternalExtKt.getInstance(SleepTracerInternal.INSTANCE).notifySleepState(false, 4);
    }

    public final void stop(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        waitInitDone();
        performStop(context);
    }
}
