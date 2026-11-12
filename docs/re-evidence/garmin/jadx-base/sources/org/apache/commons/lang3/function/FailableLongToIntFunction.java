package org.apache.commons.lang3.function;

import java.lang.Throwable;
import v.h;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableLongToIntFunction<E extends Throwable> {
    public static final FailableLongToIntFunction NOP = new h();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ int lambda$static$0(long j8) {
        return 0;
    }

    static <E extends Throwable> FailableLongToIntFunction<E> nop() {
        return NOP;
    }

    int applyAsInt(long j8);
}
