package com.xiaomi.fitness.sleep.trace.util;

import android.os.SystemClock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fJ\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/util/WaitingHelper;", "", "mLock", "Ljava/lang/Object;", "mWaitCondition", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "mTimeoutMessage", "", "mMinWaitTime", "", "setTimeoutMessage", "message", "setMinWaitTime", "time", "startWait", "", "timeout", "throwIfTimeout", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWaitingHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WaitingHelper.kt\ncom/xiaomi/fitness/sleep/trace/util/WaitingHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
public final class WaitingHelper {

    @NotNull
    private final Object mLock;
    private long mMinWaitTime;

    @Nullable
    private String mTimeoutMessage;

    @NotNull
    private final Function0<Boolean> mWaitCondition;

    public WaitingHelper(@NotNull Object mLock, @NotNull Function0<Boolean> mWaitCondition) {
        Intrinsics.checkNotNullParameter(mLock, "mLock");
        Intrinsics.checkNotNullParameter(mWaitCondition, "mWaitCondition");
        this.mLock = mLock;
        this.mWaitCondition = mWaitCondition;
    }

    public static /* synthetic */ void startWait$default(WaitingHelper waitingHelper, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        waitingHelper.startWait(j, z);
    }

    @NotNull
    public final WaitingHelper setMinWaitTime(long time) {
        this.mMinWaitTime = time;
        return this;
    }

    @NotNull
    public final WaitingHelper setTimeoutMessage(@Nullable String message) {
        this.mTimeoutMessage = message;
        return this;
    }

    @JvmOverloads
    public final void startWait(long j) {
        startWait$default(this, j, false, 2, null);
    }

    @JvmOverloads
    public final void startWait(long timeout, boolean throwIfTimeout) {
        if (timeout <= 0) {
            throw new IllegalArgumentException(("timeout is " + timeout).toString());
        }
        if (this.mWaitCondition.invoke().booleanValue()) {
            Thread.yield();
        }
        if (this.mWaitCondition.invoke().booleanValue()) {
            String str = this.mTimeoutMessage;
            long jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(20L, this.mMinWaitTime);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            synchronized (this.mLock) {
                InterruptedException e = null;
                while (this.mWaitCondition.invoke().booleanValue()) {
                    try {
                        if (SystemClock.elapsedRealtime() - jElapsedRealtime > timeout) {
                            if (!throwIfTimeout) {
                                break;
                            }
                            if (str == null) {
                                str = "Wait timeout";
                            }
                            throw new IllegalStateException(str + ", cause : " + e, e);
                        }
                        try {
                            this.mLock.wait(jCoerceAtLeast);
                        } catch (InterruptedException e2) {
                            e = e2;
                        }
                    } catch (Throwable th) {
                        this.mLock.notifyAll();
                        throw th;
                    }
                }
                this.mLock.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
        }
    }
}
