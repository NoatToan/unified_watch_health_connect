package com.huawei.wearengine.utils;

/* JADX INFO: loaded from: classes20.dex */
public abstract class Singleton<T> {
    private static final Object LOCK = new Object();
    private volatile T mInstance;

    protected abstract T create();

    public final T get() {
        T t;
        if (this.mInstance == null) {
            synchronized (LOCK) {
                if (this.mInstance == null) {
                    this.mInstance = create();
                }
                t = this.mInstance;
            }
            return t;
        }
        return this.mInstance;
    }
}
