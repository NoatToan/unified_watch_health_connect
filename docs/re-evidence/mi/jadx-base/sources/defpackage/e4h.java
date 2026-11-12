package defpackage;

import e4h.a;

/* JADX INFO: loaded from: classes4.dex */
public class e4h<T extends a> {
    public static int g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16255b;
    public Object[] c;
    public int d;
    public T e;
    public float f;

    public static abstract class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f16256b = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16257a = f16256b;

        public abstract a a();
    }

    public e4h(int i, T t) {
        if (i <= 0) {
            throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
        }
        this.f16255b = i;
        this.c = new Object[i];
        this.d = 0;
        this.e = t;
        this.f = 1.0f;
        d();
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (wrap java.lang.Class:0x0000: CONST_CLASS  A[WRAPPED] e4h.class) */
    public static synchronized e4h a(int i, a aVar) {
        e4h e4hVar;
        synchronized (e4h.class) {
            e4hVar = new e4h(i, aVar);
            int i2 = g;
            e4hVar.f16254a = i2;
            g = i2 + 1;
        }
        return e4hVar;
    }

    public synchronized T b() {
        T t;
        try {
            if (this.d == -1 && this.f > 0.0f) {
                d();
            }
            Object[] objArr = this.c;
            int i = this.d;
            t = (T) objArr[i];
            t.f16257a = a.f16256b;
            this.d = i - 1;
        } catch (Throwable th) {
            throw th;
        }
        return t;
    }

    public synchronized void c(T t) {
        try {
            int i = t.f16257a;
            if (i != a.f16256b) {
                if (i == this.f16254a) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + t.f16257a + ".  Object cannot belong to two different pool instances simultaneously!");
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= this.c.length) {
                f();
            }
            t.f16257a = this.f16254a;
            this.c[this.d] = t;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        e(this.f);
    }

    public final void e(float f) {
        int i = this.f16255b;
        int i2 = (int) (i * f);
        if (i2 < 1) {
            i = 1;
        } else if (i2 <= i) {
            i = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.c[i3] = this.e.a();
        }
        this.d = i - 1;
    }

    public final void f() {
        int i = this.f16255b;
        int i2 = i * 2;
        this.f16255b = i2;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i; i3++) {
            objArr[i3] = this.c[i3];
        }
        this.c = objArr;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006 A[PHI: r0
      0x0006: PHI (r0v2 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    public void g(float f) {
        float f2 = 1.0f;
        if (f > 1.0f) {
            f = f2;
        } else {
            f2 = 0.0f;
            if (f < 0.0f) {
                f = f2;
            }
        }
        this.f = f;
    }
}
