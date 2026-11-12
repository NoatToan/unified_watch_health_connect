package org.apache.commons.lang3.function;

import java.lang.Throwable;
import v.h;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableObjIntConsumer<T, E extends Throwable> {
    public static final FailableObjIntConsumer NOP = new h();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$0(Object obj, int i14) {
    }

    static <T, E extends Throwable> FailableObjIntConsumer<T, E> nop() {
        return NOP;
    }

    void accept(T t7, int i14);
}
