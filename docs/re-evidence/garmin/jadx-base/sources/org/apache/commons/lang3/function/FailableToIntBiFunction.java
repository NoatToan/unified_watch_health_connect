package org.apache.commons.lang3.function;

import java.lang.Throwable;
import v.h;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableToIntBiFunction<T, U, E extends Throwable> {
    public static final FailableToIntBiFunction NOP = new h();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ int lambda$static$0(Object obj, Object obj2) {
        return 0;
    }

    static <T, U, E extends Throwable> FailableToIntBiFunction<T, U, E> nop() {
        return NOP;
    }

    int applyAsInt(T t7, U u8);
}
