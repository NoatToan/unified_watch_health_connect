package org.apache.commons.lang3.function;

import a73.p;
import java.lang.Throwable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableBiConsumer<T, U, E extends Throwable> {
    public static final FailableBiConsumer NOP = new p(0);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void lambda$andThen$1(FailableBiConsumer failableBiConsumer, Object obj, Object obj2) {
        accept(obj, obj2);
        failableBiConsumer.accept(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$0(Object obj, Object obj2) {
    }

    static <T, U, E extends Throwable> FailableBiConsumer<T, U, E> nop() {
        return NOP;
    }

    void accept(T t7, U u8);

    default FailableBiConsumer<T, U, E> andThen(final FailableBiConsumer<? super T, ? super U, E> failableBiConsumer) {
        Objects.requireNonNull(failableBiConsumer);
        return new FailableBiConsumer() { // from class: a73.q
            @Override // org.apache.commons.lang3.function.FailableBiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f1875a.lambda$andThen$1(failableBiConsumer, obj, obj2);
            }
        };
    }
}
