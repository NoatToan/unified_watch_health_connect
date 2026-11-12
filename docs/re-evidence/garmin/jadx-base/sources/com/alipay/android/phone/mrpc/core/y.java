package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f28346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class<?> f28347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f28348c;

    public y(g gVar, Class<?> cls, z zVar) {
        this.f28346a = gVar;
        this.f28347b = cls;
        this.f28348c = zVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return this.f28348c.a(method, objArr);
    }
}
