package org.apache.commons.lang3.function;

import java.lang.Throwable;
import v.h;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableToDoubleFunction<T, E extends Throwable> {
    public static final FailableToDoubleFunction NOP = new h();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ double lambda$static$0(Object obj) {
        return 0.0d;
    }

    static <T, E extends Throwable> FailableToDoubleFunction<T, E> nop() {
        return NOP;
    }

    double applyAsDouble(T t7);
}
