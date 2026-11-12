package org.apache.commons.io.function;

import java.util.Objects;
import xj1.b;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface IOConsumer<T> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void lambda$andThen$0(IOConsumer iOConsumer, Object obj) {
        accept(obj);
        iOConsumer.accept(obj);
    }

    void accept(T t7);

    default IOConsumer<T> andThen(IOConsumer<? super T> iOConsumer) {
        Objects.requireNonNull(iOConsumer);
        return new b(2, this, iOConsumer);
    }
}
