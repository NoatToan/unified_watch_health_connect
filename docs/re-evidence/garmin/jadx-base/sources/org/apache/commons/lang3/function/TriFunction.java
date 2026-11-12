package org.apache.commons.lang3.function;

import a0.h;
import java.util.Objects;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface TriFunction<T, U, V, R> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$andThen$0(Function function, Object obj, Object obj2, Object obj3) {
        return function.apply(apply(obj, obj2, obj3));
    }

    default <W> TriFunction<T, U, V, W> andThen(Function<? super R, ? extends W> function) {
        Objects.requireNonNull(function);
        return new h(4, this, function);
    }

    R apply(T t7, U u8, V v14);
}
