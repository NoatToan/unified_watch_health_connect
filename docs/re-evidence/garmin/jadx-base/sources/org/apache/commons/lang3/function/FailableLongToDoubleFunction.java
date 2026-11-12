package org.apache.commons.lang3.function;

import java.lang.Throwable;
import v.h;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableLongToDoubleFunction<E extends Throwable> {
    public static final FailableLongToDoubleFunction NOP = new h();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ double lambda$static$0(long j8) {
        return 0.0d;
    }

    static <E extends Throwable> FailableLongToDoubleFunction<E> nop() {
        return NOP;
    }

    double applyAsDouble(long j8);
}
