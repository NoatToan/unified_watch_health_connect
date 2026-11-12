package org.apache.commons.lang3.function;

import java.lang.Throwable;
import v.h;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableIntToDoubleFunction<E extends Throwable> {
    public static final FailableIntToDoubleFunction NOP = new h();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ double lambda$static$0(int i14) {
        return 0.0d;
    }

    static <E extends Throwable> FailableIntToDoubleFunction<E> nop() {
        return NOP;
    }

    double applyAsDouble(int i14);
}
