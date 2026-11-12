package defpackage;

import bolts.ExecutorException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class k1p<TResult> {
    public static final ExecutorService i = n43.a();
    public static final Executor j = n43.b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Executor f23333k = y91.c();
    public static k1p<?> l = new k1p<>((Object) null);
    public static k1p<Boolean> m = new k1p<>(Boolean.TRUE);
    public static k1p<Boolean> n = new k1p<>(Boolean.FALSE);
    public static k1p<?> o = new k1p<>(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23335b;
    public boolean c;
    public TResult d;
    public Exception e;
    public boolean f;
    public abq g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f23334a = new Object();
    public List<dj4<TResult, Void>> h = new ArrayList();

    public class a implements dj4<TResult, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l1p f23336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ dj4 f23337b;
        public final /* synthetic */ Executor c;

        public a(l1p l1pVar, dj4 dj4Var, Executor executor, ti3 ti3Var) {
            this.f23336a = l1pVar;
            this.f23337b = dj4Var;
            this.c = executor;
        }

        @Override // defpackage.dj4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(k1p<TResult> k1pVar) {
            k1p.d(this.f23336a, this.f23337b, k1pVar, this.c, null);
            return null;
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l1p f23338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ dj4 f23339b;
        public final /* synthetic */ k1p c;

        public b(ti3 ti3Var, l1p l1pVar, dj4 dj4Var, k1p k1pVar) {
            this.f23338a = l1pVar;
            this.f23339b = dj4Var;
            this.c = k1pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f23338a.d(this.f23339b.a(this.c));
            } catch (CancellationException unused) {
                this.f23338a.b();
            } catch (Exception e) {
                this.f23338a.c(e);
            }
        }
    }

    public static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l1p f23340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Callable f23341b;

        public c(ti3 ti3Var, l1p l1pVar, Callable callable) {
            this.f23340a = l1pVar;
            this.f23341b = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f23340a.d(this.f23341b.call());
            } catch (CancellationException unused) {
                this.f23340a.b();
            } catch (Exception e) {
                this.f23340a.c(e);
            }
        }
    }

    public interface d {
    }

    public k1p() {
    }

    public static <TResult> k1p<TResult> b(Callable<TResult> callable, Executor executor) {
        return c(callable, executor, null);
    }

    public static <TResult> k1p<TResult> c(Callable<TResult> callable, Executor executor, ti3 ti3Var) {
        l1p l1pVar = new l1p();
        try {
            executor.execute(new c(ti3Var, l1pVar, callable));
        } catch (Exception e) {
            l1pVar.c(new ExecutorException(e));
        }
        return l1pVar.a();
    }

    public static <TContinuationResult, TResult> void d(l1p<TContinuationResult> l1pVar, dj4<TResult, TContinuationResult> dj4Var, k1p<TResult> k1pVar, Executor executor, ti3 ti3Var) {
        try {
            executor.execute(new b(ti3Var, l1pVar, dj4Var, k1pVar));
        } catch (Exception e) {
            l1pVar.c(new ExecutorException(e));
        }
    }

    public static <TResult> k1p<TResult> g(Exception exc) {
        l1p l1pVar = new l1p();
        l1pVar.c(exc);
        return l1pVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <TResult> k1p<TResult> h(TResult tresult) {
        if (tresult == 0) {
            return (k1p<TResult>) l;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (k1p<TResult>) m : (k1p<TResult>) n;
        }
        l1p l1pVar = new l1p();
        l1pVar.d(tresult);
        return l1pVar.a();
    }

    public static d k() {
        return null;
    }

    public <TContinuationResult> k1p<TContinuationResult> e(dj4<TResult, TContinuationResult> dj4Var) {
        return f(dj4Var, j, null);
    }

    public <TContinuationResult> k1p<TContinuationResult> f(dj4<TResult, TContinuationResult> dj4Var, Executor executor, ti3 ti3Var) {
        boolean zM;
        l1p l1pVar = new l1p();
        synchronized (this.f23334a) {
            try {
                zM = m();
                if (!zM) {
                    this.h.add(new a(l1pVar, dj4Var, executor, ti3Var));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM) {
            d(l1pVar, dj4Var, this, executor, ti3Var);
        }
        return l1pVar.a();
    }

    public Exception i() {
        Exception exc;
        synchronized (this.f23334a) {
            try {
                if (this.e != null) {
                    this.f = true;
                }
                exc = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return exc;
    }

    public TResult j() {
        TResult tresult;
        synchronized (this.f23334a) {
            tresult = this.d;
        }
        return tresult;
    }

    public boolean l() {
        boolean z;
        synchronized (this.f23334a) {
            z = this.c;
        }
        return z;
    }

    public boolean m() {
        boolean z;
        synchronized (this.f23334a) {
            z = this.f23335b;
        }
        return z;
    }

    public boolean n() {
        boolean z;
        synchronized (this.f23334a) {
            z = i() != null;
        }
        return z;
    }

    public final void o() {
        synchronized (this.f23334a) {
            Iterator<dj4<TResult, Void>> it = this.h.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.h = null;
        }
    }

    public boolean p() {
        synchronized (this.f23334a) {
            try {
                if (this.f23335b) {
                    return false;
                }
                this.f23335b = true;
                this.c = true;
                this.f23334a.notifyAll();
                o();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean q(Exception exc) {
        synchronized (this.f23334a) {
            try {
                if (this.f23335b) {
                    return false;
                }
                this.f23335b = true;
                this.e = exc;
                this.f = false;
                this.f23334a.notifyAll();
                o();
                if (!this.f) {
                    k();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean r(TResult tresult) {
        synchronized (this.f23334a) {
            try {
                if (this.f23335b) {
                    return false;
                }
                this.f23335b = true;
                this.d = tresult;
                this.f23334a.notifyAll();
                o();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public k1p(TResult tresult) {
        r(tresult);
    }

    public k1p(boolean z) {
        if (z) {
            p();
        } else {
            r(null);
        }
    }
}
