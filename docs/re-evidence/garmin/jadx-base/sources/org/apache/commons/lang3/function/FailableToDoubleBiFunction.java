package org.apache.commons.lang3.function;

import java.lang.Throwable;
import v.h;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableToDoubleBiFunction<T, U, E extends Throwable> {
    public static final FailableToDoubleBiFunction NOP = new h();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ double lambda$static$0(Object obj, Object obj2) {
        return 0.0d;
    }

    static <T, U, E extends Throwable> FailableToDoubleBiFunction<T, U, E> nop() {
        return NOP;
    }

    double applyAsDouble(T t7, U u8);
}
