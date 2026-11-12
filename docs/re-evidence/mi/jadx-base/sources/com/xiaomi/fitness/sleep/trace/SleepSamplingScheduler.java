package com.xiaomi.fitness.sleep.trace;

import android.content.Context;
import android.os.SystemClock;
import android.util.ArrayMap;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.concurrent.FutureImpl;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sleep.trace.db.LogTranslator;
import com.xiaomi.fitness.sleep.trace.db.SleepTraceLog;
import com.xiaomi.fitness.sleep.trace.extensions.TraceInternalExtKt;
import com.xiaomi.fitness.sleep.trace.model.SleepPeriodInfo;
import com.xiaomi.fitness.sleep.trace.model.UserSleepModel;
import com.xiaomi.fitness.sleep.trace.policy.TraceSchedule;
import com.xiaomi.fitness.sleep.trace.sampling.SamplingCallback;
import com.xiaomi.fitness.sleep.trace.sampling.SamplingSet;
import com.xiaomi.fitness.sleep.trace.util.SleepTraceUtil;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b \u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0017J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H$J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH$J$\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepSamplingScheduler;", "Lcom/xiaomi/fitness/sleep/trace/IScheduler;", "<init>", "()V", "mSchedulePolicy", "Lcom/xiaomi/fitness/sleep/trace/SleepTraceSchedulePolicy;", "onScheduling", "Ljava/util/concurrent/Future;", "Lcom/xiaomi/fitness/sleep/trace/ScheduleStatus;", "context", "Landroid/content/Context;", "schedule", "Lcom/xiaomi/fitness/sleep/trace/policy/TraceSchedule;", "onStopSchedule", "", "performRegisterNextSchedule", "current", "delay", "", "performEndSchedule", "registerNextSchedule", "beginSamplingTime", "notifySleepState", "matchCondition", "", "state", "", "TimedSamplingCallback", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SleepSamplingScheduler implements IScheduler {
    public static final int MIN_DEFAULT = 5000;
    public static final int SAMPLE_MILLIS = 1000;

    @NotNull
    private static final String TAG = "SleepSamplingScheduler";

    @NotNull
    private final SleepTraceSchedulePolicy mSchedulePolicy = new SleepTraceSchedulePolicy();

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0082\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001BC\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J \u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001a2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0006\u0010-\u001a\u00020*J\u000e\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u00020\tJ\u0006\u00100\u001a\u00020*J\u000e\u00101\u001a\u00020*2\u0006\u00102\u001a\u00020\u0012J\u0016\u00103\u001a\u00020*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001a\u00105\u001a\u00020*2\u0006\u00102\u001a\u00020\u00122\b\u00106\u001a\u0004\u0018\u00010\u000eH\u0002J\u001a\u00107\u001a\u0004\u0018\u00010\u000e2\u0006\u00108\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u0012H\u0002R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepSamplingScheduler$TimedSamplingCallback;", "Lcom/xiaomi/fitness/sleep/trace/sampling/SamplingCallback;", "", "Lcom/xiaomi/fitness/sleep/trace/db/SleepTraceLog;", "context", "Landroid/content/Context;", "mSamplingSet", "Lcom/xiaomi/fitness/sleep/trace/sampling/SamplingSet;", "dataCount", "", "future", "Lcom/xiaomi/fitness/common/concurrent/FutureImpl;", "Lcom/xiaomi/fitness/sleep/trace/ScheduleStatus;", "schedule", "Lcom/xiaomi/fitness/sleep/trace/policy/TraceSchedule;", "<init>", "(Lcom/xiaomi/fitness/sleep/trace/SleepSamplingScheduler;Landroid/content/Context;Lcom/xiaomi/fitness/sleep/trace/sampling/SamplingSet;ILcom/xiaomi/fitness/common/concurrent/FutureImpl;Lcom/xiaomi/fitness/sleep/trace/policy/TraceSchedule;)V", "mHasFullData", "", "getMHasFullData", "()Z", "setMHasFullData", "(Z)V", "mContext", "mDataMap", "", "", "", "mDataCount", "mFuture", "mTranslator", "Lcom/xiaomi/fitness/sleep/trace/db/LogTranslator;", "mSchedule", "mSleepState", "isFinished", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mBeginSamplingTime", "", "mStartTime", "mSamplingMonitor", "Ljava/lang/Runnable;", "onCallback", "", "type", "data", "performOnFinish", "startTimedMonitor", "minDuration", "onFinish", "onDeliverResult", "matchSleepCondition", "fastFinishIfNeed", "cutSamplingLogs", "postSleepTraceEventWhenSleepingStage", "sd", "onResult", "requestNext", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSleepSamplingScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepSamplingScheduler.kt\ncom/xiaomi/fitness/sleep/trace/SleepSamplingScheduler$TimedSamplingCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n1#2:326\n*E\n"})
    public final class TimedSamplingCallback implements SamplingCallback<List<? extends SleepTraceLog>> {

        @NotNull
        private final AtomicBoolean isFinished;
        private final long mBeginSamplingTime;

        @NotNull
        private final Context mContext;
        private final int mDataCount;

        @NotNull
        private final Map<String, List<SleepTraceLog>> mDataMap;

        @NotNull
        private final FutureImpl<ScheduleStatus> mFuture;
        private volatile boolean mHasFullData;

        @NotNull
        private final Runnable mSamplingMonitor;

        @NotNull
        private final SamplingSet<List<SleepTraceLog>> mSamplingSet;

        @Nullable
        private final TraceSchedule mSchedule;
        private final int mSleepState;
        private final long mStartTime;

        @NotNull
        private final LogTranslator mTranslator;
        final /* synthetic */ SleepSamplingScheduler this$0;

        public TimedSamplingCallback(@NotNull SleepSamplingScheduler sleepSamplingScheduler, @NotNull Context context, SamplingSet<List<SleepTraceLog>> mSamplingSet, @NotNull int i, @Nullable FutureImpl<ScheduleStatus> future, TraceSchedule traceSchedule) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(mSamplingSet, "mSamplingSet");
            Intrinsics.checkNotNullParameter(future, "future");
            this.this$0 = sleepSamplingScheduler;
            this.mSamplingSet = mSamplingSet;
            Context safeContext = ApplicationExtKt.getSafeContext(context);
            this.mContext = safeContext;
            this.isFinished = new AtomicBoolean();
            this.mSamplingMonitor = new Runnable() { // from class: com.xiaomi.fitness.sleep.trace.SleepSamplingScheduler$TimedSamplingCallback$mSamplingMonitor$1
                private int mTimeoutCount;

                @Override // java.lang.Runnable
                public void run() {
                    int i2 = this.mTimeoutCount + 1;
                    this.mTimeoutCount = i2;
                    boolean mHasFullData = this.this$0.getMHasFullData();
                    StringBuilder sb = new StringBuilder();
                    sb.append("mSamplingMonitor: mTimeoutCount=");
                    sb.append(i2);
                    sb.append(", mHasFullData=");
                    sb.append(mHasFullData);
                    if (this.mTimeoutCount >= 3 || this.this$0.getMHasFullData()) {
                        this.this$0.performOnFinish();
                    } else {
                        ExecutorHelper.postInMain(this, 1000L);
                    }
                }
            };
            this.mDataMap = new ArrayMap(i);
            this.mDataCount = i;
            this.mFuture = future;
            this.mSchedule = traceSchedule;
            this.mTranslator = new LogTranslator();
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.mBeginSamplingTime = jCurrentTimeMillis;
            this.mSleepState = UserSleepModel.INSTANCE.getInstance().requireSleepState(safeContext, jCurrentTimeMillis);
            this.mStartTime = SystemClock.elapsedRealtime();
        }

        private final List<SleepTraceLog> cutSamplingLogs() {
            synchronized (this.mDataMap) {
                if (this.mDataMap.isEmpty()) {
                    return CollectionsKt__CollectionsKt.emptyList();
                }
                LinkedList linkedList = new LinkedList();
                Iterator<List<SleepTraceLog>> it = this.mDataMap.values().iterator();
                while (it.hasNext()) {
                    linkedList.addAll(it.next());
                }
                this.mDataMap.clear();
                return linkedList;
            }
        }

        private final void fastFinishIfNeed(List<SleepTraceLog> data) {
            for (SleepTraceLog sleepTraceLog : data) {
                if (sleepTraceLog.getTimestamp() >= this.mBeginSamplingTime && (this.mTranslator.hasInteractive(sleepTraceLog) || this.mTranslator.hasMotion(sleepTraceLog) || (this.mSleepState == 2 && this.mTranslator.hasActivity(sleepTraceLog)))) {
                    performOnFinish();
                    return;
                }
            }
        }

        private final TraceSchedule onResult(boolean requestNext, boolean matchSleepCondition) {
            ScheduleStatus scheduleStatus = new ScheduleStatus();
            TraceSchedule traceScheduleRegisterNextSchedule = null;
            if (requestNext) {
                traceScheduleRegisterNextSchedule = this.this$0.registerNextSchedule(this.mContext, matchSleepCondition ? this.mSchedule : null, this.mBeginSamplingTime);
                if (traceScheduleRegisterNextSchedule != null) {
                    scheduleStatus.setNextScheduleTime(traceScheduleRegisterNextSchedule.getNextScheduleTime());
                } else {
                    scheduleStatus.setInterrupt(true);
                    this.this$0.performEndSchedule(this.mContext);
                }
            } else {
                scheduleStatus.setInterrupt(false);
                this.this$0.performEndSchedule(this.mContext);
            }
            try {
                this.mFuture.set(scheduleStatus);
            } catch (Exception e) {
                SleepTraceUtil.INSTANCE.throwIfDebug(e, "Set schedule future failure", new Object[0]);
            }
            return traceScheduleRegisterNextSchedule;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void performOnFinish$lambda$2(TimedSamplingCallback this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.onFinish();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0043  */
        private final void postSleepTraceEventWhenSleepingStage(boolean matchSleepCondition, TraceSchedule sd) {
            int i = 4;
            int i2 = 3;
            if (sd != null) {
                long continuousSleepDuration = sd.getContinuousSleepDuration();
                SleepTraceUtil.INSTANCE.sleepTrace("sleep duration " + TimeUnit.MILLISECONDS.toMinutes(continuousSleepDuration) + " min", new Object[0]);
                if (matchSleepCondition) {
                    i = continuousSleepDuration < ((long) SleepAnalyzeContract.INSTANCE.getPrepareSleepDuration()) ? 2 : 3;
                } else if (this.mSleepState != 3) {
                    i = 1;
                }
                i2 = i;
            } else if (matchSleepCondition) {
                matchSleepCondition = true;
            } else {
                if (this.mSleepState != 3) {
                    i = 1;
                }
                i2 = i;
            }
            SleepTraceUtil.INSTANCE.sleepTrace("sleep event: state=" + i2, new Object[0]);
            this.this$0.notifySleepState(matchSleepCondition, i2);
        }

        public final boolean getMHasFullData() {
            return this.mHasFullData;
        }

        @Override // com.xiaomi.fitness.sleep.trace.sampling.SamplingCallback
        public /* bridge */ /* synthetic */ void onCallback(String str, List<? extends SleepTraceLog> list) {
            onCallback2(str, (List<SleepTraceLog>) list);
        }

        public final void onDeliverResult(boolean matchSleepCondition) {
            TraceSchedule traceSchedule = this.mSchedule;
            if (traceSchedule != null) {
                traceSchedule.updateSleepState(matchSleepCondition);
            }
            int i = this.mSleepState;
            if (i == 2) {
                postSleepTraceEventWhenSleepingStage(matchSleepCondition, onResult(true, matchSleepCondition));
                return;
            }
            if (i == 3) {
                postSleepTraceEventWhenSleepingStage(matchSleepCondition, onResult(matchSleepCondition, matchSleepCondition));
                return;
            }
            onResult(false, matchSleepCondition);
            int i2 = matchSleepCondition ? 3 : 4;
            SleepTraceUtil.INSTANCE.sleepTrace("sleep event: matchSleepCondition=" + matchSleepCondition + ", state=" + i2, new Object[0]);
            this.this$0.notifySleepState(matchSleepCondition, i2);
        }

        public final void onFinish() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.mStartTime);
            SleepTraceUtil.INSTANCE.sleepTrace("Finish Sampling, cost " + seconds + " s", new Object[0]);
            List<SleepTraceLog> listCutSamplingLogs = cutSamplingLogs();
            SleepPeriodInfo sleepPeriodInfoRequireRecentSleepPeriod = UserSleepModel.INSTANCE.getInstance().requireRecentSleepPeriod(this.mContext, System.currentTimeMillis());
            TraceSchedule traceSchedule = this.mSchedule;
            long realTimeOffset = traceSchedule != null ? traceSchedule.getRealTimeOffset() : 0L;
            if (realTimeOffset == 0) {
                realTimeOffset = TimeUnit.MINUTES.toMillis(10L);
            }
            long jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(sleepPeriodInfoRequireRecentSleepPeriod.getEarliestSleepTime(), this.mBeginSamplingTime - realTimeOffset);
            boolean zHasInteractive = false;
            boolean zHasMotion = false;
            boolean zHasActivity = false;
            for (SleepTraceLog sleepTraceLog : listCutSamplingLogs) {
                if (sleepTraceLog.getTimestamp() >= jCoerceAtLeast) {
                    if (!zHasInteractive) {
                        zHasInteractive = this.mTranslator.hasInteractive(sleepTraceLog);
                    }
                    if (!zHasMotion) {
                        zHasMotion = this.mTranslator.hasMotion(sleepTraceLog);
                    }
                    if (!zHasActivity) {
                        zHasActivity = this.mTranslator.hasActivity(sleepTraceLog);
                    }
                }
            }
            boolean z = (zHasInteractive || zHasMotion || zHasActivity) ? false : true;
            SleepTraceUtil.INSTANCE.sleepTrace("Sleep condition " + z + ", state " + this.mSleepState + ", itr " + zHasInteractive + ", mtn " + zHasMotion + ", act " + zHasActivity, new Object[0]);
            onDeliverResult(z);
        }

        public final void performOnFinish() {
            if (this.isFinished.compareAndSet(false, true)) {
                ExecutorHelper.INSTANCE.removeFromMain(this.mSamplingMonitor);
                this.mSamplingSet.endSampling();
                ExecutorHelper.runInBackground(new Runnable() { // from class: com.xiaomi.fitness.sleep.trace.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        SleepSamplingScheduler.TimedSamplingCallback.performOnFinish$lambda$2(this.f12905a);
                    }
                });
            }
        }

        public final void setMHasFullData(boolean z) {
            this.mHasFullData = z;
        }

        public final void startTimedMonitor(int minDuration) {
            ExecutorHelper.postInMain(this.mSamplingMonitor, RangesKt___RangesKt.coerceAtLeast(5000, minDuration));
        }

        /* JADX INFO: renamed from: onCallback, reason: avoid collision after fix types in other method */
        public void onCallback2(@NotNull String type, @Nullable List<SleepTraceLog> data) {
            Intrinsics.checkNotNullParameter(type, "type");
            synchronized (this.mDataMap) {
                try {
                    if (this.isFinished.get()) {
                        return;
                    }
                    Logger.i(SleepSamplingScheduler.TAG, "Sampling " + type + ",len " + (data != null ? Integer.valueOf(data.size()) : "empty"));
                    List<SleepTraceLog> list = this.mDataMap.get(type);
                    if (list == null) {
                        this.mDataMap.put(type, data != null ? new LinkedList(data) : new LinkedList());
                    } else if (data != null) {
                        list.addAll(data);
                    }
                    if (this.mDataMap.size() == this.mDataCount) {
                        this.mHasFullData = true;
                    }
                    if (data != null) {
                        fastFinishIfNeed(data);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySleepState(boolean matchCondition, int state) {
        TraceInternalExtKt.getInstance(SleepTracerInternal.INSTANCE).notifySleepState(matchCondition, state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TraceSchedule registerNextSchedule(Context context, TraceSchedule schedule, long beginSamplingTime) {
        TraceSchedule traceScheduleRequireNextSchedule = this.mSchedulePolicy.requireNextSchedule(context, schedule);
        if (traceScheduleRequireNextSchedule == null) {
            SleepTraceUtil.INSTANCE.sleepTrace("Next schedule is non, user until not wakeup", new Object[0]);
            return null;
        }
        traceScheduleRequireNextSchedule.updateTime();
        long scheduleInterval = (beginSamplingTime + traceScheduleRequireNextSchedule.getScheduleInterval()) - System.currentTimeMillis();
        if (scheduleInterval <= 0) {
            scheduleInterval = TimeUnit.SECONDS.toMillis(1L);
        }
        traceScheduleRequireNextSchedule.setNextTriggerTime(System.currentTimeMillis() + scheduleInterval);
        performRegisterNextSchedule(context, traceScheduleRequireNextSchedule, scheduleInterval);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long minutes = timeUnit.toMinutes(scheduleInterval);
        long seconds = timeUnit.toSeconds(scheduleInterval - TimeUnit.MINUTES.toMillis(minutes));
        SleepTraceUtil.INSTANCE.sleepTrace("Next schedule delay: " + minutes + " " + seconds + ", at " + (System.currentTimeMillis() + scheduleInterval), new Object[0]);
        return traceScheduleRequireNextSchedule;
    }

    @Override // com.xiaomi.fitness.sleep.trace.IScheduler
    @NotNull
    public Future<ScheduleStatus> onScheduling(@NotNull Context context, @Nullable TraceSchedule schedule) {
        Intrinsics.checkNotNullParameter(context, "context");
        FutureImpl futureImpl = new FutureImpl();
        SamplingSet samplingSet = new SamplingSet();
        samplingSet.addTask(new ActionSamplingTask(context));
        samplingSet.addTask(new UsageSamplingTask(context));
        samplingSet.addTask(new ActivitySamplingTask(context));
        TimedSamplingCallback timedSamplingCallback = new TimedSamplingCallback(this, context, samplingSet, 3, futureImpl, schedule);
        samplingSet.addSamplingCallback(timedSamplingCallback);
        samplingSet.startSampling();
        timedSamplingCallback.startTimedMonitor(SleepTraceConfiguration.INSTANCE.getTraceDuration());
        return futureImpl;
    }

    @Override // com.xiaomi.fitness.sleep.trace.IScheduler
    public void onStopSchedule(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        performEndSchedule(context);
    }

    public abstract void performEndSchedule(@NotNull Context context);

    public abstract void performRegisterNextSchedule(@NotNull Context context, @NotNull TraceSchedule current, long delay);
}
