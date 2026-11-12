package org.apache.commons.lang3.function;

import a73.h0;
import java.lang.Throwable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableIntConsumer<E extends Throwable> {
    public static final FailableIntConsumer NOP = new h0();

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void lambda$andThen$1(FailableIntConsumer failableIntConsumer, int i14) {
        accept(i14);
        failableIntConsumer.accept(i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$0(int i14) {
    }

    static <E extends Throwable> FailableIntConsumer<E> nop() {
        return NOP;
    }

    void accept(int i14);

    default FailableIntConsumer<E> andThen(final FailableIntConsumer<E> failableIntConsumer) {
        Objects.requireNonNull(failableIntConsumer);
        return new FailableIntConsumer() { // from class: a73.g0
            @Override // org.apache.commons.lang3.function.FailableIntConsumer
            public final void accept(int i14) {
                this.f1840a.lambda$andThen$1(failableIntConsumer, i14);
            }
        };
    }
}
