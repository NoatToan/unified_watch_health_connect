package com.huami.sync.job;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sync.job.Poller;
import com.huami.watch.companion.mediac.Command;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010+J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u001e\u0010\t\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/huami/sync/job/Poller;", "", "", "loop", Command.STOP, "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "a", "Ljava/util/concurrent/ScheduledExecutorService;", "executor", "Ljava/util/concurrent/ScheduledFuture;", "b", "Ljava/util/concurrent/ScheduledFuture;", "future", "", "c", "J", "getInitialDelay", "()J", "setInitialDelay", "(J)V", "initialDelay", GoogleApiAvailabilityLight.a, "getPeriod", "setPeriod", TypedValues.CycleType.S_WAVE_PERIOD, "Ljava/util/concurrent/TimeUnit;", "e", "Ljava/util/concurrent/TimeUnit;", "getTimeUnit", "()Ljava/util/concurrent/TimeUnit;", "setTimeUnit", "(Ljava/util/concurrent/TimeUnit;)V", "timeUnit", "Lkotlin/Function0;", "f", "Lkotlin/jvm/functions/Function0;", "getAction", "()Lkotlin/jvm/functions/Function0;", "setAction", "(Lkotlin/jvm/functions/Function0;)V", "action", "<init>", "()V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final class Poller {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private ScheduledFuture<?> future;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long initialDelay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long period;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private TimeUnit timeUnit = TimeUnit.MILLISECONDS;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private Function0<Unit> action = a.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Poller poller) {
        poller.getAction().invoke();
    }

    @NotNull
    public final Function0<Unit> getAction() {
        return this.action;
    }

    public final long getInitialDelay() {
        return this.initialDelay;
    }

    public final long getPeriod() {
        return this.period;
    }

    @NotNull
    public final TimeUnit getTimeUnit() {
        return this.timeUnit;
    }

    public final void loop() {
        this.future = this.executor.scheduleWithFixedDelay(new Runnable() { // from class: o16
            @Override // java.lang.Runnable
            public final void run() {
                Poller.b(this.a);
            }
        }, this.initialDelay, this.period, this.timeUnit);
    }

    public final void setAction(@NotNull Function0<Unit> function0) {
        this.action = function0;
    }

    public final void setInitialDelay(long j) {
        this.initialDelay = j;
    }

    public final void setPeriod(long j) {
        this.period = j;
    }

    public final void setTimeUnit(@NotNull TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public final void stop() {
        ScheduledFuture<?> scheduledFuture = this.future;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        scheduledFuture.cancel(true);
    }
}
