package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
@DoNotMock("Use FakeTimeLimiter")
@J2ktIncompatible
public interface TimeLimiter {
    @CanIgnoreReturnValue
    @ParametricNullness
    <T> T callUninterruptiblyWithTimeout(Callable<T> callable, long j8, TimeUnit timeUnit);

    @CanIgnoreReturnValue
    @ParametricNullness
    <T> T callWithTimeout(Callable<T> callable, long j8, TimeUnit timeUnit);

    <T> T newProxy(T t7, Class<T> cls, long j8, TimeUnit timeUnit);

    void runUninterruptiblyWithTimeout(Runnable runnable, long j8, TimeUnit timeUnit);

    void runWithTimeout(Runnable runnable, long j8, TimeUnit timeUnit);
}
