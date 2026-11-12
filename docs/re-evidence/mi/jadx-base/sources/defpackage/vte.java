package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public class vte<T> {
    public static Executor e = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<nte<T>> f37208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<nte<Throwable>> f37209b;
    public final Handler c;
    public volatile tte<T> d;

    public class a extends FutureTask<tte<T>> {
        public a(Callable<tte<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled()) {
                return;
            }
            try {
                vte.this.k(get());
            } catch (InterruptedException | ExecutionException e) {
                vte.this.k(new tte(e));
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public vte(Callable<tte<T>> callable) {
        this(callable, false);
    }

    public synchronized vte<T> c(nte<Throwable> nteVar) {
        try {
            tte<T> tteVar = this.d;
            if (tteVar != null && tteVar.a() != null) {
                nteVar.onResult(tteVar.a());
            }
            this.f37209b.add(nteVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized vte<T> d(nte<T> nteVar) {
        try {
            tte<T> tteVar = this.d;
            if (tteVar != null && tteVar.b() != null) {
                nteVar.onResult(tteVar.b());
            }
            this.f37208a.add(nteVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final /* synthetic */ void e() {
        tte<T> tteVar = this.d;
        if (tteVar == null) {
            return;
        }
        if (tteVar.b() != null) {
            h(tteVar.b());
        } else {
            f(tteVar.a());
        }
    }

    public final synchronized void f(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f37209b);
        if (arrayList.isEmpty()) {
            rpe.d("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((nte) it.next()).onResult(th);
        }
    }

    public final void g() {
        this.c.post(new Runnable() { // from class: ute
            @Override // java.lang.Runnable
            public final void run() {
                this.f36115a.e();
            }
        });
    }

    public final synchronized void h(T t) {
        Iterator it = new ArrayList(this.f37208a).iterator();
        while (it.hasNext()) {
            ((nte) it.next()).onResult(t);
        }
    }

    public synchronized vte<T> i(nte<Throwable> nteVar) {
        this.f37209b.remove(nteVar);
        return this;
    }

    public synchronized vte<T> j(nte<T> nteVar) {
        this.f37208a.remove(nteVar);
        return this;
    }

    public final void k(tte<T> tteVar) {
        if (this.d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.d = tteVar;
        g();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public vte(Callable<tte<T>> callable, boolean z) {
        this.f37208a = new LinkedHashSet(1);
        this.f37209b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        if (z) {
            try {
                k(callable.call());
                return;
            } catch (Throwable th) {
                k(new tte<>(th));
                return;
            }
        }
        e.execute(new a(callable));
    }
}
