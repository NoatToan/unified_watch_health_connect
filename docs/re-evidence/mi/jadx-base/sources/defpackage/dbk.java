package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes5.dex */
public final class dbk {
    public static <T> T a(Class<T> cls, InvocationHandler invocationHandler) {
        c6i.o(invocationHandler);
        c6i.j(cls.isInterface(), "%s is not an interface", cls);
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
