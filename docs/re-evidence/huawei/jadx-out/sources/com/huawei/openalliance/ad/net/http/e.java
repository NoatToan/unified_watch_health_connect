package com.huawei.openalliance.ad.net.http;

import android.content.Context;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.kn;
import com.huawei.openalliance.ad.kt;
import com.huawei.openalliance.ad.kw;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes12.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final f f19689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f19690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f19691c;
    final h d;
    final kw e;
    final kw f;
    final boolean g;
    final Context h;
    final boolean i;
    final boolean j;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Context f19694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        f f19695b;
        h e;
        kw f;
        kw g;
        boolean i;
        boolean k;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f19696c = 10000;
        int d = 10000;
        int h = 1;
        boolean j = true;

        public a c(boolean z) {
            this.k = z;
            return this;
        }

        public a c(int i) {
            this.h = i;
            return this;
        }

        public a b(boolean z) {
            this.j = z;
            return this;
        }

        public a b(kw kwVar) {
            this.g = kwVar;
            return this;
        }

        public a b(int i) {
            this.d = i;
            return this;
        }

        public e a() {
            return new e(this);
        }

        public a a(boolean z) {
            this.i = z;
            return this;
        }

        public a a(kw kwVar) {
            this.f = kwVar;
            return this;
        }

        public a a(int i) {
            this.f19696c = i;
            return this;
        }

        public a(Context context) {
            this.f19694a = context.getApplicationContext();
        }
    }

    public <T> T a(final Class<T> cls) {
        if (cls == null) {
            throw new NullPointerException("service class cannot be null");
        }
        if (cls.isInterface()) {
            return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: com.huawei.openalliance.ad.net.http.e.1
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method, Object[] objArr) {
                    if (method.getDeclaringClass() == Object.class) {
                        return method.invoke(this, objArr);
                    }
                    kt ktVarB = e.this.b(cls);
                    com.huawei.openalliance.ad.net.http.a aVarA = new com.huawei.openalliance.ad.net.http.a.C0223a(e.this, method, objArr, e.this.c(cls), ktVarB).a();
                    Response response = new Response();
                    try {
                        response = e.this.d.b(e.this, aVarA);
                    } catch (IllegalStateException | Exception e) {
                        response.a(e);
                    }
                    hw.b("HttpCall", "response http code: %d", Integer.valueOf(response.a()));
                    if (hw.a()) {
                        hw.a("HttpCall", "response exception: %s", response.d());
                    }
                    return response;
                }
            });
        }
        throw new IllegalArgumentException("Service must be interface.");
    }

    c a(kn knVar) {
        c cVar = new c();
        if (knVar != null) {
            for (String str : knVar.a()) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length >= 2) {
                    cVar.a(strArrSplit[0].trim(), strArrSplit[1].trim());
                }
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> c c(Class<T> cls) {
        return a((kn) cls.getAnnotation(kn.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> kt b(Class<T> cls) {
        return (kt) cls.getAnnotation(kt.class);
    }

    e(a aVar) {
        this.f19689a = aVar.f19695b;
        this.f19690b = aVar.f19696c;
        this.f19691c = aVar.d;
        this.d = aVar.e != null ? aVar.e : HttpCallerFactory.a(aVar.f19694a, aVar.h);
        this.e = aVar.f;
        this.f = aVar.g;
        this.g = aVar.i;
        this.h = aVar.f19694a;
        this.i = aVar.j;
        this.j = aVar.k;
    }
}
