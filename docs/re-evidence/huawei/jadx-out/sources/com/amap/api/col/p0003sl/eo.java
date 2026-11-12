package com.amap.api.col.p0003sl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class eo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2460b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<a> f2459a = new ArrayList<>();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        r4 = r3.f2462b.getClass();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        Class<?> cls;
        Method declaredMethod;
        synchronized (this) {
            if (this.f2460b) {
                return;
            }
            this.f2460b = true;
            for (int i = 0; i < this.f2459a.size(); i++) {
                a aVar = this.f2459a.get(i);
                try {
                    try {
                        try {
                            if (aVar.f2462b != null && cls != null) {
                                try {
                                    declaredMethod = cls.getDeclaredMethod(aVar.f2461a, aVar.f2463c);
                                } catch (NoSuchMethodException unused) {
                                    if (aVar.f2463c.length > 0) {
                                        Class<?>[] clsArr = new Class[aVar.f2463c.length];
                                        for (int i2 = 0; i2 < aVar.f2463c.length; i2++) {
                                            if (aVar.f2463c[i2].getInterfaces().length > 0) {
                                                clsArr[i2] = aVar.f2463c[i2].getInterfaces()[0];
                                            }
                                        }
                                        declaredMethod = cls.getDeclaredMethod(aVar.f2461a, clsArr);
                                    } else {
                                        declaredMethod = null;
                                    }
                                }
                                if (declaredMethod != null) {
                                    declaredMethod.setAccessible(true);
                                    declaredMethod.invoke(aVar.f2462b, aVar.d);
                                }
                            }
                        } catch (NoSuchMethodException e) {
                            e.printStackTrace();
                        }
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (IllegalArgumentException e3) {
                        e3.printStackTrace();
                    }
                } catch (SecurityException e4) {
                    e4.printStackTrace();
                } catch (InvocationTargetException e5) {
                    e5.printStackTrace();
                }
            }
            this.f2459a.clear();
        }
    }

    public final void a(Object obj, Object... objArr) {
        synchronized (this) {
            try {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                if (stackTrace != null && stackTrace.length >= 3) {
                    this.f2459a.add(new a(obj, stackTrace[3].getMethodName(), objArr));
                }
            } catch (Throwable unused) {
            }
            this.f2460b = false;
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f2461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f2462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Class<?>[] f2463c;
        private Object[] d;

        public a(Object obj, String str, Object... objArr) {
            this.f2462b = obj;
            this.f2461a = str;
            if (objArr == null || objArr.length <= 0) {
                return;
            }
            this.f2463c = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                this.f2463c[i] = objArr[i].getClass();
            }
            this.d = new Object[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                this.d[i2] = objArr[i2];
            }
        }
    }
}
