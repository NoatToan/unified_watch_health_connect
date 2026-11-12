package org.apache.commons.lang3.function;

import java.lang.Throwable;
import v.h;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableIntFunction<R, E extends Throwable> {
    public static final FailableIntFunction NOP = new h();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Object lambda$static$0(int i14) {
        return null;
    }

    static <R, E extends Throwable> FailableIntFunction<R, E> nop() {
        return NOP;
    }

    R apply(int i14);
}
