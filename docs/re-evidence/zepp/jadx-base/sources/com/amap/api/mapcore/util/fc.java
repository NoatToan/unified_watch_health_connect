package com.amap.api.mapcore.util;

import com.amap.api.mapcore.util.fd;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fc<T extends fd<?>> {
    public T a;

    public final T a(T t) {
        if (t == null) {
            return null;
        }
        while (t != null) {
            Object obj = t.f;
            t.f = this.a;
            this.a = t;
            t = (T) obj;
        }
        return null;
    }
}
