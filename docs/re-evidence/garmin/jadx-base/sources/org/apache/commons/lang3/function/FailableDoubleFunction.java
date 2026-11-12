package org.apache.commons.lang3.function;

import java.lang.Throwable;
import v.h;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableDoubleFunction<R, E extends Throwable> {
    public static final FailableDoubleFunction NOP = new h();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Object lambda$static$0(double d14) {
        return null;
    }

    static <R, E extends Throwable> FailableDoubleFunction<R, E> nop() {
        return NOP;
    }

    R apply(double d14);
}
