package org.apache.commons.lang3.function;

import java.lang.Throwable;
import v.h;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableToLongBiFunction<T, U, E extends Throwable> {
    public static final FailableToLongBiFunction NOP = new h();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ long lambda$static$0(Object obj, Object obj2) {
        return 0L;
    }

    static <T, U, E extends Throwable> FailableToLongBiFunction<T, U, E> nop() {
        return NOP;
    }

    long applyAsLong(T t7, U u8);
}
