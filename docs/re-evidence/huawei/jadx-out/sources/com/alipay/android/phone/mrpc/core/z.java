package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class z implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f2018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class<?> f2019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public aa f2020c;

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return this.f2020c.a(obj, this.f2019b, method, objArr);
    }

    public z(g gVar, Class<?> cls, aa aaVar) {
        this.f2018a = gVar;
        this.f2019b = cls;
        this.f2020c = aaVar;
    }
}
