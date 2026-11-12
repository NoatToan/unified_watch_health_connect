package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes7.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f28344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z f28345b = new z(this);

    public x(g gVar) {
        this.f28344a = gVar;
    }

    public final <T> T a(Class<T> cls) {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new y(this.f28344a, cls, this.f28345b));
    }

    public final g a() {
        return this.f28344a;
    }
}
