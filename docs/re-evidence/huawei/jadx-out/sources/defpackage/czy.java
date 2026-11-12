package defpackage;

import android.text.TextUtils;
import com.huawei.hmf.services.Module;
import health.compact.a.LogUtil;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class czy {

    /* JADX INFO: loaded from: classes3.dex */
    static final class a {
        private static final Map<Class<?>, Object> e = new HashMap(28);

        static {
            b(Boolean.TYPE, Boolean.class, Boolean.FALSE);
            b(Byte.TYPE, Byte.class, (byte) 0);
            b(Character.TYPE, Character.class, (char) 0);
            b(Double.TYPE, Double.class, Double.valueOf(0.0d));
            b(Float.TYPE, Float.class, Float.valueOf(0.0f));
            b(Integer.TYPE, Integer.class, 0);
            b(Long.TYPE, Long.class, 0L);
            b(Short.TYPE, Short.class, (short) 0);
            b(Void.TYPE, Void.class, null);
            c(boolean[].class, new boolean[0]);
            c(byte[].class, new byte[0]);
            c(char[].class, new char[0]);
            c(double[].class, new double[0]);
            c(float[].class, new float[0]);
            c(int[].class, new int[0]);
            c(long[].class, new long[0]);
            c(short[].class, new short[0]);
            c(String.class, "");
            c(String[].class, new String[0]);
        }

        private static <T> void b(Class<T> cls, Class<T> cls2, T t) {
            c(cls, t);
            c(cls2, t);
        }

        private static <T> void c(Class<T> cls, T t) {
            e.put(cls, t);
        }

        public static boolean d(Class<?> cls) {
            return e.containsKey(cls);
        }

        public static <T> T a(Class<? extends T> cls) {
            return (T) e.get(cls);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static class e implements InvocationHandler {
        private e() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            LogUtil.d("ServiceManagerImpl", "Dummy method ", method.getName(), " of ", c(obj.getClass()), " was invoked!");
            Object objE = e(method.getReturnType());
            LogUtil.c("ServiceManagerImpl", "Dummy method ", method.getName(), " was invoked with result=", objE);
            return objE;
        }

        protected static Class<?> c(Class<?> cls) {
            Class<?>[] interfaces = cls.getInterfaces();
            return interfaces.length == 0 ? cls : interfaces[0];
        }

        protected static <T> T e(Class<? extends T> cls) {
            if (a.d(cls)) {
                return (T) a.a(cls);
            }
            if (List.class.isAssignableFrom(cls)) {
                return (T) Collections.EMPTY_LIST;
            }
            if (Set.class.isAssignableFrom(cls)) {
                return (T) Collections.EMPTY_SET;
            }
            if (Map.class.isAssignableFrom(cls)) {
                return (T) Collections.EMPTY_MAP;
            }
            if (cls.isArray()) {
                return (T) Array.newInstance(cls.getComponentType(), 0);
            }
            LogUtil.c("ServiceManagerImpl", "Dummy method without default value: type=", cls.getName());
            return null;
        }
    }

    public static <T> T b(Module module, Class<T> cls, String str) {
        T t = TextUtils.isEmpty(str) ? (T) module.create(cls) : (T) module.create(cls, str);
        if (t == null) {
            LogUtil.d("ServiceManagerImpl", "Instantiate the implementation of ", cls, " in ", module.getName(), " failed");
            throw new IllegalStateException("Instantiate failed: " + cls);
        }
        LogUtil.c("ServiceManagerImpl", "Got instance of ", cls, " with result: ", t.getClass().getName(), "@", Integer.toHexString(t.hashCode()));
        return t;
    }

    public static <T> T a(Class<? extends T> cls) {
        if (!cls.isInterface()) {
            throw new UnsupportedOperationException("Can't create dummy instance of class: " + cls.getName());
        }
        return (T) a(cls, new e());
    }

    public static <T> T a(Class<? extends T> cls, InvocationHandler invocationHandler) {
        LogUtil.b("ServiceManagerImpl", "Creating new dummy instance of ", cls.getName(), " with handler=", invocationHandler);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler);
    }
}
