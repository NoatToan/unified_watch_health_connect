package org.apache.commons.io.function;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes46.dex */
@FunctionalInterface
public interface IOTriConsumer<T, U, V> {
    void accept(T t, U u, V v) throws IOException;

    static <T, U, V> IOTriConsumer<T, U, V> noop() {
        return Constants.IO_TRI_CONSUMER;
    }

    default IOTriConsumer<T, U, V> andThen(final IOTriConsumer<? super T, ? super U, ? super V> iOTriConsumer) {
        Objects.requireNonNull(iOTriConsumer);
        return new IOTriConsumer() { // from class: org.apache.commons.io.function.IOTriConsumer$$ExternalSyntheticLambda0
            @Override // org.apache.commons.io.function.IOTriConsumer
            public final void accept(Object obj, Object obj2, Object obj3) throws IOException {
                IOTriConsumer.lambda$andThen$0(this.f$0, iOTriConsumer, obj, obj2, obj3);
            }
        };
    }

    static /* synthetic */ void lambda$andThen$0(IOTriConsumer iOTriConsumer, IOTriConsumer iOTriConsumer2, Object obj, Object obj2, Object obj3) throws IOException {
        iOTriConsumer.accept(obj, obj2, obj3);
        iOTriConsumer2.accept(obj, obj2, obj3);
    }
}
