package org.apache.commons.lang3.function;

import a73.r;
import java.lang.Throwable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableBiFunction<T, U, R, E extends Throwable> {
    public static final FailableBiFunction NOP = new r();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$andThen$1(FailableFunction failableFunction, Object obj, Object obj2) {
        return failableFunction.apply(apply(obj, obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Object lambda$static$0(Object obj, Object obj2) {
        return null;
    }

    static <T, U, R, E extends Throwable> FailableBiFunction<T, U, R, E> nop() {
        return NOP;
    }

    default <V> FailableBiFunction<T, U, V, E> andThen(final FailableFunction<? super R, ? extends V, E> failableFunction) {
        Objects.requireNonNull(failableFunction);
        return new FailableBiFunction() { // from class: a73.s
            @Override // org.apache.commons.lang3.function.FailableBiFunction
            public final Object apply(Object obj, Object obj2) {
                return this.f1879a.lambda$andThen$1(failableFunction, obj, obj2);
            }
        };
    }

    R apply(T t7, U u8);
}
