package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.reflect.ElementTypesAreNonnullByDefault;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class aps {
    public static <T> T a(Class<T> cls, InvocationHandler invocationHandler) {
        Preconditions.checkNotNull(invocationHandler);
        Preconditions.checkArgument(cls.isInterface(), "%s is not an interface", cls);
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
