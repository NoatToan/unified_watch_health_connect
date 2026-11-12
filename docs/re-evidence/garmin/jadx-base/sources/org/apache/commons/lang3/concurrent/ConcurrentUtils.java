package org.apache.commons.lang3.concurrent;

import am.j;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.Validate;

/* JADX INFO: loaded from: classes3.dex */
public class ConcurrentUtils {
    private ConcurrentUtils() {
    }

    public static Throwable checkedException(Throwable th3) {
        Validate.isTrue((th3 == null || (th3 instanceof RuntimeException) || (th3 instanceof Error)) ? false : true, j.p("Not a checked exception: ", th3), new Object[0]);
        return th3;
    }

    public static <T> Future<T> constantFuture(T t7) {
        return new ConstantFuture(t7);
    }

    public static <K, V> V createIfAbsent(ConcurrentMap<K, V> concurrentMap, K k14, ConcurrentInitializer<V> concurrentInitializer) {
        if (concurrentMap == null || concurrentInitializer == null) {
            return null;
        }
        V v14 = concurrentMap.get(k14);
        return v14 == null ? (V) putIfAbsent(concurrentMap, k14, concurrentInitializer.get()) : v14;
    }

    public static <K, V> V createIfAbsentUnchecked(ConcurrentMap<K, V> concurrentMap, K k14, ConcurrentInitializer<V> concurrentInitializer) {
        try {
            return (V) createIfAbsent(concurrentMap, k14, concurrentInitializer);
        } catch (ConcurrentException e4) {
            throw new ConcurrentRuntimeException(e4.getCause());
        }
    }

    public static ConcurrentException extractCause(ExecutionException executionException) {
        if (executionException == null || executionException.getCause() == null) {
            return null;
        }
        throwCause(executionException);
        return new ConcurrentException(executionException.getMessage(), executionException.getCause());
    }

    public static ConcurrentRuntimeException extractCauseUnchecked(ExecutionException executionException) {
        if (executionException == null || executionException.getCause() == null) {
            return null;
        }
        throwCause(executionException);
        return new ConcurrentRuntimeException(executionException.getMessage(), executionException.getCause());
    }

    public static void handleCause(ExecutionException executionException) throws ConcurrentException {
        ConcurrentException concurrentExceptionExtractCause = extractCause(executionException);
        if (concurrentExceptionExtractCause != null) {
            throw concurrentExceptionExtractCause;
        }
    }

    public static void handleCauseUnchecked(ExecutionException executionException) {
        ConcurrentRuntimeException concurrentRuntimeExceptionExtractCauseUnchecked = extractCauseUnchecked(executionException);
        if (concurrentRuntimeExceptionExtractCauseUnchecked != null) {
            throw concurrentRuntimeExceptionExtractCauseUnchecked;
        }
    }

    public static <T> T initialize(ConcurrentInitializer<T> concurrentInitializer) {
        if (concurrentInitializer != null) {
            return concurrentInitializer.get();
        }
        return null;
    }

    public static <T> T initializeUnchecked(ConcurrentInitializer<T> concurrentInitializer) {
        try {
            return (T) initialize(concurrentInitializer);
        } catch (ConcurrentException e4) {
            throw new ConcurrentRuntimeException(e4.getCause());
        }
    }

    public static <K, V> V putIfAbsent(ConcurrentMap<K, V> concurrentMap, K k14, V v14) {
        if (concurrentMap == null) {
            return null;
        }
        V vPutIfAbsent = concurrentMap.putIfAbsent(k14, v14);
        return vPutIfAbsent != null ? vPutIfAbsent : v14;
    }

    private static void throwCause(ExecutionException executionException) {
        if (executionException.getCause() instanceof RuntimeException) {
            throw ((RuntimeException) executionException.getCause());
        }
        if (executionException.getCause() instanceof Error) {
            throw ((Error) executionException.getCause());
        }
    }

    public static final class ConstantFuture<T> implements Future<T> {
        private final T value;

        public ConstantFuture(T t7) {
            this.value = t7;
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z14) {
            return false;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.value;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return false;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get(long j8, TimeUnit timeUnit) {
            return this.value;
        }
    }
}
