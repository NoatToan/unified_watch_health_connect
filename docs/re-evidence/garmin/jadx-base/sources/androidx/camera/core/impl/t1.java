package androidx.camera.core.impl;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class t1<T> implements z1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.y0<a<T>> f5753a = new androidx.lifecycle.y0<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f5754b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a4.b f5755c;

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f5756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f5757b;

        private a(T t7, Throwable th3) {
            this.f5756a = t7;
            this.f5757b = th3;
        }

        public static <T> a<T> a(T t7) {
            return new a<>(t7, null);
        }

        public final String toString() {
            String strP;
            StringBuilder sb3 = new StringBuilder("[Result: <");
            Throwable th3 = this.f5757b;
            if (th3 == null) {
                strP = "Value: " + this.f5756a;
            } else {
                strP = am.j.p("Error: ", th3);
            }
            return am.j.o(strP, ">]", sb3);
        }
    }

    @Override // androidx.camera.core.impl.z1
    public final ListenableFuture<T> b() {
        return androidx.concurrent.futures.b.a(new a73.j(this, 8));
    }

    @Override // androidx.camera.core.impl.z1
    public final void c(z1.a<? super T> aVar) {
        synchronized (this.f5754b) {
            this.f5754b.remove(aVar);
            if (this.f5754b.isEmpty()) {
                k0.b.d().execute(new s1(this, 0));
            }
        }
    }

    @Override // androidx.camera.core.impl.z1
    public final void d(Executor executor, z1.a<? super T> aVar) {
        synchronized (this.f5754b) {
            boolean zIsEmpty = this.f5754b.isEmpty();
            this.f5754b.put(aVar, executor);
            if (zIsEmpty) {
                k0.b.d().execute(new s1(this, 1));
            } else {
                executor.execute(new ab.j(7, this, aVar));
            }
        }
    }
}
