package com.facebook.common.references;

import defpackage.b6i;
import defpackage.cm8;
import defpackage.frk;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class SharedReference<T> {
    public static final Map<Object, Integer> d = new IdentityHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f7089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7090b = 1;
    public final frk<T> c;

    public static class NullReferenceException extends RuntimeException {
        public NullReferenceException() {
            super("Null shared reference");
        }
    }

    public SharedReference(T t, frk<T> frkVar) {
        this.f7089a = (T) b6i.g(t);
        this.c = (frk) b6i.g(frkVar);
        a(t);
    }

    public static void a(Object obj) {
        Map<Object, Integer> map = d;
        synchronized (map) {
            try {
                Integer num = map.get(obj);
                if (num == null) {
                    map.put(obj, 1);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() + 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean h(SharedReference<?> sharedReference) {
        return sharedReference != null && sharedReference.g();
    }

    public static void i(Object obj) {
        Map<Object, Integer> map = d;
        synchronized (map) {
            try {
                Integer num = map.get(obj);
                if (num == null) {
                    cm8.I("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
                } else if (num.intValue() == 1) {
                    map.remove(obj);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void b() {
        e();
        this.f7090b++;
    }

    public final synchronized int c() {
        int i;
        e();
        b6i.b(this.f7090b > 0);
        i = this.f7090b - 1;
        this.f7090b = i;
        return i;
    }

    public void d() {
        T t;
        if (c() == 0) {
            synchronized (this) {
                t = this.f7089a;
                this.f7089a = null;
            }
            this.c.release(t);
            i(t);
        }
    }

    public final void e() {
        if (!h(this)) {
            throw new NullReferenceException();
        }
    }

    public synchronized T f() {
        return this.f7089a;
    }

    public synchronized boolean g() {
        return this.f7090b > 0;
    }
}
