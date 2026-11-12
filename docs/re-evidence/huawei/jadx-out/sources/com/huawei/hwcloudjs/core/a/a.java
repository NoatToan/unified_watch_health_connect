package com.huawei.hwcloudjs.core.a;

import com.huawei.hwcloudjs.core.JSRequest;
import com.huawei.hwcloudjs.core.JsCallback;
import com.huawei.hwcloudjs.f.d;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Method f17051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Class<?> f17052b;

    public Class<?> b() {
        return this.f17052b;
    }

    public void a(Object obj, JsCallback jsCallback) {
        String str;
        try {
            Object objNewInstance = this.f17051a.getDeclaringClass().newInstance();
            if (objNewInstance instanceof JSRequest) {
                ((JSRequest) objNewInstance).execute(this.f17051a, obj, jsCallback);
            } else {
                d.b("CallObject", "clazz.newInstance() is not JSRequest type", true);
            }
        } catch (IllegalAccessException unused) {
            str = "call IllegalAccessException";
            d.b("CallObject", str, true);
        } catch (InstantiationException unused2) {
            str = "call InstantiationException";
            d.b("CallObject", str, true);
        }
    }

    public Method a() {
        return this.f17051a;
    }

    public a(Method method) {
        Class<?> cls;
        this.f17052b = null;
        this.f17051a = method;
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length <= 0 || JsCallback.class == (cls = parameterTypes[0])) {
            return;
        }
        this.f17052b = cls;
    }
}
