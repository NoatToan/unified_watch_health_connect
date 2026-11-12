package z23;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f202025a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f202026b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f202027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f202028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f202029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Method f202030d;

        public a(Method method, Method method2, Method method3, Method method4) {
            this.f202027a = method;
            this.f202028b = method2;
            this.f202029c = method3;
            this.f202030d = method4;
        }
    }

    private b() {
    }

    public static a a() {
        a aVar;
        a aVar2 = f202026b;
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            aVar = new a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            aVar = new a(null, null, null, null);
        }
        f202026b = aVar;
        return aVar;
    }

    public static Boolean b(Class cls) throws IllegalAccessException, InvocationTargetException {
        cls.getClass();
        Method method = a().f202027a;
        if (method == null) {
            return null;
        }
        Object objInvoke = method.invoke(cls, null);
        objInvoke.getClass();
        return (Boolean) objInvoke;
    }
}
