package com.xiaomi.fitness.common.concurrent;

import com.mi.health.course.export.data.CourseConfigModel;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u001c*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\u000f\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0010J \u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0096\u0002¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0017H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/common/concurrent/FutureImpl;", "V", "Lcom/xiaomi/fitness/common/concurrent/SettableFuture;", "<init>", "()V", "mLock", "Ljava/lang/Object;", "mValue", "Ljava/lang/Object;", "mDone", "", BroadcastsKt.SILENT_PUSHING_CANCEL, "mayInterruptIfRunning", "isCancelled", "isDone", "get", "()Ljava/lang/Object;", "timeout", "", "unit", "Ljava/util/concurrent/TimeUnit;", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "checkInterrupted", "", CourseConfigModel.DevCmd.CMD_ACTION_SET, "v", "(Ljava/lang/Object;)V", "onDone", "Companion", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFutureImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FutureImpl.kt\ncom/xiaomi/fitness/common/concurrent/FutureImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
public class FutureImpl<V> implements SettableFuture<V> {
    private static final long WAIT_NANO = TimeUnit.MILLISECONDS.toNanos(50);
    private volatile boolean mDone;

    @NotNull
    private final Object mLock = new Object();

    @Nullable
    private volatile V mValue;

    private final void checkInterrupted() throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public V get() throws InterruptedException {
        checkInterrupted();
        if (this.mDone) {
            return this.mValue;
        }
        synchronized (this.mLock) {
            while (!this.mDone) {
                try {
                    checkInterrupted();
                    TimeUnit.NANOSECONDS.timedWait(this.mLock, WAIT_NANO);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.mLock.notifyAll();
            Unit unit = Unit.INSTANCE;
        }
        return this.mValue;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.mDone;
    }

    public void onDone() {
    }

    @Override // com.xiaomi.fitness.common.concurrent.SettableFuture
    public void set(V v) {
        synchronized (this.mLock) {
            if (!(!this.mDone)) {
                throw new IllegalStateException("Already set value".toString());
            }
            this.mValue = v;
            this.mDone = true;
            this.mLock.notifyAll();
            onDone();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public V get(long timeout, @NotNull TimeUnit unit) throws InterruptedException, TimeoutException {
        Intrinsics.checkNotNullParameter(unit, "unit");
        checkInterrupted();
        if (this.mDone) {
            return this.mValue;
        }
        if (timeout <= 0) {
            timeout = 0;
        }
        long nanos = unit.toNanos(timeout);
        synchronized (this.mLock) {
            try {
                long jNanoTime = System.nanoTime() + nanos;
                while (!this.mDone) {
                    Thread.yield();
                    if (this.mDone) {
                        break;
                    }
                    checkInterrupted();
                    long jNanoTime2 = jNanoTime - System.nanoTime();
                    if (jNanoTime2 > 0) {
                        TimeUnit.NANOSECONDS.timedWait(this.mLock, Math.min(WAIT_NANO, jNanoTime2));
                    } else {
                        throw new TimeoutException("Future timeout");
                    }
                }
                this.mLock.notifyAll();
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.mValue;
    }
}
