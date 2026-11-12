package com.xiaomi.fitness.sport_eco.ftp;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.sport_eco.ftp.StopWatch;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0016B'\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0012\u001a\u00020\u0006H\u0002J\u0006\u0010\u0013\u001a\u00020\u0006J\u0006\u0010\u0014\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/StopWatch;", "", "interval", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", "<init>", "(JLkotlin/jvm/functions/Function1;)V", "duration", "perStart", "preLeft", "state", "Lcom/xiaomi/fitness/sport_eco/ftp/StopWatch$State;", "handler", "Landroid/os/Handler;", "timerRunnable", "Ljava/lang/Runnable;", "timerIncrease", StatConstants.PARAM_START, "pause", BroadcastsKt.SILENT_PUSHING_CANCEL, "State", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StopWatch {
    private long duration;

    @NotNull
    private final Handler handler;
    private final long interval;
    private long perStart;
    private long preLeft;

    @NotNull
    private State state;

    @NotNull
    private final Runnable timerRunnable;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/StopWatch$State;", "", "<init>", "(Ljava/lang/String;I)V", "None", "In", "Pause", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum State {
        None,
        In,
        Pause;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StopWatch(@NotNull Function1<? super Long, Unit> listener) {
        this(0L, listener, 1, null);
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    private final void timerIncrease() {
        this.handler.postDelayed(this.timerRunnable, this.interval);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void timerRunnable$lambda$0(StopWatch this$0, Function1 listener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        long j = this$0.duration + this$0.interval;
        this$0.duration = j;
        listener.invoke2(Long.valueOf(j));
        this$0.perStart = SystemClock.elapsedRealtime();
        this$0.timerIncrease();
    }

    public final void cancel() {
        this.handler.removeCallbacks(this.timerRunnable);
        this.duration = 0L;
        this.perStart = 0L;
        this.preLeft = this.interval;
        this.state = State.None;
    }

    public final void pause() {
        State state = this.state;
        State state2 = State.Pause;
        if (state == state2) {
            return;
        }
        this.state = state2;
        this.handler.removeCallbacks(this.timerRunnable);
        this.preLeft = Math.max(0L, this.interval - (SystemClock.elapsedRealtime() - this.perStart));
    }

    public final void start() {
        State state = this.state;
        State state2 = State.In;
        if (state == state2) {
            return;
        }
        this.state = state2;
        this.handler.postDelayed(this.timerRunnable, this.preLeft);
    }

    @JvmOverloads
    public StopWatch(long j, @NotNull final Function1<? super Long, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.interval = j;
        this.preLeft = j;
        this.state = State.None;
        this.handler = new Handler(Looper.getMainLooper());
        this.timerRunnable = new Runnable() { // from class: bio
            @Override // java.lang.Runnable
            public final void run() {
                StopWatch.timerRunnable$lambda$0(this.f4257a, listener);
            }
        };
    }

    public /* synthetic */ StopWatch(long j, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1000L : j, function1);
    }
}
