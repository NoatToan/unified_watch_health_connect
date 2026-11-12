package org.apache.commons.io.function;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import wr.g;
import y63.a;
import y63.b;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface IOFunction<T, R> {
    static <T> IOFunction<T, T> identity() {
        return new g(18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$andThen$4(IOFunction iOFunction, Object obj) {
        return iOFunction.apply(apply(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$andThen$5(Function function, Object obj) {
        return function.apply(apply(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void lambda$andThen$6(IOConsumer iOConsumer, Object obj) {
        iOConsumer.accept(apply(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void lambda$andThen$7(Consumer consumer, Object obj) {
        consumer.accept(apply(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$compose$0(IOFunction iOFunction, Object obj) {
        return apply(iOFunction.apply(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$compose$1(Function function, Object obj) {
        return apply(function.apply(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$compose$2(IOSupplier iOSupplier) {
        return apply(iOSupplier.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$compose$3(Supplier supplier) {
        return apply(supplier.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Object lambda$identity$8(Object obj) {
        return obj;
    }

    default <V> IOFunction<T, V> andThen(IOFunction<? super R, ? extends V> iOFunction) {
        Objects.requireNonNull(iOFunction);
        return new a(this, iOFunction, 0);
    }

    R apply(T t7);

    default <V> IOFunction<V, R> compose(IOFunction<? super V, ? extends T> iOFunction) {
        Objects.requireNonNull(iOFunction);
        return new a(this, iOFunction, 1);
    }

    default <V> IOFunction<T, V> andThen(Function<? super R, ? extends V> function) {
        Objects.requireNonNull(function);
        return new b(this, function, 1);
    }

    default <V> IOFunction<V, R> compose(Function<? super V, ? extends T> function) {
        Objects.requireNonNull(function);
        return new b(this, function, 0);
    }

    default IOConsumer<T> andThen(IOConsumer<? super R> iOConsumer) {
        Objects.requireNonNull(iOConsumer);
        return new xj1.b(3, this, iOConsumer);
    }

    default IOSupplier<R> compose(IOSupplier<? extends T> iOSupplier) {
        Objects.requireNonNull(iOSupplier);
        return new xj1.b(5, this, iOSupplier);
    }

    default IOConsumer<T> andThen(Consumer<? super R> consumer) {
        Objects.requireNonNull(consumer);
        return new xj1.b(4, this, consumer);
    }

    default IOSupplier<R> compose(Supplier<? extends T> supplier) {
        Objects.requireNonNull(supplier);
        return new xj1.b(6, this, supplier);
    }
}
