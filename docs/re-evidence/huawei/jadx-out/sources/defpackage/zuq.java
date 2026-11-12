package defpackage;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* JADX INFO: loaded from: classes20.dex */
public class zuq {
    public static Method d(Method method, ClassLoader classLoader) throws NoSuchMethodException, ClassNotFoundException {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    public static <T> T c(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(zuq.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static InvocationHandler c(Object obj) {
        if (obj == null) {
            return null;
        }
        return new d(obj);
    }

    public static Object b(InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return ((d) invocationHandler).a();
    }

    /* JADX INFO: loaded from: classes46.dex */
    static class d implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f54583a;

        public d(Object obj) {
            this.f54583a = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return zuq.d(method, this.f54583a.getClass().getClassLoader()).invoke(this.f54583a, objArr);
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            } catch (ReflectiveOperationException e2) {
                throw new RuntimeException("Reflection failed for method " + method, e2);
            }
        }

        public Object a() {
            return this.f54583a;
        }
    }

    private static boolean a() {
        return "eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE);
    }

    public static boolean a(Collection<String> collection, String str) {
        if (collection.contains(str)) {
            return true;
        }
        if (!a()) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":dev");
        return collection.contains(sb.toString());
    }
}
