package com.huawei.watchface.videoedit.sysc;

import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
@FunctionalInterface
public interface Function<T, R> {
    static <T> Function<T, T> identity() {
        return new Function() { // from class: com.huawei.watchface.videoedit.sysc.Function$$ExternalSyntheticLambda2
            @Override // com.huawei.watchface.videoedit.sysc.Function
            public final Object apply(Object obj) {
                return Function.lambda$identity$2(obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$andThen$1(Function function, Object obj) {
        return function.apply(apply(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$compose$0(Function function, Object obj) {
        return apply(function.apply(obj));
    }

    static /* synthetic */ Object lambda$identity$2(Object obj) {
        return obj;
    }

    default <V> Function<T, V> andThen(final Function<? super R, ? extends V> function) {
        Objects.requireNonNull(function);
        return new Function() { // from class: com.huawei.watchface.videoedit.sysc.Function$$ExternalSyntheticLambda1
            @Override // com.huawei.watchface.videoedit.sysc.Function
            public final Object apply(Object obj) {
                return this.f$0.lambda$andThen$1(function, obj);
            }
        };
    }

    R apply(T t);

    default <V> Function<V, R> compose(final Function<? super V, ? extends T> function) {
        Objects.requireNonNull(function);
        return new Function() { // from class: com.huawei.watchface.videoedit.sysc.Function$$ExternalSyntheticLambda0
            @Override // com.huawei.watchface.videoedit.sysc.Function
            public final Object apply(Object obj) {
                return this.f$0.lambda$compose$0(function, obj);
            }
        };
    }
}
