package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes11.dex */
public class p7s implements j7s, InvocationHandler {
    public static final String[][] o = {new String[]{"com.bun.supplier.IIdentifierListener", "com.bun.supplier.IdSupplier"}, new String[]{"com.bun.miitmdid.core.IIdentifierListener", "com.bun.miitmdid.supplier.IdSupplier"}};
    public Context j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class f30099a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class f30100b = null;
    public Method c = null;
    public Method d = null;
    public Method e = null;
    public Method f = null;
    public Method g = null;
    public Method h = null;
    public Method i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f30101k = new Object();
    public volatile int l = 0;
    public volatile long m = 0;
    public volatile a n = null;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Boolean f30102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30103b;
        public String c;
        public String d;
        public String e;

        public a() {
            this.f30102a = null;
            this.f30103b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }

        public boolean a() {
            if (!TextUtils.isEmpty(this.f30103b) || !TextUtils.isEmpty(this.c) || !TextUtils.isEmpty(this.d) || !TextUtils.isEmpty(this.e)) {
                this.f30102a = Boolean.TRUE;
            }
            return this.f30102a != null;
        }
    }

    public p7s(Context context) {
        this.j = context.getApplicationContext();
        e(context);
        h(context);
    }

    public static <T> T b(Method method, Object obj, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            T t = (T) method.invoke(obj, objArr);
            if (t != null) {
                return t;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method c(Class<?> cls, String str, Class<?>... clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    private void d() {
        synchronized (this.f30101k) {
            try {
                this.f30101k.notifyAll();
            } catch (Exception unused) {
            }
        }
    }

    private void f(String str) {
        if (this.n != null) {
            return;
        }
        long j = this.m;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - Math.abs(j);
        int i = this.l;
        if (jElapsedRealtime > 3000 && i < 3) {
            synchronized (this.f30101k) {
                try {
                    if (this.m == j && this.l == i) {
                        i("retry, current count is " + i);
                        this.l = this.l + 1;
                        h(this.j);
                        j = this.m;
                        jElapsedRealtime = SystemClock.elapsedRealtime() - Math.abs(j);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (this.n != null || j < 0 || jElapsedRealtime > 3000 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f30101k) {
            if (this.n == null) {
                try {
                    i(str + " wait...");
                    this.f30101k.wait(3000L);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static boolean g(Object obj) {
        return (obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double);
    }

    public static void i(String str) {
        x9s.o("mdid:" + str);
    }

    @Override // defpackage.j7s
    /* JADX INFO: renamed from: a */
    public boolean mo66a() {
        f("isSupported");
        return this.n != null && Boolean.TRUE.equals(this.n.f30102a);
    }

    public final void e(Context context) {
        Class<?> clsA = a(context, "com.bun.miitmdid.core.MdidSdk");
        Class<?> cls = null;
        Class<?> cls2 = null;
        int i = 0;
        while (true) {
            String[][] strArr = o;
            if (i >= strArr.length) {
                break;
            }
            String[] strArr2 = strArr[i];
            Class<?> clsA2 = a(context, strArr2[0]);
            Class<?> clsA3 = a(context, strArr2[1]);
            if (clsA2 != null && clsA3 != null) {
                i("found class in index " + i);
                cls2 = clsA3;
                cls = clsA2;
                break;
            }
            i++;
            cls2 = clsA3;
            cls = clsA2;
        }
        this.f30099a = clsA;
        this.c = c(clsA, "InitSdk", Context.class, cls);
        this.f30100b = cls;
        this.e = c(cls2, "getOAID", new Class[0]);
        this.h = c(cls2, "isSupported", new Class[0]);
        this.i = c(cls2, "shutDown", new Class[0]);
    }

    public final void h(Context context) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = -jElapsedRealtime;
        Class cls = this.f30100b;
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    classLoader = context.getClassLoader();
                }
                b(this.c, this.f30099a.newInstance(), context, Proxy.newProxyInstance(classLoader, new Class[]{this.f30100b}, this));
            } catch (Throwable th) {
                i("call init sdk error:" + th);
                jElapsedRealtime = j;
            }
        } else {
            jElapsedRealtime = j;
        }
        this.m = jElapsedRealtime;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        this.m = SystemClock.elapsedRealtime();
        if (objArr != null) {
            a aVar = new a();
            for (Object obj2 : objArr) {
                if (obj2 != null && !g(obj2)) {
                    aVar.c = (String) b(this.e, obj2, new Object[0]);
                    aVar.f30102a = (Boolean) b(this.h, obj2, new Object[0]);
                    b(this.i, obj2, new Object[0]);
                    if (aVar.a()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("has get succ, check duplicate:");
                        sb.append(this.n != null);
                        i(sb.toString());
                        synchronized (p7s.class) {
                            try {
                                if (this.n == null) {
                                    this.n = aVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        break;
                    }
                }
            }
        }
        d();
        return null;
    }

    @Override // defpackage.j7s
    public String a() {
        f("getOAID");
        if (this.n == null) {
            return null;
        }
        return this.n.c;
    }

    public static Class<?> a(Context context, String str) {
        try {
            return odt.c(context, str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
