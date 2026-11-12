package org.apache.commons.lang3.function;

import java.lang.Throwable;
import v.h;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableObjLongConsumer<T, E extends Throwable> {
    public static final FailableObjLongConsumer NOP = new h();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$0(Object obj, long j8) {
    }

    static <T, E extends Throwable> FailableObjLongConsumer<T, E> nop() {
        return NOP;
    }

    void accept(T t7, long j8);
}
