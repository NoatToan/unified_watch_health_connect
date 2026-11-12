package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes4.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f2016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private aa f2017b = new aa(this);

    public <T> T a(Class<T> cls) {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new z(this.f2016a, cls, this.f2017b));
    }

    public g a() {
        return this.f2016a;
    }

    public y(g gVar) {
        this.f2016a = gVar;
    }
}
