package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ObjectArrays;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import v.e0;

/* JADX INFO: loaded from: classes14.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class SimpleTimeLimiter implements TimeLimiter {
    private final ExecutorService executor;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.SimpleTimeLimiter$1, reason: invalid class name */
    public class AnonymousClass1 implements InvocationHandler {
        final /* synthetic */ SimpleTimeLimiter this$0;
        final /* synthetic */ Set val$interruptibleMethods;
        final /* synthetic */ Object val$target;
        final /* synthetic */ long val$timeoutDuration;
        final /* synthetic */ TimeUnit val$timeoutUnit;

        public AnonymousClass1(SimpleTimeLimiter simpleTimeLimiter, Object obj, long j8, TimeUnit timeUnit, Set set) {
            this.val$target = obj;
            this.val$timeoutDuration = j8;
            this.val$timeoutUnit = timeUnit;
            this.val$interruptibleMethods = set;
            this.this$0 = simpleTimeLimiter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object lambda$invoke$0(Method method, Object obj, Object[] objArr) throws Exception {
            try {
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e4) {
                throw SimpleTimeLimiter.throwCause(e4, false);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, final Method method, final Object[] objArr) {
            final Object obj2 = this.val$target;
            return this.this$0.callWithTimeout(new Callable() { // from class: com.google.common.util.concurrent.o
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return SimpleTimeLimiter.AnonymousClass1.lambda$invoke$0(method, obj2, objArr);
                }
            }, this.val$timeoutDuration, this.val$timeoutUnit, this.val$interruptibleMethods.contains(method));
        }
    }

    private SimpleTimeLimiter(ExecutorService executorService) {
        this.executor = (ExecutorService) Preconditions.checkNotNull(executorService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ParametricNullness
    public <T> T callWithTimeout(Callable<T> callable, long j8, TimeUnit timeUnit, boolean z14) throws Exception {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j8);
        Future<T> futureSubmit = this.executor.submit(callable);
        try {
            return z14 ? futureSubmit.get(j8, timeUnit) : (T) Uninterruptibles.getUninterruptibly(futureSubmit, j8, timeUnit);
        } catch (InterruptedException e4) {
            futureSubmit.cancel(true);
            throw e4;
        } catch (ExecutionException e14) {
            throw throwCause(e14, true);
        } catch (TimeoutException e15) {
            futureSubmit.cancel(true);
            throw new UncheckedTimeoutException(e15);
        }
    }

    private static void checkPositiveTimeout(long j8) {
        Preconditions.checkArgument(j8 > 0, "timeout must be positive: %s", j8);
    }

    public static SimpleTimeLimiter create(ExecutorService executorService) {
        return new SimpleTimeLimiter(executorService);
    }

    private static boolean declaresInterruptedEx(Method method) {
        for (Class<?> cls : method.getExceptionTypes()) {
            if (cls == InterruptedException.class) {
                return true;
            }
        }
        return false;
    }

    private static Set<Method> findInterruptibleMethods(Class<?> cls) {
        HashSet hashSetNewHashSet = Sets.newHashSet();
        for (Method method : cls.getMethods()) {
            if (declaresInterruptedEx(method)) {
                hashSetNewHashSet.add(method);
            }
        }
        return hashSetNewHashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Exception throwCause(Exception exc, boolean z14) throws Exception {
        Throwable cause = exc.getCause();
        if (cause == null) {
            throw exc;
        }
        if (z14) {
            cause.setStackTrace((StackTraceElement[]) ObjectArrays.concat(cause.getStackTrace(), exc.getStackTrace(), StackTraceElement.class));
        }
        if (cause instanceof Exception) {
            throw ((Exception) cause);
        }
        if (cause instanceof Error) {
            throw ((Error) cause);
        }
        throw exc;
    }

    private void wrapAndThrowExecutionExceptionOrError(Throwable th3) throws ExecutionException {
        if (th3 instanceof Error) {
            throw new ExecutionError((Error) th3);
        }
        if (!(th3 instanceof RuntimeException)) {
            throw new ExecutionException(th3);
        }
        throw new UncheckedExecutionException(th3);
    }

    private void wrapAndThrowRuntimeExecutionExceptionOrError(Throwable th3) {
        if (!(th3 instanceof Error)) {
            throw new UncheckedExecutionException(th3);
        }
        throw new ExecutionError((Error) th3);
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @CanIgnoreReturnValue
    @ParametricNullness
    public <T> T callUninterruptiblyWithTimeout(Callable<T> callable, long j8, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j8);
        Future<T> futureSubmit = this.executor.submit(callable);
        try {
            return (T) Uninterruptibles.getUninterruptibly(futureSubmit, j8, timeUnit);
        } catch (ExecutionException e4) {
            wrapAndThrowExecutionExceptionOrError(e4.getCause());
            e0.l();
            return null;
        } catch (TimeoutException e14) {
            futureSubmit.cancel(true);
            throw e14;
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public <T> T newProxy(T t7, Class<T> cls, long j8, TimeUnit timeUnit) {
        Preconditions.checkNotNull(t7);
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j8);
        Preconditions.checkArgument(cls.isInterface(), "interfaceType must be an interface type");
        return (T) newProxy(cls, new AnonymousClass1(this, t7, j8, timeUnit, findInterruptibleMethods(cls)));
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runUninterruptiblyWithTimeout(Runnable runnable, long j8, TimeUnit timeUnit) throws TimeoutException {
        Preconditions.checkNotNull(runnable);
        Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j8);
        Future<?> futureSubmit = this.executor.submit(runnable);
        try {
            Uninterruptibles.getUninterruptibly(futureSubmit, j8, timeUnit);
        } catch (ExecutionException e4) {
            wrapAndThrowRuntimeExecutionExceptionOrError(e4.getCause());
            e0.l();
        } catch (TimeoutException e14) {
            futureSubmit.cancel(true);
            throw e14;
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runWithTimeout(Runnable runnable, long j8, TimeUnit timeUnit) throws Throwable {
        Preconditions.checkNotNull(runnable);
        Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j8);
        Future<?> futureSubmit = this.executor.submit(runnable);
        try {
            futureSubmit.get(j8, timeUnit);
        } catch (InterruptedException e4) {
            e = e4;
            futureSubmit.cancel(true);
            throw e;
        } catch (ExecutionException e14) {
            wrapAndThrowRuntimeExecutionExceptionOrError(e14.getCause());
            e0.l();
        } catch (TimeoutException e15) {
            e = e15;
            futureSubmit.cancel(true);
            throw e;
        }
    }

    private static <T> T newProxy(Class<T> cls, InvocationHandler invocationHandler) {
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @CanIgnoreReturnValue
    @ParametricNullness
    public <T> T callWithTimeout(Callable<T> callable, long j8, TimeUnit timeUnit) throws Throwable {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j8);
        Future<T> futureSubmit = this.executor.submit(callable);
        try {
            return futureSubmit.get(j8, timeUnit);
        } catch (InterruptedException e4) {
            e = e4;
            futureSubmit.cancel(true);
            throw e;
        } catch (ExecutionException e14) {
            wrapAndThrowExecutionExceptionOrError(e14.getCause());
            e0.l();
            return null;
        } catch (TimeoutException e15) {
            e = e15;
            futureSubmit.cancel(true);
            throw e;
        }
    }
}
