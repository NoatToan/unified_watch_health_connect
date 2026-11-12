package z23;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f202020a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C3764a f202021b;

    /* JADX INFO: renamed from: z23.a$a, reason: collision with other inner class name */
    public static final class C3764a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f202022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f202023b;

        public C3764a(Method method, Method method2) {
            this.f202022a = method;
            this.f202023b = method2;
        }
    }

    private a() {
    }

    public static C3764a a(Object obj) {
        C3764a c3764a;
        C3764a c3764a2 = f202021b;
        if (c3764a2 != null) {
            return c3764a2;
        }
        Class<?> cls = obj.getClass();
        try {
            c3764a = new C3764a(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            c3764a = new C3764a(null, null);
        }
        f202021b = c3764a;
        return c3764a;
    }
}
