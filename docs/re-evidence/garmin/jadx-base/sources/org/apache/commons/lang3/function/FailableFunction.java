package org.apache.commons.lang3.function;

import a73.e0;
import a73.f0;
import java.lang.Throwable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableFunction<T, R, E extends Throwable> {
    public static final FailableFunction NOP = new f0(0);

    static <T, E extends Throwable> FailableFunction<T, T, E> identity() {
        return new f0(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$andThen$2(FailableFunction failableFunction, Object obj) {
        return failableFunction.apply(apply(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$compose$3(FailableFunction failableFunction, Object obj) {
        return apply(failableFunction.apply(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Object lambda$identity$1(Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Object lambda$static$0(Object obj) {
        return null;
    }

    static <T, R, E extends Throwable> FailableFunction<T, R, E> nop() {
        return NOP;
    }

    default <V> FailableFunction<T, V, E> andThen(FailableFunction<? super R, ? extends V, E> failableFunction) {
        Objects.requireNonNull(failableFunction);
        return new e0(this, failableFunction, 1);
    }

    R apply(T t7);

    default <V> FailableFunction<V, R, E> compose(FailableFunction<? super V, ? extends T, E> failableFunction) {
        Objects.requireNonNull(failableFunction);
        return new e0(this, failableFunction, 0);
    }
}
