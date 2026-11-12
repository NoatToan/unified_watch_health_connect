package org.apache.commons.lang3.function;

import a73.d;
import java.lang.Throwable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableConsumer<T, E extends Throwable> {
    public static final FailableConsumer NOP = new d(1);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void lambda$andThen$1(FailableConsumer failableConsumer, Object obj) {
        accept(obj);
        failableConsumer.accept(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$0(Object obj) {
    }

    static <T, E extends Throwable> FailableConsumer<T, E> nop() {
        return NOP;
    }

    void accept(T t7);

    default FailableConsumer<T, E> andThen(final FailableConsumer<? super T, E> failableConsumer) {
        Objects.requireNonNull(failableConsumer);
        return new FailableConsumer() { // from class: a73.w
            @Override // org.apache.commons.lang3.function.FailableConsumer
            public final void accept(Object obj) {
                this.f1894a.lambda$andThen$1(failableConsumer, obj);
            }
        };
    }
}
