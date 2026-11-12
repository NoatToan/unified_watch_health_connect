package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class y implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected g f5764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Class<?> f5765b;
    protected z c;

    public y(g gVar, Class<?> cls, z zVar) {
        this.f5764a = gVar;
        this.f5765b = cls;
        this.c = zVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return this.c.a(method, objArr);
    }
}
