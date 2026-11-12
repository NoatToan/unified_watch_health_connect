package org.apache.commons.lang3.function;

import java.lang.Throwable;
import v.h;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableIntToLongFunction<E extends Throwable> {
    public static final FailableIntToLongFunction NOP = new h();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ long lambda$static$0(int i14) {
        return 0L;
    }

    static <E extends Throwable> FailableIntToLongFunction<E> nop() {
        return NOP;
    }

    long applyAsLong(int i14);
}
