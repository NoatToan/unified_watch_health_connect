package org.apache.commons.lang3.function;

import java.lang.Throwable;
import v.h;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableDoubleToLongFunction<E extends Throwable> {
    public static final FailableDoubleToLongFunction NOP = new h();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ int lambda$static$0(double d14) {
        return 0;
    }

    static <E extends Throwable> FailableDoubleToLongFunction<E> nop() {
        return NOP;
    }

    int applyAsLong(double d14);
}
