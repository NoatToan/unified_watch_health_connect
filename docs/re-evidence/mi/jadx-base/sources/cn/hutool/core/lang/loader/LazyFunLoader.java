package cn.hutool.core.lang.loader;

import defpackage.qk1;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public class LazyFunLoader<T> extends LazyLoader<T> {
    private static final long serialVersionUID = 1;
    private Supplier<T> supplier;

    public LazyFunLoader(Supplier<T> supplier) {
        qk1.t(supplier);
        this.supplier = supplier;
    }

    public void ifInitialized(Consumer<T> consumer) {
        qk1.t(consumer);
        if (isInitialize()) {
            consumer.accept(get());
        }
    }

    @Override // cn.hutool.core.lang.loader.LazyLoader
    public T init() {
        T t = this.supplier.get();
        this.supplier = null;
        return t;
    }

    public boolean isInitialize() {
        return this.supplier == null;
    }
}
