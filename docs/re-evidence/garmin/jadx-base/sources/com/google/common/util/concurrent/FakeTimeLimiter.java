package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class FakeTimeLimiter implements TimeLimiter {
    @Override // com.google.common.util.concurrent.TimeLimiter
    @CanIgnoreReturnValue
    @ParametricNullness
    public <T> T callUninterruptiblyWithTimeout(Callable<T> callable, long j8, TimeUnit timeUnit) {
        return (T) callWithTimeout(callable, j8, timeUnit);
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @CanIgnoreReturnValue
    @ParametricNullness
    public <T> T callWithTimeout(Callable<T> callable, long j8, TimeUnit timeUnit) throws ExecutionException {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeUnit);
        try {
            return callable.call();
        } catch (Error e4) {
            throw new ExecutionError(e4);
        } catch (RuntimeException e14) {
            throw new UncheckedExecutionException(e14);
        } catch (Exception e15) {
            Platform.restoreInterruptIfIsInterruptedException(e15);
            throw new ExecutionException(e15);
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @CanIgnoreReturnValue
    public <T> T newProxy(T t7, Class<T> cls, long j8, TimeUnit timeUnit) {
        Preconditions.checkNotNull(t7);
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(timeUnit);
        return t7;
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runUninterruptiblyWithTimeout(Runnable runnable, long j8, TimeUnit timeUnit) {
        runWithTimeout(runnable, j8, timeUnit);
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runWithTimeout(Runnable runnable, long j8, TimeUnit timeUnit) {
        Preconditions.checkNotNull(runnable);
        Preconditions.checkNotNull(timeUnit);
        try {
            runnable.run();
        } catch (Error e4) {
            throw new ExecutionError(e4);
        } catch (Exception e14) {
            throw new UncheckedExecutionException(e14);
        }
    }
}
