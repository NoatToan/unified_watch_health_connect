package org.apache.commons.lang3.function;

import java.lang.Throwable;
import v.h;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableToLongFunction<T, E extends Throwable> {
    public static final FailableToLongFunction NOP = new h();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ long lambda$static$0(Object obj) {
        return 0L;
    }

    static <T, E extends Throwable> FailableToLongFunction<T, E> nop() {
        return NOP;
    }

    long applyAsLong(T t7);
}
