package org.apache.commons.lang3.function;

import a73.x;
import java.lang.Throwable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableDoubleConsumer<E extends Throwable> {
    public static final FailableDoubleConsumer NOP = new x();

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void lambda$andThen$1(FailableDoubleConsumer failableDoubleConsumer, double d14) {
        accept(d14);
        failableDoubleConsumer.accept(d14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$0(double d14) {
    }

    static <E extends Throwable> FailableDoubleConsumer<E> nop() {
        return NOP;
    }

    void accept(double d14);

    default FailableDoubleConsumer<E> andThen(final FailableDoubleConsumer<E> failableDoubleConsumer) {
        Objects.requireNonNull(failableDoubleConsumer);
        return new FailableDoubleConsumer() { // from class: a73.y
            @Override // org.apache.commons.lang3.function.FailableDoubleConsumer
            public final void accept(double d14) {
                this.f1897a.lambda$andThen$1(failableDoubleConsumer, d14);
            }
        };
    }
}
