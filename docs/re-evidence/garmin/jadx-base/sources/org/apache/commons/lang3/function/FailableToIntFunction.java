package org.apache.commons.lang3.function;

import java.lang.Throwable;
import v.h;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableToIntFunction<T, E extends Throwable> {
    public static final FailableToIntFunction NOP = new h();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ int lambda$static$0(Object obj) {
        return 0;
    }

    static <T, E extends Throwable> FailableToIntFunction<T, E> nop() {
        return NOP;
    }

    int applyAsInt(T t7);
}
