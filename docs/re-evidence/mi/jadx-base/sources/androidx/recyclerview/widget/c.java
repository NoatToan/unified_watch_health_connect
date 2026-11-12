package androidx.recyclerview.widget;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f2865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f2866b;
    public final h.f<T> c;

    public static final class a<T> {
        public static final Object d = new Object();
        public static Executor e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Executor f2867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Executor f2868b;
        public final h.f<T> c;

        public a(h.f<T> fVar) {
            this.c = fVar;
        }

        public c<T> a() {
            if (this.f2868b == null) {
                synchronized (d) {
                    try {
                        if (e == null) {
                            e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f2868b = e;
            }
            return new c<>(this.f2867a, this.f2868b, this.c);
        }
    }

    public c(Executor executor, Executor executor2, h.f<T> fVar) {
        this.f2865a = executor;
        this.f2866b = executor2;
        this.c = fVar;
    }

    public Executor a() {
        return this.f2866b;
    }

    public h.f<T> b() {
        return this.c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Executor c() {
        return this.f2865a;
    }
}
