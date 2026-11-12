package com.huawei.watchface.videoedit.sysc;

import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
@FunctionalInterface
public interface Consumer<T> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void lambda$andThen$0(Consumer consumer, Object obj) {
        accept(obj);
        consumer.accept(obj);
    }

    void accept(T t);

    default Consumer<T> andThen(final Consumer<? super T> consumer) {
        Objects.requireNonNull(consumer);
        return new Consumer() { // from class: com.huawei.watchface.videoedit.sysc.Consumer$$ExternalSyntheticLambda0
            @Override // com.huawei.watchface.videoedit.sysc.Consumer
            public final void accept(Object obj) {
                this.f$0.lambda$andThen$0(consumer, obj);
            }
        };
    }
}
