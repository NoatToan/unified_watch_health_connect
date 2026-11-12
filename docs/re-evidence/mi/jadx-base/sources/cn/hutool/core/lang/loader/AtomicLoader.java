package cn.hutool.core.lang.loader;

import defpackage.d8i;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class AtomicLoader<T> implements Serializable {
    private static final long serialVersionUID = 1;
    private final AtomicReference<T> reference = new AtomicReference<>();

    public T get() {
        T t = this.reference.get();
        if (t != null) {
            return t;
        }
        T tInit = init();
        return !d8i.a(this.reference, null, tInit) ? this.reference.get() : tInit;
    }

    public abstract T init();
}
