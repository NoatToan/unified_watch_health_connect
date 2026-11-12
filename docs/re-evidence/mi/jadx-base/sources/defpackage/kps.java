package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class kps {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24148a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<a> f24149b = new ArrayList<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f24150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f24151b;
        public Class<?>[] c;
        public Object[] d;

        public a(Object obj, String str, Object... objArr) {
            this.f24151b = obj;
            this.f24150a = str;
            if (objArr == null || objArr.length <= 0) {
                return;
            }
            this.c = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                this.c[i] = objArr[i].getClass();
            }
            this.d = new Object[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                this.d[i2] = objArr[i2];
            }
        }
    }

    public final synchronized void a() {
        Method declaredMethod;
        try {
            if (this.f24148a) {
                return;
            }
            this.f24148a = true;
            for (int i = 0; i < this.f24149b.size(); i++) {
                a aVar = this.f24149b.get(i);
                try {
                    try {
                        try {
                            if (aVar.f24151b != null) {
                                Class<?> cls = aVar.f24151b.getClass();
                                try {
                                    declaredMethod = cls.getDeclaredMethod(aVar.f24150a, aVar.c);
                                } catch (NoSuchMethodException unused) {
                                    if (aVar.c.length > 0) {
                                        Class<?>[] clsArr = new Class[aVar.c.length];
                                        for (int i2 = 0; i2 < aVar.c.length; i2++) {
                                            if (aVar.c[i2].getInterfaces().length > 0) {
                                                clsArr[i2] = aVar.c[i2].getInterfaces()[0];
                                            }
                                        }
                                        declaredMethod = cls.getDeclaredMethod(aVar.f24150a, clsArr);
                                    } else {
                                        declaredMethod = null;
                                    }
                                }
                                if (declaredMethod != null) {
                                    declaredMethod.setAccessible(true);
                                    declaredMethod.invoke(aVar.f24151b, aVar.d);
                                }
                            }
                        } catch (NoSuchMethodException e) {
                            e.printStackTrace();
                        }
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (SecurityException e3) {
                        e3.printStackTrace();
                    }
                } catch (IllegalArgumentException e4) {
                    e4.printStackTrace();
                } catch (InvocationTargetException e5) {
                    e5.printStackTrace();
                }
            }
            this.f24149b.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Object obj, Object... objArr) {
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace != null && stackTrace.length >= 3) {
                this.f24149b.add(new a(obj, stackTrace[3].getMethodName(), objArr));
            }
        } catch (Throwable unused) {
        }
        this.f24148a = false;
    }
}
