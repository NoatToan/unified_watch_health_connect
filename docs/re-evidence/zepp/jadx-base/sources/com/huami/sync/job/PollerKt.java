package com.huami.sync.job;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\n"}, d2 = {"", "initialDelay", TypedValues.CycleType.S_WAVE_PERIOD, "Ljava/util/concurrent/TimeUnit;", "timeUnit", "Lkotlin/Function0;", "", "action", "Lcom/huami/sync/job/Poller;", "Poll", "realtime_transmission_release"}, k = 2, mv = {1, 5, 1})
public final class PollerKt {
    @NotNull
    public static final Poller Poll(long j, long j2, @NotNull TimeUnit timeUnit, @NotNull Function0<Unit> function0) {
        Poller poller = new Poller();
        poller.setInitialDelay(j);
        poller.setPeriod(j2);
        poller.setTimeUnit(timeUnit);
        poller.setAction(function0);
        poller.loop();
        return poller;
    }

    public static /* synthetic */ Poller Poll$default(long j, long j2, TimeUnit timeUnit, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        return Poll(j3, j2, timeUnit, function0);
    }
}
