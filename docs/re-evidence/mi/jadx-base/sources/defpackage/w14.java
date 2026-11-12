package defpackage;

import com.facebook.common.references.SharedReference;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class w14<T> implements Cloneable, Closeable {
    public static Class<w14> d = w14.class;
    public static final frk<Closeable> e = new a();
    public static final c f = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f37432a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedReference<T> f37433b;
    public final c c;

    public static class a implements frk<Closeable> {
        @Override // defpackage.frk
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void release(Closeable closeable) {
            try {
                a24.a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    public static class b implements c {
        @Override // w14.c
        public void a(SharedReference<Object> sharedReference) {
            cm8.A(w14.d, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(sharedReference)), sharedReference.f().getClass().getName());
        }
    }

    public interface c {
        void a(SharedReference<Object> sharedReference);
    }

    public w14(SharedReference<T> sharedReference, c cVar) {
        this.f37433b = (SharedReference) b6i.g(sharedReference);
        sharedReference.b();
        this.c = cVar;
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;)Lw14<TT;>; */
    public static w14 D(Closeable closeable) {
        return K(closeable, e);
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;Lw14$c;)Lw14<TT;>; */
    public static w14 J(Closeable closeable, c cVar) {
        if (closeable == null) {
            return null;
        }
        return new w14(closeable, e, cVar);
    }

    public static <T> w14<T> K(T t, frk<T> frkVar) {
        return M(t, frkVar, f);
    }

    public static <T> w14<T> M(T t, frk<T> frkVar, c cVar) {
        if (t == null) {
            return null;
        }
        return new w14<>(t, frkVar, cVar);
    }

    public static <T> w14<T> d(w14<T> w14Var) {
        if (w14Var != null) {
            return w14Var.c();
        }
        return null;
    }

    public static void l(w14<?> w14Var) {
        if (w14Var != null) {
            w14Var.close();
        }
    }

    public static boolean y(w14<?> w14Var) {
        return w14Var != null && w14Var.s();
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized w14<T> clone() {
        b6i.i(s());
        return new w14<>(this.f37433b, this.c);
    }

    public synchronized w14<T> c() {
        if (!s()) {
            return null;
        }
        return clone();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.f37432a) {
                    return;
                }
                this.f37432a = true;
                this.f37433b.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f37432a) {
                    super.finalize();
                    return;
                }
                this.c.a(this.f37433b);
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public synchronized T n() {
        b6i.i(!this.f37432a);
        return this.f37433b.f();
    }

    public int p() {
        if (s()) {
            return System.identityHashCode(this.f37433b.f());
        }
        return 0;
    }

    public synchronized boolean s() {
        return !this.f37432a;
    }

    public w14(T t, frk<T> frkVar, c cVar) {
        this.f37433b = new SharedReference<>(t, frkVar);
        this.c = cVar;
    }
}
