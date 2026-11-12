package androidx.recyclerview.widget;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f10413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f10414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o.f<T> f10415c;

    public static final class a<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Object f10416c = new Object();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static ExecutorService f10417d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Executor f10418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o.f<T> f10419b;

        public a(o.f<T> fVar) {
            this.f10419b = fVar;
        }

        public final c<T> a() {
            if (this.f10418a == null) {
                synchronized (f10416c) {
                    try {
                        if (f10417d == null) {
                            f10417d = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                this.f10418a = f10417d;
            }
            return new c<>(null, this.f10418a, this.f10419b);
        }
    }

    public c(Executor executor, Executor executor2, o.f<T> fVar) {
        this.f10413a = executor;
        this.f10414b = executor2;
        this.f10415c = fVar;
    }
}
