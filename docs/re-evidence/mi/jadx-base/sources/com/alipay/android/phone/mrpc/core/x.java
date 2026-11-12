package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f5762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private z f5763b = new z(this);

    public x(g gVar) {
        this.f5762a = gVar;
    }

    public final g a() {
        return this.f5762a;
    }

    public final <T> T a(Class<T> cls) {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new y(this.f5762a, cls, this.f5763b));
    }
}
