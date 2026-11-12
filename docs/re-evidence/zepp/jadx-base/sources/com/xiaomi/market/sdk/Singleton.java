package com.xiaomi.market.sdk;

/* JADX INFO: loaded from: classes22.dex */
public abstract class Singleton<T> {
    private T mInstance;

    public abstract T create();

    public final T get() {
        T t;
        synchronized (this) {
            if (this.mInstance == null) {
                this.mInstance = create();
            }
            t = this.mInstance;
        }
        return t;
    }
}
