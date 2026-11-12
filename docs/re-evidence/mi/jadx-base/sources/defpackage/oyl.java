package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oyl<T> {
    public static <T> oyl<T> b(etk etkVar, Method method) {
        lok lokVarB = lok.b(etkVar, method);
        Type genericReturnType = method.getGenericReturnType();
        if (kmq.j(genericReturnType)) {
            throw kmq.m(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return ehc.f(etkVar, method, lokVarB);
        }
        throw kmq.m(method, "Service methods cannot return void.", new Object[0]);
    }

    public abstract T a(Object[] objArr);
}
