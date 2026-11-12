package org.apache.commons.lang3.function;

import a73.n0;
import java.lang.Throwable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableLongConsumer<E extends Throwable> {
    public static final FailableLongConsumer NOP = new n0();

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void lambda$andThen$1(FailableLongConsumer failableLongConsumer, long j8) {
        accept(j8);
        failableLongConsumer.accept(j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$0(long j8) {
    }

    static <E extends Throwable> FailableLongConsumer<E> nop() {
        return NOP;
    }

    void accept(long j8);

    default FailableLongConsumer<E> andThen(final FailableLongConsumer<E> failableLongConsumer) {
        Objects.requireNonNull(failableLongConsumer);
        return new FailableLongConsumer() { // from class: a73.o0
            @Override // org.apache.commons.lang3.function.FailableLongConsumer
            public final void accept(long j8) {
                this.f1869a.lambda$andThen$1(failableLongConsumer, j8);
            }
        };
    }
}
