package cn.hutool.core.lang.loader;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class LazyLoader<T> implements Serializable {
    private static final long serialVersionUID = 1;
    private volatile T object;

    public T get() {
        T tInit = this.object;
        if (tInit == null) {
            synchronized (this) {
                try {
                    tInit = this.object;
                    if (tInit == null) {
                        tInit = init();
                        this.object = tInit;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return tInit;
    }

    public abstract T init();
}
