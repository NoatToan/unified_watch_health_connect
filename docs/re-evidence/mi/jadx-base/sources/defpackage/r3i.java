package defpackage;

import java.lang.ref.SoftReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class r3i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap<Class<?>, Object> f32140a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap<Class<?>, f<?>> f32141b = new HashMap<>();
    public static final e<StringBuilder> c = b(new a(), 4);

    public class a extends d<StringBuilder> {
        @Override // r3i.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuilder a() {
            return new StringBuilder();
        }

        @Override // r3i.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(StringBuilder sb) {
            sb.setLength(0);
        }
    }

    public static abstract class b<T> implements e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d<T> f32142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f32143b;
        public c<T> c;
        public final Object d;

        public class a {
            public a() {
            }

            public void finalize() throws Throwable {
                try {
                    b.this.a();
                } finally {
                    super.finalize();
                }
            }
        }

        public b(d<T> dVar, int i) {
            a aVar = new a();
            this.d = aVar;
            if (dVar == null || i < 1) {
                this.f32143b = aVar.hashCode();
                throw new IllegalArgumentException("manager cannot be null and size cannot less then 1");
            }
            this.f32142a = dVar;
            this.f32143b = i;
            T tA = dVar.a();
            if (tA == null) {
                throw new IllegalStateException("manager create instance cannot return null");
            }
            this.c = b(tA.getClass(), i);
            e(tA);
        }

        public void a() {
            c<T> cVar = this.c;
            if (cVar != null) {
                c(cVar, this.f32143b);
                this.c = null;
            }
        }

        @Override // r3i.e
        public T acquire() {
            return d();
        }

        public abstract c<T> b(Class<T> cls, int i);

        public abstract void c(c<T> cVar, int i);

        public final T d() {
            c<T> cVar = this.c;
            if (cVar == null) {
                throw new IllegalStateException("Cannot acquire object after close()");
            }
            T tA = cVar.get();
            if (tA == null && (tA = this.f32142a.a()) == null) {
                throw new IllegalStateException("manager create instance cannot return null");
            }
            this.f32142a.b(tA);
            return tA;
        }

        public final void e(T t) {
            if (this.c == null) {
                throw new IllegalStateException("Cannot release object after close()");
            }
            if (t == null) {
                return;
            }
            this.f32142a.d(t);
            if (this.c.put(t)) {
                return;
            }
            this.f32142a.c(t);
        }

        @Override // r3i.e
        public void release(T t) {
            e(t);
        }
    }

    public interface c<T> {
        T get();

        boolean put(T t);
    }

    public static abstract class d<T> {
        public abstract T a();

        public void b(T t) {
        }

        public void c(T t) {
        }

        public void d(T t) {
        }
    }

    public interface e<T> {
        T acquire();

        void release(T t);
    }

    public static class f<T> implements c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f32145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile SoftReference<T>[] f32146b;
        public volatile int c = 0;
        public volatile int d;

        public f(Class<T> cls, int i) {
            this.f32145a = cls;
            this.d = i;
            this.f32146b = new SoftReference[i];
        }

        public Class<T> a() {
            return this.f32145a;
        }

        public synchronized void b(int i) {
            try {
                int i2 = i + this.d;
                if (i2 <= 0) {
                    synchronized (r3i.f32141b) {
                        r3i.f32141b.remove(a());
                    }
                    return;
                }
                this.d = i2;
                SoftReference<T>[] softReferenceArr = this.f32146b;
                int i3 = this.c;
                if (i2 > softReferenceArr.length) {
                    SoftReference<T>[] softReferenceArr2 = new SoftReference[i2];
                    System.arraycopy(softReferenceArr, 0, softReferenceArr2, 0, i3);
                    this.f32146b = softReferenceArr2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // r3i.c
        public synchronized T get() {
            int i = this.c;
            SoftReference<T>[] softReferenceArr = this.f32146b;
            while (i != 0) {
                i--;
                SoftReference<T> softReference = softReferenceArr[i];
                if (softReference != null) {
                    T t = softReference.get();
                    softReferenceArr[i] = null;
                    if (t != null) {
                        this.c = i;
                        return t;
                    }
                }
            }
            return null;
        }

        @Override // r3i.c
        public synchronized boolean put(T t) {
            int i;
            try {
                int i2 = this.c;
                SoftReference<T>[] softReferenceArr = this.f32146b;
                if (i2 < this.d) {
                    softReferenceArr[i2] = new SoftReference<>(t);
                    this.c = i2 + 1;
                    return true;
                }
                for (0; i < i2; i + 1) {
                    SoftReference<T> softReference = softReferenceArr[i];
                    i = (softReference == null || softReference.get() == null) ? 0 : i + 1;
                    softReferenceArr[i] = new SoftReference<>(t);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static class g<T> extends b<T> {
        public g(d<T> dVar, int i) {
            super(dVar, i);
        }

        @Override // r3i.b
        public /* bridge */ /* synthetic */ void a() {
            super.a();
        }

        @Override // r3i.b, r3i.e
        public /* bridge */ /* synthetic */ Object acquire() {
            return super.acquire();
        }

        @Override // r3i.b
        public final c<T> b(Class<T> cls, int i) {
            return r3i.e(cls, i);
        }

        @Override // r3i.b
        public final void c(c<T> cVar, int i) {
            r3i.d((f) cVar, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // r3i.b, r3i.e
        public /* bridge */ /* synthetic */ void release(Object obj) {
            super.release(obj);
        }
    }

    public static <T> g<T> b(d<T> dVar, int i) {
        return new g<>(dVar, i);
    }

    public static e<StringBuilder> c() {
        return c;
    }

    public static <T> void d(f<T> fVar, int i) {
        synchronized (f32141b) {
            fVar.b(-i);
        }
    }

    public static <T> f<T> e(Class<T> cls, int i) {
        f fVar;
        HashMap<Class<?>, f<?>> map = f32141b;
        synchronized (map) {
            try {
                fVar = (f<T>) map.get(cls);
                if (fVar == null) {
                    fVar = (f<T>) new f(cls, i);
                    map.put((Class<?>) cls, (f<?>) fVar);
                } else {
                    fVar.b(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (f<T>) fVar;
    }
}
