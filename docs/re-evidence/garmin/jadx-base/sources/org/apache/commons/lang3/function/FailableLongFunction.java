package org.apache.commons.lang3.function;

import java.lang.Throwable;
import v.h;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableLongFunction<R, E extends Throwable> {
    public static final FailableLongFunction NOP = new h();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Object lambda$static$0(long j8) {
        return null;
    }

    static <R, E extends Throwable> FailableLongFunction<R, E> nop() {
        return NOP;
    }

    R apply(long j8);
}
