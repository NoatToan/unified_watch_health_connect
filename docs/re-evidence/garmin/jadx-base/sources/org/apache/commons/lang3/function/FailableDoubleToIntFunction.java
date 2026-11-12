package org.apache.commons.lang3.function;

import java.lang.Throwable;
import v.h;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableDoubleToIntFunction<E extends Throwable> {
    public static final FailableDoubleToIntFunction NOP = new h();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ int lambda$static$0(double d14) {
        return 0;
    }

    static <E extends Throwable> FailableDoubleToIntFunction<E> nop() {
        return NOP;
    }

    int applyAsInt(double d14);
}
